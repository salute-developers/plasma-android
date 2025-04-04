package com.sdds.compose.uikit.fs

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp

val LocalFocusSelectorSettings = compositionLocalOf { FocusSelectorSettings.builder().build() }

interface FocusSelectorSettings {
    val border: FocusSelectorBorder
    val scaleFactor: Float
    val isScaleEnabled: Boolean

    companion object {
        fun builder(): FocusSelectorSettingsBuilder = FocusSelectorSettingsBuilderImpl()
    }
}

interface FocusSelectorBorder {
    val shape: Shape
    val shapeAdjustment: Dp
    val strokeWidth: Dp
    val strokeInsets: Dp
    fun Modifier.applyToModifier(scale: Float): Modifier
}


fun Modifier.applyFocus(
    settings: FocusSelectorSettings,
    isFocused: Boolean,
): Modifier {
    if (!isFocused) return this
    var result = this
    var scale = 1f
    if (settings.isScaleEnabled) {
        scale = settings.scaleFactor
        result = result.then(
            Modifier.graphicsLayer {
                scaleX = settings.scaleFactor
                scaleY = settings.scaleFactor
            }
        )
    }
    return result.then(settings.border.run { applyToModifier(scale) })
}

@Immutable
private class DefaultFocusSelectorSettings(
    override val border: FocusSelectorBorder,
    override val scaleFactor: Float,
    override val isScaleEnabled: Boolean
) : FocusSelectorSettings

interface FocusSelectorSettingsBuilder {
    fun border(border: FocusSelectorBorder): FocusSelectorSettingsBuilder
    fun isScaleEnabled(isEnabled: Boolean): FocusSelectorSettingsBuilder
    fun scaleFactor(factor: Float): FocusSelectorSettingsBuilder
    fun build(): FocusSelectorSettings
}

@Immutable
private class FocusSelectorSettingsBuilderImpl : FocusSelectorSettingsBuilder {
    private var border: FocusSelectorBorder = FocusSelectorBorders.solid()
    private var isScaleEnabled: Boolean = false
    private var scaleFactor: Float = DEFAULT_SCALE_FACTOR

    override fun border(border: FocusSelectorBorder): FocusSelectorSettingsBuilder = apply {
        this.border = border
    }

    override fun isScaleEnabled(isEnabled: Boolean): FocusSelectorSettingsBuilder = apply {
        this.isScaleEnabled = isEnabled
    }

    override fun scaleFactor(factor: Float): FocusSelectorSettingsBuilder = apply {
        this.scaleFactor = factor
    }

    override fun build(): FocusSelectorSettings {
        return DefaultFocusSelectorSettings(
            border = border,
            scaleFactor = scaleFactor,
            isScaleEnabled = isScaleEnabled
        )
    }
}

private const val DEFAULT_SCALE_FACTOR = 1.05f