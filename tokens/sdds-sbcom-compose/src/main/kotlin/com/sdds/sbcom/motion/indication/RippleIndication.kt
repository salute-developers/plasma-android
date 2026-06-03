package com.sdds.sbcom.motion.indication

import android.graphics.BlurMaskFilter
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Indication
import androidx.compose.foundation.IndicationNodeFactory
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.node.DelegatableNode
import androidx.compose.ui.node.DrawModifierNode
import androidx.compose.ui.node.invalidateDraw
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.ShapeableIndication
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Риппл-индикация SddsSbCom.
 *
 * Рисует риппл от точки нажатия и ограничивает область рисования переданной [shape].
 *
 * [shape] нужен для компонентов, которые сами не могут быть clipped целиком: например, если у компонента
 * есть тень, badge или другой внешний слой, который должен выходить за bounds. В этом случае контент
 * компонента остаётся не обрезанным, а обрезается только слой рипла.
 *
 * По умолчанию риппл соответствует motion-спецификации SddsSbCom:
 * размер 1000x1000 dp, максимальная opacity 12%, blur 40% от размера, scale 0% -> 100% за 150 ms,
 * opacity 0% -> 12% за 100 ms и fade-out до 0% за 150 ms после завершения press.
 *
 * @param color цвет риппла.
 * @param shape форма, которой ограничивается рисование риппла.
 * @param rippleSize размер риппла.
 * @param maxAlpha максимальная opacity риппла.
 * @param blurRadius радиус blur.
 * @param scaleAnimationSpec спецификация scale-анимации.
 * @param opacityFadeInAnimationSpec спецификация появления opacity.
 * @param opacityFadeOutAnimationSpec спецификация исчезновения opacity.
 * @param drawOrder порядок рисования риппла относительно контента.
 */
