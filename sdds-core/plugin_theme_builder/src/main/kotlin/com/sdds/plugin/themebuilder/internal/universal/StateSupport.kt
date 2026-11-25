package com.sdds.plugin.themebuilder.internal.universal

import kotlinx.serialization.Serializable

/**
 * Состояния взаимодействия, которые умеет преобразовывать генератор платформы.
 *
 * @property interactionStates имена состояний в конфигурации компонентов.
 * @property combinations поддерживает ли генератор сочетания состояний.
 */
@Serializable
internal data class StateSupport(
    val interactionStates: List<String>,
    val combinations: Boolean,
)
