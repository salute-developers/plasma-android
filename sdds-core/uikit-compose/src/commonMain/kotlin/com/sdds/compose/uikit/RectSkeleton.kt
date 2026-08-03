package com.sdds.compose.uikit

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.util.lerp
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.UnspecifiedShape
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.skeleton.RectSkeletonMotionStyle
import com.sdds.compose.uikit.motion.components.skeleton.rememberRectSkeletonMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент RectSkeleton
 *
 * Представляет собой прямоугольную область с формой [shape],
 * внутри которой бесконечно перемещается градиент [brush].
 * Чтобы синхронизировать несколько [RectSkeleton], нужно передать одинаковый [transition]
 *
 * @param modifier модификатор компонента
 * @param style стиль компонента
 * @param duration время в мс, за которое градиент перемещается через всю ширину компонента
 * @param brush градиент шиммера
 * @param shape форма компонента
 * @param interactionSource источник взаимодейтсвий
 * @param transition менеджер анимации
 */
@Composable
fun RectSkeleton(
    modifier: Modifier = Modifier,
    style: RectSkeletonStyle = LocalRectSkeletonStyle.current,
    duration: Int = style.duration,
    brush: StatefulValue<Brush> = style.gradient,
    shape: Shape = UnspecifiedShape,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    transition: InfiniteTransition = rememberInfiniteTransition(),
    motion: Motion<RectSkeletonMotionStyle> = rememberRectSkeletonMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val currentShape = if (shape === UnspecifiedShape) {
        style.shapes.getValueAsState(motion.context).value
    } else {
        shape
    }

    val brushState = brush.getBrushAsState(motion.context, motion.style.gradientBrush)
    val isSolidColor by remember {
        derivedStateOf {
            brushState.value is SolidColor
        }
    }
    val shimmerModifier: Modifier = if (isSolidColor) {
        Modifier.blink(
            colorProducer = { (brushState.value as SolidColor).value },
            shape = currentShape,
            alphaDelta = 0.3f,
            durationMillis = duration,
            transition = transition,
        )
    } else {
        Modifier.shimmer(
            brushProducer = { brushState.value },
            shape = currentShape,
            durationMillis = duration,
            transition = transition,
        )
    }
    Box(modifier.then(shimmerModifier))
}

/**
 * Компонент RectSkeleton
 *
 * Представляет собой прямоугольную область с формой [shape],
 * внутри которой бесконечно перемещается градиент [brush].
 * Чтобы синхронизировать несколько [RectSkeleton], нужно передать одинаковый [transition]
 *
 * @param modifier модификатор компонента
 * @param style стиль компонента
 * @param duration время в мс, за которое градиент перемещается через всю ширину компонента
 * @param brush градиент шиммера
 * @param shape форма компонента
 * @param transition менеджер анимации
 */
@Composable
@NonRestartableComposable
fun RectSkeleton(
    modifier: Modifier = Modifier,
    style: RectSkeletonStyle = LocalRectSkeletonStyle.current,
    duration: Int = style.duration,
    brush: Brush = style.gradient.getDefaultValue(),
    shape: Shape = UnspecifiedShape,
    transition: InfiniteTransition = rememberInfiniteTransition(),
    motion: Motion<RectSkeletonMotionStyle> = rememberRectSkeletonMotion(),
) {
    RectSkeleton(
        modifier = modifier,
        style = style,
        duration = duration,
        brush = brush.asStatefulValue(),
        shape = shape,
        transition = transition,
        motion = motion,
    )
}

/**
 * Позволяет применить анимацию мерцания.
 * Выглядит как бесконечно плавно мерцающая область.
 * Мерцание достигается путём плавного изменения альфы.
 * Альфа имзеняется в положительную сторону, поэтому альфа оригинального цвета в [color] должна быть < 1.
 *
 * @param color цвет мерцания, должен иметь альфу <= (1 - [alphaDelta])
 * @param shape форма области
 * @param alphaDelta количество альфы, которое будет добавлено к исходной альфе [color] в процессе анимации
 * @param durationMillis время в мс, за которое альфа изменится от [color].alpha до [color].alpha + [alphaDelta]
 * @param transition менеджер анимации
 */
