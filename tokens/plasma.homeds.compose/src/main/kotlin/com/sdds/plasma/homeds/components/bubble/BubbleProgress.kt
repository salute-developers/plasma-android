package com.sdds.plasma.homeds.components.bubble

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Path

/**
 * Прогресс-бар для перегрузки [BubbleTrigger]: два прямоугольника с разрывом
 * между ними, положение разрыва показывает прогресс.
 *
 * @param progress прогресс
 * @param style стиль компонента — читает [BubbleDimensions.progressHeight],
 * [BubbleDimensions.progressPointerThickness], [BubbleDimensions.progressCornerRadius],
 * [BubbleColors.progressTrackBrush], [BubbleColors.progressValueBrush]
 * @param modifier модификатор
 */
@Composable
internal fun BubbleProgress(
    progress: Float,
    style: BubbleStyle,
    modifier: Modifier = Modifier,
) {
    val height = style.dimensions.progressHeight.getDefaultValue()
    val pointerThickness = style.dimensions.progressPointerThickness.getDefaultValue()
    val cornerRadius = style.dimensions.progressCornerRadius.getDefaultValue()
    val trackBrush = style.colors.progressTrackBrush.getDefaultValue()
    val valueBrush = style.colors.progressValueBrush.getDefaultValue()
    val clampedProgress = progress.coerceIn(0f, 1f)
    Box(
        modifier = modifier
            .height(height)
            .drawWithCache {
                val thicknessPx = pointerThickness.toPx()
                val halfThicknessPx = (thicknessPx / 2f).coerceAtMost(size.width / 2f)
                val gapCenterPx = (clampedProgress * size.width).coerceIn(halfThicknessPx, size.width - halfThicknessPx)
                val gapLeftPx = gapCenterPx - halfThicknessPx
                val gapRightPx = gapCenterPx + halfThicknessPx
                val cornerRadiusPx = cornerRadius.toPx().coerceAtMost(size.height / 2f)
                val valuePath = if (gapLeftPx > 0f) {
                    val outerRadius = CornerRadius(cornerRadiusPx.coerceAtMost(gapLeftPx / 2f))
                    Path().apply {
                        addRoundRect(
                            RoundRect(
                                rect = Rect(0f, 0f, gapLeftPx, size.height),
                                topLeft = outerRadius,
                                bottomLeft = outerRadius,
                                topRight = CornerRadius.Zero,
                                bottomRight = CornerRadius.Zero,
                            ),
                        )
                    }
                } else {
                    null
                }
                val trackPath = if (gapRightPx < size.width) {
                    val trackWidthPx = size.width - gapRightPx
                    val outerRadius = CornerRadius(cornerRadiusPx.coerceAtMost(trackWidthPx / 2f))
                    Path().apply {
                        addRoundRect(
                            RoundRect(
                                rect = Rect(gapRightPx, 0f, size.width, size.height),
                                topLeft = CornerRadius.Zero,
                                bottomLeft = CornerRadius.Zero,
                                topRight = outerRadius,
                                bottomRight = outerRadius,
                            ),
                        )
                    }
                } else {
                    null
                }
                onDrawBehind {
                    valuePath?.let { drawPath(it, valueBrush) }
                    trackPath?.let { drawPath(it, trackBrush) }
                }
            },
    )
}
