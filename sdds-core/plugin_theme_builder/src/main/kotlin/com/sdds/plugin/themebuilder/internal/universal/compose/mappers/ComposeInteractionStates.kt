package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

/** Общий словарь генерации Compose-кода и экспортируемых метаданных. */
internal object ComposeInteractionStates {
    val values: Map<String, String> = mapOf(
        "focused" to "InteractiveState.Focused",
        "pressed" to "InteractiveState.Pressed",
        "hovered" to "InteractiveState.Hovered",
        "activated" to "InteractiveState.Activated",
        "selected" to "InteractiveState.Selected",
    )
}
