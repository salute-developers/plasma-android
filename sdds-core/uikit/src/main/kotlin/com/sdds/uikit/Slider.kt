package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.slider.SliderView
import com.sdds.uikit.internal.slider.SliderView.Companion.MAX_PROGRESS
import com.sdds.uikit.internal.slider.SliderView.Companion.MIN_PROGRESS
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.getColorValueStateList

/**
 * Компонент Slider - применяется для указания значения (value)
 * из заданного диапозона. Представляет собой контейнер для отображения [SliderView]
 * совместно с Label, блоком, включающим в себя заголовок (title)
 * и иконку (icon), с возможностью конфигурирования расположения этих блоков.
 * @param context контекст.
 * @param attrs аттрибуты view.
 * @param defStyleAttr атрибут стиля по-умолчанию.
 * @param defStyleRes стиль по умолчанию.
 */
open class Slider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_sliderStyle,
    defStyleRes: Int = R.style.Sdds_Components_Slider,
) : LinearLayout(context, attrs), ColorStateHolder {

    private val sliderView: SliderView = SliderView(context)
    private val label: LinearLayout = LinearLayout(context).apply {
        orientation = HORIZONTAL
        layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    }
    private var _labelMargin: Int = 0

    @StyleRes
    private var titleAppearance: Int = 0
    private val titleTv: TextView = TextView(context)
    private var _title: CharSequence? = null

    @DrawableRes
    private var icon: Int = 0
    private var titleMargin: Int = 0
    private var titleColor: ColorStateList? = null

    private var iconTint: ColorStateList? = null
    private var _iconSize: Int = 0

    private var _titleAlignment: Int = TITLE_ALIGNMENT_NONE
    private var _alignment: Int = ALIGNMENT_START
    private var _labelAlignment: Int = LABEL_ALIGNMENT_CENTER

    private var _progressTransformer: ProgressFormatTransformer? = null
    private var _progressListener: ProgressListener? = null

    private val iconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    /**
     * Отображение ползунка (thumb)
     */
    open var thumbEnabled: Boolean
        get() = sliderView.thumbEnabled
        set(value) {
            sliderView.thumbEnabled = value
        }

    /**
     * Отображение Label
     */
    open var labelEnabled: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                label.isVisible = value
            }
        }

    /**
     * Отображение limitLabel
     */
    open var limitLabelEnabled: Boolean
        get() = sliderView.limitLabelEnabled
        set(value) {
            sliderView.limitLabelEnabled = value
        }

    /**
     * Направление шкалы Slider.
     */
    open var slideDirection: Int
        get() = sliderView.slideDirection
        set(value) {
            sliderView.slideDirection = value
        }

    /**
     * Расположение текста в Label
     */
    open var titleAlignment: Int
        get() = _titleAlignment
        set(value) {
            if (_titleAlignment != value) {
                _titleAlignment = value
                if (value != TITLE_ALIGNMENT_NONE) labelRecomposition()
                titleTv.isVisible = value != TITLE_ALIGNMENT_NONE
            }
        }

    /**
     * Выравнивание всего контента
     */
    open var alignment: Int
        get() = _alignment
        set(value) {
            if (_alignment != value) {
                val previousAlignment = _alignment
                _alignment = value
                updateAlignment(previousAlignment)
            }
        }

    /**
     * Расположение Label
     */
    open var labelAlignment: Int
        get() = _labelAlignment
        set(value) {
            if (_labelAlignment != value) {
                _labelAlignment = value
                updateLabelAlignment()
            }
        }

    /**
     * Расположение limitLabel
     */
    open var limitLabelAlignment: Int
        get() = sliderView.limitLabelAlignment
        set(value) {
            sliderView.limitLabelAlignment = value
        }

    /**
     * Заголовок
     */
    open var title: CharSequence?
        get() = _title
        set(value) {
            if (_title != value) {
                _title = value
                titleTv.text = _title
            }
        }

    /**
     * Максимальный прогресс
     */
    open var maxProgress: Float
        get() = sliderView.maxProgress
        set(value) {
            sliderView.maxProgress = value
        }

    /**
     * Минимальный прогресс
     */
    open var minProgress: Float
        get() = sliderView.minProgress
        set(value) {
            sliderView.minProgress = value
        }

    /**
     * Толщина track
     */
    open var trackThickness: Int
        get() = sliderView.trackThickness
        set(value) {
            sliderView.trackThickness = value
        }

    /**
     * Толщина indicator
     */
    open var indicatorThickness: Int
        get() = sliderView.indicatorThickness
        set(value) {
            sliderView.indicatorThickness = value
        }

    /**
     * Размер thumb
     */
    open var thumbSize: Int
        get() = sliderView.thumbSize
        set(value) {
            sliderView.thumbSize = value
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
                sliderView.colorState = value
            }
        }

    init {
        clipToPadding = false
        clipChildren = false
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        createContentLayoutParams()
        labelInitialization()
        createSliderLayoutParams()
        containerInitialization()
        titleTv.isVisible = _titleAlignment != TITLE_ALIGNMENT_NONE
    }

    /**
     * Устанавливает иконку из ресурсов по идентификатору
     * @param iconRes идентификатор ресурса иконки
     */
    open fun setIconResource(@DrawableRes iconRes: Int) {
        if (icon != iconRes) {
            icon = iconRes
            if (iconRes != 0) {
                installIcon()
                applyIconSettings()
                labelRecomposition()
            }
        }
    }

    /**
     * Устанавливает отступ limitLabel от максимальной из двух величин -
     * толщины индикатора (indicator) и толщины трэка (track)
     * @param margin отступ
     */
    open fun setLimitLabelMargin(margin: Int) {
        sliderView.setLimitLabelMargin(margin)
    }

    /**
     * Устанавливает стиль текста в limitLabel по идентификатору стиля
     * @param appearanceId идентификатор стиля текста
     */
    open fun setLimitLabelAppearance(@StyleRes appearanceId: Int) {
        sliderView.setLimitLabelAppearance(appearanceId)
    }

    /**
     * Устанавливает слушателя изменения прогресса [progressListener]
     */
    fun setProgressListener(progressListener: ProgressListener) {
        _progressListener = progressListener
        sliderView.setProgressListener(progressListener)
    }

    /**
     * Устанавливает преобразователь формата прогресса [progressTransformer]
     */
    open fun setProgressFormatTransformer(progressTransformer: ProgressFormatTransformer) {
        _progressTransformer = progressTransformer
        sliderView.setProgressFormatTransformer(progressTransformer)
    }

    /**
     * Устанавливает режим отображения [valueMode]
     */
    open fun setValueMode(valueMode: Int) {
        sliderView.valueMode = valueMode
    }

    /**
     * Устанавливает расположение [valuePlacement] относительно thumb
     */
    open fun setValuePlacement(valuePlacement: Int) {
        sliderView.valuePlacement = valuePlacement
    }

    /**
     * Устанавливает окрас [trackTint] для track.
     */
    fun setTrackTint(trackTint: ColorStateList?) {
        sliderView.setTrackTint(trackTint)
    }

    /**
     * Устанавливает цвета [trackTint] для track.
     */
    fun setTrackTint(@ColorInt trackTint: Int) {
        setTrackTint(ColorStateList.valueOf(trackTint))
    }

    /**
     * Устанавливает окрас [thumbTint] для thumb.
     */
    fun setThumbTint(thumbTint: ColorStateList?) {
        sliderView.setThumbTint(thumbTint)
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
        sliderView.setThumbStrokeTint(thumbStrokeTint)
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
        sliderView.setIndicatorTint(indicatorTint)
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
     * Устанавливает ноыую форму скруглений для ползунка (thumb) по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setThumbShape(@StyleRes shapeAppearanceId: Int) {
        sliderView.setThumbShape(shapeAppearanceId)
    }

    /**
     * Устанавливает ноыую форму скруглений для track по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setTrackShape(@StyleRes shapeAppearanceId: Int) {
        sliderView.setTrackShape(shapeAppearanceId)
    }

    /**
     * Устанавливает ноыую форму скруглений для полосы прогресса (indicator) по идентификатору стиля
     * @param shapeAppearanceId идентификатор стиля формы скруглений
     */
    fun setIndicatorShape(@StyleRes shapeAppearanceId: Int) {
        sliderView.setIndicatorShape(shapeAppearanceId)
    }

    /**
     * Возвращает значение текущего прогресса, на основе установленных минимального и максимального значений.
     */
    fun getCurrentValue() {
        sliderView.getCurrentValue()
    }

    /**
     * Устанавливает значение [progress] прогресса в диапазоне от 0f до 1f
     */
    fun setProgress(progress: Float) {
        sliderView.setProgress(progress)
    }

    /**
     * Устанавливает значение [value] прогресса в диапазоне от утсановленных значений minProgress и maxProgress
     */
    fun setProgressValue(value: Float) {
        sliderView.setProgressValue(value)
    }

    /**
     * Слушатель прогресса
     */
    fun interface ProgressListener {

        /**
         * Колбэк изменения прогресса
         * @param progress текущее значение прогресса
         */
        fun onProgressChanged(progress: Float)
    }

    /**
     * Преобразователь формата отображаемого прогресса
     */
    fun interface ProgressFormatTransformer {

        /**
         * Колбэк изменения формата
         * @param progress текущее значение прогресса
         */
        fun transform(progress: Float): String
    }

    override fun setOrientation(orientation: Int) {
        if (sliderView != null) {
            if ((_labelAlignment == LABEL_ALIGNMENT_TOP || _labelAlignment == LABEL_ALIGNMENT_BOTTOM) &&
                orientation == HORIZONTAL
            ) {
                super.setOrientation(VERTICAL)
            } else {
                super.setOrientation(orientation)
            }
            sliderView.orientation = orientation
            whenOrientationChanged()
        } else {
            super.setOrientation(orientation)
        }
    }

    override fun getOrientation(): Int {
        val orientation = sliderView?.let { if (sliderView.orientation == HORIZONTAL) HORIZONTAL else VERTICAL }
        return orientation ?: super.getOrientation()
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.Slider, defStyleAttr, defStyleRes) {
            sliderView.setProgress(getFloat(R.styleable.Slider_sd_progress, MIN_PROGRESS))
            sliderView.minProgress = getFloat(R.styleable.Slider_sd_minProgress, MIN_PROGRESS)
            sliderView.maxProgress = getFloat(R.styleable.Slider_sd_maxProgress, MAX_PROGRESS)
            sliderView.thumbEnabled = getBoolean(R.styleable.Slider_sd_thumbEnabled, true)
            sliderView.limitLabelEnabled = getBoolean(R.styleable.Slider_sd_limitLabelEnabled, true)
            sliderView.limitLabelAlignment =
                getInt(R.styleable.Slider_sd_limitLabelAlignment, LIMIT_LABEL_ALIGNMENT_END)
            sliderView.setLimitLabelMargin(getDimensionPixelSize(R.styleable.Slider_sd_limitLabelMargin, 0))
            sliderView.setLimitLabelAppearance(getResourceId(R.styleable.Slider_sd_limitLabelAppearance, 0))
            getColorStateList(R.styleable.Slider_sd_limitLabelColor)?.let {
                sliderView.setLimitLabelColor(it)
            }
            sliderView.valuePlacement = getInt(R.styleable.Slider_sd_valuePlacement, Popover.PLACEMENT_TOP)
            sliderView.valueMode = getInt(R.styleable.Slider_sd_valueMode, VALUE_MODE_INTERACTION)
            sliderView.slideDirection = getInt(R.styleable.Slider_sd_slideDirection, SLIDE_DIRECTION_NORMAL)
            getColorStateList(R.styleable.Slider_sd_trackColor)?.let {
                sliderView.setTrackTint(it)
            }
            getColorStateList(R.styleable.Slider_sd_thumbColor)?.let {
                sliderView.setThumbTint(it)
            }
            getColorValueStateList(context, R.styleable.Slider_sd_strokeColor)?.let {
                sliderView.setThumbStrokeTint(it)
            }
            getColorValueStateList(context, R.styleable.Slider_sd_indicatorColor)?.let {
                sliderView.setIndicatorTint(it)
            }
            sliderView.trackThickness = getDimensionPixelSize(R.styleable.Slider_sd_trackThickness, 0)
            sliderView.indicatorThickness = getDimensionPixelSize(R.styleable.Slider_sd_indicatorThickness, 0)
            sliderView.setStrokeWidth(getDimensionPixelSize(R.styleable.Slider_sd_strokeWidth, 0))
            sliderView.thumbSize = (getDimensionPixelSize(R.styleable.Slider_sd_thumbSize, 0))
            sliderView.setThumbShape(getResourceId(R.styleable.Slider_sd_thumbShapeAppearance, 0))
            sliderView.setIndicatorShape(getResourceId(R.styleable.Slider_sd_indicatorShapeAppearance, 0))
            sliderView.setTrackShape(getResourceId(R.styleable.Slider_sd_shapeAppearance, 0))

            _title = getString(R.styleable.Slider_sd_title)
            titleColor = getColorStateList(R.styleable.Slider_sd_titleColor)
            titleAppearance = getResourceId(R.styleable.Slider_sd_titleAppearance, 0)
            _titleAlignment = getInt(R.styleable.Slider_sd_titleAlignment, 0)
            titleMargin = getDimensionPixelSize(R.styleable.Slider_sd_titleMargin, 0)
            titleTv.isVisible = _titleAlignment != TITLE_ALIGNMENT_NONE

            icon = getResourceId(R.styleable.Slider_sd_icon, 0)
            _iconSize = getDimensionPixelSize(R.styleable.Slider_sd_iconSize, 0)
            iconTint = getColorStateList(R.styleable.Slider_sd_iconTint)

            _labelMargin = getDimensionPixelSize(R.styleable.Slider_sd_labelMargin, 0)
            labelEnabled = getBoolean(R.styleable.Slider_sd_labelEnabled, true)
            _labelAlignment = getInt(R.styleable.Slider_sd_labelAlignment, 0)
            _alignment = getInt(R.styleable.Slider_sd_alignment, 0)
            val orientation = getInt(R.styleable.Slider_android_orientation, 0)
            orientationInitialization(orientation)
        }
    }

    private fun orientationInitialization(orientation: Int) {
        if ((_labelAlignment == LABEL_ALIGNMENT_TOP || _labelAlignment == LABEL_ALIGNMENT_BOTTOM) &&
            orientation == HORIZONTAL
        ) {
            super.setOrientation(VERTICAL)
        } else {
            super.setOrientation(orientation)
        }
        sliderView.orientation = orientation
    }

    private fun createContentLayoutParams() {
        label.layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        titleTv.layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        iconView.layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    }

    private fun labelInitialization() {
        updateLabelOrientation()
        installIcon()
        applyIconSettings()
        setTitleAppearanceAndColor()
        labelRecomposition()
        updateLabelContentGravity()
    }

    private fun updateLabelOrientation() {
        label.orientation =
            if (sliderView.orientation == VERTICAL && _alignment == ALIGNMENT_CENTER) {
                VERTICAL
            } else {
                HORIZONTAL
            }
    }

    private fun installIcon() {
        if (icon != 0) {
            iconView.setImageDrawable(
                AppCompatResources.getDrawable(context, icon),
            )
        }
    }

    private fun applyIconSettings() {
        if (_iconSize > 0) {
            val lp = (iconView.layoutParams as? MarginLayoutParams) ?: return
            lp.width = _iconSize
            lp.height = _iconSize
            iconView.layoutParams = lp
        }
        iconView.imageTintList = iconTint
        iconView.isVisible = (icon != 0)
    }

    private fun updateTitleLayoutParams() {
        val lp = titleTv.layoutParams as? MarginLayoutParams ?: return
        if (iconView.isVisible) {
            if (label.orientation == HORIZONTAL) {
                lp.marginStart = if (titleAlignment == TITLE_ALIGNMENT_END) titleMargin else 0
                lp.marginEnd = if (titleAlignment == TITLE_ALIGNMENT_START) titleMargin else 0
            } else {
                lp.topMargin = if (titleAlignment == TITLE_ALIGNMENT_END) titleMargin else 0
                lp.bottomMargin = if (titleAlignment == TITLE_ALIGNMENT_START) titleMargin else 0
            }
        }
        titleTv.layoutParams = lp
    }

    private fun setTitleAppearanceAndColor() {
        titleTv.apply {
            if (titleAppearance != 0) setTextAppearance(titleAppearance)
            titleColor?.let { setTextColor(it) }
            text = _title
        }
    }

    private fun labelRecomposition() {
        when (titleAlignment) {
            TITLE_ALIGNMENT_END -> {
                label.removeAllViews()
                label.addView(iconView)
                label.addView(titleTv)
            }

            TITLE_ALIGNMENT_START -> {
                label.removeAllViews()
                label.addView(titleTv)
                label.addView(iconView)
            }

            else -> {}
        }
        updateTitleLayoutParams()
    }

    private fun updateLabelContentGravity() {
        val newGravity = if (label.orientation == HORIZONTAL) Gravity.CENTER_VERTICAL else Gravity.CENTER_HORIZONTAL
        label.gravity = newGravity
        val titleLP = titleTv.layoutParams.apply { gravity = newGravity }
        val iconLP = iconView.layoutParams.apply { gravity = newGravity }
        titleTv.layoutParams = titleLP
        iconView.layoutParams = iconLP
    }

    private fun createSliderLayoutParams() {
        sliderView.layoutParams = when (super.getOrientation()) {
            HORIZONTAL -> LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
            else -> LayoutParams(LayoutParams.WRAP_CONTENT, 0, 1f)
        }
    }

    private fun containerInitialization() {
        sliderRecomposition()
        updateLabelMargins()
        updateSliderGravity()
        updateLabelGravity()
    }

    private fun sliderRecomposition() {
        when (sliderView.orientation) {
            VERTICAL -> verticalSliderRecomposition()
            else -> horizontalSliderRecomposition()
        }
    }

    private fun horizontalSliderRecomposition() {
        if (_labelAlignment == LABEL_ALIGNMENT_CENTER) {
            if (_alignment == ALIGNMENT_END || _alignment == ALIGNMENT_START) removeAllViews()
            when (_alignment) {
                ALIGNMENT_END -> {
                    addView(sliderView)
                    addView(label)
                }

                ALIGNMENT_START -> {
                    addView(label)
                    addView(sliderView)
                }

                else -> {}
            }
        } else {
            if ((_labelAlignment == LABEL_ALIGNMENT_BOTTOM || _labelAlignment == LABEL_ALIGNMENT_TOP) &&
                _alignment != ALIGNMENT_CENTER
            ) {
                removeAllViews()
            }

            if (_labelAlignment == LABEL_ALIGNMENT_BOTTOM) {
                addView(sliderView)
                addView(label)
            } else {
                addView(label)
                addView(sliderView)
            }
        }
    }

    private fun verticalSliderRecomposition() {
        if (_labelAlignment == LABEL_ALIGNMENT_BOTTOM || _labelAlignment == LABEL_ALIGNMENT_TOP) {
            removeAllViews()
        }
        when (_labelAlignment) {
            LABEL_ALIGNMENT_BOTTOM -> {
                addView(sliderView)
                addView(label)
            }

            LABEL_ALIGNMENT_TOP -> {
                addView(label)
                addView(sliderView)
            }

            else -> {}
        }
    }

    private fun updateLabelMargins() {
        val lp = (label.layoutParams as? MarginLayoutParams) ?: return
        when {
            !labelEnabled -> lp.setMargins(0, 0, 0, 0)
            sliderView.orientation == HORIZONTAL && _labelAlignment == LABEL_ALIGNMENT_TOP ->
                lp.setMargins(0, 0, 0, _labelMargin)

            sliderView.orientation == HORIZONTAL && _labelAlignment == LABEL_ALIGNMENT_BOTTOM ->
                lp.setMargins(0, _labelMargin, 0, 0)

            sliderView.orientation == HORIZONTAL && _labelAlignment == LABEL_ALIGNMENT_CENTER -> {
                if (_alignment == ALIGNMENT_START) {
                    lp.setMargins(0, 0, _labelMargin, 0)
                } else {
                    lp.setMargins(_labelMargin, 0, 0, 0)
                }
            }

            sliderView.orientation == VERTICAL -> {
                when (_labelAlignment) {
                    LABEL_ALIGNMENT_TOP -> {
                        lp.setMargins(0, 0, 0, _labelMargin)
                    }

                    LABEL_ALIGNMENT_BOTTOM -> {
                        lp.setMargins(0, _labelMargin, 0, 0)
                    }

                    else -> {}
                }
            }
        }
        label.layoutParams = lp
    }

    private fun updateSliderGravity() {
        var newGravity = Gravity.START
        when {
            orientation == HORIZONTAL && labelAlignment == LABEL_ALIGNMENT_CENTER -> {
                newGravity = Gravity.TOP
            }

            orientation == VERTICAL -> {
                newGravity = when (_alignment) {
                    ALIGNMENT_START -> Gravity.START
                    ALIGNMENT_CENTER -> Gravity.CENTER_HORIZONTAL
                    else -> Gravity.END
                }
            }
        }
        val lp = sliderView.layoutParams.apply { gravity = newGravity }
        sliderView.layoutParams = lp
    }

    private fun updateLabelGravity() {
        var newGravity = Gravity.START
        when {
            orientation == HORIZONTAL && labelAlignment != LABEL_ALIGNMENT_CENTER -> {
                newGravity = if (alignment == ALIGNMENT_END) Gravity.END else Gravity.START
            }

            orientation == HORIZONTAL && labelAlignment == LABEL_ALIGNMENT_CENTER -> {
                newGravity = if (alignment == ALIGNMENT_END) {
                    Gravity.END or Gravity.TOP
                } else {
                    Gravity.START or Gravity.TOP
                }
            }

            orientation == VERTICAL -> {
                newGravity = when (_alignment) {
                    ALIGNMENT_START -> Gravity.START
                    ALIGNMENT_CENTER -> Gravity.CENTER_HORIZONTAL
                    else -> Gravity.END
                }
            }
        }
        val lp = label.layoutParams.apply { gravity = newGravity }
        label.layoutParams = lp
    }

    private fun updateAlignment(previousAlignment: Int) {
        when {
            sliderView.orientation == HORIZONTAL && _alignment != ALIGNMENT_CENTER -> {
                if (_labelAlignment != LABEL_ALIGNMENT_CENTER) {
                    updateSliderGravity()
                    updateLabelGravity()
                } else {
                    containerInitialization()
                }
            }

            sliderView.orientation == VERTICAL && _labelAlignment != LABEL_ALIGNMENT_CENTER -> {
                if (previousAlignment == ALIGNMENT_CENTER || _alignment == ALIGNMENT_CENTER) {
                    updateLabelOrientation()
                    labelRecomposition()
                    updateLabelContentGravity()
                    containerInitialization()
                } else {
                    containerInitialization()
                }
            }

            else -> {}
        }
    }

    private fun updateLabelAlignment() {
        orientationInitialization(sliderView.orientation)
        createSliderLayoutParams()
        if (labelEnabled) {
            updateLabelOrientation()
            labelRecomposition()
            updateLabelContentGravity()
            containerInitialization()
        }
    }

    private fun whenOrientationChanged() {
        createSliderLayoutParams()
        updateLabelOrientation()
        updateTitleLayoutParams()
    }

    companion object {

        /**
         * Расположение LABEL сверху от Slider
         */
        const val LABEL_ALIGNMENT_TOP = 0

        /**
         * Расположение LABEL на одном уровне со Slider
         */
        const val LABEL_ALIGNMENT_CENTER = 1

        /**
         * Расположение LABEL снизу от Slider
         */
        const val LABEL_ALIGNMENT_BOTTOM = 2

        /**
         * Выравнивание всего контента к началу
         */
        const val ALIGNMENT_START = 0

        /**
         * Выравнивание всего контента по центру
         */
        const val ALIGNMENT_CENTER = 1

        /**
         * Выравнивание всего контента к концу
         */
        const val ALIGNMENT_END = 2

        /**
         * Заголовок отстутствует
         */
        const val TITLE_ALIGNMENT_NONE = 0

        /**
         * Расположение заголовка вначале
         */
        const val TITLE_ALIGNMENT_START = 1

        /**
         * Расположение заголовка вконце
         */
        const val TITLE_ALIGNMENT_END = 2

        /**
         * Расположение подписей максимального и минимального прогресса - вначале.
         */
        const val LIMIT_LABEL_ALIGNMENT_START = 0

        /**
         * Расположение подписей максимального и минимального прогресса - центрированы относительно полосы прогресса.
         */
        const val LIMIT_LABEL_ALIGNMENT_CENTER = 1

        /**
         * Расположение подписей максимального и минимального прогресса - вконце.
         */
        const val LIMIT_LABEL_ALIGNMENT_END = 2

        /**
         * Режим отображения значения текущего прогресса (value) - не отображается.
         */
        const val VALUE_MODE_NONE = 0

        /**
         * Режим отображения значения текущего прогресса (value) - отображается пока идет взаимодействие.
         */
        const val VALUE_MODE_INTERACTION = 1

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
