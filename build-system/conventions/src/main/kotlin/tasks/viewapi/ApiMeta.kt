package tasks.viewapi

/**
 * Producer-модель метаинформации об API View-компонентов, собираемой из размеченных
 * `declare-styleable` в ресурсах `sdds-core/uikit`.
 *
 * Модель намеренно отделена от compose-`ComposeComponentMeta`: она XML-нативная
 * (несёт `attrName`, а не `methodName`) и сериализуется в `sdds/api/uikit-api-meta.json`.
 * Сериализация — через Gson (модуль `conventions` использует `kotlin-dsl`, без
 * compiler-plugin `kotlinx.serialization`; consumer-модель в `plugin_theme_builder`
 * помечена `@Serializable`).
 *
 * @property components описания компонентов
 * @property sharedStates общий словарь состояний модуля (`sd_state_*` из `base_attrs.xml`):
 *  имя состояния → drawable-атрибут. Позволяет потребителю резолвить имена состояний
 *  из токен-конфига по реальному словарю uikit, а не форматированием строки.
 */
data class ApiMeta(
    val components: List<ComponentMeta>,
    val sharedStates: Map<String, String> = emptyMap(),
)

/**
 * API View-компонента.
 *
 * @property componentNames **логические** имена компонентов, которые обслуживает
 *  `declare-styleable` (из `sdds:api_info`) — это join key с токен-конфигом темы и с
 *  делегатами генерации, а НЕ имя styleable. Список — если styleable общий для
 *  нескольких компонентов (напр. `Button` → `BasicButton`/`IconButton`/`LinkButton`).
 * @property styleableName имя `declare-styleable`, из которого собрана запись.
 * @property identity идентичность каждого компонента: `coreName`/`defStyleAttr`/`parent`.
 *  Задаётся per-component, т.к. один styleable может обслуживать компоненты с разными
 *  атрибутом стиля по умолчанию и родителем.
 * @property params темизируемые свойства компонента.
 * @property stateSets наборы кастомных состояний компонента.
 * @property subStyle если задано — этот `declare-styleable` описывает не сам компонент,
 *  а вложенную семью стилей внутри него (контент карточки, группа чипов поля ввода).
 */
data class ComponentMeta(
    val componentNames: List<String>,
    val styleableName: String,
    val identity: Map<String, ComponentIdentity> = emptyMap(),
    val params: List<PropertyMeta>,
    val stateSets: List<StateSet> = emptyList(),
    val subStyle: SubStyleInfo? = null,
)

/**
 * Вложенная семья стилей компонента.
 *
 * Компонент может генерировать не один стиль на вариацию, а пару: собственный стиль и
 * стиль вложенного вида (`Components.CardSolid.L` и `Components.CardSolidContent.L`).
 * Вложенная семья повторяет дерево вариаций владельца, ссылка на неё публикуется из
 * атрибута [styleRef], а её overlay — из `android:theme` владельца, если у семьи есть
 * что задавать.
 *
 * @property name суффикс имени стиля (`Content` → `Components.CardSolidContent.L`).
 * @property kind `style` — полноценная семья стилей плюс overlay; `overlay` — только
 *  overlay-стиль (случай группы чипов у поля ввода).
 * @property styleRef атрибут, которым владелец ссылается на вложенный стиль
 *  (`sd_cardContentStyle`, `sd_chipGroupStyleOverlay`).
 * @property parent родительский стиль uikit для базовой вариации вложенной семьи.
 */
data class SubStyleInfo(
    val name: String,
    val kind: String,
    val styleRef: String,
    val parent: String = "",
)

/**
 * Идентичность компонента — знание uikit, необходимое генератору стилей.
 *
 * @property coreName сид имён генерируемых сущностей (`XxxColorState`, attrs-файл,
 *  styleable темы). По умолчанию совпадает с логическим именем компонента.
 * @property defStyleAttr атрибут стиля по умолчанию (`sd_avatarStyle`, `android:buttonStyle`).
 * @property parent родительский стиль из uikit (`Sdds.Components.Avatar`).
 * @property styleName имя, под которым генерируется стиль компонента. Пусто — имя
 *  берётся из вида компонента в конфиге темы (обычный случай); задаётся явно там, где
 *  стиль исторически называется иначе (напр. `Components.OverlayView`).
 * @property colorStateScope кому принадлежит палитра `ColorState`: [ColorStateScope].
 */
data class ComponentIdentity(
    val coreName: String,
    val defStyleAttr: String,
    val parent: String,
    val styleName: String = "",
    val colorStateScope: String = ColorStateScope.CLASS.key,
)

/**
 * Кому принадлежит палитра `ColorState` компонента.
 *
 * Палитра — это набор цветовых состояний (`default`, `accent`, …), из которого
 * генерируются enum `XxxColorState`, boolean-атрибуты состояний и enum-атрибут
 * `<prefix>_xxxColors`.
 */
enum class ColorStateScope(val key: String) {

    /**
     * Палитра принадлежит классу uikit: все виды компонента ссылаются на одну сущность
     * с именем от [ComponentIdentity.coreName]. Значение по умолчанию.
     */
    CLASS("class"),

    /**
     * Палитра принадлежит виду компонента: каждый вид получает собственную сущность с
     * именем от своего стиля. Нужно там, где виды одного класса набирают разные палитры
     * (`counter` — семь состояний, `segment-item-counter` — два).
     */
    VARIETY("variety"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }

        /** Значения, допустимые в `sdds:api_color_state_scope`. */
        val markupKeys: Set<String> = byKey.keys

        fun fromKeyOrNull(key: String): ColorStateScope? = byKey[key]
    }
}

