package com.sdds.plasma.homeds.components.bubble

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.toArgb
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.shadow.ShadowLayer
import kotlin.math.roundToInt

/**
 * Рисовальщик внутренней тени (inner shadow) поверх уже нарисованной заливки фигуры. Использует
 * `android.graphics.BlurMaskFilter` на принудительно программном `Bitmap`/`Canvas`, чтобы размытие
 * работало одинаково и при программном, и при аппаратном рендере слоя. Держатель bitmap/canvas
 * создаётся один раз на размер контейнера (см. [createBubbleInnerGlowPainter]), перерисовывается —
 * на каждый кадр (см. [BubbleInnerGlowPainter.draw]).
 */
internal class BubbleInnerGlowPainter(width: Int, height: Int) {

    private val bitmap = android.graphics.Bitmap.createBitmap(
        width.coerceAtLeast(1),
        height.coerceAtLeast(1),
        android.graphics.Bitmap.Config.ARGB_8888,
    )
    private val canvas = android.graphics.Canvas(bitmap)
    private val paint = android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG).apply {
        style = android.graphics.Paint.Style.STROKE
    }
    private var cachedBlurRadiusPx = Float.NaN
    private var cachedMaskFilter: android.graphics.BlurMaskFilter? = null

    fun DrawScope.draw(path: Path, color: Color, blurRadiusPx: Float, alpha: Float = 1f) {
        if (blurRadiusPx <= 0f || alpha <= 0f) return
        bitmap.eraseColor(android.graphics.Color.TRANSPARENT)
        val androidPath = path.asAndroidPath()
        canvas.save()
        canvas.clipPath(androidPath)
        paint.color = color.toArgb()
        paint.strokeWidth = blurRadiusPx
        if (cachedBlurRadiusPx != blurRadiusPx) {
            cachedBlurRadiusPx = blurRadiusPx
            cachedMaskFilter = android.graphics.BlurMaskFilter(
                blurRadiusPx,
                android.graphics.BlurMaskFilter.Blur.NORMAL,
            )
        }
        paint.maskFilter = cachedMaskFilter
        canvas.drawPath(androidPath, paint)
        canvas.restore()
        drawImage(bitmap.asImageBitmap(), alpha = alpha)
    }
}

/**
 * Создаёт [BubbleInnerGlowPainter] под фактический размер контейнера — вызывать из
 * `drawWithCache` (один раз на изменение размера), не из `onDrawBehind`.
 */
internal fun createBubbleInnerGlowPainter(size: Size): BubbleInnerGlowPainter =
    BubbleInnerGlowPainter(size.width.roundToInt(), size.height.roundToInt())

/**
 * Первый слой [BubbleStyle.shadow], резолвленный для [interactionSource]. `null`, если слоёв нет.
 */
@Composable
internal fun BubbleStyle.innerGlowLayer(interactionSource: InteractionSource): ShadowLayer? =
    shadow.getValue(interactionSource).layers.firstOrNull()
