package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import kotlinx.serialization.Serializable

/**
 * Consumer-модель метаинформации об API View-компонентов.
 *
 * Читается из `sdds/api/uikit-api-meta.json`, который producer-плагин (`conventions`)
 * собирает из размеченных `declare-styleable` и пакует в classes.jar модуля `uikit`.
 * Модель зеркалит producer-модель `tasks.viewapi.ApiMeta`, но помечена
 * `@Serializable` (модуль `plugin_theme_builder` использует compiler-plugin
 * `kotlinx.serialization`, тогда как producer сериализует через Gson).
 *
 * Модель намеренно отделена от compose-[ComposeComponentMeta]: она XML-нативная
 * (несёт `attrName`, а не `methodName`) и предназначена для универсального
 * View-генератора (шов с токен-конфигом — по [PropertyMeta.id]).
 *
 * @property components описания компонентов.
 * @property sharedStates общий словарь состояний модуля (`sd_state_*`): имя состояния
 *  → drawable-атрибут. По нему генератор резолвит имена состояний из токен-конфига.
 */
@Serializable
internal data class ApiMeta(
    val components: List<ComponentMeta> = emptyList(),
    val sharedStates: Map<String, String> = emptyMap(),
)

/**
 * API View-компонента.
 *
 * @property componentNames **логические** имена компонентов (join key с токен-конфигом
 *  и делегатами генерации), которые обслуживает `declare-styleable`.
 * @property styleableName имя `declare-styleable`.
 * @property identity идентичность каждого компонента (`coreName`/`defStyleAttr`/`parent`);
 *  пустая карта означает, что компонент ещё не переведён на универсальный генератор.
 * @property params темизируемые свойства компонента.
 * @property stateSets наборы кастомных состояний.
 * @property subStyle если задано — запись описывает вложенную семью стилей компонента,
 *  а не сам компонент.
 */
@Serializable
internal data class ComponentMeta(
    val componentNames: List<String>,
    val styleableName: String,
    val identity: Map<String, ComponentIdentity> = emptyMap(),
    val params: List<PropertyMeta>,
    val stateSets: List<StateSet> = emptyList(),
    val subStyle: SubStyleInfo? = null,
)

/**
 * Вложенная семья стилей компонента: вторая семья стилей, повторяющая дерево вариаций
 * владельца (контент карточки, группа чипов поля ввода).
 *
 * @property name суффикс имени стиля (`Content` → `Components.CardSolidContent.L`).
 * @property kind `style` — семья стилей плюс overlay; `overlay` — только overlay-стиль.
 * @property styleRef атрибут, которым владелец ссылается на вложенный стиль.
 * @property parent родительский стиль uikit для базовой вариации вложенной семьи.
 */
@Serializable
internal data class SubStyleInfo(
    val name: String,
    val kind: String,
    val styleRef: String,
    val parent: String = "",
)

/**
 * Идентичность компонента — знание uikit, необходимое генератору стилей.
 *
 * @property coreName сид имён генерируемых сущностей (`XxxColorState`, attrs-файл,
 *  styleable темы).
 * @property defStyleAttr атрибут стиля по умолчанию.
 * @property parent родительский стиль из uikit.
 * @property styleName имя генерируемого стиля; пусто — берётся из вида компонента.
 * @property colorStateScope кому принадлежит палитра `ColorState`: `class` — классу
 *  uikit (одна сущность на все виды компонента), `variety` — виду компонента
 *  (собственная сущность у каждого вида, если виды набирают разные палитры).
 */
@Serializable
internal data class ComponentIdentity(
    val coreName: String,
    val defStyleAttr: String,
    val parent: String,
    val styleName: String = "",
    val colorStateScope: String = COLOR_STATE_SCOPE_CLASS,
)

/** Палитра `ColorState` принадлежит классу uikit. */
internal const val COLOR_STATE_SCOPE_CLASS = "class"

/** Палитра `ColorState` принадлежит виду компонента. */
internal const val COLOR_STATE_SCOPE_VARIETY = "variety"