@Stable
class RippleIndication(
    private val color: Color,
    private val shape: Shape = RectangleShape,
    private val rippleSize: Dp = DefaultRippleSize,
    private val maxAlpha: Float = DEFAULT_MAX_RIPPLE_ALPHA,
    private val blurRadius: Dp = DefaultBlurRadius,
    private val scaleAnimationSpec: AnimationSpec<Float> = DefaultScaleAnimationSpec,
    private val opacityFadeInAnimationSpec: AnimationSpec<Float> = DefaultOpacityFadeInAnimationSpec,
    private val opacityFadeOutAnimationSpec: AnimationSpec<Float> = DefaultOpacityFadeOutAnimationSpec,
    private val drawOrder: DrawOrder = DrawOrder.DrawOver,
) : IndicationNodeFactory, ShapeableIndication {

    override fun create(interactionSource: InteractionSource): DelegatableNode =
        RippleIndicationNode(
            interactionSource = interactionSource,
            color = color,
            shape = shape,
            rippleSize = rippleSize,
            maxAlpha = maxAlpha,
            blurRadius = blurRadius,
            scaleAnimationSpec = scaleAnimationSpec,
            opacityFadeInAnimationSpec = opacityFadeInAnimationSpec,
            opacityFadeOutAnimationSpec = opacityFadeOutAnimationSpec,
            drawOrder = drawOrder,
        )

    override fun hashCode(): Int {
        var result = color.hashCode()
        result = 31 * result + shape.hashCode()
        result = 31 * result + rippleSize.hashCode()
        result = 31 * result + maxAlpha.hashCode()
        result = 31 * result + blurRadius.hashCode()
        result = 31 * result + scaleAnimationSpec.hashCode()
        result = 31 * result + opacityFadeInAnimationSpec.hashCode()
        result = 31 * result + opacityFadeOutAnimationSpec.hashCode()
        result = 31 * result + drawOrder.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean =
        other is RippleIndication &&
            color == other.color &&
            shape == other.shape &&
            rippleSize == other.rippleSize &&
            maxAlpha == other.maxAlpha &&
            blurRadius == other.blurRadius &&
            scaleAnimationSpec == other.scaleAnimationSpec &&
            opacityFadeInAnimationSpec == other.opacityFadeInAnimationSpec &&
            opacityFadeOutAnimationSpec == other.opacityFadeOutAnimationSpec &&
            drawOrder == other.drawOrder

    override fun withShape(shape: Shape): Indication {
        return RippleIndication(
            color = color,
            shape = shape,
            rippleSize = rippleSize,
            maxAlpha = maxAlpha,
            blurRadius = blurRadius,
            scaleAnimationSpec = scaleAnimationSpec,
            opacityFadeInAnimationSpec = opacityFadeInAnimationSpec,
            opacityFadeOutAnimationSpec = opacityFadeOutAnimationSpec,
            drawOrder = drawOrder,
        )
    }
}

/**
 * Порядок рисования риппла относительно контента компонента.
 */
enum class DrawOrder {
    /**
     * Рисовать риппл поверх контента.
     */
    DrawOver,

    /**
     * Рисовать риппл под контентом.
     */
    DrawBehind,
}

/**
 * Возвращает [RippleIndication] с параметрами SddsSbCom.
 *
 * [shape] ограничивает только слой риппла и не клипает сам composable. Это позволяет использовать
 * indication на компонентах с внешними элементами, тенями или badge, которые должны рисоваться за bounds.
 *
 * @param color цвет риппла.
 * @param shape форма, которой ограничивается рисование риппла.
 * @param rippleSize размер риппла.
 * @param maxAlpha максимальная opacity риппла.
 * @param blurRadius радиус blur.
 * @param scaleAnimationSpec спецификация scale-анимации.
 * @param opacityFadeInAnimationSpec спецификация анимации увеличения прозрачности.
 * @param opacityFadeOutAnimationSpec спецификация анимации уменьшения прозрачности.
 * @param drawOrder порядок рисования риппла относительно контента.
 */
@Composable
fun rememberRippleIndication(
    color: Color = SddsSbComTheme.colors.surfaceDefaultTransparentAccent,
    shape: Shape = RectangleShape,
    rippleSize: Dp = DefaultRippleSize,
    maxAlpha: Float = DEFAULT_MAX_RIPPLE_ALPHA,
    blurRadius: Dp = DefaultBlurRadius,
    scaleAnimationSpec: AnimationSpec<Float> = DefaultScaleAnimationSpec,
    opacityFadeInAnimationSpec: AnimationSpec<Float> = DefaultOpacityFadeInAnimationSpec,
    opacityFadeOutAnimationSpec: AnimationSpec<Float> = DefaultOpacityFadeOutAnimationSpec,
    drawOrder: DrawOrder = DrawOrder.DrawOver,
): RippleIndication = remember(
    color,
    shape,
    rippleSize,
    maxAlpha,
    blurRadius,
    scaleAnimationSpec,
    opacityFadeInAnimationSpec,
    opacityFadeOutAnimationSpec,
    drawOrder,
) {
    RippleIndication(
        color = color,
        shape = shape,
        rippleSize = rippleSize,
        maxAlpha = maxAlpha,
        blurRadius = blurRadius,
        scaleAnimationSpec = scaleAnimationSpec,
        opacityFadeInAnimationSpec = opacityFadeInAnimationSpec,
        opacityFadeOutAnimationSpec = opacityFadeOutAnimationSpec,
        drawOrder = drawOrder,
    )
}

private class RippleIndicationNode(
    private val interactionSource: InteractionSource,
    private val color: Color,
    private val shape: Shape,
    private val rippleSize: Dp,
    private val maxAlpha: Float,
    private val blurRadius: Dp,
    private val scaleAnimationSpec: AnimationSpec<Float>,
    private val opacityFadeInAnimationSpec: AnimationSpec<Float>,
    private val opacityFadeOutAnimationSpec: AnimationSpec<Float>,
    private val drawOrder: DrawOrder,
) : androidx.compose.ui.Modifier.Node(), DrawModifierNode {

    private val scale = Animatable(0f)
    private val alpha = Animatable(0f)
    private val paint = Paint()
    private var pressPosition = Offset.Zero
    private var currentPress: PressInteraction.Press? = null
    private var scaleJob: Job? = null
    private var alphaJob: Job? = null
    private var cachedClipSize: Size = Size.Unspecified
    private var cachedLayoutDirection: LayoutDirection? = null
    private var cachedOutline: Outline? = null
    private var cachedRoundedPath: Path? = null
    private var cachedBlurRadiusPx: Float = Float.NaN
    private var cachedBlurMaskFilter: BlurMaskFilter? = null

    override fun onAttach() {
        coroutineScope.launch {
            interactionSource.interactions.collect { interaction ->
                when (interaction) {
                    is PressInteraction.Press -> startRipple(interaction)
                    is PressInteraction.Release -> {
                        if (interaction.press == currentPress) {
                            finishRipple()
                        }
                    }

                    is PressInteraction.Cancel -> {
                        if (interaction.press == currentPress) {
                            finishRipple()
                        }
                    }
                }
            }
        }
    }

    override fun ContentDrawScope.draw() {
        if (drawOrder == DrawOrder.DrawBehind) {
            drawRipple()
            drawContent()
            return
        }

        drawContent()
        drawRipple()
    }

    private fun ContentDrawScope.drawRipple() {
        if (scale.value == 0f || alpha.value == 0f) return

        val rippleRadiusPx = rippleSize.toPx() / 2f
        val blurRadiusPx = blurRadius.toPx()
        clipRipple(shape) {
            withTransform(
                transformBlock = {
                    scale(
                        scaleX = scale.value,
                        scaleY = scale.value,
                        pivot = pressPosition,
                    )
                },
            ) {
                drawIntoCanvas { canvas ->
                    paint.color = color.copy(alpha = maxAlpha * alpha.value)
                    paint.asFrameworkPaint().apply {
                        isAntiAlias = true
                        maskFilter = getCachedBlurMaskFilter(blurRadiusPx)
                    }
                    canvas.drawCircle(pressPosition, rippleRadiusPx, paint)
                }
            }
        }
    }

    private fun startRipple(press: PressInteraction.Press) {
        currentPress = press
        pressPosition = press.pressPosition
        scaleJob?.cancel()
        alphaJob?.cancel()

        scaleJob = coroutineScope.launch {
            scale.snapTo(0f)
            invalidateDraw()
            scale.animateTo(
                targetValue = 1f,
                animationSpec = scaleAnimationSpec,
            ) {
                invalidateDraw()
            }
        }

        alphaJob = coroutineScope.launch {
            alpha.snapTo(0f)
            invalidateDraw()
            alpha.animateTo(
                targetValue = 1f,
                animationSpec = opacityFadeInAnimationSpec,
            ) {
                invalidateDraw()
            }
        }
    }

    private fun finishRipple() {
        currentPress = null
        scaleJob?.cancel()
        alphaJob?.cancel()
        alphaJob = coroutineScope.launch {
            alpha.animateTo(
                targetValue = 0f,
                animationSpec = opacityFadeOutAnimationSpec,
            ) {
                invalidateDraw()
            }
            scale.snapTo(0f)
            invalidateDraw()
        }
    }

    private inline fun ContentDrawScope.clipRipple(
        shape: Shape,
        drawBlock: ContentDrawScope.() -> Unit,
    ) {
        when (val outline = getCachedOutline(shape)) {
            is Outline.Rectangle -> clipRect(
                left = outline.rect.left,
                top = outline.rect.top,
                right = outline.rect.right,
                bottom = outline.rect.bottom,
            ) {
                this@clipRipple.drawBlock()
            }

            is Outline.Rounded -> {
                val path = cachedRoundedPath ?: Path().apply {
                    addRoundRect(outline.roundRect)
                    cachedRoundedPath = this
                }
                clipPath(path) {
                    this@clipRipple.drawBlock()
                }
            }

            is Outline.Generic -> clipPath(outline.path) {
                this@clipRipple.drawBlock()
            }
        }
    }

    private fun ContentDrawScope.getCachedOutline(shape: Shape): Outline {
        if (cachedClipSize == size && cachedLayoutDirection == layoutDirection) {
            cachedOutline?.let { return it }
        }

        val outline = shape.createOutline(size, layoutDirection, this)
        cachedClipSize = size
        cachedLayoutDirection = layoutDirection
        cachedOutline = outline
        cachedRoundedPath = null
        return outline
    }

    private fun getCachedBlurMaskFilter(blurRadiusPx: Float): BlurMaskFilter {
        if (cachedBlurRadiusPx == blurRadiusPx) {
            cachedBlurMaskFilter?.let { return it }
        }

        val filter = BlurMaskFilter(blurRadiusPx, BlurMaskFilter.Blur.NORMAL)
        cachedBlurRadiusPx = blurRadiusPx
        cachedBlurMaskFilter = filter
        return filter
    }
}

private val DefaultRippleSize = 1000.dp
private val DefaultBlurRadius = 400.dp
private const val DEFAULT_MAX_RIPPLE_ALPHA = 0.12f
private val DefaultScaleAnimationSpec = tween<Float>(durationMillis = 150)
private val DefaultOpacityFadeInAnimationSpec = tween<Float>(durationMillis = 100)
private val DefaultOpacityFadeOutAnimationSpec = tween<Float>(durationMillis = 150)
