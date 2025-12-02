package com.sdds.uikit.internal.slider

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.Popover
import com.sdds.uikit.Popover.Companion.ALIGNMENT_CENTER
import com.sdds.uikit.Popover.Companion.PLACEMENT_MODE_LOOSE
import com.sdds.uikit.R
import com.sdds.uikit.Slider
import com.sdds.uikit.Tooltip
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.drawable.TextDrawable
import com.sdds.uikit.statelist.ColorValueStateList
import kotlin.math.roundToInt

/**
 * Компонент SliderView - линия прогресса, с возможностью установки ее значения,
 * посредством перемещения, расположенного на ней ползунка. Содержит Label для
 * отображения значений минимального и максимального прогресса, Value - для
 * отображения текущего значения прогресса. Value отображается с помощью компонента
 * [Tooltip] и располагается рядом с thumb.
 * @param context контекст.
 * @param attrs аттрибуты view.
 * @param defStyleAttr атрибут стиля по-умолчанию.
 */
internal class SliderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_sliderStyle,
) : View(context, attrs, defStyleAttr), ColorStateHolder, TextDrawable.Delegate {

    private val sliderDrawable: SliderDrawable = SliderDrawable(context, attrs, defStyleAttr)
        .apply { callback = this@SliderView }
    private var minLabelDrawable: TextDrawable = TextDrawable(context)
    private var maxLabelDrawable: TextDrawable = TextDrawable(context)
    private var isDragging: Boolean = false
    private var dragOffset: Float = 0f

    private var _progressListener: Slider.ProgressListener? = null
    private var _progressTransformer: Slider.ProgressFormatTransformer? = null

    private var _limitLabelAlignment: Int = Slider.LIMIT_LABEL_ALIGNMENT_END
    private var limitLabelMargin: Int = 0
    private var _limitLabelEnabled: Boolean = true

    private var limitLabelColorList: ColorStateList = ColorStateList.valueOf(Color.LTGRAY)
    private var _maxProgress: Float = MAX_PROGRESS
    private var _minProgress: Float = MIN_PROGRESS

    private var _orientation: Int = HORIZONTAL

    private val isVertical: Boolean get() = orientation == VERTICAL
    private val isHorizontal: Boolean get() = orientation == HORIZONTAL

    private var tooltip: Tooltip? = null
    private var tooltipPlacement: Int = Popover.PLACEMENT_TOP
    private var _valueMode: Int = Slider.VALUE_MODE_INTERACTION
    private val thumbGlobalRect = Rect()
    private var thumbPressed = false

    private var initialProgress: Float = 0f
    private var needToSetProgress: Boolean = false

    /**
     * Отображение ползунка (thumb).
     */
    var thumbEnabled: Boolean
        get() = sliderDrawable.thumbEnabled
        set(value) {
            sliderDrawable.thumbEnabled = value
        }

    /**
     * Отображение ползунка (thumb).
     */
    var limitLabelEnabled: Boolean
        get() = _limitLabelEnabled
        set(value) {
            if (_limitLabelEnabled != value) {
                _limitLabelEnabled = value
                requestLayout()
            }
        }

    /**
     * Направление шкалы Slider.
     */
    var slideDirection: Int
        get() = sliderDrawable.sliderDirection
        set(value) {
            sliderDrawable.sliderDirection = value
            updateDrawablesBounds()
            sliderDrawable.updateThumbOffset()
        }

    /**
     * Толщина трэка Slider.
     */
    var trackThickness: Int
        get() = sliderDrawable.trackThickness
        set(value) {
            sliderDrawable.trackThickness = value
            requestLayout()
        }

    /**
     * Толщина индикатора Slider.
     */
    var indicatorThickness: Int
        get() = sliderDrawable.indicatorThickness
        set(value) {
            sliderDrawable.indicatorThickness = value
            requestLayout()
        }

    /**
     * Размер ползунка (thumb) Slider.
     */
    var thumbSize: Int
        get() = sliderDrawable.thumbSize
        set(value) {
            sliderDrawable.thumbSize = value
            requestLayout()
        }

    /**
     * Ориентация Slider.
     */
    var orientation: Int
        get() = _orientation
        set(value) {
            if (_orientation != value) {
                _orientation = value
                requestLayout()
                sliderDrawable.orientation = value
            }
        }

    /**
     * Располжение limitLabel относительно шкалы Slider.
     */
    var limitLabelAlignment: Int
        get() = _limitLabelAlignment
        set(value) {
            if (_limitLabelAlignment != value) {
                val oldValue = _limitLabelAlignment
                _limitLabelAlignment = value
                if (limitLabelEnabled) {
                    if (oldValue == Slider.LIMIT_LABEL_ALIGNMENT_CENTER ||
                        _limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER
                    ) {
                        requestLayout()
                    } else {
                        updateDrawablesBounds()
                    }
                    invalidate()
                }
            }
        }

    /**
     * Максимальный прогресс
     */
    var maxProgress: Float
        get() = _maxProgress
        set(value) {
            if (_maxProgress != value) {
                val oldValue = getCurrentValue()
                _maxProgress = value
                if (limitLabelEnabled) {
                    updateMaxLabel()
                    if (orientation == HORIZONTAL) {
                        updateDrawablesBounds()
                    } else {
                        requestLayout()
                    }
                }
                setProgressValue(oldValue)
            }
        }

    /**
     * Минимальный прогресс
     */
    var minProgress: Float
        get() = _minProgress
        set(value) {
            if (_minProgress != value) {
                val oldValue = getCurrentValue()
                _minProgress = value
                if (limitLabelEnabled) {
                    updateMinLabel()
                    if (orientation == HORIZONTAL) {
                        updateDrawablesBounds()
                    } else {
                        requestLayout()
                    }
                }
                setProgressValue(oldValue)
            }
        }

    /**
     * Расположение значения текущего прогресса относительно ползунка (thumb)
     */
    var valueMode: Int
        get() = _valueMode
        set(value) {
            if (_valueMode != value) {
                _valueMode = value
                if (tooltip?.isShowing == true) {
                    if (valueMode == Slider.VALUE_MODE_NONE) tooltip?.dismiss()
                }
            }
        }

    /**
     * Расположение значения текущего прогресса относительно ползунка (thumb)
     */
    var valuePlacement: Int
        get() = tooltipPlacement
        set(value) {
            if (tooltipPlacement != value) {
                tooltipPlacement = value
                if (tooltip?.isShowing == true) {
                    tooltip?.dismiss()
                }
            }
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        isClickable = true
        clipToOutline = false
        obtainAttributes(attrs, defStyleAttr)
        minLabelDrawable.apply {
            setTintList(ColorStateList.valueOf(Color.TRANSPARENT))
            setTextColor(limitLabelColorList)
            text = _minProgress.toString()
            ellipsize = null
            callback = this@SliderView
        }
        maxLabelDrawable.apply {
            setTintList(ColorStateList.valueOf(Color.TRANSPARENT))
            setTextColor(limitLabelColorList)
            ellipsize = null
            text = _maxProgress.toString()
            callback = this@SliderView
        }
        updateDrawablesBounds()
        tooltip?.text = sliderDrawable.progress.toString()
        tooltip?.setTriggerLocationProvider { _, triggerRect ->
            val rect = sliderDrawable.getThumbRect()
            thumbGlobalRect.apply {
                set(rect)
                offset(triggerRect.left, triggerRect.top)
            }
        }
    }

    /**
     * Устанавливает стиль текста по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    fun setLimitLabelAppearance(@StyleRes appearanceId: Int) {
        maxLabelDrawable.setTextAppearance(context, appearanceId)
        minLabelDrawable.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает новую форму скруглений для ползунка (thumb) по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setThumbShape(@StyleRes shapeAppearanceId: Int) {
        sliderDrawable.setThumbShape(context, shapeAppearanceId)
    }

    /**
     * Устанавливает новую форму скруглений для track по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setTrackShape(@StyleRes shapeAppearanceId: Int) {
        sliderDrawable.setTrackShape(context, shapeAppearanceId)
    }

    /**
     * Устанавливает новую форму скруглений для полосы прогресса (indicator) по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setIndicatorShape(@StyleRes shapeAppearanceId: Int) {
        sliderDrawable.setIndicatorShape(context, shapeAppearanceId)
    }

    /**
     * Устанавливает отступ limitLabel от максимальной из двух величин -
     * толщины индикатора (indicator) и толщины трэка (track)
     * @param margin отступ
     */
    fun setLimitLabelMargin(margin: Int) {
        if (limitLabelMargin != margin) {
            limitLabelMargin = margin
            requestLayout()
            invalidate()
        }
    }

    /**
     * Устанавливает окрас [trackTint] для track.
     */
    fun setTrackTint(trackTint: ColorStateList?) {
        sliderDrawable.setTrackTint(trackTint)
    }

    /**
     * Устанавливает окрас [trackTint] для track.
     */
    fun setTrackTint(@ColorInt trackTint: Int) {
        setTrackTint(ColorStateList.valueOf(trackTint))
    }

    /**
     * Устанавливает окрас [thumbTint] для thumb.
     */
    fun setThumbTint(thumbTint: ColorStateList?) {
        sliderDrawable.setThumbTint(thumbTint)
    }

    /**
     * Устанавливает окрас [thumbTint] для thumb.
     */
    fun setThumbTint(@ColorInt thumbTint: Int) {
        setThumbTint(ColorStateList.valueOf(thumbTint))
    }

    /**
     * Устанавливает окрас [thumbStrokeTint] бордера для thumb.
     */
    fun setThumbStrokeTint(thumbStrokeTint: ColorValueStateList?) {
        sliderDrawable.setThumbStrokeTint(thumbStrokeTint)
    }

    /**
     * Устанавливает окрас [thumbStrokeTint] бордера для thumb.
     */
    fun setThumbStrokeTint(thumbStrokeTint: ColorStateList?) {
        setThumbStrokeTint(ColorValueStateList.valueOf(thumbStrokeTint))
    }

    /**
     * Устанавливает окрас [thumbStrokeTint] бордера для thumb.
     */
    fun setThumbStrokeTint(@ColorInt thumbStrokeTint: Int) {
        setThumbStrokeTint(ColorValueStateList.valueOf(thumbStrokeTint))
    }

    /**
     * Устанавливает окрас [indicatorTint] для indicator
     */
    fun setIndicatorTint(indicatorTint: ColorValueStateList?) {
        sliderDrawable.setIndicatorTint(indicatorTint)
    }

    /**
     * Устанавливает окрас [indicatorTint] для indicator
     */
    fun setIndicatorTint(indicatorTint: ColorStateList?) {
        setIndicatorTint(ColorValueStateList.valueOf(indicatorTint))
    }

    /**
     * Устанавливает окрас [indicatorTint] для indicator
     */
    fun setIndicatorTint(@ColorInt indicatorTint: Int) {
        setIndicatorTint(ColorValueStateList.valueOf(indicatorTint))
    }

    /**
     * Устанавливает цвета [limitLabelColor] для limitLabel
     */
    fun setLimitLabelColor(limitLabelColor: ColorStateList?) {
        minLabelDrawable.setTextColor(limitLabelColor)
        maxLabelDrawable.setTextColor(limitLabelColor)
    }

    /**
     * Устанавливает цвет [limitLabelColor] для limitLabel
     */
    fun setLimitLabelColor(@ColorInt limitLabelColor: Int) {
        setLimitLabelColor(ColorStateList.valueOf(limitLabelColor))
    }

    /**
     * Устанавливает толщину бордера у thumb [strokeWidth]
     */
    fun setStrokeWidth(strokeWidth: Int) {
        sliderDrawable.setStrokeWidth(strokeWidth)
    }

    /**
     * Устанавливает слушателя изменения прогресса
     */
    fun setProgressListener(progressListener: Slider.ProgressListener?) {
        _progressListener = progressListener
    }

    /**
     * Устанавливает преобразователь формата прогресса
     */
    fun setProgressFormatTransformer(progressTransformer: Slider.ProgressFormatTransformer?) {
        _progressTransformer = progressTransformer
        updateMinLabel()
        updateMaxLabel()
        updateToolTipText()
    }

    /**
     * Возвращает значение текущего прогресса, на основе установленных минимального и максимального значений.
     */
    fun getCurrentValue() = minProgress + (maxProgress - minProgress) * sliderDrawable.progress

    /**
     * Устанавливает значение [progress] прогресса в диапазоне от 0f до 1f
     */
    fun setProgress(progress: Float) {
        if (sliderDrawable.bounds.isEmpty) {
            initialProgress = progress
            needToSetProgress = true
        } else {
            sliderDrawable.setProgress(progress)
            _progressListener?.onProgressChanged(getCurrentValue())
            updateToolTipText()
            invalidate()
        }
    }

    /**
     * Устанавливает значение [value] прогресса в диапазоне от установленных значений minProgress и maxProgress
     */
    fun setProgressValue(value: Float) {
        val clamped = if (maxProgress > minProgress) {
            value.coerceIn(minProgress, maxProgress)
        } else {
            value.coerceIn(maxProgress, minProgress)
        }
        val progress = (clamped - minProgress) / (maxProgress - minProgress)
        setProgress(progress)
    }

    override fun onDrawableSizeChange() {
        requestLayout()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        sliderDrawable.draw(canvas)
        if (limitLabelEnabled) {
            if (!minLabelDrawable.bounds.isEmpty) minLabelDrawable.draw(canvas)
            if (!maxLabelDrawable.bounds.isEmpty) maxLabelDrawable.draw(canvas)
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateDrawablesBounds()
        if (needToSetProgress) {
            setProgress(initialProgress)
            needToSetProgress = false
        } else {
            sliderDrawable.updateThumbOffset()
            tooltip?.apply {
                setWindowWidth(ViewGroup.LayoutParams.MATCH_PARENT)
            }
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) ||
            who == sliderDrawable ||
            who == minLabelDrawable ||
            who == maxLabelDrawable
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        sliderDrawable.state = drawableState
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val wMode = MeasureSpec.getMode(widthMeasureSpec)
        val hMode = MeasureSpec.getMode(heightMeasureSpec)
        val wSize = MeasureSpec.getSize(widthMeasureSpec)
        val hSize = MeasureSpec.getSize(heightMeasureSpec)
        val maxContentThickness = getSliderThicknessWithLabel()
        val (desiredWidth, desiredHeight) = if (isHorizontal) {
            val height = paddingTop + paddingBottom + maxContentThickness
            val h = when (hMode) {
                MeasureSpec.EXACTLY -> hSize
                MeasureSpec.AT_MOST -> minOf(height, hSize)
                else -> height
            }
            wSize to h
        } else {
            val width = paddingLeft + paddingRight + maxContentThickness
            val w = when (wMode) {
                MeasureSpec.EXACTLY -> wSize
                MeasureSpec.AT_MOST -> minOf(width, wSize)
                else -> width
            }
            w to hSize
        }
        val width = resolveSize(desiredWidth, widthMeasureSpec)
        val height = resolveSize(desiredHeight, heightMeasureSpec)
        setMeasuredDimension(width, height)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val touch = if (isVertical) event?.y ?: 0f else event?.x ?: 0f
        return when (event?.actionMasked) {
            MotionEvent.ACTION_DOWN -> handleActionDown(event, touch)
            MotionEvent.ACTION_MOVE -> handleActionMove(event)
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDragging) {
                    isDragging = false
                    isPressed = false
                    parent.requestDisallowInterceptTouchEvent(false)
                    if (tooltip?.isShowing == true) tooltip?.dismiss()
                }
                if (event.actionMasked == MotionEvent.ACTION_UP && thumbPressed) {
                    performClick()
                }
                thumbPressed = false
                super.onTouchEvent(event)
            }

            else -> false
        }
    }

    private fun handleActionDown(event: MotionEvent, touch: Float): Boolean {
        return when {
            isOnThumb(event) || isOnTrack(event) -> {
                isPressed = true
                isDragging = true
                thumbPressed = true
                if (isOnTrack(event)) offsetToTouch(touch)
                followFinger(touch)
                super.onTouchEvent(event)
            }

            else -> false
        }
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }

    private fun handleActionMove(event: MotionEvent): Boolean {
        return if (isDragging) {
            isPressed = true
            updateSlideFromDrag(event)
            return true
        } else {
            false
        }
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        context.withStyledAttributes(attrs, R.styleable.SliderView, defStyleAttr) {
            _minProgress = getFloat(R.styleable.SliderView_sd_minProgress, MIN_PROGRESS)
            _maxProgress = getFloat(R.styleable.SliderView_sd_maxProgress, MAX_PROGRESS)
            minLabelDrawable.setTextAppearance(
                context,
                getResourceId(R.styleable.SliderView_sd_limitLabelAppearance, 0),
            )
            maxLabelDrawable.setTextAppearance(
                context,
                getResourceId(R.styleable.SliderView_sd_limitLabelAppearance, 0),
            )
            getColorStateList(R.styleable.SliderView_sd_limitLabelColor)?.let { limitLabelColorList = it }
            limitLabelMargin = getDimensionPixelSize(R.styleable.SliderView_sd_limitLabelMargin, 0)
            _limitLabelEnabled = getBoolean(R.styleable.SliderView_sd_limitLabelEnabled, true)
            tooltip = Tooltip(
                ContextThemeWrapper(
                    context, getResourceId(R.styleable.SliderView_sd_tooltipStyleOverlay, 0),
                ),
            ).apply {
                setTextGravity(Gravity.CENTER)
            }
            _valueMode = getInt(R.styleable.SliderView_sd_valueMode, 1)
            tooltipPlacement = getInt(R.styleable.SliderView_sd_valuePlacement, 1)
            _limitLabelAlignment = getInt(R.styleable.SliderView_sd_limitLabelAlignment, 2)
            _orientation = getInt(R.styleable.SliderView_android_orientation, 0)
        }
    }

    private fun offsetToTouch(touch: Float) {
        val offset = sliderDrawable.touchToOffset(touch) - thumbSize / 2
        sliderDrawable.updateThumbOffset(offset)
        _progressListener?.onProgressChanged(getCurrentValue())
        updateToolTipText()
        invalidate()
    }

    private fun followFinger(touch: Float) {
        parent.requestDisallowInterceptTouchEvent(true)
        dragOffset = sliderDrawable.calculateDragOffset(touch)
        if (tooltip?.isShowing == false && valueMode == Slider.VALUE_MODE_INTERACTION) showValue()
    }

    private fun updateSlideFromDrag(event: MotionEvent) {
        val rawTouch = if (isVertical) event.y else event.x
        val position = sliderDrawable.touchToOffset(rawTouch) - dragOffset
        sliderDrawable.updateThumbOffset(position)
        val currentProgress = sliderDrawable.progress
        _progressListener?.onProgressChanged(currentProgress)
        updateToolTipText()
        if (tooltip?.isShowing == true) {
            tooltip?.updateLocationPoint()
        }
    }

    private fun updateDrawablesBounds() {
        when {
            isHorizontal -> updateBoundsWhenHorizontal()
            isVertical -> updateBoundsWhenVertical()
            else -> {}
        }
    }

    private fun getLabelDrawables(): Pair<Drawable, Drawable> {
        val startLabel = if (slideDirection == SliderDrawable.SLIDE_DIRECTION_NORMAL) {
            minLabelDrawable
        } else {
            maxLabelDrawable
        }
        val endLabel = if (slideDirection == SliderDrawable.SLIDE_DIRECTION_REVERSED) {
            minLabelDrawable
        } else {
            maxLabelDrawable
        }
        return startLabel to endLabel
    }

    private fun getStartLabelWidthHeight(startLabel: Drawable): Pair<Int, Int> {
        val startW = if (limitLabelEnabled) startLabel.intrinsicWidth else 0
        val startH = if (limitLabelEnabled) startLabel.intrinsicHeight else 0
        return startW to startH
    }

    private fun getEndLabelWidthHeight(endLabel: Drawable): Pair<Int, Int> {
        val endW = if (limitLabelEnabled) endLabel.intrinsicWidth else 0
        val endH = if (limitLabelEnabled) endLabel.intrinsicHeight else 0
        return endW to endH
    }

    private fun setBoundsWhenUnknowAlignment(pL: Int, pT: Int, pR: Int, pB: Int) {
        minLabelDrawable.setBounds(0, 0, 0, 0)
        maxLabelDrawable.setBounds(0, 0, 0, 0)
        sliderDrawable.setBounds(pL, pT, width - pR, height - pB)
    }

    private fun updateBoundsWhenHorizontal() {
        val (startLabel, endLabel) = getLabelDrawables()
        val (startW, startH) = getStartLabelWidthHeight(startLabel)
        val (endW, endH) = getEndLabelWidthHeight(endLabel)
        val sliderThickness = sliderDrawable.getSliderThickness()
        val pL = paddingLeft
        val pT = paddingTop
        val pR = paddingRight
        val pB = paddingBottom
        val margin = if (limitLabelEnabled) limitLabelMargin else 0
        when (limitLabelAlignment) {
            Slider.LIMIT_LABEL_ALIGNMENT_CENTER -> {
                sliderDrawable.setBounds(
                    pL + startW + margin,
                    height / 2 - sliderThickness / 2,
                    width - pR - endW - margin,
                    height / 2 + sliderThickness / 2,
                )
                startLabel.setBounds(pL, height / 2 - startH / 2, pL + startW, height / 2 + startH / 2)
                endLabel.setBounds(width - pR - endW, height / 2 - endH / 2, width - pR, height / 2 + endH / 2)
            }

            Slider.LIMIT_LABEL_ALIGNMENT_START -> {
                sliderDrawable.setBounds(pL, height - pB - sliderThickness, width - pR, height - pB)
                startLabel.setBounds(pL, pT, pL + startW, pT + startH)
                endLabel.setBounds(width - pR - endW, pT, width - pR, pT + endH)
            }

            Slider.LIMIT_LABEL_ALIGNMENT_END -> {
                sliderDrawable.setBounds(pL, pT, width - pR, pT + sliderThickness)
                startLabel.setBounds(pL, height - pB - startH, pL + startW, height - pB)
                endLabel.setBounds(width - pR - endW, height - pB - endH, width - pR, height - pB)
            }

            else -> setBoundsWhenUnknowAlignment(pL, pT, pR, pB)
        }
    }

    private fun updateBoundsWhenVertical() {
        val (startLabel, endLabel) = getLabelDrawables()
        val (startW, startH) = getStartLabelWidthHeight(startLabel)
        val (endW, endH) = getEndLabelWidthHeight(endLabel)
        val sThickness = sliderDrawable.getSliderThickness()
        val lineThickness = maxOf(trackThickness, indicatorThickness)
        val extra = if (thumbSize > lineThickness) (thumbSize / 2 - lineThickness / 2) else 0
        val pL = paddingLeft
        val pT = paddingTop
        val pR = paddingRight
        val pB = paddingBottom
        val margin = if (limitLabelEnabled) limitLabelMargin else 0
        val halfW = width / 2
        when (limitLabelAlignment) {
            Slider.LIMIT_LABEL_ALIGNMENT_CENTER -> {
                sliderDrawable.setBounds(
                    halfW - sThickness / 2,
                    pT + endH + margin,
                    halfW + sThickness / 2,
                    height - pB - startH - margin,
                )
                val startLabelLeft = (halfW - startW / 2f).roundToInt()
                val endLabelLeft = (halfW - startW / 2f).roundToInt()
                startLabel.setBounds(startLabelLeft, height - pB - startH, startLabelLeft + startW, height - pB)
                endLabel.setBounds(endLabelLeft, pT, endLabelLeft + endW, pT + endH)
            }

            Slider.LIMIT_LABEL_ALIGNMENT_START -> {
                sliderDrawable.setBounds(width - pR - sThickness, pT, width - pR, height - pB)
                startLabel.setBounds(
                    width - pR - sThickness + extra - margin - startW,
                    height - pB - startH,
                    width - pR - sThickness + extra - margin,
                    height - pB,
                )
                endLabel.setBounds(
                    width - pR - sThickness + extra - margin - endW,
                    pT,
                    width - pR - sThickness + extra - margin,
                    pT + endH,
                )
            }

            Slider.LIMIT_LABEL_ALIGNMENT_END -> {
                sliderDrawable.setBounds(pL, pT, pL + sThickness, height - pB)
                startLabel.setBounds(
                    pL + sThickness - extra + margin,
                    height - pB - startH,
                    pL + sThickness - extra + margin + startW,
                    height - pB,
                )
                endLabel.setBounds(
                    pL + sThickness - extra + margin,
                    pT,
                    pL + sThickness - extra + margin + endW,
                    pT + endH,
                )
            }

            else -> setBoundsWhenUnknowAlignment(pL, pT, pR, pB)
        }
    }

    private fun isOnThumb(event: MotionEvent): Boolean {
        return sliderDrawable.isTouchOnThumb(event.x, event.y)
    }

    private fun isOnTrack(event: MotionEvent): Boolean {
        return sliderDrawable.isTouchOnTrackOrIndicator(event.x, event.y)
    }

    private fun getSliderThicknessWithLabel(): Int {
        val sliderThickness = sliderDrawable.getSliderThickness()
        val lineThickness = maxOf(trackThickness, indicatorThickness)
        val extra = if (thumbSize > lineThickness) (thumbSize / 2 - lineThickness / 2) else 0
        val limitLabelThickness = if (isHorizontal) getLimitLabelsHeight() else getLimitLabelsWidth()
        return if (limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER) {
            maxOf(sliderThickness, limitLabelThickness) + 1
        } else {
            lineThickness + extra + limitLabelThickness + 1
        }
    }

    private fun getLimitLabelsWidth(): Int {
        if (!limitLabelEnabled) return 0
        val width = if (isHorizontal) {
            if (limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER) {
                minLabelDrawable.intrinsicWidth + maxLabelDrawable.intrinsicWidth + 2 * limitLabelMargin
            } else {
                0
            }
        } else {
            if (limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER) {
                maxOf(minLabelDrawable.intrinsicWidth, maxLabelDrawable.intrinsicWidth)
            } else {
                maxOf(minLabelDrawable.intrinsicWidth, maxLabelDrawable.intrinsicWidth) + limitLabelMargin
            }
        }
        return width
    }

    private fun getLimitLabelsHeight(): Int {
        if (!limitLabelEnabled) return 0
        val height = if (isVertical) {
            if (limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER) {
                minLabelDrawable.intrinsicHeight + maxLabelDrawable.intrinsicHeight + 2 * limitLabelMargin
            } else {
                0
            }
        } else {
            if (limitLabelAlignment == Slider.LIMIT_LABEL_ALIGNMENT_CENTER) {
                maxOf(minLabelDrawable.intrinsicHeight, maxLabelDrawable.intrinsicHeight)
            } else {
                maxOf(minLabelDrawable.intrinsicHeight, maxLabelDrawable.intrinsicHeight) + limitLabelMargin
            }
        }
        return height
    }

    private fun updateMinLabel() {
        minLabelDrawable.text = _progressTransformer?.transform(minProgress) ?: minProgress.toString()
    }

    private fun updateMaxLabel() {
        maxLabelDrawable.text = _progressTransformer?.transform(maxProgress) ?: maxProgress.toString()
    }

    private fun updateToolTipText() {
        val realValue = getCurrentValue()
        val tooltipText = _progressTransformer?.transform(realValue)
        tooltip?.text = tooltipText ?: realValue.toString()
    }

    private fun showValue() {
        tooltip?.showWithTrigger(
            trigger = this@SliderView,
            placement = valuePlacement,
            alignment = ALIGNMENT_CENTER,
            placementMode = PLACEMENT_MODE_LOOSE,
            tailEnabled = true,
        )
    }

    companion object {
        /**
         * Константа дефолтного максимального прогресса.
         */
        const val MAX_PROGRESS = 1f

        /**
         * Константа дефолтного минимального прогресса.
         */
        const val MIN_PROGRESS = 0f

        /**
         * Константа для горизонтальной ориентации.
         */
        const val HORIZONTAL = 0

        /**
         * Константа для вертикальной ориентации.
         */
        const val VERTICAL = 1
    }
}