/**
 * Темизируемое свойство View-компонента.
 *
 * @property id идентификатор свойства — шов с ключом токен-конфига
 *  (`sdds:api_name` либо имя атрибута без `resourcePrefix`).
 * @property attrName полное имя XML-атрибута с префиксом (напр. `sd_valuePadding`,
 *  `android:minWidth`).
 * @property type семантический тип свойства (см. [ApiType]).
 * @property resSuffix суффикс имени генерируемого ресурса (`@dimen`/`@color`/`@xml`);
 *  по умолчанию — snake_case от [attrName] без префиксов.
 * @property placement куда эмитится `<item>`: в стиль компонента или в ThemeOverlay
 *  (см. [Placement]).
 * @property values значения для `type == value` (enum-атрибут).
 * @property defaultValue имя `<enum>`, на которое проецируется значение конфига, не
 *  совпавшее ни с одним `configName` (из `sdds:api_default`). Пусто — значит несовпадение
 *  является ошибкой генерации.
 * @property stateValues дополнительные значения свойства под состояниями.
 * @property resPrefix префикс имени генерируемого ресурса, вставляемый после имени
 *  вариации (`content` → `serv_card_solid_l_content_min_width`). Пусто — без префикса.
 * @property valueExpr значение, не приходящее из конфига по [id]: литерал (`true`) либо
 *  выражение `ratio(<ключ>,<ключ>)`. Пусто — обычное свойство.
 * @property condition условие эмиссии в форме `<ключ конфига>=<значение>`; свойство
 *  печатается, только если ключ имеет это значение. Пусто — без условия.
 * @property shapeAdjustment владеет ли shape-свойство атрибутом `sd_shapeAppearanceAdjustment`.
 *  Атрибут в стиле один на всех, поэтому владелец может быть только один: по умолчанию это
 *  основной `<prefix>shapeAppearance`, а прочие shape-атрибуты (`sd_externalShapeAppearance`,
 *  `sd_itemShapeAppearance`, …) adjustment не эмитят, пока не помечены явно.
 */
data class PropertyMeta(
    val id: String,
    val attrName: String,
    val type: String,
    val resSuffix: String,
    val placement: String = Placement.STYLE.key,
    val values: List<EnumValue> = emptyList(),
    val defaultValue: String = "",
    val stateValues: List<StateValue> = emptyList(),
    val resPrefix: String = "",
    val valueExpr: String = "",
    val condition: String = "",
    val shapeAdjustment: Boolean = false,
)

/**
 * Значение свойства, применяемое под конкретным состоянием.
 *
 * Две формы: значение берётся из другого ключа конфига ([StateValueKind.ALIAS]) либо
 * выводится из базового значения применением альфы из указанного ключа
 * ([StateValueKind.ALPHA]).
 *
 * @property state имя состояния из токен-конфига.
 * @property configKey ключ конфига — источник значения либо альфы.
 * @property kind форма (см. [StateValueKind]).
 */
data class StateValue(
    val state: String,
    val configKey: String,
    val kind: String,
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
 * Именованный набор кастомных состояний компонента.
 *
 * Порядок привязок в наборе НЕ является рантайм-контрактом и служит только
 * детерминированности сериализации: рантайм-порядок взаимоисключающих состояний
 * задаётся значениями `<enum>` соответствующего темизируемого свойства.
 *
 * @property name имя набора (из `sdds:api_state`).
 * @property states привязки состояний; несколько привязок с одним [StateInfo.configName]
 *  образуют составное состояние.
 */
data class StateSet(
    val name: String,
    val states: List<StateInfo>,
)

/**
 * Привязка состояния: имя состояния из конфига → drawable-атрибут и его значение.
 *
 * @property configName ключ состояния в токен-конфиге (`sdds:api_name` либо имя атрибута).
 * @property drawableAttr имя drawable-state-атрибута (напр. `sd_status_active`,
 *  `android:state_checked`).
 * @property flavor флейвор состояния (см. [StateFlavor]).
 * @property negated true, если состояние выражается отрицанием (`state=false`).
 */
data class StateInfo(
    val configName: String,
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

/** Куда эмитится `<item>` свойства. */
enum class Placement(val key: String) {
    /** В стиль компонента (по умолчанию). */
    STYLE("style"),

    /** В ThemeOverlay вариации — для атрибутов, задающих стиль вложенных компонентов. */
    OVERLAY("overlay"),

    /**
     * Ссылка на ThemeOverlay: в стиль печатается атрибут со ссылкой на overlay-стиль —
     * собственный (если объявлен в styleable компонента) либо вложенной семьи (если
     * объявлен в её styleable). Публикуется, только если тот overlay непуст.
     */
    THEME("theme"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }
        val markupKeys: Set<String> = byKey.keys
        fun fromKeyOrNull(key: String): Placement? = byKey[key]
    }
}

/** Форма значения свойства, не приходящего из конфига по ключу. */
enum class ValueExprKind(val key: String) {
    /** Литерал: печатается как есть (`true`, `false`). */
    LITERAL("literal"),

    /** `ratio(<ключ>,<ключ>)` — частное двух числовых значений конфига. */
    RATIO("ratio"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }
        fun fromKeyOrNull(key: String): ValueExprKind? = byKey[key]
    }
}

/** Форма значения свойства под состоянием. */
enum class StateValueKind(val key: String) {
    /** Значение берётся из другого ключа конфига. */
    ALIAS("alias"),

    /** Базовое значение с альфой из указанного ключа конфига. */
    ALPHA("alpha"),
    ;

    companion object {
        private val byKey = values().associateBy { it.key }
        fun fromKeyOrNull(key: String): StateValueKind? = byKey[key]
    }
}
