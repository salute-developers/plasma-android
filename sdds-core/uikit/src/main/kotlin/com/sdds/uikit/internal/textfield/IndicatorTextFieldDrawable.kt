package com.sdds.uikit.internal.textfield

import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.Gravity
import androidx.core.graphics.withTranslation
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure

/**
 * Drawable для отрисовки индикатора в TextField
 * @author Малышев Александр on 10.09.2024
 */
internal class IndicatorTextFieldDrawable(
    private val size: Int,
    private val verticalOffset: Int = 0,
    private val horizontalOffset: Int = 0,
) : Drawable() {
    private val _gravityBounds: Rect = Rect()
    private val _badgePaint: Paint = Paint().configure(style = Paint.Style.FILL, color = Color.RED)
    private var _gravity: Int = Gravity.TOP or Gravity.START
    private var _horizontalAlignment: AlignmentMode = AlignmentMode.Inside
    private var _verticalAlignment: AlignmentMode = AlignmentMode.Inside

    /**
     * Режим выравнивания индикатора
     */
    enum class AlignmentMode {
        /**
         * Внутри границ
         */
        Inside,

        /**
         * Снаружи границ
         */
        Outside,
    }

    /**
     * Применяет [AlignmentMode] и [Gravity] для индикатора
     */
    fun applyMode(horizontalAlignment: AlignmentMode, verticalAlignment: AlignmentMode, gravity: Int) {
        _horizontalAlignment = horizontalAlignment
        _verticalAlignment = verticalAlignment
        _gravity = gravity
        onBoundsChange(bounds)
    }

    override fun draw(canvas: Canvas) {
        canvas.withTranslation(_gravityBounds.left.toFloat(), _gravityBounds.top.toFloat()) {
            canvas.drawCircle(size / 2f, size / 2f, size / 2f, _badgePaint)
        }
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        _gravityBounds.set(bounds)
        when (_horizontalAlignment) {
            AlignmentMode.Inside -> {
                _gravityBounds.left += horizontalOffset
                _gravityBounds.right -= horizontalOffset
            }

            AlignmentMode.Outside -> {
                _gravityBounds.left -= size + horizontalOffset
                _gravityBounds.right += horizontalOffset + size
            }
        }
        when (_verticalAlignment) {
            AlignmentMode.Inside -> {
                _gravityBounds.top += verticalOffset
                _gravityBounds.bottom -= verticalOffset
            }

            AlignmentMode.Outside -> {
                _gravityBounds.top -= verticalOffset + size
                _gravityBounds.bottom -= verticalOffset + size
            }
        }
        Gravity.apply(_gravity, size, size, _gravityBounds, _gravityBounds)
    }

    override fun setAlpha(alpha: Int) = Unit

    override fun setColorFilter(colorFilter: ColorFilter?) {
        _badgePaint.colorFilter = colorFilter
    }

    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun setTintList(tint: ColorStateList?) {
        super.setTintList(tint)
        _badgePaint.color = tint.colorForState(state)
    }

    override fun getIntrinsicWidth(): Int {
        return size + horizontalOffset
    }

    override fun getIntrinsicHeight(): Int {
        return size + verticalOffset
    }
}
