package tasks.viewapi

import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Парсер размеченных `declare-styleable` в `List<ComponentMeta>`.
 *
 * Чистый класс без Gradle-типов во входе — покрывается unit-тестами.
 *
 * Алгоритм двухпроходный:
 * 1. Глобальный индекс `attr → format` по всем переданным ресурсным values-файлам
 *    (нужен, т.к. `format` живёт в месте определения `<attr>`, а styleable
 *    часто ссылается на атрибут без `format`).
 * 2. Обход `declare-styleable`, помеченных `sdds:api_info`, с классификацией
 *    свойств и сборкой наборов состояний.
 *
 * @param resourcePrefix префикс ресурсов модуля (для авто-strip `id`), напр. `sd_`.
 */
class DeclareStyleableParser(
    private val resourcePrefix: String = "sd_",
) {

    /** Ошибка разметки/классификации. */
    class MarkupException(message: String) : RuntimeException(message)

    fun parse(files: List<File>): List<ComponentMeta> {
        val roots = files
            .filter { it.exists() }
            .map { file -> file to parseDocumentRoot(file) }

        val formatIndex = buildFormatIndex(roots.map { it.second })

        return roots.flatMap { (_, root) ->
            root.childElements(TAG_STYLEABLE)
                .filter { it.hasAttribute(ATTR_API_INFO) }
                .map { styleable -> parseStyleable(styleable, formatIndex) }
        }
    }

    private fun parseDocumentRoot(file: File): Element {
        val factory = DocumentBuilderFactory.newInstance().apply {
            // Читаем префиксные имена как есть (sdds:api_info), namespace-aware не нужен.
            isNamespaceAware = false
        }
        val document = factory.newDocumentBuilder().parse(file)
        return document.documentElement
    }

    /** Пасс 1: собираем `attr name → format` по всем определениям во всех файлах. */
    private fun buildFormatIndex(roots: List<Element>): Map<String, String> {
        val index = mutableMapOf<String, String>()
        roots.forEach { root ->
            root.descendantElements(TAG_ATTR).forEach { attr ->
                val name = attr.getAttribute("name")
                val format = attr.getAttribute("format")
                if (name.isNotBlank() && format.isNotBlank()) {
                    index.putIfAbsent(name, format)
                }
            }
        }
        return index
    }

    private fun parseStyleable(styleable: Element, formatIndex: Map<String, String>): ComponentMeta {
        val styleableName = styleable.getAttribute("name")
        val componentNames = styleable.getAttribute(ATTR_API_INFO)
            .split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }

        val params = mutableListOf<PropertyMeta>()
        val stateBuckets = LinkedHashMap<String, MutableList<StateInfo>>()

        styleable.childElements(TAG_ATTR).forEach { attr ->
            val attrName = attr.getAttribute("name")
            when {
                attrName.startsWith(ANDROID_PREFIX) -> return@forEach
                attr.hasAttribute(ATTR_API_STATE) -> collectState(attr, attrName, stateBuckets)
                else -> params.add(parseProperty(attr, attrName, formatIndex))
            }
        }

        // Свойства конфига, проецируемые на framework-атрибуты (не имеющие sd_-attr):
        // объявляются на declare-styleable через sdds:api_framework и попадают в params
        // с attrName вида "android:X" (потребитель отличает их по префиксу).
        params.addAll(parseFrameworkBindings(styleable))

        val stateSets = stateBuckets.map { (setName, states) ->
            StateSet(name = setName, states = states)
        }

        return ComponentMeta(
            componentNames = componentNames,
            styleableName = styleableName,
            packageName = styleable.getAttribute(ATTR_API_PACKAGE),
            builderFunName = styleable.getAttribute(ATTR_API_BUILDER_FUN),
            params = params,
            stateSets = stateSets,
        )
    }

    /**
     * Разбирает `sdds:api_framework` на declare-styleable — список биндингов
     * свойств конфига на framework-атрибуты в формате `configKey=android:attr:type`,
     * разделённых `;`. Тип — после последнего `:` (само имя атрибута содержит `:`).
     */
    private fun parseFrameworkBindings(styleable: Element): List<PropertyMeta> {
        val raw = styleable.optAttribute(ATTR_API_FRAMEWORK) ?: return emptyList()
        return raw.split(";").mapNotNull { part ->
            val entry = part.trim()
            if (entry.isEmpty()) return@mapNotNull null
            val eq = entry.indexOf('=')
            val lastColon = entry.lastIndexOf(':')
            if (eq <= 0 || lastColon <= eq) {
                throw MarkupException("Некорректный sdds:api_framework-элемент \"$entry\" (ожидается configKey=android:attr:type)")
            }
            val id = entry.substring(0, eq)
            val attrName = entry.substring(eq + 1, lastColon)
            val type = entry.substring(lastColon + 1)
            if (type !in ApiType.markupKeys) {
                throw MarkupException(
                    "Недопустимый тип \"$type\" в sdds:api_framework для \"$id\". " +
                        "Допустимо: ${ApiType.markupKeys.sorted().joinToString()}",
                )
            }
            PropertyMeta(id = id, attrName = attrName, type = type)
        }
    }

    private fun parseProperty(
        attr: Element,
        attrName: String,
        formatIndex: Map<String, String>,
    ): PropertyMeta {
        val id = attr.optAttribute(ATTR_API_NAME) ?: attrName.removePrefix(resourcePrefix)
        val format = attr.optAttribute("format") ?: formatIndex[attrName]
        val type = resolveType(attr, attrName, format)
        val values = if (format == FORMAT_ENUM || type == ApiType.VALUE.key) parseEnumValues(attr) else emptyList()
        return PropertyMeta(id = id, attrName = attrName, type = type, values = values)
    }

    private fun resolveType(attr: Element, attrName: String, format: String?): String {
        // 1. Явный sdds:api_type (валидируется по закрытому множеству).
        attr.optAttribute(ATTR_API_TYPE)?.let { explicit ->
            if (explicit !in ApiType.markupKeys) {
                throw MarkupException(
                    "Недопустимое значение sdds:api_type=\"$explicit\" на атрибуте \"$attrName\". " +
                        "Допустимо: ${ApiType.markupKeys.sorted().joinToString()}",
                )
            }
            return explicit
        }
        // 2. По format.
        typeFromFormat(format)?.let { return it }
        // 3. Keyword-эвристика по имени.
        return typeFromName(attrName) ?: TYPE_UNKNOWN
    }

    private fun typeFromFormat(format: String?): String? = when (format) {
        "dimension" -> ApiType.DIMENSION.key
        "boolean" -> ApiType.BOOLEAN.key
        "integer" -> ApiType.INTEGER.key
        "float" -> ApiType.FLOAT.key
        "color" -> ApiType.COLOR.key
        FORMAT_ENUM -> ApiType.VALUE.key
        else -> null // reference / string / многоформатные — уточняются api_type/эвристикой
    }

    private fun typeFromName(attrName: String): String? {
        val simple = attrName.removePrefix(resourcePrefix)
        return when {
            // SHAPE проверяется раньше TYPOGRAPHY, чтобы `shapeAppearance` не ушёл в typography по `appearance`.
            SHAPE_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.SHAPE.key
            COLOR_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.COLOR.key
            TYPOGRAPHY_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.TYPOGRAPHY.key
            SHADOW_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.SHADOW.key
            ICON_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.ICON.key
            // `*Style` / `*StyleOverlay` — ссылки на стили других компонентов.
            COMPONENT_STYLE_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.COMPONENT_STYLE.key
            DIMENSION_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.DIMENSION.key
            else -> null
        }
    }

    private fun parseEnumValues(attr: Element): List<EnumValue> =
        attr.childElements(TAG_ENUM).map { enum ->
            val name = enum.getAttribute("name")
            EnumValue(
                name = name,
                value = enum.getAttribute("value"),
                configName = enum.optAttribute(ATTR_API_NAME) ?: name,
            )
        }

    private fun collectState(
        attr: Element,
        attrName: String,
        buckets: LinkedHashMap<String, MutableList<StateInfo>>,
    ) {
        val setName = attr.getAttribute(ATTR_API_STATE)
        val flavorKey = attr.optAttribute(ATTR_API_STATE_KIND) ?: StateFlavor.SCOPED.key
        if (StateFlavor.fromKeyOrNull(flavorKey) == null) {
            throw MarkupException(
                "Недопустимый sdds:api_state_kind=\"$flavorKey\" на \"$attrName\". " +
                    "Допустимо: ${StateFlavor.values().joinToString { it.key }}",
            )
        }
        val bucket = buckets.getOrPut(setName) { mutableListOf() }
        val configName = attr.optAttribute(ATTR_API_NAME)
            ?: attrName.removePrefix(resourcePrefix).removePrefix("state_")
        bucket.add(
            StateInfo(
                configName = configName,
                ordinal = bucket.size,
                drawableAttr = attrName,
                flavor = flavorKey,
                negated = attr.optAttribute(ATTR_API_STATE_NEGATED)?.toBoolean() ?: false,
            ),
        )
    }

    // region DOM helpers

    private fun Element.optAttribute(name: String): String? =
        if (hasAttribute(name)) getAttribute(name).takeIf { it.isNotBlank() } else null

    private fun Element.childElements(tag: String): List<Element> {
        val result = mutableListOf<Element>()
        val nodes = childNodes
        for (i in 0 until nodes.length) {
            val node = nodes.item(i)
            if (node.nodeType == Node.ELEMENT_NODE && (node as Element).tagName == tag) {
                result.add(node)
            }
        }
        return result
    }

    private fun Element.descendantElements(tag: String): List<Element> {
        val result = mutableListOf<Element>()
        val nodes = getElementsByTagName(tag)
        for (i in 0 until nodes.length) {
            (nodes.item(i) as? Element)?.let(result::add)
        }
        return result
    }

    // endregion

    private companion object {
        const val ANDROID_PREFIX = "android:"
        const val TAG_STYLEABLE = "declare-styleable"
        const val TAG_ATTR = "attr"
        const val TAG_ENUM = "enum"
        const val FORMAT_ENUM = "enum"
        const val TYPE_UNKNOWN = "unknown"

        const val ATTR_API_INFO = "sdds:api_info"
        const val ATTR_API_FRAMEWORK = "sdds:api_framework"
        const val ATTR_API_NAME = "sdds:api_name"
        const val ATTR_API_TYPE = "sdds:api_type"
        const val ATTR_API_PACKAGE = "sdds:api_package"
        const val ATTR_API_BUILDER_FUN = "sdds:api_builder_fun"
        const val ATTR_API_STATE = "sdds:api_state"
        const val ATTR_API_STATE_KIND = "sdds:api_state_kind"
        const val ATTR_API_STATE_NEGATED = "sdds:api_state_negated"

        val SHAPE_KEYWORDS = setOf("shape")
        val COLOR_KEYWORDS = setOf("color", "tint", "brush")
        // `appearance` покрывает `titleAppearance`/`valueAppearance`/… (текстовые стили);
        // `shapeAppearance` перехватывается раньше веткой SHAPE.
        val TYPOGRAPHY_KEYWORDS = setOf("textAppearance", "appearance", "typography", "font")
        val SHADOW_KEYWORDS = setOf("shadow")
        val ICON_KEYWORDS = setOf("icon", "drawable")
        val COMPONENT_STYLE_KEYWORDS = setOf("style")
        val DIMENSION_KEYWORDS = setOf("padding", "size", "width", "height", "radius", "offset", "inset", "thickness")
    }
}
