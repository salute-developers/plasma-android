package com.sdds.playground.sandbox.core.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.core.components.SwitchDefaults.AnimationDuration
import com.sdds.playground.sandbox.core.components.SwitchDefaults.DefaultSwitchPadding
import com.sdds.playground.sandbox.core.components.SwitchDefaults.SwitchHeight
import com.sdds.playground.sandbox.core.components.SwitchDefaults.SwitchWidth
import com.sdds.playground.sandbox.core.components.SwitchDefaults.ThumbDiameter
import com.sdds.playground.sandbox.core.components.SwitchDefaults.TrackCornerRadius
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Базовый компонент Switch
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param onActiveChanged колбэк изменения состояния переключателя
 * @param enabled доступен ли переключатель
 * @param interactionSource источник взаимодействий
 * @param colors цвета
 */
@Composable
internal fun BaseSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: SwitchColors = SwitchDefaults.colors(),
) {
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null,
            )
        } else {
            Modifier
        }

    val trackColor by colors.trackColor(enabled = enabled, active = active)
    val thumbColor by colors.thumbColor(enabled = enabled, active = active)
    val thumbPosition by animateFloatAsState(
        targetValue = if (active) 1f else 0f,
        animationSpec = tween(durationMillis = AnimationDuration),
        label = "thumbPosition",
    )

    Canvas(
        modifier = modifier
            .then(toggleableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f }
            .requiredSize(SwitchWidth, SwitchHeight),
    ) {
        val thumbRadius = ThumbDiameter.toPx() / 2

        // Рисуем track
        drawRoundRect(
            color = trackColor,
            cornerRadius = CornerRadius(TrackCornerRadius.toPx()),
        )

        // Рисуем thumb
        drawCircle(
            color = thumbColor,
            radius = thumbRadius,
            center = Offset(
                x = lerp(
                    DefaultSwitchPadding.toPx() + thumbRadius,
                    size.width - thumbRadius - DefaultSwitchPadding.toPx(),
                    thumbPosition,
                ),
                y = size.center.y,
            ),
        )
    }
}

/**
 * Цвета [BaseSwitch]
 */
@Stable
internal interface SwitchColors {

    /**
     * Цвет подвижного элемента переключателя (thumb) в зависимости от состояния.
     * @param enabled доступен ли переключатель
     * @param active активен ли переключатель
     */
    @Composable
    fun thumbColor(enabled: Boolean, active: Boolean): State<Color>

    /**
     * Цвет неподвижного элемента переключателя (track) в зависимости от состояния.
     * @param enabled доступен ли переключатель
     * @param active активен ли переключатель
     */
    @Composable
    fun trackColor(enabled: Boolean, active: Boolean): State<Color>
}

/**
 * Значения по умолчанию для переключателя
 */
internal object SwitchDefaults {
    const val AnimationDuration = 200
    val DefaultSwitchPadding = 2.dp
    val ThumbDiameter = 24.dp
    val SwitchWidth = 44.dp
    val SwitchHeight = 28.dp
    val TrackCornerRadius = 14.dp

    /**
     * Цвета переключателя
     * @param thumbColor цвет подвижного элемента
     * @param activeTrackColor цвет неподвижного элемента в состоянии active = true
     * @param inactiveTrackColor цвет неподвижного элемента в состоянии active = false
     */
    @Composable
    fun colors(
        thumbColor: Color = DefaultTheme.colors.surfaceOnDarkSolidDefault,
        activeTrackColor: Color = DefaultTheme.colors.surfaceDefaultPositive,
        inactiveTrackColor: Color = DefaultTheme.colors.surfaceDefaultTransparentTertiary,
    ): SwitchColors = DefaultSwitchColors(
        thumbColor = thumbColor,
        activeTrackColor = activeTrackColor,
        inactiveTrackColor = inactiveTrackColor,
    )
}

@Immutable
private class DefaultSwitchColors(
    private val thumbColor: Color,
    private val activeTrackColor: Color,
    private val inactiveTrackColor: Color,
) : SwitchColors {

    @Composable
    override fun thumbColor(enabled: Boolean, active: Boolean): State<Color> {
        return rememberUpdatedState(thumbColor)
    }

    @Composable
    override fun trackColor(enabled: Boolean, active: Boolean): State<Color> {
        return animateColorAsState(
            if (active) {
                activeTrackColor
            } else {
                inactiveTrackColor
            },
            label = "trackColor",
        )
    }
}
