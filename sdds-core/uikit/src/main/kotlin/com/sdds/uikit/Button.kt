package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.Rect
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.text.Spannable
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.ReplacementSpan
import android.text.style.UpdateAppearance
import android.util.AttributeSet
import android.view.Gravity
import android.view.SoundEffectConstants
import android.widget.Checkable
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatButton
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.text.buildSpannedString
import androidx.core.view.ViewCompat
import androidx.core.widget.TextViewCompat
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.drawable.SpinnerDrawable
import com.sdds.uikit.internal.base.set
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.focusselector.FocusSelectorDelegate
import com.sdds.uikit.internal.focusselector.HasFocusSelector
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.viewstate.ViewState
import com.sdds.uikit.viewstate.ViewState.Companion.isDefined
import com.sdds.uikit.viewstate.ViewStateHolder

/**
 * Компонент "Кнопка".
 * Умеет отображать иконку, индикатор загрузки, а также два текста: основной и дополнительный.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 24.05.2024
 */
@Suppress("LeakingThis")
open class Button @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.buttonStyle,
) : AppCompatButton(
    context,
    attrs,
    defStyleAttr,
),
    Checkable,
    Shapeable,
    ViewStateHolder,
    ColorStateHolder,
    HasFocusSelector by FocusSelectorDelegate() {

    /**
     * Слушатель изменений состояния [isChecked]
     */
    fun interface OnCheckedChangeListener {

        /**
         * Колбэк изменений состояния [isChecked]
         */
        fun onCheckedChanged(button: Button, isChecked: Boolean)
    }

    private val _shapeHelper: ShapeHelper = ShapeHelper(this, attrs, defStyleAttr)
    private val _viewAlphaHelper: ViewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    private val _valueStateListSpan: ColorStateListSpan = ColorStateListSpan()
    private val _spaceSpan: SpaceSpan = SpaceSpan()

    private var _label: CharSequence? = null

    private var _isLoading: Boolean = false
    private var _iconLeft: Int = 0
    private var _iconTop: Int = 0
    private var _icon: Drawable? = null
    private var _iconTint: ColorStateList? = null
    private var _iconPadding: Int = 0
    private var _iconPosition: IconPosition = IconPosition.TextStart
    private var _iconSize: Int = 0
    private var _value: CharSequence? = null
    private var _spacing: Spacing = Spacing.Packed
    private var _valuePadding: Int = 0
    private var _valueTextColor: ColorStateList? = null
    private var _spanSpaceSize: Int = 0
    private var _spinner: Drawable? = null
    private var _spinnerSize: Int = 0
    private var _spinnerStrokeWidth: Float = 0f
    private var _spinnerTintList: ColorStateList? = null

    private var _isCheckable: Boolean = false
    private var _onCheckedChangedListener: OnCheckedChangeListener? = null
    private var _isChecked: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                _onCheckedChangedListener?.onCheckedChanged(this, value)
            }
        }

    /**
     * Режим обработки расстояния между основным ([getText]) и дополнительным [value] текстами
     */
    enum class Spacing {

        /**
         * Отступ между текстами минимальный, но не менее [_valuePadding]
         */
        Packed,

        /**
         * Отступ между текстами максимальный, насколько позволяют параметры родителя
         */
        SpaceBetween,
    }

    /**
     * Позиция [icon] в кнопке
     */
    enum class IconPosition {
        /**
         * В начале всего текста (Text + Value)
         */
        TextStart,

        /**
         * В конце всего текста (Text + Value)
         */
        TextEnd,
    }

    /**
     * Может ли [Button] изменять состояние [isChecked]
     */
    open var isCheckable: Boolean
        get() = _isCheckable
        set(value) {
            if (_isCheckable != value) {
                _isCheckable = value
                refreshDrawableState()
            }
        }

    /**
     * Устанавливает слушатель изменения состояния [isChecked]
     */
    open fun setOnCheckedChangedListener(listener: OnCheckedChangeListener?) {
        _onCheckedChangedListener = listener
    }

    /**
     * Изменяет состояние загрузки.
     * Если [isLoading] == true, отобразится индикатор загрузки
     */
    open var isLoading: Boolean
        get() = _isLoading
        set(value) {
            if (_isLoading != value) {
                _isLoading = value
                updateLoadingState()
            }
        }

    /**
     * Иконка кнопки
     * @see iconPosition
     * @see iconPadding
     */
    open var icon: Drawable?
        get() = _icon
        set(value) {
            if (_icon != value) {
                _icon = value
                resetText()
                updateIcon(false)
                updateIconPosition(measuredWidth)
            }
        }

    /**
     * Отступ между иконок и текстом кнопки
     * @see icon
     */
    open var iconPadding: Int
        get() = _iconPadding
        set(value) {
            if (_iconPadding != value) {
                _iconPadding = value
                resetSpanSpace()
            }
        }

    /**
     * Положение иконки относительно текста
     * @see IconPosition
     */
    open var iconPosition: IconPosition
        get() = _iconPosition
        set(value) {
            if (_iconPosition != value) {
                _iconPosition = value
                resetText()
                updateIcon(false)
            }
        }

    /**
     * Переопределенный размер иконки.
     * Если [iconSize] == 0, то будет использована внутрення ширина иконки [Drawable.getIntrinsicWidth]
     */
    open var iconSize: Int
        get() = if (_iconSize == 0) icon?.intrinsicWidth ?: 0 else _iconSize
        set(value) {
            if (value < 0) throw IllegalArgumentException("iconSize cannot be less than 0")
            if (_iconSize != value) {
                _iconSize = value
                resetText()
                updateIcon(icon != null)
            }
        }

    /**
     * Дополнительный текст кнопки
     * @see spacing
     * @see valuePadding
     */
    open var value: CharSequence?
        get() = _value
        set(value) {
            if (_value != value) {
                _value = value
                resetText()
            }
        }

    /**
     * Отступ между основным ([getText]/[setText]) и дополнительным ([value]) текстами кнопки.
     * @see spacing
     * @see value
     */
    open var valuePadding: Int
        get() = _valuePadding
        set(value) {
            if (_valuePadding != value) {
                _valuePadding = value
                resetText()
            }
        }

    /**
     * Режим обработки расстояния между основным и дополнительным текстами
     * @see Spacing
     */
    open var spacing: Spacing
        get() = _spacing
        set(value) {
            if (_spacing != value) {
                _spacing = value
                resetText()
            }
        }

    /**
     * Состояние внешнего вида кнопки
     * @see ViewState
     */
    @Deprecated("Использовать Button.colorState")
    override var state: ViewState? = ViewState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * Состояние внешнего вида кнопки
     * @see ColorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    /**
     * @see Shapeable
     */
    override val shape: ShapeModel?
        get() = _shapeHelper.shape

    init {
        obtainAttributes(attrs, defStyleAttr)
        applySelector(this, context, attrs, defStyleAttr)
    }

    /**
     * Устанавливает толщину линии границы кнопки
     * @param strokeWidth ширина границы кнопки
     */
    open fun setStrokeWidth(strokeWidth: Float) {
        this._shapeHelper.setStrokeWidth(strokeWidth)
    }

    /**
     * Устанавливает цвет линии границы кнопки
     * @param color цвет границы кнопки
     */
    open fun setStrokeColor(@ColorInt color: Int) {
        setStrokeColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет линии границы кнопки из ресурсов
     * @param colorRes цвета линии границы
     */
    open fun setStrokeColorResources(@ColorRes colorRes: Int) {
        setStrokeColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета границы кнопки согласно состоянию [getDrawableState]
     * @param colorStateList цвета границы кнопки
     */
    open fun setStrokeColorList(colorStateList: ColorStateList) {
        this._shapeHelper.setStrokeColor(colorStateList)
    }

    /**
     * Устанавливает цвета индикатору загрузки кнопки согласно состоянию [getDrawableState]
     * @param tintList цвета границы индикатора загрузки
     */
    open fun setSpinnerTintList(tintList: ColorStateList) {
        getSpinnerDrawable().setTintList(tintList)
    }

    /**
     * Устанавливает иконку из ресурсов по идентификатору
     * @param iconRes идентификатор ресурса иконки
     */
    fun setIconResource(@DrawableRes iconRes: Int) {
        icon = AppCompatResources.getDrawable(context, iconRes)
    }

    /**
     * Устанавливает цвета иконке кнопки согласно состоянию [getDrawableState]
     * @param tintList цвета иконки кнопки
     */
    open fun setIconTintList(tintList: ColorStateList?) {
        if (_iconTint != tintList) {
            _iconTint = tintList
            updateIcon(false)
        }
    }

    /**
     * Устанавливает цвет иконки кнопки
     * @param color цвет иконки кнопки
     */
    fun setIconTint(@ColorInt color: Int) {
        setIconTintList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает дополнительный текст кнопке по идентификатору строки в ресурсах
     * @param valueRes идентификатор строки в ресурсах
     */
    fun setValue(@StringRes valueRes: Int) {
        value = context.getString(valueRes)
    }

    /**
     * Устанавливает цвет дополнительного текста
     * @param color цвет дополнительного текста
     */
    fun setValueTextColor(@ColorInt color: Int) {
        setValueTextColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета дополнительного текста
     * @param colors цвета дополнительного текста
     */
    open fun setValueTextColor(colors: ColorStateList?) {
        if (_valueTextColor != colors) {
            _valueTextColor = colors
            invalidate()
        }
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        if (_label != text) {
            _label = text
            resetText()
        }
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper?.updateAlphaByEnabledState(this)
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
        updateFocusSelector(this, focused)
    }

    override fun setPressed(pressed: Boolean) {
        if (isPressed != pressed) {
            handlePressedChange(this, pressed)
        }
        super.setPressed(pressed)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        resetSpanSpace()
        val left = (measuredWidth - _spinnerSize) / 2
        val top = (measuredHeight - _spinnerSize) / 2
        getSpinnerDrawable().setBounds(left, top, left + _spinnerSize, top + _spinnerSize)
        updateIconPosition(measuredWidth)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateIconPosition(w)
    }

    override fun onTextChanged(
        text: CharSequence?,
        start: Int,
        lengthBefore: Int,
        lengthAfter: Int,
    ) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
        updateIconPosition(measuredWidth)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (isLoading) {
            getSpinnerDrawable().draw(canvas)
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || (_spinner != null && who == _spinner)
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 4)
        if (state?.isDefined() == true) {
            mergeDrawableStates(drawableState, state?.attr)
        }
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        if (isChecked) {
            mergeDrawableStates(drawableState, intArrayOf(android.R.attr.state_checked))
        }
        val loadingState = if (isLoading) R.attr.sd_state_loading else -R.attr.sd_state_loading
        mergeDrawableStates(drawableState, intArrayOf(loadingState))
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        getSpinnerDrawable().state = drawableState
    }

    override fun getCompoundPaddingLeft(): Int {
        val extraPadding = if (hasIcon()) {
            if (isLayoutRTL()) {
                if (isIconEnd()) iconPadding else 0
            } else {
                if (isIconStart()) iconPadding else 0
            }
        } else {
            0
        }
        return super.getCompoundPaddingLeft() + extraPadding
    }

    override fun getCompoundPaddingRight(): Int {
        val extraPadding = if (hasIcon()) {
            if (isLayoutRTL()) {
                if (isIconStart()) iconPadding else 0
            } else {
                if (isIconEnd()) iconPadding else 0
            }
        } else {
            0
        }
        return super.getCompoundPaddingRight() + extraPadding
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Button, defStyleAttr, -1)

        _spinnerSize = typedArray.getDimensionPixelSize(
            R.styleable.Button_sd_spinnerSize,
            DEFAULT_SPINNER_SIZE.dp,
        )
        _spinnerStrokeWidth = typedArray.getDimension(
            R.styleable.Button_sd_spinnerStrokeWidth,
            DEFAULT_SPINNER_STROKE_WIDTH.dp,
        )
        _spinnerTintList = typedArray.getColorStateList(R.styleable.Button_sd_spinnerTint)

        _valuePadding = typedArray.getDimensionPixelSize(
            R.styleable.Button_sd_valuePadding,
            0,
        )
        _valueTextColor = typedArray.getColorStateList(R.styleable.Button_sd_valueTextColor)
        _value = typedArray.getString(R.styleable.Button_sd_value)
        _spacing = Spacing
            .values()
            .getOrElse(typedArray.getInt(R.styleable.Button_sd_spacing, 0)) { Spacing.Packed }

        _iconSize = typedArray.getDimensionPixelSize(R.styleable.Button_sd_iconSize, 0)
        iconPadding = typedArray.getDimensionPixelSize(R.styleable.Button_sd_iconPadding, 0)
        _icon = typedArray.getDrawable(R.styleable.Button_sd_icon)
        _iconTint = typedArray.getColorStateList(R.styleable.Button_sd_iconTint)
        _iconPosition = IconPosition
            .values()
            .getOrElse(
                typedArray.getInt(
                    R.styleable.Button_sd_iconPosition,
                    0,
                ),
            ) { IconPosition.TextStart }
        _isCheckable = typedArray.getBoolean(R.styleable.Button_android_checkable, true)
        _isChecked = typedArray.getBoolean(R.styleable.Button_android_checked, false)

        typedArray.recycle()
        resetText()
        updateIcon(_icon != null)
    }

    private fun updateLoadingState() {
        if (isLoading) {
            (getSpinnerDrawable() as? Animatable)?.start()
        } else {
            (getSpinnerDrawable() as? Animatable)?.stop()
        }
        refreshDrawableState()
    }

    private fun getSpinnerDrawable(): Drawable {
        return _spinner ?: SpinnerDrawable(_spinnerStrokeWidth)
            .apply {
                callback = this@Button
                isInEditMode = this@Button.isInEditMode
                setTintList(_spinnerTintList)
            }.also {
                _spinner = it
            }
    }

    private fun getButtonText(): CharSequence? {
        if (!hasLabel() && !hasValue()) return null
        val label = _label
        val value = _value
        val spanPosition = getSpanPosition()
        return buildSpannedString {
            var macrosEndIndex = 0

            if (spanPosition == SPAN_POSITION_START) {
                append(SPACING_MACROS)
                macrosEndIndex = length
            }

            if (!label.isNullOrBlank()) {
                append(label)
            }

            if (spanPosition == SPAN_POSITION_MIDDLE) {
                append(SPACING_MACROS)
                macrosEndIndex = length
            }

            if (!value.isNullOrBlank()) {
                val valueStartIndex = length
                append(value)
                setSpan(
                    _valueStateListSpan,
                    valueStartIndex,
                    length,
                    Spannable.SPAN_INCLUSIVE_EXCLUSIVE,
                )
            }

            if (spanPosition == SPAN_POSITION_END) {
                append(SPACING_MACROS)
                macrosEndIndex = length
            }

            if (spanPosition != SPAN_POSITION_NONE) {
                setSpan(
                    _spaceSpan,
                    macrosEndIndex - SPACING_MACROS.length,
                    macrosEndIndex,
                    Spannable.SPAN_INCLUSIVE_EXCLUSIVE,
                )
            }
        }
    }

    private fun resetText() {
        if (hasLabel() || hasValue()) {
            resetSpanSpace()
            super.setText(getButtonText(), null)
            requestLayout()
        } else {
            super.setText(null, null)
        }
    }

    private fun updateIcon(needsIconReset: Boolean) {
        _icon = _icon?.let { iconDrawable ->
            val wrappedIcon = DrawableCompat.wrap(iconDrawable).mutate()
            DrawableCompat.setTintList(wrappedIcon, _iconTint)
            DrawableCompat.setTintMode(wrappedIcon, PorterDuff.Mode.SRC_IN)
            val width = if (_iconSize != 0) _iconSize else wrappedIcon.intrinsicWidth
            val height = if (_iconSize != 0) _iconSize else wrappedIcon.intrinsicHeight
            wrappedIcon.setBounds(_iconLeft, _iconTop, _iconLeft + width, _iconTop + height)
            wrappedIcon
        }

        if (needsIconReset) {
            resetCompoundDrawables()
            return
        }

        val existingDrawables = getExistingDrawables()
        val drawableStart = existingDrawables[0]
        val drawableEnd = existingDrawables[2]
        val hasIconChanged =
            isIconStart() && drawableStart != _icon || isIconEnd() && drawableEnd != _icon
        if (hasIconChanged) resetCompoundDrawables()
    }

    @Suppress("CyclomaticComplexMethod")
    private fun updateIconPosition(buttonWidth: Int) {
        if (icon == null || layout == null) {
            return
        }
        _iconTop = 0
        val hGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection) and Gravity.HORIZONTAL_GRAVITY_MASK
        val newIconLeft = when {
            hGravity == Gravity.RIGHT && isIconStart() -> buttonWidth - getContentWidth()
            hGravity == Gravity.RIGHT && isIconEnd() -> 0
            hGravity == Gravity.CENTER_HORIZONTAL && isIconStart() -> (buttonWidth - getContentWidth()) / 2
            hGravity == Gravity.CENTER_HORIZONTAL && isIconEnd() -> -(buttonWidth - getContentWidth()) / 2
            hGravity == Gravity.LEFT && isIconEnd() -> -(buttonWidth - getContentWidth())
            else -> 0
        }
        if (_iconLeft != newIconLeft) {
            _iconLeft = newIconLeft
            updateIcon(false)
        }
    }

    private fun resetSpanSpace() {
        val spanSpaceSize = calculateSpanSpaceSize()
        _spanSpaceSize = spanSpaceSize
    }

    private fun calculateSpanSpaceSize(): Int {
        val availableSpace = measuredWidth - compoundPaddingStart - compoundPaddingEnd
        val atLeastSpace = if (hasLabel() && hasValue()) valuePadding else 0
        return if (spacing == Spacing.SpaceBetween) {
            (availableSpace - getTextWidth() - valuePadding).coerceAtLeast(atLeastSpace)
        } else {
            atLeastSpace
        }
    }

    private fun getTextWidth(): Int = getLabelWidth() + getValueWidth()

    private fun getLabelWidth(): Int {
        val labelText = _label?.toString() ?: return 0
        return paint.getTextWidth(labelText)
    }

    private fun getValueWidth(): Int {
        val valueText = value?.toString() ?: return 0
        return paint.getTextWidth(valueText)
    }

    private fun getSpanPosition(): Int {
        return when {
            hasLabel() && hasValue() -> SPAN_POSITION_MIDDLE // отступ между label и value
            hasIcon() && isIconStart() -> SPAN_POSITION_START // отступ перед текстом
            hasIcon() && isIconEnd() -> SPAN_POSITION_END // отступ после текста
            else -> SPAN_POSITION_NONE
        }
    }

    protected open fun resetCompoundDrawables() = when {
        isIconStart() -> TextViewCompat.setCompoundDrawablesRelative(this, icon, null, null, null)
        isIconEnd() -> TextViewCompat.setCompoundDrawablesRelative(this, null, null, icon, null)
        else -> Unit
    }

    private fun isIconStart(): Boolean {
        return iconPosition == IconPosition.TextStart
    }

    private fun isIconEnd(): Boolean {
        return iconPosition == IconPosition.TextEnd
    }

    private fun hasIcon(): Boolean = icon != null

    private fun hasValue(): Boolean = value?.isNotBlank() == true

    private fun hasLabel(): Boolean = _label?.isNotBlank() == true

    private fun isLayoutRTL(): Boolean {
        return ViewCompat.getLayoutDirection(this) == ViewCompat.LAYOUT_DIRECTION_RTL
    }

    private fun getExistingDrawables() = TextViewCompat.getCompoundDrawablesRelative(this)

    internal fun getContentWidth(): Int {
        val textWidth = minOf(layout.ellipsizedWidth, getTextWidth() + _spanSpaceSize)
        return textWidth + compoundPaddingStart + compoundPaddingEnd
    }

    private inner class SpaceSpan : ReplacementSpan() {

        override fun getSize(
            paint: Paint,
            text: CharSequence?,
            start: Int,
            end: Int,
            fm: Paint.FontMetricsInt?,
        ): Int {
            fm?.set(paint.fontMetricsInt)
            return _spanSpaceSize
        }

        override fun draw(
            canvas: Canvas,
            text: CharSequence?,
            start: Int,
            end: Int,
            x: Float,
            top: Int,
            y: Int,
            bottom: Int,
            paint: Paint,
        ) {
            if (DEBUG_MODE) {
                canvas.drawRect(
                    x,
                    top.toFloat(),
                    x + _spanSpaceSize,
                    bottom.toFloat(),
                    DebugPaint.configure(color = Color.WHITE),
                )
            }
        }
    }

    private inner class ColorStateListSpan : CharacterStyle(), UpdateAppearance {

        override fun updateDrawState(tp: TextPaint?) {
            if (tp == null) return
            val colorState = _valueTextColor ?: return
            tp.color = colorState.getColorForState(drawableState, colorState.defaultColor)
        }
    }

    override fun setChecked(checked: Boolean) {
        if (_isChecked != checked) {
            _isChecked = checked
            refreshDrawableState()
        }
    }

    override fun isChecked(): Boolean {
        return _isChecked
    }

    override fun toggle() {
        isChecked = !isChecked && isCheckable
    }

    override fun performClick(): Boolean {
        toggle()
        return super.performClick().also { handled ->
            if (handled) {
                playSoundEffect(SoundEffectConstants.CLICK)
            }
        }
    }

    private companion object {
        const val SPAN_POSITION_NONE = -1
        const val SPAN_POSITION_START = 0
        const val SPAN_POSITION_MIDDLE = 1
        const val SPAN_POSITION_END = 2
        const val DEFAULT_SPINNER_SIZE = 24
        const val DEFAULT_SPINNER_STROKE_WIDTH = 2f
        const val DEBUG_MODE = false
        const val SPACING_MACROS = "*"
        val DebugPaint =
            Paint().configure(style = Paint.Style.STROKE, color = Color.MAGENTA, strokeWidth = 3f)

        fun Paint.getTextWidth(text: CharSequence, start: Int = 0, end: Int = text.length): Int {
            if (text.isEmpty()) return 0
            return measureText(text.toString(), start, end).toInt()
        }
    }
}
