package com.sdds.plugin.themebuilder.internal.components

import kotlinx.serialization.Serializable

/**
 * Класс содержит данные о вариациях всех компонентов в пределах одного конфига
 *
 * @property name название библиотеки
 * @property components список данных о компонентах [ComponentInfo]
 */
@Serializable
internal data class ConfigInfo(
    val name: String,
    val components: List<ComponentInfo>,
)

/**
 * Класс содержит данные о компоненте из конфига
 *
 * @property coreName название кор-компонента
 * @property styleName названия конфигурации компонента
 * @property variations список вариаций компонента
 */
@Serializable
internal data class ComponentInfo(
    val coreName: String,
    val styleName: String,
    val variations: List<String>,
)