/**
 * Темизируемое свойство View-компонента.
 *
 * @property id идентификатор свойства — шов с ключом токен-конфига.
 * @property attrName полное имя XML-атрибута с префиксом (напр. `sd_valuePadding`,
 *  `android:minWidth`).
 * @property type семантический тип свойства.
 * @property resSuffix суффикс имени генерируемого ресурса (`@dimen`/`@color`/`@xml`).
 * @property placement куда эмитится `<item>`: `style` либо `overlay`.
 * @property values значения для `type == "value"` (enum-атрибут).
 * @property defaultValue имя `<enum>` для значения конфига, не совпавшего ни с одним
 *  `configName`; пусто — несовпадение является ошибкой генерации.
 * @property stateValues дополнительные значения свойства под состояниями.
 * @property resPrefix префикс имени генерируемого ресурса после имени вариации.
 * @property valueExpr значение, не приходящее из конфига по [id]: литерал либо
 *  выражение `ratio(<ключ>,<ключ>)`.
 * @property condition условие эмиссии `<ключ конфига>=<значение>`.
 * @property shapeAdjustment владеет ли shape-свойство единственным на стиль атрибутом
 *  `sd_shapeAppearanceAdjustment`. У компонента с несколькими формами владелец один,
 *  иначе стиль получил бы одинаковый `<item>` дважды.
 */
@Serializable
internal data class PropertyMeta(
    val id: String,
    val attrName: String,
    val type: String,
    val resSuffix: String = "",
    val placement: String = PLACEMENT_STYLE,
    val values: List<EnumValue> = emptyList(),
    val defaultValue: String = "",
    val stateValues: List<StateValue> = emptyList(),
    val resPrefix: String = "",
    val valueExpr: String = "",
    val condition: String = "",
    val shapeAdjustment: Boolean = false,
)

/**
 * Значение свойства под состоянием: из другого ключа конфига (`alias`) либо базовое
 * значение с альфой из указанного ключа (`alpha`).
 *
 * @property state имя состояния из токен-конфига.
 * @property configKey ключ конфига — источник значения либо альфы.
 * @property kind форма: `alias` или `alpha`.
 */
@Serializable
internal data class StateValue(
    val state: String,
    val configKey: String,
    val kind: String,
)

/**
 * Значение enum-атрибута.
 *
 * @property name имя `<enum>` (keyword в XML).
 * @property value целочисленное значение `<enum>`.
 * @property configName ключ значения в токен-конфиге.
 */
@Serializable
internal data class EnumValue(
    val name: String,
    val value: String,
    val configName: String,
)

/**
 * Именованный набор кастомных состояний компонента.
 *
 * Порядок привязок не является рантайм-контрактом: рантайм-порядок взаимоисключающих
 * состояний задаётся значениями `<enum>` соответствующего свойства.
 *
 * @property name имя набора.
 * @property states привязки; несколько привязок с одним [StateInfo.configName]
 *  образуют составное состояние.
 */
@Serializable
internal data class StateSet(
    val name: String,
    val states: List<StateInfo>,
)

/**
 * Привязка состояния: имя состояния из конфига → drawable-атрибут и его значение.
 *
 * @property configName ключ состояния в токен-конфиге.
 * @property drawableAttr имя drawable-state-атрибута (напр. `sd_status_active`).
 * @property flavor флейвор состояния (`android` / `shared` / `scoped`).
 * @property negated true, если состояние выражается отрицанием (`state=false`).
 */
@Serializable
internal data class StateInfo(
    val configName: String,
    val drawableAttr: String,
    val flavor: String,
    val negated: Boolean = false,
)

/** Размещение `<item>` в стиле компонента. */
internal const val PLACEMENT_STYLE = "style"

/** Размещение `<item>` в ThemeOverlay вариации. */
internal const val PLACEMENT_OVERLAY = "overlay"

/** Ссылка на ThemeOverlay: собственный либо вложенной семьи, если тот непуст. */
internal const val PLACEMENT_THEME = "theme"

/** Вложенная семья стилей: полноценная семья стилей плюс overlay. */
internal const val SUB_STYLE_KIND_STYLE = "style"
