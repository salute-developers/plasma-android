package com.sdds.uikit.internal.slider

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.R
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList
import kotlin.math.roundToInt

/**
 * [Drawable] для SliderView, содержит в себе
 * track, indicator, thumb.
 * @param context контекст.
 * @param attrs аттрибуты.
 * @param defStyleAttr аттрибут стиля по умолчанию.
 */
internal class SliderDrawable(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : Drawable() {

    // в нэйминге переменных, относящихся к Thumb, буква m означает main (основной thumb, используетcя
    // в обычном Slider), s - second (второй thumb, используется в компоненте SliderRange)
    private var trackColorList: ColorStateList = ColorStateList.valueOf(Color.LTGRAY)
    private var thumbColorList: ColorStateList = ColorStateList.valueOf(Color.DKGRAY)
    private var thumbStrokeColorList: ColorValueStateList = ColorValueStateList.valueOf(Color.LTGRAY)
    private var indicatorColorList: ColorValueStateList = ColorValueStateList.valueOf(Color.GREEN)

    private var _trackThickness: Int = 0
    private var _indicatorThickness: Int = 0
    private var mThumbOffset: Float = 0f
    private var sThumbOffset: Int = 0

    private var trackDrawable: ShapeDrawable? = null

    // здесь mThumbDrawable - это бОльший drawable,  mThumbForStrokeDrawable - меньший drawable
    // от mThumbDrawable зависят размеры индикатора и высчитываются смещения, соответствует thumbSize
    // mThumbForStrokeDrawable за счет меньшего диаметра создает бордер, его размеры не участвуют расчетах
    private var mThumbDrawable: ShapeDrawable? = null
    private var mThumbForStrokeDrawable: ShapeDrawable? = null
    private var sThumbDrawable: ShapeDrawable? = null
    private var indicatorDrawable: ShapeDrawable? = null

    @StyleRes
    private var trackShape: Int = 0

    @StyleRes
    private var indicatorShape: Int = 0

    @StyleRes
    private var thumbShape: Int = 0
    private val trackRect: Rect = Rect()
    private val mThumbRect: Rect = Rect()
    private val mThumbStrokeRect: Rect = Rect()
    private val sThumbRect: Rect = Rect()
    private val indicatorRect: Rect = Rect()

    private var _orientation: Int = SliderView.HORIZONTAL

    private var _thumbSize: Int = 0
    private var thumbStrokeWidth: Int = 0

    private var _slideDirection: Int = SLIDE_DIRECTION_NORMAL

    /**
     * Отображение Thumb.
     */
    var thumbEnabled: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                updateIndicatorBounds()
                indicatorDrawable?.bounds = indicatorRect
                invalidateSelf()
            }
        }

    /**
     * Текущее значение прогресса.
     */
    var progress: Float = 0f
        private set

    /**
     * Размер Thumb.
     */
    var thumbSize: Int
        get() = _thumbSize
        set(value) {
            if (_thumbSize != value) {
                _thumbSize = value
                invalidateSelf()
            }
        }

    /**
     * Толщина трэка.
     */
    var trackThickness: Int
        get() = _trackThickness
        set(value) {
            if (_trackThickness != value) {
                _trackThickness = value
                invalidateSelf()
            }
        }

    /**
     * Толщина индикатора (часть между началом компонента и ползунком
     * или между двумя ползунками)
     */
    var indicatorThickness: Int
        get() = _indicatorThickness
        set(value) {
            if (_indicatorThickness != value) {
                _indicatorThickness = value
                invalidateSelf()
            }
        }

    /**
     * Ориентация.
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
     * Направление движения thumb и шкалы indicator.
     */
    var sliderDirection: Int
        get() = _slideDirection
        set(value) {
            if (_slideDirection != value) {
                _slideDirection = value
            }
            onBoundsChange(bounds)
            invalidateSelf()
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr)
    }

    /**
     * Устанавливает цвета трэка [trackTint]
     */
    fun setTrackTint(trackTint: ColorStateList?) {
        trackColorList = trackTint ?: ColorStateList.valueOf(Color.LTGRAY)
        trackDrawable?.setTintList(trackColorList)
    }

    /**
     * Устанавливает цвета основного бегунка [thumbTint]
     */
    fun setThumbTint(thumbTint: ColorStateList?) {
        thumbColorList = thumbTint ?: ColorStateList.valueOf(Color.DKGRAY)
        mThumbForStrokeDrawable?.setTintList(thumbTint)
    }

    /**
     * Устанавливает цвета бордера основного бегунка [thumbStrokeTint]
     */
    fun setThumbStrokeTint(thumbStrokeTint: ColorValueStateList?) {
        thumbStrokeColorList = thumbStrokeTint ?: ColorValueStateList.valueOf(Color.DKGRAY)
        mThumbDrawable?.setTintValue(thumbStrokeTint)
    }

    /**
     * Устанавливает цвета полосы индикатора [indicatorTint]
     */
    fun setIndicatorTint(indicatorTint: ColorValueStateList?) {
        indicatorColorList = indicatorTint ?: ColorValueStateList.valueOf(Color.DKGRAY)
        indicatorDrawable?.setTintValue(indicatorTint)
    }

    /**
     * Устанавливает толщину бордера у thumb [strokeWidth]
     */
    fun setStrokeWidth(strokeWidth: Int) {
        if (thumbStrokeWidth != strokeWidth) {
            thumbStrokeWidth = strokeWidth
            updateThumbBounds()
            invalidateSelf()
        }
    }

    /**
     * Устанавливает новую форму скруглений для ползунка (thumb) по идентификатору стиля
     * @param context контекст
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setThumbShape(context: Context, @StyleRes shapeAppearanceId: Int) {
        mThumbDrawable ?: return
        if (thumbShape != shapeAppearanceId) {
            thumbShape = shapeAppearanceId
            mThumbDrawable?.setShapeModel(ShapeModel.create(context, thumbShape))
            mThumbForStrokeDrawable?.setShapeModel(ShapeModel.create(context, thumbShape))
            sThumbDrawable?.setShapeModel(ShapeModel.create(context, thumbShape))
        }
    }

    /**
     * Устанавливает новую форму скруглений для track по идентификатору стиля
     * @param context контекст
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setTrackShape(context: Context, @StyleRes shapeAppearanceId: Int) {
        trackDrawable ?: return
        if (trackShape != shapeAppearanceId) {
            trackShape = shapeAppearanceId
            trackDrawable?.setShapeModel(ShapeModel.create(context, trackShape))
        }
    }

    /**
     * Устанавливает новую форму скруглений для полосы прогресса (indicator) по идентификатору стиля
     * @param context контекст
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setIndicatorShape(context: Context, @StyleRes shapeAppearanceId: Int) {
        indicatorDrawable ?: return
        if (indicatorShape != shapeAppearanceId) {
            indicatorShape = shapeAppearanceId
            indicatorDrawable?.setShapeModel(ShapeModel.create(context, indicatorShape))
        }
    }

    /**
     * Устанавливает прогресс [newProgress], принимает значения от 0f до 1f
     */
    fun setProgress(newProgress: Float) {
        val clamped = newProgress.coerceIn(0f, 1f)
        progress = newProgress
        val position = (getTrackLength() - _thumbSize) * clamped
        updateThumbOffset(position)
    }

    /**
     * Рассчитывает смещение thumb.
     * @param position текущая позиция ползунка.
     * используется при обработке drug
     */
    fun updateThumbOffset(position: Float) {
        val track = (getTrackLength() - _thumbSize).coerceAtLeast(0)
        mThumbOffset = position.coerceIn(0f, track.toFloat())
        updateIndicatorBounds()
        indicatorDrawable?.bounds = indicatorRect
        updateThumbBounds()
        mThumbDrawable?.bounds = mThumbRect
        mThumbForStrokeDrawable?.bounds = mThumbStrokeRect
        progress = if (track > 0) mThumbOffset / track else 0f
        invalidateSelf()
    }

    /**
     * Рассчитывает смещение thumb.
     * используется при включении reversed
     */
    fun updateThumbOffset() {
        val track = (getTrackLength() - _thumbSize).coerceAtLeast(0)
        val position = progress * track
        updateThumbOffset(position)
    }

    private fun getTrackLength() = if (orientation == SliderView.HORIZONTAL) bounds.width() else bounds.height()

    /**
     * Вычисляет смещение прикосновения относительно смещения thumb
     * @param touch координата прикосновения по оси ориентации Slider
     */
    fun calculateDragOffset(touch: Float): Float {
        val touchOffset = touchToOffset(touch)
        return touchOffset - mThumbOffset
    }

    /**
     * Проверяет находится ли прикосновение в пределах thumb
     * @param x координата X
     * @param y координата Y
     */
    fun isTouchOnThumb(x: Float, y: Float): Boolean {
        return mThumbRect.contains(x.toInt(), y.toInt())
    }

    /**
     * Проверяет находится ли прикосновение в пределах track или indicator
     * @param x координата X
     * @param y координата Y
     */
    fun isTouchOnTrackOrIndicator(x: Float, y: Float): Boolean {
        return indicatorRect.contains(x.toInt(), y.toInt()) ||
            trackRect.contains(x.toInt(), y.toInt())
    }

    /**
     * Возвращает тощину всего SliderDarawable с учетом thumb
     */
    fun getSliderThickness() = thumbSize.coerceAtLeast(maxOf(trackThickness, indicatorThickness))

    /**
     * Возвращает Rect подвижной части - thumb
     */
    fun getThumbRect() = mThumbRect

    fun touchToOffset(touch: Float): Float {
        return when (orientation) {
            SliderView.HORIZONTAL -> {
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    (bounds.right - touch).coerceIn(0f, bounds.width().toFloat())
                } else {
                    (touch - bounds.left).coerceIn(0f, bounds.width().toFloat())
                }
            }

            SliderView.VERTICAL -> {
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    (touch - bounds.top).coerceIn(0f, bounds.height().toFloat())
                } else {
                    (bounds.bottom - touch).coerceIn(0f, bounds.height().toFloat())
                }
            }

            else -> 0f
        }
    }

    override fun draw(canvas: Canvas) {
        trackDrawable?.draw(canvas)
        indicatorDrawable?.draw(canvas)
        if (thumbEnabled) {
            mThumbDrawable?.draw(canvas)
            mThumbForStrokeDrawable?.draw(canvas)
        }
    }

    override fun setAlpha(alpha: Int) {
        trackDrawable?.alpha = alpha
        mThumbDrawable?.alpha = alpha
        mThumbForStrokeDrawable?.alpha = alpha
        sThumbDrawable?.alpha = alpha
        indicatorDrawable?.alpha = alpha
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        updateTrackBounds()
        trackDrawable?.bounds = trackRect
        updateIndicatorBounds()
        indicatorDrawable?.bounds = indicatorRect
        updateThumbBounds()
        mThumbDrawable?.bounds = mThumbRect
        mThumbForStrokeDrawable?.bounds = mThumbStrokeRect
    }

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun isStateful(): Boolean =
        thumbColorList.isStateful ||
            trackColorList.isStateful ||
            indicatorColorList.isStateful() ||
            thumbStrokeColorList.isStateful()

    override fun onStateChange(state: IntArray): Boolean {
        var change = false
        if (indicatorDrawable?.setState(state) == true) change = true
        if (trackDrawable?.setState(state) == true) change = true
        if (mThumbDrawable?.setState(state) == true) change = true
        if (mThumbForStrokeDrawable?.setState(state) == true) change = true
        if (sThumbDrawable?.setState(state) == true) change = true
        if (change) invalidateSelf()
        return super.onStateChange(state) || change
    }

    private fun updateIndicatorBounds() {
        val left: Int
        val top: Int
        val right: Int
        val bottom: Int
        val trackLength = if (orientation == SliderView.HORIZONTAL) bounds.width() else bounds.height()
        val extraOffset = if (thumbEnabled) thumbSize / 2 else 0
        val posOffset = if (thumbEnabled) mThumbOffset.roundToInt() else (trackLength * progress).roundToInt()
        when (orientation) {
            SliderView.VERTICAL -> {
                left = bounds.centerX() - indicatorThickness / 2
                right = left + indicatorThickness
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    top = bounds.top
                    bottom = top + posOffset + extraOffset
                } else {
                    bottom = bounds.bottom
                    top = bottom - posOffset - extraOffset
                }
            }

            else -> {
                top = bounds.centerY() - indicatorThickness / 2
                bottom = top + indicatorThickness
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    right = bounds.right
                    left = right - posOffset - extraOffset
                } else {
                    left = bounds.left
                    right = left + posOffset + extraOffset
                }
            }
        }
        indicatorRect.set(left, top, right, bottom)
    }

    private fun updateTrackBounds() {
        val trackLeft: Int
        val trackTop: Int
        val trackRight: Int
        val trackBottom: Int
        if (orientation == SliderView.VERTICAL) {
            trackLeft = bounds.centerX() - trackThickness / 2
            trackTop = bounds.top
            trackRight = trackLeft + trackThickness
            trackBottom = bounds.bottom
        } else {
            trackLeft = bounds.left
            trackTop = bounds.centerY() - trackThickness / 2
            trackRight = bounds.right
            trackBottom = trackTop + trackThickness
        }
        trackRect.set(trackLeft, trackTop, trackRight, trackBottom)
    }

    private fun updateThumbBounds() {
        val left: Int
        val top: Int
        val right: Int
        val bottom: Int
        val thumbOffset = mThumbOffset.roundToInt()
        when (orientation) {
            SliderView.VERTICAL -> {
                left = bounds.centerX() - thumbSize / 2
                right = left + thumbSize
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    top = bounds.top + thumbOffset
                    bottom = top + thumbSize
                } else {
                    bottom = bounds.bottom - thumbOffset
                    top = bottom - thumbSize
                }
            }

            else -> {
                top = bounds.centerY() - thumbSize / 2
                bottom = top + thumbSize
                if (sliderDirection == SLIDE_DIRECTION_REVERSED) {
                    right = bounds.right - thumbOffset
                    left = right - thumbSize
                } else {
                    left = bounds.left + thumbOffset
                    right = left + thumbSize
                }
            }
        }
        mThumbRect.set(left, top, right, bottom)
        mThumbStrokeRect.set(
            left + thumbStrokeWidth,
            top + thumbStrokeWidth,
            right - thumbStrokeWidth,
            bottom - thumbStrokeWidth,
        )
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.SdSliderDrawable, defStyleAttr) {
            _orientation = getInt(R.styleable.SdSliderDrawable_android_orientation, 0)
            _slideDirection = getInt(R.styleable.SdSliderDrawable_sd_slideDirection, 0)
            thumbEnabled = getBoolean(R.styleable.SdSliderDrawable_sd_thumbEnabled, true)
            getColorStateList(R.styleable.SdSliderDrawable_sd_trackColor)?.let { trackColorList = it }
            getColorStateList(R.styleable.SdSliderDrawable_sd_thumbColor)?.let { thumbColorList = it }
            getColorValueStateList(context, R.styleable.SdSliderDrawable_sd_strokeColor)?.let {
                thumbStrokeColorList = it
            }
            getColorValueStateList(context, R.styleable.SdSliderDrawable_sd_indicatorColor)?.let {
                indicatorColorList = it
            }
            _trackThickness = getDimensionPixelSize(R.styleable.SdSliderDrawable_sd_trackThickness, 2)
            _indicatorThickness = getDimensionPixelSize(R.styleable.SdSliderDrawable_sd_indicatorThickness, 2)
            _thumbSize = getDimensionPixelSize(R.styleable.SdSliderDrawable_sd_thumbSize, 0)
            thumbStrokeWidth = getDimensionPixelSize(R.styleable.SdSliderDrawable_sd_strokeWidth, 0)

            trackShape = getResourceId(R.styleable.SdSliderDrawable_sd_shapeAppearance, 0)
            indicatorShape = getResourceId(R.styleable.SdSliderDrawable_sd_indicatorShapeAppearance, 0)
            thumbShape = getResourceId(R.styleable.SdSliderDrawable_sd_thumbShapeAppearance, 0)
            if (indicatorShape == 0) indicatorShape = trackShape
            if (thumbShape == 0) thumbShape = trackShape
            trackDrawable = ShapeDrawable(ShapeModel.create(context, trackShape))
                .apply {
                    setTintList(trackColorList)
                    callback = this@SliderDrawable.callback
                }
            indicatorDrawable = ShapeDrawable(ShapeModel.create(context, indicatorShape)).apply {
                setTintValue(indicatorColorList)
                callback = this@SliderDrawable.callback
            }
            mThumbDrawable = ShapeDrawable(ShapeModel.create(context, thumbShape)).apply {
                setTintValue(thumbStrokeColorList)
                callback = this@SliderDrawable.callback
            }
            mThumbForStrokeDrawable = ShapeDrawable(ShapeModel.create(context, thumbShape)).apply {
                setTintList(thumbColorList)
                callback = this@SliderDrawable.callback
            }
            sThumbDrawable = ShapeDrawable(ShapeModel.create(context, thumbShape)).apply {
                setTintList(thumbColorList)
                callback = this@SliderDrawable.callback
            }
        }
    }

    companion object {

        /**
         * Константа для направления движения thumb от начала к концу либо снизу вверх.
         */
        const val SLIDE_DIRECTION_NORMAL = 0

        /**
         * Константа для направления движения thumb от конца к началу либо сверху вниз.
         */
        const val SLIDE_DIRECTION_REVERSED = 1
    }
}
