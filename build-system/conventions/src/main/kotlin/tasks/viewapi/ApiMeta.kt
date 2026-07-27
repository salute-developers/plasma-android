package tasks.viewapi

/**
 * Producer-модель метаинформации об API View-компонента, собираемой из размеченных
 * `declare-styleable` в ресурсах `sdds-core/uikit`.
 *
 * Модель намеренно отделена от compose-`ComposeComponentMeta`: она XML-нативная
 * (несёт `attrName`, а не `methodName`) и сериализуется в `sdds/api/uikit-api-meta.json`.
 * Сериализация — через Gson (модуль `conventions` использует `kotlin-dsl`, без
 * compiler-plugin `kotlinx.serialization`; consumer-модель в `plugin_theme_builder`
 * будет `@Serializable`).
 *
 * @property componentNames имена компонентов, которые обслуживает `declare-styleable`
 *  (из `sdds:api_info`; список — если styleable общий для нескольких компонентов).
 * @property styleableName имя `declare-styleable`.
 * @property packageName имя пакета для генерируемых стилей (из `sdds:api_package`;
 *  используется для обхода зарезервированных слов языка генерации, напр. `switch` → `switcher`).
 * @property params темизируемые свойства компонента.
 * @property stateSets наборы кастомных состояний компонента.
 */

data class ComponentMeta(
    val componentNames: List<String>,
    val styleableName: String,
    val packageName: String = "",
    val params: List<PropertyMeta>,
    val stateSets: List<StateSet> = emptyList(),
)

/**
 * Темизируемое свойство View-компонента.
 *
 * @property id идентификатор свойства — шов с ключом токен-конфига
 *  (`sdds:api_name` либо имя атрибута без `resourcePrefix`).
 * @property attrName полное имя XML-атрибута с префиксом (напр. `sd_valuePadding`).
 * @property type семантический тип свойства (см. [ApiType]).
 * @property values значения для `type == value` (enum-атрибут).
 */

data class PropertyMeta(
    val id: String,
    val attrName: String,
    val type: String,
    val values: List<EnumValue> = emptyList(),
)

/**
 * Значение enum-атрибута.
 *
 * @property name имя `<enum>` (keyword в XML).
 * @property value целочисленное значение `<enum>`.
 * @property configName ключ значения в токен-конфиге (`sdds:api_name` либо [name]).
 */

data class EnumValue(
    val name: String,
    val value: String,
    val configName: String,
)

/**
 * Набор кастомных состояний компонента.
 *
 * @property name имя набора (из `sdds:api_state`; задаёт имя генерируемого `XxxColorState`-enum).
 * @property states состояния набора в детерминированном порядке (порядок задаёт ordinal).
 */

data class StateSet(
    val name: String,
    val states: List<StateInfo>,
)

/**
 * Кастомное состояние компонента.
 *
 * @property configName ключ состояния в токен-конфиге (`sdds:api_name` либо имя из атрибута).
 * @property ordinal позиция состояния в наборе — рантайм-контракт `ColorStateProvider`.
 * @property drawableAttr имя drawable-state-атрибута для селектора (напр. `sd_state_loading`).
 * @property flavor флейвор состояния (см. [StateFlavor]).
 * @property negated true, если состояние выражается отрицанием (`state=false`).
 */

data class StateInfo(
    val configName: String,
    val ordinal: Int,
    val drawableAttr: String,
    val flavor: String,
    val negated: Boolean = false,
)

/**
 * Закрытое множество допустимых значений `sdds:api_type`.
 * Выровнено с `@SerialName` в compose-`ComposePropertyMeta`, чтобы семантика типов совпадала между стеками.
 * `unknown` — внутренний fallback классификатора и не может указываться в разметке явно.
 */
enum class ApiType(val key: String) {
    COLOR("color"),
    DIMENSION("dimension"),
    TYPOGRAPHY("typography"),
    SHAPE("shape"),
    SHADOW("shadow"),
    ICON("icon"),
    COMPONENT_STYLE("component_style"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    FLOAT("float"),
    VALUE("value"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }

        /** Значения, допустимые в `sdds:api_type` (без внутреннего `unknown`). */
        val markupKeys: Set<String> = byKey.keys

        fun fromKeyOrNull(key: String): ApiType? = byKey[key]
    }
}

/** Флейвор кастомного состояния. */
enum class StateFlavor(val key: String) {
    ANDROID("android"),
    SHARED("shared"),
    SCOPED("scoped"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }
        fun fromKeyOrNull(key: String): StateFlavor? = byKey[key]
    }
}
