package com.sdds.plugin.themebuilder.internal.universal.view

import kotlinx.serialization.Serializable

/**
 * Consumer-модель метаинформации об API View-компонента.
 *
 * Читается из `sdds/api/uikit-api-meta.json`, который producer-плагин (`conventions`)
 * собирает из размеченных `declare-styleable` и пакует в classes.jar модуля `uikit`.
 * Модель зеркалит producer-модель `tasks.viewapi.ComponentMeta`, но помечена
 * `@Serializable` (модуль `plugin_theme_builder` использует compiler-plugin
 * `kotlinx.serialization`, тогда как producer сериализует через Gson).
 *
 * Модель намеренно отделена от compose-[ComposeComponentMeta]: она XML-нативная
 * (несёт `attrName`, а не `methodName`) и предназначена для будущего универсального
 * View-генератора (шов с токен-конфигом — по [PropertyMeta.id]).
 *
 * @property componentNames имена компонентов, обслуживаемых `declare-styleable`.
 * @property styleableName имя `declare-styleable`.
 * @property packageName пакет для генерируемых стилей (обход зарезервированных слов).
 * @property params темизируемые свойства компонента.
 * @property stateSets наборы кастомных состояний (для генерации ColorState).
 */
@Serializable
internal data class ComponentMeta(
    val componentNames: List<String>,
    val styleableName: String,
    val packageName: String = "",
    val params: List<PropertyMeta>,
    val stateSets: List<StateSet> = emptyList(),
)

/**
 * Темизируемое свойство View-компонента.
 *
 * @property id идентификатор свойства — шов с ключом токен-конфига.
 * @property attrName полное имя XML-атрибута с префиксом (напр. `sd_valuePadding`).
 * @property type семантический тип свойства (выровнен с `@SerialName` compose-`ComposePropertyMeta`).
 * @property values значения для `type == "value"` (enum-атрибут).
 */
@Serializable
internal data class PropertyMeta(
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
 * @property configName ключ значения в токен-конфиге.
 */
@Serializable
internal data class EnumValue(
    val name: String,
    val value: String,
    val configName: String,
)

/**
 * Набор кастомных состояний компонента.
 *
 * @property name имя набора (задаёт имя генерируемого `XxxColorState`-enum).
 * @property states состояния набора в детерминированном порядке (порядок задаёт ordinal).
 */
@Serializable
internal data class StateSet(
    val name: String,
    val states: List<StateInfo>,
)

/**
 * Кастомное состояние компонента.
 *
 * @property configName ключ состояния в токен-конфиге.
 * @property ordinal позиция состояния в наборе — рантайм-контракт `ColorStateProvider`.
 * @property drawableAttr имя drawable-state-атрибута для селектора (напр. `sd_state_loading`).
 * @property flavor флейвор состояния (`android` / `shared` / `scoped`).
 * @property negated true, если состояние выражается отрицанием (`state=false`).
 */
@Serializable
internal data class StateInfo(
    val configName: String,
    val ordinal: Int,
    val drawableAttr: String,
    val flavor: String,
    val negated: Boolean = false,
)
