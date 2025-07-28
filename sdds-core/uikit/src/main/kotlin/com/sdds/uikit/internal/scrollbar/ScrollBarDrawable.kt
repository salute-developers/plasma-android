package com.sdds.uikit.internal.scrollbar

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.R
import com.sdds.uikit.shape.ShapeDrawable

/**
 * [Drawable] для ScrollBar.
 * @param context контекст.
 * @param attrs аттрибуты.
 * @param defStyleAttr аттрибут стиля по умолчанию.
 */
internal class ScrollBarDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : Drawable() {

    private var _trackColorList: ColorStateList = ColorStateList.valueOf(Color.LTGRAY)
    private var _thumbColorList: ColorStateList = ColorStateList.valueOf(Color.DKGRAY)

    private var _thickness: Int = 0
    private var _orientation: Int = UNKNOWN
    private var _thumbLength: Int = 100
    private var _thumbOffset: Int = 0
    private var _hasTrack: Boolean = true
    private var _trackDrawable: ShapeDrawable? = null
    private var _thumbDrawable: ShapeDrawable? = null
    private val trackRect: Rect = Rect()
    private val thumbRect: Rect = Rect()

    init {
        obtainAttributes(context, attrs, defStyleAttr)
        _trackDrawable = ShapeDrawable(context, attrs, defStyleAttr).apply {
            callback = this@ScrollBarDrawable.callback
            setTintList(_trackColorList)
        }
        _thumbDrawable = ShapeDrawable(context, attrs, defStyleAttr).apply {
            callback = this@ScrollBarDrawable.callback
            setTintList(_thumbColorList)
        }
    }

    /**
     * Устанавливает толщину ScrollBar.
     */
    var thickness: Int
        get() = _thickness
        set(value) {
            if (_thickness != value) {
                _thickness = value
                invalidateSelf()
            }
        }

    /**
     * Устанавливает ориентацию ScrollBar.
     */
    var orientation: Int
        get() = _orientation
        set(value) {
            if (_orientation != value) {
                _orientation = value
                invalidateSelf()
            }
        }

    /**
     * Включает отображение track у ScrollBar.
     */
    var hasTrack: Boolean
        get() = _hasTrack
        set(value) {
            if (_hasTrack != value) {
                _hasTrack = value
                invalidateSelf()
            }
        }

    /**
     * Устанавливает цвета фона переключателя.
     * @param trackColor цвет фона переключателя.
     */
    fun setTrackColor(trackColor: ColorStateList?) {
        _trackColorList = trackColor ?: ColorStateList.valueOf(Color.LTGRAY)
        _trackDrawable?.setTintList(_trackColorList)
    }

    /**
     * Устанавливает цвета подвижного элемента переключателя.
     * @param thumbColor цвета подвижного элемента.
     */
    fun setThumbColor(thumbColor: ColorStateList?) {
        _thumbColorList = thumbColor ?: ColorStateList.valueOf(Color.DKGRAY)
        _thumbDrawable?.setTintList(_thumbColorList)
    }

    /**
     * Рассчитывает длину thumb.
     * @param trackLength длина track.
     * @param scrollRange общая, прокручиваемая длина контента.
     * @param scrollExtent величина видимой области.
     */
    fun updateThumbLength(trackLength: Int, scrollRange: Int, scrollExtent: Int) {
        _thumbLength = (scrollExtent.toFloat() / scrollRange * trackLength)
            .toInt()
            .coerceAtLeast(MIN_TRACK_LENGTH)
        invalidateSelf()
    }

    /**
     * Рассчитывает смещение thumb.
     * @param trackLength длина track.
     * @param scrollRange общая, прокручиваемая длина контента.
     * @param scrollExtent величина видимой области.
     * @param scrollOffset текущая, прокрученная позиция.
     */
    fun updateThumbOffset(trackLength: Int, scrollRange: Int, scrollExtent: Int, scrollOffset: Int) {
        val maxScroll = (scrollRange - scrollExtent)
        val track = (trackLength - _thumbLength).coerceAtLeast(0)
        _thumbOffset = (scrollOffset.toFloat() / maxScroll * track)
            .toInt()
            .coerceIn(0, track)
        invalidateSelf()
    }

    /**
     * Проверяет находится ли прикосновение в пределах thumb
     * @param x координата X
     * @param y координата Y
     */
    fun isTouchOnThumb(x: Float, y: Float): Boolean {
        val thumbStart = _thumbOffset
        val thumbEnd = thumbStart + _thumbLength
        return if (orientation == VERTICAL) {
            y >= thumbStart && y <= thumbEnd
        } else {
            x >= thumbStart && x <= thumbEnd
        }
    }

    /**
     * Вычисляет смещение прикосновения относительно смещения thumb
     * @param touch координата прикосновения по оси ориентации скролла
     */
    fun calculateDragOffset(touch: Float) = touch - _thumbOffset

    override fun draw(canvas: Canvas) {
        if (orientation == UNKNOWN) return
        if (_hasTrack) {
            updateTrackBounds()
            _trackDrawable?.bounds = trackRect
            _trackDrawable?.draw(canvas)
        }
        updateThumbBounds()
        _thumbDrawable?.bounds = thumbRect
        _thumbDrawable?.draw(canvas)
    }

    override fun setAlpha(alpha: Int) {
        _trackDrawable?.alpha = alpha
        _thumbDrawable?.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    private fun updateTrackBounds() {
        val trackLeft = if (orientation == VERTICAL) {
            bounds.right - thickness
        } else {
            bounds.left
        }
        val trackTop = if (orientation == VERTICAL) {
            bounds.top
        } else {
            bounds.bottom - thickness
        }
        trackRect.set(trackLeft, trackTop, bounds.right, bounds.bottom)
    }

    private fun updateThumbBounds() {
        val thumbLeft = if (orientation == VERTICAL) {
            bounds.right - thickness
        } else {
            bounds.left + _thumbOffset
        }
        val thumbTop = if (orientation == VERTICAL) {
            bounds.top + _thumbOffset
        } else {
            bounds.bottom - thickness
        }
        val thumbRight = if (orientation == VERTICAL) {
            bounds.right
        } else {
            bounds.left + _thumbOffset + _thumbLength
        }
        val thumbBottom = if (orientation == VERTICAL) {
            bounds.top + _thumbOffset + _thumbLength
        } else {
            bounds.bottom
        }
        thumbRect.set(thumbLeft, thumbTop, thumbRight, thumbBottom)
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.SdScrollDrawable, defStyleAttr) {
            _thickness = getDimensionPixelSize(R.styleable.SdScrollDrawable_sd_thickness, 2)
            _hasTrack = getBoolean(R.styleable.SdScrollDrawable_sd_hasTrack, true)
        }
    }

    companion object {

        /**
         * Константа для вертикальной ориентации ScrollBar.
         */
        const val VERTICAL = 0

        /**
         * Константа для горизонтальной ориентации ScrollBar.
         */
        const val HORIZONTAL = 1

        /**
         * Константа ориентации ScrollBar когда не известно может
         * ли контент скроллиться. В этом случае логично не отображать ScrollBar
         */
        const val UNKNOWN = 2

        private const val MIN_TRACK_LENGTH = 20
    }
}
