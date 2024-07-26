package com.sdds.compose.uikit.internal

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.nativeCanvas

/**
 * Рассчитывает линейную интерполяцию между значениями [a] в [b]
 */
internal fun lerp(a: Float, b: Float, fraction: Float): Float {
    return a * (1f - fraction) + (b * fraction)
}

/**
 * Модификатор для отрисовки [block] на нативном канвасе
 */
internal fun Modifier.drawWithLayer(block: ContentDrawScope.() -> Unit) = this.then(
    Modifier.drawWithContent {
        drawWithLayer {
            block()
        }
    },
)

/**
 * Рисует [block] на нативном канвасе
 */
internal fun ContentDrawScope.drawWithLayer(block: ContentDrawScope.() -> Unit) {
    with(drawContext.canvas.nativeCanvas) {
        val checkPoint = saveLayer(null, null)
        block()
        restoreToCount(checkPoint)
    }
}
