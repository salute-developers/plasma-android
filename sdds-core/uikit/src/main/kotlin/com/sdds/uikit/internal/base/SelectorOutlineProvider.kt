package com.sdds.uikit.internal.base

import android.graphics.Outline
import android.graphics.Rect
import android.graphics.RectF
import android.view.View
import android.view.ViewOutlineProvider
import com.sdds.uikit.fs.FocusSelectorBorder
import com.sdds.uikit.fs.FocusSelectorSettings
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.getOutline
import kotlin.math.max
import kotlin.math.roundToInt

internal class SelectorOutlineProvider(
    settings: FocusSelectorSettings,
    private val shapeModel: ShapeModel? = null,
) : ViewOutlineProvider() {

    private val _outlineRect: Rect = Rect()
    private val _outlineRectF: RectF = RectF()
    private val _extensionRect: Rect = Rect()

    private val focusSelectorScale: Float = if (settings.scaleEnabled) {
        1f + settings.scaleFactor
    } else {
        1f
    }
    private val focusSelectorOffset: Int = if (settings.border.borderMode != FocusSelectorBorder.Mode.NONE) {
        ((settings.border.strokeWidth + settings.border.strokeInsets) * focusSelectorScale).roundToInt()
    } else {
        0
    }

    var extendTop: Boolean = false
    var extendBottom: Boolean = false
    var extendStart: Boolean = false
    var extendEnd: Boolean = false

    fun getExtensionRect(width: Int, height: Int): Rect {
        val outline = getOutlineRect(width, height)
        _extensionRect.set(
            max(0, -outline.left),
            max(0, -outline.top),
            max(0, outline.width() - width),
            max(0, outline.height() - height),
        )
        return _extensionRect
    }

    fun getOutlineRect(width: Int, height: Int): Rect {
        val topOffset = if (extendTop) focusSelectorOffset else 0
        val bottomOffset = if (extendBottom) focusSelectorOffset else 0
        val startOffset = if (extendStart) focusSelectorOffset else 0
        val endOffset = if (extendEnd) focusSelectorOffset else 0

        val topScale = if (extendTop) focusSelectorScale else 1f
        val bottomScale = if (extendBottom) focusSelectorScale else 1f
        val startScale = if (extendStart) focusSelectorScale else 1f
        val endScale = if (extendEnd) focusSelectorScale else 1f

        val scaledLeft = width * startScale
        val scaledRight = width * endScale
        val scaledTop = height * topScale
        val scaledBottom = height * bottomScale

        val left = -((scaledLeft - width) / 2).roundToInt()
        val top = -((scaledTop - height) / 2).roundToInt()
        val right = ((scaledRight - width) / 2).roundToInt() + width
        val bottom = ((scaledBottom - height) / 2).roundToInt() + height

        _outlineRect.set(
            left - startOffset,
            top - topOffset,
            right + endOffset,
            bottom + bottomOffset,
        )
        _outlineRectF.set(_outlineRect)
        return _outlineRect
    }

    override fun getOutline(view: View, outline: Outline) {
        val bounds = getOutlineRect(view.width, view.height)
        if (shapeModel != null) {
            shapeModel.getOutline(_outlineRectF, bounds, outline)
        } else {
            outline.setRect(bounds)
        }
    }
}
