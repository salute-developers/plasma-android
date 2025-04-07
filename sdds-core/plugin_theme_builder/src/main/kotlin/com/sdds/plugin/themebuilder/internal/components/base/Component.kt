package com.sdds.plugin.themebuilder.internal.components.base

import kotlinx.serialization.Serializable

/**
 * Данные о компонентах
 *
 * @property name название темы
 * @property version версия темы
 * @property components список компонентов
 */
@Serializable
internal data class Components(
    val name: String,
    val version: String,
    @Serializable
    val components: List<Component>,
)

/**
 * Данные о компоненте
 *
 * @property componentName название компонента
 * @property styleName название стиля компонента
 * @property config название файла с конфигом компонента
 */
@Serializable
internal data class Component(
    val componentName: String,
    val styleName: String,
    val config: String,
    val excludePlatforms: List<String> = emptyList(),
) {
    val packageName = componentName.replace("-", "")

    val isExcludedForViewSystem: Boolean = excludePlatforms.contains("view-system")
    val isExcludedForCompose: Boolean = excludePlatforms.contains("compose")
}
