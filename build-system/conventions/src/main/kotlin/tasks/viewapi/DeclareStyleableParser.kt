package tasks.viewapi

import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

/**
 * Парсер размеченных `declare-styleable` в [ApiMeta].
 *
 * Чистый класс без Gradle-типов во входе — покрывается unit-тестами.
 *
 * Алгоритм трёхпроходный:
 * 1. Глобальный индекс `attr → format` по всем переданным ресурсным values-файлам
 *    (нужен, т.к. `format` живёт в месте определения `<attr>`, а styleable
 *    часто ссылается на атрибут без `format`).
 * 2. Общий словарь состояний модуля: все атрибуты вида `<prefix>state_*`.
 * 3. Обход `declare-styleable`, помеченных `sdds:api_info`, с классификацией
 *    свойств, разбором идентичности и сборкой привязок состояний.
 *
 * @param resourcePrefix префикс ресурсов модуля (для авто-strip `id`), напр. `sd_`.
 */
class DeclareStyleableParser(
    private val resourcePrefix: String = "sd_",
) {

    /** Ошибка разметки/классификации. */
    class MarkupException(message: String) : RuntimeException(message)

    fun parse(files: List<File>): ApiMeta {
        val roots = files
            .filter { it.exists() }
            .map { file -> file to parseDocumentRoot(file) }

        val formatIndex = buildFormatIndex(roots.map { it.second })
        val enumIndex = buildEnumIndex(roots.map { it.second })
        val sharedStates = buildSharedStates(roots.map { it.second })

        val components = roots.flatMap { (_, root) ->
            root.childElements(TAG_STYLEABLE)
                .filter { it.hasAttribute(ATTR_API_INFO) }
                .map { styleable -> parseStyleable(styleable, formatIndex, enumIndex) }
        }
        return ApiMeta(components = components, sharedStates = sharedStates)
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

    /**
     * Индекс значений enum по имени атрибута.
     *
     * Общий enum-атрибут определяется один раз, а styleable компонентов ссылаются на него
     * без вложенных `<enum>`; без индекса такая ссылка теряет значения и проекция
     * ключа конфига на имя `<enum>` перестаёт работать.
     */
    private fun buildEnumIndex(roots: List<Element>): Map<String, EnumDefinition> {
        val index = mutableMapOf<String, EnumDefinition>()
        roots.forEach { root ->
            root.descendantElements(TAG_ATTR).forEach { attr ->
                val name = attr.getAttribute("name")
                val values = parseEnumValues(attr)
                if (name.isNotBlank() && values.isNotEmpty()) {
                    index.putIfAbsent(name, EnumDefinition(values, attr.optAttribute(ATTR_API_DEFAULT).orEmpty()))
                }
            }
        }
        return index
    }

    /**
     * Пасс 2: общий словарь состояний модуля — атрибуты вида `<prefix>state_<name>`.
     *
     * Потребитель резолвит по нему имена состояний из токен-конфига: без словаря
     * нераспознанное имя молча теряется в собранном state-list.
     */
    private fun buildSharedStates(roots: List<Element>): Map<String, String> {
        val statePrefix = "${resourcePrefix}state_"
        val states = sortedMapOf<String, String>()
        roots.forEach { root ->
            root.descendantElements(TAG_ATTR).forEach { attr ->
                val name = attr.getAttribute("name")
                if (name.startsWith(statePrefix)) {
                    states.putIfAbsent(name.removePrefix(statePrefix), name)
                }
            }
        }
        return states
    }

    private fun parseStyleable(
        styleable: Element,
        formatIndex: Map<String, String>,
        enumIndex: Map<String, EnumDefinition>,
    ): ComponentMeta {
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
                attr.hasAttribute(ATTR_API_STATE) -> collectState(attr, attrName, stateBuckets)
                // Framework-атрибуты попадают в мету только явно размеченными: именем
                // ключа конфига либо разметкой, задающей значение и место эмиссии.
                attrName.startsWith(ANDROID_PREFIX) && EXPLICIT_MARKS.none { attr.hasAttribute(it) } -> Unit
                else -> params.add(parseProperty(attr, attrName, formatIndex, enumIndex))
            }
        }

        val stateSets = stateBuckets.map { (setName, states) -> StateSet(name = setName, states = states) }
        val subStyle = parseSubStyle(styleable)
        // Вложенная семья не описывает компонент, поэтому идентичности у неё нет.
        val identity = if (subStyle == null) parseIdentity(styleable, componentNames) else emptyMap()
        validateStateConsistency(styleableName, params, stateSets)

        return ComponentMeta(
            componentNames = componentNames,
            styleableName = styleableName,
            identity = identity,
            params = params,
            stateSets = stateSets,
            subStyle = subStyle,
        )
    }

    /**
     * Разбирает объявление вложенной семьи стилей: `sdds:api_sub_style` (суффикс имени),
     * `sdds:api_sub_style_kind` (`style`/`overlay`), `sdds:api_style_ref` (атрибут ссылки).
     */
    private fun parseSubStyle(styleable: Element): SubStyleInfo? {
        val name = styleable.optAttribute(ATTR_API_SUB_STYLE) ?: return null
        val kind = styleable.optAttribute(ATTR_API_SUB_STYLE_KIND) ?: SUB_STYLE_KIND_STYLE
        if (kind !in SUB_STYLE_KINDS) {
            throw MarkupException(
                "Недопустимое значение $ATTR_API_SUB_STYLE_KIND=\"$kind\" в styleable " +
                    "\"${styleable.getAttribute("name")}\". Допустимо: ${SUB_STYLE_KINDS.joinToString()}",
            )
        }
        val styleRef = styleable.optAttribute(ATTR_API_STYLE_REF)
            ?: throw MarkupException(
                "Вложенная семья стилей \"$name\" в styleable \"${styleable.getAttribute("name")}\" " +
                    "объявлена без $ATTR_API_STYLE_REF: неизвестно, каким атрибутом на неё ссылается владелец",
            )
        return SubStyleInfo(
            name = name,
            kind = kind,
            styleRef = styleRef,
            parent = styleable.optAttribute(ATTR_API_PARENT).orEmpty(),
        )
    }

    // region идентичность

    /**
     * Разбирает идентичность компонентов: `sdds:api_core_name`, `sdds:api_def_style_attr`,
     * `sdds:api_parent`. Значение — либо голое (один компонент/общее), либо список
     * `componentName=value;…` для мультикомпонентных styleable.
     *
     * Отсутствие разметки целиком означает «компонент ещё не переведён на универсальный
     * генератор» и ошибкой не является. Частичная разметка — ошибка: это опечатка.
     */
    private fun parseIdentity(styleable: Element, componentNames: List<String>): Map<String, ComponentIdentity> {
        val defStyleAttrs = perComponent(styleable, ATTR_API_DEF_STYLE_ATTR, componentNames)
        val parents = perComponent(styleable, ATTR_API_PARENT, componentNames)
        val coreNames = perComponent(styleable, ATTR_API_CORE_NAME, componentNames)
        val styleNames = perComponent(styleable, ATTR_API_STYLE_NAME, componentNames)
        val colorStateScopes = perComponent(styleable, ATTR_API_COLOR_STATE_SCOPE, componentNames)
        if (defStyleAttrs.isEmpty() && parents.isEmpty() && coreNames.isEmpty()) return emptyMap()

        return componentNames.associateWith { component ->
            val defStyleAttr = defStyleAttrs[component]
            val parent = parents[component]
            if (defStyleAttr.isNullOrBlank() || parent.isNullOrBlank()) {
                throw MarkupException(
                    "Неполная идентичность компонента \"$component\" в styleable " +
                        "\"${styleable.getAttribute("name")}\": требуются $ATTR_API_DEF_STYLE_ATTR и $ATTR_API_PARENT",
                )
            }
            ComponentIdentity(
                coreName = coreNames[component] ?: component,
                defStyleAttr = defStyleAttr,
                parent = parent,
                styleName = styleNames[component].orEmpty(),
                colorStateScope = parseColorStateScope(styleable, component, colorStateScopes[component]),
            )
        }
    }

    /**
     * Проверяет и возвращает область владения палитрой `ColorState`.
     *
     * Отсутствие разметки — `class`: палитра принадлежит классу uikit и общая для всех
     * видов компонента.
     */
    private fun parseColorStateScope(styleable: Element, component: String, raw: String?): String {
        val scope = raw?.takeIf { it.isNotBlank() } ?: return ColorStateScope.CLASS.key
        if (ColorStateScope.fromKeyOrNull(scope) == null) {
            throw MarkupException(
                "Недопустимое значение $ATTR_API_COLOR_STATE_SCOPE=\"$scope\" для компонента " +
                    "\"$component\" в styleable \"${styleable.getAttribute("name")}\". " +
                    "Допустимо: ${ColorStateScope.markupKeys.joinToString()}",
            )
        }
        return scope
    }

    /**
     * Читает значение вида `A=x;B=y` либо голое значение, применяемое ко всем компонентам.
     */
    private fun perComponent(
        styleable: Element,
        attribute: String,
        componentNames: List<String>,
    ): Map<String, String> {
        val raw = styleable.optAttribute(attribute) ?: return emptyMap()
        if (!raw.contains('=')) return componentNames.associateWith { raw.trim() }
        return raw.split(";").mapNotNull { entry ->
            val part = entry.trim()
            if (part.isEmpty()) return@mapNotNull null
            val index = part.indexOf('=')
            if (index <= 0 || index == part.lastIndex) {
                throw MarkupException(
                    "Некорректная запись \"$part\" в $attribute на styleable " +
                        "\"${styleable.getAttribute("name")}\" (ожидается componentName=value)",
                )
            }
            val component = part.substring(0, index).trim()
            if (component !in componentNames) {
                throw MarkupException(
                    "В $attribute указан компонент \"$component\", отсутствующий в $ATTR_API_INFO " +
                        "styleable \"${styleable.getAttribute("name")}\"",
                )
            }
            component to part.substring(index + 1).trim()
        }.toMap()
    }

    // endregion

    // region свойства

    private fun parseProperty(
        attr: Element,
        attrName: String,
        formatIndex: Map<String, String>,
        enumIndex: Map<String, EnumDefinition>,
    ): PropertyMeta {
        val id = attr.optAttribute(ATTR_API_NAME) ?: attrName.removePrefix(resourcePrefix)
        val format = attr.optAttribute("format") ?: formatIndex[attrName]
        val type = resolveType(attr, attrName, format)
        val enumDefinition = if (format == FORMAT_ENUM || type == ApiType.VALUE.key) {
            val own = parseEnumValues(attr)
            if (own.isNotEmpty()) {
                EnumDefinition(own, attr.optAttribute(ATTR_API_DEFAULT).orEmpty())
            } else {
                enumIndex[attrName] ?: EnumDefinition(emptyList(), "")
            }
        } else {
            EnumDefinition(emptyList(), "")
        }
        val values = enumDefinition.values
        validateDefault(attrName, enumDefinition)
        return PropertyMeta(
            id = id,
            attrName = attrName,
            type = type,
            resSuffix = attr.optAttribute(ATTR_API_RES_SUFFIX) ?: defaultResSuffix(attrName),
            placement = resolvePlacement(attr, attrName),
            values = values,
            defaultValue = enumDefinition.default,
            stateValues = parseStateValues(attr, attrName),
            resPrefix = attr.optAttribute(ATTR_API_RES_PREFIX).orEmpty(),
            valueExpr = parseValueExpr(attr, attrName),
            condition = parseCondition(attr, attrName),
            shapeAdjustment = resolveShapeAdjustment(attr, attrName, type),
        )
    }

    /**
     * `sdds:api_shape_adjustment` — владеет ли shape-свойство единственным на стиль
     * атрибутом `sd_shapeAppearanceAdjustment`.
     *
     * По умолчанию владельцем является основной `<prefix>shapeAppearance`: он парный
     * adjustment'у в styleable `SdShape`. Компонент с несколькими shape-свойствами
     * (`ButtonGroup` — внешняя и внутренняя формы) иначе печатал бы одинаковый
     * `<item>` дважды. Там, где adjustment принадлежит не основному свойству
     * (`sd_itemSelectorShapeAppearance` у `Wheel`), владение задаётся явно.
     */
    private fun resolveShapeAdjustment(attr: Element, attrName: String, type: String): Boolean {
        val raw = attr.optAttribute(ATTR_API_SHAPE_ADJUSTMENT)
        if (raw != null && type != ApiType.SHAPE.key) {
            throw MarkupException(
                "$ATTR_API_SHAPE_ADJUSTMENT на \"$attrName\" применим только к свойству " +
                    "типа ${ApiType.SHAPE.key}, а тип свойства — \"$type\"",
            )
        }
        if (type != ApiType.SHAPE.key) return false
        if (raw == null) return attrName.removePrefix(resourcePrefix).equals(SHAPE_APPEARANCE, ignoreCase = true)
        return raw.toBooleanStrictOrNull() ?: throw MarkupException(
            "Недопустимое значение $ATTR_API_SHAPE_ADJUSTMENT=\"$raw\" на \"$attrName\". " +
                "Допустимо: true, false",
        )
    }

    /**
     * `sdds:api_value` — значение, не приходящее из конфига по ключу свойства:
     * литерал (`true`) либо выражение `ratio(<ключ>,<ключ>)`.
     */
    private fun parseValueExpr(attr: Element, attrName: String): String {
        val raw = attr.optAttribute(ATTR_API_VALUE)?.trim() ?: return ""
        if (raw.isEmpty()) {
            throw MarkupException("Пустое значение $ATTR_API_VALUE на \"$attrName\"")
        }
        RATIO_FORM.matchEntire(raw)?.let { match ->
            val keys = match.groupValues[1].split(",").map { it.trim() }
            if (keys.size != 2 || keys.any { !PLAIN_KEY.matches(it) }) {
                throw MarkupException(
                    "Неразбираемое выражение $ATTR_API_VALUE=\"$raw\" на \"$attrName\": " +
                        "ожидается ratio(<ключ>,<ключ>)",
                )
            }
        }
        return raw
    }

    /** `sdds:api_when` — условие эмиссии в форме `<ключ конфига>=<значение>`. */
    private fun parseCondition(attr: Element, attrName: String): String {
        val raw = attr.optAttribute(ATTR_API_WHEN)?.trim() ?: return ""
        val index = raw.indexOf('=')
        if (index <= 0 || index == raw.lastIndex) {
            throw MarkupException(
                "Неразбираемое условие $ATTR_API_WHEN=\"$raw\" на \"$attrName\": " +
                    "ожидается <ключ конфига>=<значение>",
            )
        }
        return raw
    }

    /** `sdds:api_default` обязан ссылаться на существующее значение `<enum>`. */
    private fun validateDefault(attrName: String, definition: EnumDefinition) {
        if (definition.default.isEmpty()) return
        if (definition.values.none { it.name == definition.default }) {
            throw MarkupException(
                "$ATTR_API_DEFAULT=\"${definition.default}\" на \"$attrName\" не совпадает ни с одним " +
                    "значением enum (${definition.values.joinToString { it.name }})",
            )
        }
    }

    /**
     * Дефолтный суффикс имени генерируемого ресурса: snake_case от имени атрибута
     * без namespace-префикса и без `resourcePrefix` (`android:minWidth` → `min_width`).
     */
    private fun defaultResSuffix(attrName: String): String =
        attrName.substringAfterLast(':')
            .removePrefix(resourcePrefix)
            .replace(CAMEL_HUMP, "_")
            .lowercase()

    private fun resolvePlacement(attr: Element, attrName: String): String {
        val raw = attr.optAttribute(ATTR_API_PLACEMENT) ?: return Placement.STYLE.key
        if (Placement.fromKeyOrNull(raw) == null) {
            throw MarkupException(
                "Недопустимое значение $ATTR_API_PLACEMENT=\"$raw\" на атрибуте \"$attrName\". " +
                    "Допустимо: ${Placement.markupKeys.sorted().joinToString()}",
            )
        }
        return raw
    }

    /**
     * Разбирает `sdds:api_state_value`: записи `state=configKey` либо `state=alpha(configKey)`,
     * разделённые `;`.
     */
    private fun parseStateValues(attr: Element, attrName: String): List<StateValue> {
        val raw = attr.optAttribute(ATTR_API_STATE_VALUE) ?: return emptyList()
        return raw.split(";").mapNotNull { entry ->
            val part = entry.trim()
            if (part.isEmpty()) return@mapNotNull null
            val index = part.indexOf('=')
            if (index <= 0 || index == part.lastIndex) {
                throw MarkupException(
                    "Некорректная запись \"$part\" в $ATTR_API_STATE_VALUE на \"$attrName\" " +
                        "(ожидается state=configKey либо state=alpha(configKey))",
                )
            }
            val state = part.substring(0, index).trim()
            val source = part.substring(index + 1).trim()
            val alpha = ALPHA_FORM.matchEntire(source)
            when {
                alpha != null -> StateValue(state, alpha.groupValues[1].trim(), StateValueKind.ALPHA.key)
                source.matches(PLAIN_KEY) -> StateValue(state, source, StateValueKind.ALIAS.key)
                else -> throw MarkupException(
                    "Недопустимая форма значения \"$source\" в $ATTR_API_STATE_VALUE на \"$attrName\". " +
                        "Допустимо: configKey либо alpha(configKey)",
                )
            }
        }
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

    /**
     * `reference` — способ записи значения, а не его тип: `color|reference` описывает цвет,
     * который можно задать ссылкой. Поэтому `reference` отбрасывается, и если остаётся
     * ровно один формат — он и есть тип. Всё остальное (`dimension|float`, `string`)
     * уточняется через `sdds:api_type` или эвристику по имени.
     */
    private fun typeFromFormat(format: String?): String? {
        val formats = format?.split("|")?.map { it.trim() }?.filter { it.isNotBlank() }.orEmpty()
        val meaningful = formats.filter { it != FORMAT_REFERENCE }
        // Числовые форматы перечисляют способы записи одной и той же величины
        // (`float|fraction`, `dimension|float`), поэтому выбираются по приоритету.
        if (meaningful.size > 1 && meaningful.all { it in NUMERIC_FORMATS }) {
            return NUMERIC_PRECEDENCE.first { it in meaningful }.let { numericType(it) }
        }
        val single = meaningful.singleOrNull() ?: return null
        return when (single) {
            "dimension" -> ApiType.DIMENSION.key
            "boolean" -> ApiType.BOOLEAN.key
            "integer" -> ApiType.INTEGER.key
            "float" -> ApiType.FLOAT.key
            "color" -> ApiType.COLOR.key
            FORMAT_ENUM -> ApiType.VALUE.key
            else -> null
        }
    }

    /** Числовой формат → семантический тип; `fraction` — способ записи `float`. */
    private fun numericType(format: String): String = when (format) {
        "dimension" -> ApiType.DIMENSION.key
        "integer" -> ApiType.INTEGER.key
        else -> ApiType.FLOAT.key
    }

    private fun typeFromName(attrName: String): String? {
        val simple = attrName.substringAfterLast(':').removePrefix(resourcePrefix)
        return when {
            // SHAPE проверяется раньше TYPOGRAPHY, чтобы `shapeAppearance` не ушёл в typography по `appearance`.
            SHAPE_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.SHAPE.key
            COLOR_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.COLOR.key
            // SHADOW раньше TYPOGRAPHY: `shadowAppearance` — тень, а не типографика.
            SHADOW_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.SHADOW.key
            TYPOGRAPHY_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.TYPOGRAPHY.key
            // `*Style` / `*StyleOverlay` — ссылки на стили других компонентов; проверяются
            // раньше ICON, иначе `sd_iconButtonStyleOverlay` уходит в icon по подстроке `icon`.
            COMPONENT_STYLE_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.COMPONENT_STYLE.key
            // DIMENSION раньше ICON по той же причине: `sd_toggleIconWidth` — размер, а не иконка.
            DIMENSION_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.DIMENSION.key
            ICON_KEYWORDS.any { simple.contains(it, ignoreCase = true) } -> ApiType.ICON.key
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

    // endregion

    // region состояния

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
            ?: attrName.substringAfterLast(':').removePrefix(resourcePrefix).removePrefix("state_")
        bucket.add(
            StateInfo(
                configName = configName,
                drawableAttr = attrName,
                flavor = flavorKey,
                negated = attr.optAttribute(ATTR_API_STATE_NEGATED)?.toBoolean() ?: false,
            ),
        )
    }

    /**
     * Сверяет ключи привязок состояний со значениями enum-свойств компонента.
     *
     * Рассинхрон (напр. `sdds:api_name="activated"` на привязке против `<enum name="active">`)
     * порождает элемент state-list, который никогда не сматчится, — ловим на разметке.
     */
    private fun validateStateConsistency(
        styleableName: String,
        params: List<PropertyMeta>,
        stateSets: List<StateSet>,
    ) {
        if (stateSets.isEmpty()) return
        val enums = params.filter { it.type == ApiType.VALUE.key }
        if (enums.isEmpty()) return
        stateSets.flatMap { set -> set.states.map { set to it } }.forEach { (set, state) ->
            // Привязка относится к enum-свойству, если её drawable-атрибут лежит в его
            // пространстве имён: `sd_status` → `sd_status_active`. Иначе состояние
            // не enum-driven (framework/shared) и сверять его не с чем.
            val owner = enums.firstOrNull { state.drawableAttr.startsWith("${it.attrName}_") } ?: return@forEach
            val known = owner.values.map { it.configName }
            if (state.configName !in known) {
                throw MarkupException(
                    "Состояние \"${state.configName}\" набора \"${set.name}\" в styleable " +
                        "\"$styleableName\" не совпадает ни с одним значением enum-свойства " +
                        "\"${owner.attrName}\" (${known.sorted().joinToString()})",
                )
            }
        }
    }

    // endregion

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
        const val FORMAT_REFERENCE = "reference"

        /** Форматы, описывающие числовую величину, и приоритет выбора среди них. */
        val NUMERIC_PRECEDENCE = listOf("dimension", "float", "fraction", "integer")
        val NUMERIC_FORMATS = NUMERIC_PRECEDENCE.toSet()
        const val TYPE_UNKNOWN = "unknown"

        const val ATTR_API_INFO = "sdds:api_info"
        const val ATTR_API_NAME = "sdds:api_name"
        const val ATTR_API_TYPE = "sdds:api_type"
        const val ATTR_API_CORE_NAME = "sdds:api_core_name"
        const val ATTR_API_STYLE_NAME = "sdds:api_style_name"
        const val ATTR_API_COLOR_STATE_SCOPE = "sdds:api_color_state_scope"
        const val ATTR_API_DEF_STYLE_ATTR = "sdds:api_def_style_attr"
        const val ATTR_API_PARENT = "sdds:api_parent"
        const val ATTR_API_RES_SUFFIX = "sdds:api_res_suffix"
        const val ATTR_API_PLACEMENT = "sdds:api_placement"
        const val ATTR_API_SHAPE_ADJUSTMENT = "sdds:api_shape_adjustment"
        const val ATTR_API_STATE_VALUE = "sdds:api_state_value"
        const val ATTR_API_STATE = "sdds:api_state"
        const val ATTR_API_STATE_KIND = "sdds:api_state_kind"
        const val ATTR_API_STATE_NEGATED = "sdds:api_state_negated"
        const val ATTR_API_DEFAULT = "sdds:api_default"
        const val ATTR_API_RES_PREFIX = "sdds:api_res_prefix"
        const val ATTR_API_VALUE = "sdds:api_value"
        const val ATTR_API_WHEN = "sdds:api_when"
        const val ATTR_API_SUB_STYLE = "sdds:api_sub_style"
        const val ATTR_API_SUB_STYLE_KIND = "sdds:api_sub_style_kind"
        const val ATTR_API_STYLE_REF = "sdds:api_style_ref"

        /** Разметка, делающая framework-атрибут частью API компонента. */
        val EXPLICIT_MARKS = listOf(ATTR_API_NAME, ATTR_API_PLACEMENT, ATTR_API_VALUE)

        /** Имя основного shape-атрибута без префикса — владельца adjustment по умолчанию. */
        const val SHAPE_APPEARANCE = "shapeAppearance"

        const val SUB_STYLE_KIND_STYLE = "style"
        val SUB_STYLE_KINDS = setOf(SUB_STYLE_KIND_STYLE, "overlay")

        val CAMEL_HUMP = Regex("(?<!^)(?=[A-Z])")
        val ALPHA_FORM = Regex("""alpha\(([^)]+)\)""")
        val RATIO_FORM = Regex("""ratio\(([^)]+)\)""")
        val PLAIN_KEY = Regex("""[A-Za-z_][A-Za-z0-9_]*""")

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

/**
 * Определение enum-атрибута: значения и имя значения по умолчанию.
 *
 * @property values значения `<enum>`.
 * @property default имя значения, на которое проецируется ключ конфига, не совпавший
 *  ни с одним `configName`.
 */
data class EnumDefinition(
    val values: List<EnumValue>,
    val default: String,
)
