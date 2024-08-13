package com.sdds.uikit.shape

import android.graphics.RectF

/**
 * Абсолютный размер угла [ShapeModel] в пикселях
 * @property size размер угла в пикселях
 * @author Малышев Александр on 12.08.2024
 */
data class AbsoluteCornerSize(val size: Float) : CornerSize {

    /**
     * @see CornerSize.getSize
     */
    override fun getSize(bounds: RectF): Float {
        return size
    }
}
