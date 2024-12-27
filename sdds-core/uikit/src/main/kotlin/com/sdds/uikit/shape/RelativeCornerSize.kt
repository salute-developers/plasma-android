package com.sdds.uikit.shape

import android.graphics.RectF
import androidx.annotation.FloatRange

/**
 * Относительный размер угла [ShapeModel] в процентах.
 * Абсолютный размер рассчитывается относительно границам, в которые будет вписана форма.
 * @property percent относительный размер угла в процентах
 * @property baseline относительно чего выполняется скругление
 * @author Малышев Александр on 12.08.2024
 */
data class RelativeCornerSize(
    @FloatRange(from = 0.0, to = 1.0) val percent: Float,
    val baseline: CornerSizeBaseline,
) : CornerSize {

    /**
     * @see CornerSize.getSize
     */
    override fun getSize(bounds: RectF): Float {
        val baselineValue = when (baseline) {
            CornerSizeBaseline.AUTO -> minOf(bounds.height(), bounds.width())
            CornerSizeBaseline.WIDTH -> bounds.width()
            CornerSizeBaseline.HEIGHT -> bounds.height()
        }
        return percent * baselineValue
    }
}
