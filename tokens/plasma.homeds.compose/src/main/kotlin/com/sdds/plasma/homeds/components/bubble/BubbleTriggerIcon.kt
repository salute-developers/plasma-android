package com.sdds.plasma.homeds.components.bubble

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.shadow.ShadowLayer

/**
 * Анимированное содержимое триггера — кроссфейд + скейл между звёздочкой (свёрнутое состояние)
 * и крестиком (развёрнутое состояние), плюс декоративная рамка-«мерцание» вокруг них, которая
 * поворачивается при морфинге.
 *
 * @param morphProgress прогресс морфинга 0f..1f (альфа/масштаб иконок, альфа фона-подложки)
 * @param rotationProgress прогресс поворота обводки 0f..1f, на overshoot-кривой — может кратковременно
 * выходить за границы 0f..1f
 * @param sizeScale масштаб рамки-обводки+фона относительно [borderSize]
 * @param tint кисть иконок
 * @param starIcon иконка свёрнутого (морфинг=0) состояния, задаётся стилем (см. [BubbleStyle.starIcon])
 * @param closeIcon иконка развёрнутого (морфинг=1) состояния (см. [BubbleStyle.closeIcon])
 * @param backgroundBrush кисть заливки-подложки внутри обводки
 * @param borderBrush кисть обводки-рамки
 * @param borderSize базовый размер рамки-обводки до применения [sizeScale]
 * @param glowLayer параметры собственного внутреннего glow этого слоя, `null` пропускает отрисовку
 * @param modifier модификатор, задаёт размер самих иконок (звёздочка/крестик)
 */
@Composable
internal fun BubbleTriggerIcon(
    morphProgress: () -> Float,
    rotationProgress: () -> Float,
    sizeScale: () -> Float,
    tint: Brush,
    @DrawableRes starIcon: Int,
    @DrawableRes closeIcon: Int,
    backgroundBrush: Brush,
    borderBrush: Brush,
    borderSize: Dp,
    glowLayer: ShadowLayer?,
    modifier: Modifier = Modifier,
) {
    Box(contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(borderSize)
                .graphicsLayer {
                    rotationZ = BORDER_ROTATION_DEGREES * rotationProgress()
                    alpha = 1f - morphProgress()
                    scaleX = sizeScale()
                    scaleY = sizeScale()
                }
                .drawWithCache {
                    val outline = BubbleStarFourShape.createOutline(size, layoutDirection, this)
                    val path = (outline as Outline.Generic).path
                    val glowRadiusPx = glowLayer?.blurRadius?.toPx() ?: 0f
                    val glowPainter = createBubbleInnerGlowPainter(size)
                    onDrawBehind {
                        drawPath(path, backgroundBrush)
                        if (glowLayer != null) {
                            with(glowPainter) { draw(path, glowLayer.color, glowRadiusPx) }
                        }
                    }
                },
        )
        Box(
            modifier = Modifier
                .size(borderSize)
                .graphicsLayer {
                    rotationZ = BORDER_ROTATION_DEGREES * rotationProgress()
                    scaleX = sizeScale()
                    scaleY = sizeScale()
                }
                .border(BorderStroke(BADGE_BORDER_WIDTH, borderBrush), BubbleStarFourShape),
        )
        Icon(
            source = resourceImageSource(starIcon),
            brush = { tint },
            contentDescription = null,
            modifier = modifier.graphicsLayer {
                alpha = 1f - morphProgress()
                val scale = 1f - morphProgress() * STAR_SHRINK_FACTOR
                scaleX = scale
                scaleY = scale
            },
        )
        Icon(
            source = resourceImageSource(closeIcon),
            brush = { tint },
            contentDescription = null,
            modifier = modifier.graphicsLayer {
                alpha = morphProgress()
                val scale = CLOSE_START_SCALE + morphProgress() * (1f - CLOSE_START_SCALE)
                scaleX = scale
                scaleY = scale
            },
        )
    }
}

/**
 * Доля от диаметра круга-якоря, которую занимает рамка-обводка триггера на углу развёрнутого тела.
 */
internal const val BUBBLE_BADGE_BORDER_SCALE = 26f / 32f

private val BADGE_BORDER_WIDTH = 1.dp
private const val STAR_SHRINK_FACTOR = 0.3f
private const val CLOSE_START_SCALE = 0.7f
private const val BORDER_ROTATION_DEGREES = 45f
