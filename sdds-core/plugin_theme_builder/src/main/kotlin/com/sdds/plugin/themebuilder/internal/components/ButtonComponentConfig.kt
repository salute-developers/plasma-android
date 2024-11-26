package com.sdds.plugin.themebuilder.internal.components

import kotlinx.serialization.Serializable

/**
 * Конфиг для BasicButton, IconButton, LinkButton
 */
@Serializable
internal data class ButtonComponentConfig(
    val invariant: Invariant? = null,
    val variations: Variations,
) : ComponentConfig {

    @Serializable
    data class Invariant(
        val loadingAlpha: Float,
        val backgroundColor: Color? = null,
    )

    @Serializable
    data class Variations(
        val size: Map<String, Size>,
        val color: Map<String, Map<String, Color>>,
    )

    @Serializable
    data class Size(
        val shape: String? = null,
        val labelStyle: String? = null,
        val valueStyle: String? = null,
        val height: Float,
        val paddingStart: Float,
        val paddingEnd: Float,
        val minWidth: Float,
        val iconSize: Float,
        val spinnerSize: Float,
        val iconMargin: Float? = null,
        val valueMargin: Float? = null,
    )

    @Serializable
    data class Color(
        val default: String,
        val states: List<ColorState>? = null,
    )

    @Serializable
    data class ColorState(
        val state: List<String>,
        val value: String,
    )
}
