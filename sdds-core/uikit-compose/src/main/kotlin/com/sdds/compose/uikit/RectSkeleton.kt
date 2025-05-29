package com.sdds.compose.uikit

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValue

/**
 * Компонент RectSkeleton
 *
 * Представляет собой прямоугольную область с формой [shape],
 * внутри которой бесконечно перемещается градиент [brush].
 *
 * @param modifier модификатор компонента
 * @param style стиль компонента
 * @param duration время в мс, за которое градиент перемещается через всю ширину компонента
 * @param brush градиент шиммера
 * @param shape форма компонента
 */
@Composable
fun RectSkeleton(
    modifier: Modifier = Modifier,
    style: RectSkeletonStyle = LocalRectSkeletonStyle.current,
    duration: Int = style.duration,
    brush: StatefulValue<Brush> = style.gradient,
    shape: Shape = style.shape,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Box(modifier.shimmer(brush.getValue(interactionSource), shape, duration))
}

/**
 * Позволяет применить шиммер-анимацию.
 *
 * @param brush градиент шиммера
 * @param shape форма
 * @param durationMillis время в мс, за которое градиент перемещается через всю ширину composable
 *
 */
@Composable
fun Modifier.shimmer(
    brush: Brush,
    shape: Shape = RectangleShape,
    durationMillis: Int = 1000,
): Modifier {
    val transition = rememberInfiniteTransition(label = "shimmer")
    val translateAnimation by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing,
            ),
            repeatMode = RepeatMode.Restart,
        ),
        label = "",
    )
    return clip(shape) then drawWithContent {
        drawContent()
        translate(size.width * translateAnimation) {
            translate(left = -size.width) {
                drawRect(
                    brush,
                    size = size,
                )
            }
            drawRect(
                brush,
                size = size,
            )
        }
    }
}

@Preview
@Composable
private fun RectSkeletonPreview() {
    RectSkeleton(modifier = Modifier.size(300.dp))
}
