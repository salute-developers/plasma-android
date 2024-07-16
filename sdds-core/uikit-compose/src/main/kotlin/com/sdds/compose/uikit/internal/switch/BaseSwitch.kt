package com.sdds.compose.uikit.internal.switch

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.lerp

/**
 * Базовый компонент Switch
 *
 * @param active активен ли переключатель
 * @param modifier модификатор
 * @param thumbColor цвет подвижного элемента
 * @param activeTrackColor цвет неподвижного элемента в состоянии active = true
 * @param inactiveTrackColor цвет неподвижного элемента в состоянии active = false
 * @param switchWidth ширина switch
 * @param switchHeight высота switch
 * @param thumbDiameter диаметр подвижного элемента
 * @param trackCornerRadius радиус закругления
 * @param switchPadding внутренний паддинг switch
 * @param animationDuration длительность анимации
 * @param enabled доступен ли переключатель
 */
@Composable
internal fun BaseSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    thumbColor: Color,
    activeTrackColor: Color,
    inactiveTrackColor: Color,
    switchWidth: Dp,
    switchHeight: Dp,
    thumbDiameter: Dp,
    trackCornerRadius: Dp,
    switchPadding: Dp,
    animationDuration: Int,
    enabled: Boolean = true,
) {
    val colors = switchColors(thumbColor, activeTrackColor, inactiveTrackColor)
    val trackColor by colors.trackColor(enabled = enabled, active = active)
    val thumbColor by colors.thumbColor(enabled = enabled, active = active)
    val thumbPosition by animateFloatAsState(
        targetValue = if (active) 1f else 0f,
        animationSpec = tween(durationMillis = animationDuration),
        label = "thumbPosition",
    )

    Canvas(
        modifier = modifier
            .requiredSize(switchWidth, switchHeight),
    ) {
        val thumbRadius = thumbDiameter.toPx() / 2

        // Рисуем track
        drawRoundRect(
            color = trackColor,
            cornerRadius = CornerRadius(trackCornerRadius.toPx()),
        )

        // Рисуем thumb
        drawCircle(
            color = thumbColor,
            radius = thumbRadius,
            center = Offset(
                x = lerp(
                    switchPadding.toPx() + thumbRadius,
                    size.width - thumbRadius - switchPadding.toPx(),
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
 * Цвета переключателя
 * @param thumbColor цвет подвижного элемента
 * @param activeTrackColor цвет неподвижного элемента в состоянии active = true
 * @param inactiveTrackColor цвет неподвижного элемента в состоянии active = false
 */
@Composable
internal fun switchColors(
    thumbColor: Color,
    activeTrackColor: Color,
    inactiveTrackColor: Color,
): SwitchColors = DefaultSwitchColors(
    thumbColor = thumbColor,
    activeTrackColor = activeTrackColor,
    inactiveTrackColor = inactiveTrackColor,
)

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