@Composable
fun Modifier.blink(
    color: Color,
    shape: Shape = RectangleShape,
    alphaDelta: Float = 0.08f,
    durationMillis: Int = 700,
    transition: InfiniteTransition = rememberInfiniteTransition(label = "shimmer"),
): Modifier = blink(
    colorProducer = { color },
    shape = shape,
    alphaDelta = alphaDelta,
    durationMillis = durationMillis,
    transition = transition,
)

/**
 * Позволяет применить анимацию мерцания.
 * Выглядит как бесконечно плавно мерцающая область.
 * Мерцание достигается путём плавного изменения альфы.
 * Альфа имзеняется в положительную сторону, поэтому альфа оригинального цвета в [color] должна быть < 1.
 *
 * @param colorProducer функция, возращающая цвет мерцания, должен иметь альфу <= (1 - [alphaDelta])
 * @param shape форма области
 * @param alphaDelta количество альфы, которое будет добавлено к исходной альфе [color] в процессе анимации
 * @param durationMillis время в мс, за которое альфа изменится от [color].alpha до [color].alpha + [alphaDelta]
 * @param transition менеджер анимации
 */
@Composable
fun Modifier.blink(
    colorProducer: ColorProducer,
    shape: Shape = RectangleShape,
    alphaDelta: Float = 0.08f,
    durationMillis: Int = 700,
    transition: InfiniteTransition = rememberInfiniteTransition(label = "shimmer"),
): Modifier {
    val progress by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = durationMillis,
                easing = LinearEasing,
            ),
            repeatMode = RepeatMode.Reverse,
        ),
    )

    return clip(shape)
        .drawWithContent {
            drawContent()
            val color = colorProducer()
            val animatedAlpha = lerp(
                start = color.alpha,
                stop = if (color.alpha + alphaDelta <= 1f) {
                    color.alpha + alphaDelta
                } else {
                    (color.alpha - alphaDelta).coerceAtLeast(0f)
                },
                fraction = progress,
            )
            drawRect(color = color.copy(alpha = animatedAlpha))
        }
}

/**
 * Позволяет применить шиммер-анимацию.
 * Выглядит как бесконечно перемещающийся прямоугольник, покрашенный в градиент.
 *
 * @param brush градиент шиммера
 * @param shape форма
 * @param durationMillis время в мс, за которое градиент перемещается через всю ширину composable
 * @param transition менеджер анимации
 */
@Composable
fun Modifier.shimmer(
    brush: Brush,
    shape: Shape = RectangleShape,
    durationMillis: Int = 1000,
    transition: InfiniteTransition = rememberInfiniteTransition(label = "shimmer"),
): Modifier = shimmer(
    brushProducer = { brush },
    shape = shape,
    durationMillis = durationMillis,
    transition = transition,
)

/**
 * Позволяет применить шиммер-анимацию.
 * Выглядит как бесконечно перемещающийся прямоугольник, покрашенный в градиент.
 *
 * @param brushProducer функция, возвращающая градиент шиммера
 * @param shape форма
 * @param durationMillis время в мс, за которое градиент перемещается через всю ширину composable
 * @param transition менеджер анимации
 */
@Composable
fun Modifier.shimmer(
    brushProducer: BrushProducer,
    shape: Shape = RectangleShape,
    durationMillis: Int = 1000,
    transition: InfiniteTransition = rememberInfiniteTransition(label = "shimmer"),
): Modifier {
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

    val windowSize = rememberWindowSize()
    val screenWidthPx = remember(windowSize) { windowSize.width.toFloat() }
    var coordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }

    return clip(shape)
        .onGloballyPositioned { coordinates = it }
        .drawWithCache {
            val currentBrush = brushProducer()
            val rectSize = Size(screenWidthPx, size.height)
            val screenWidthShader = (currentBrush as? ShaderBrush)?.createShader(rectSize)
            val shaderBrush = screenWidthShader?.let { ShaderBrush(it) }

            onDrawWithContent {
                drawContent()
                shaderBrush ?: return@onDrawWithContent
                val positionInRoot = coordinates?.positionInRoot()?.x ?: 0f
                translate(screenWidthPx * translateAnimation - positionInRoot) {
                    translate(left = -screenWidthPx) {
                        drawRect(brush = shaderBrush, size = rectSize)
                    }
                    drawRect(brush = shaderBrush, size = rectSize)
                }
            }
        }
}
