package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.EditText
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.textfield.DecoratedFieldBox
import com.sdds.uikit.internal.textfield.IndicatorDrawable
import com.sdds.uikit.internal.textfield.StatefulEditText
import com.sdds.uikit.internal.textfield.TextFieldTextView

/**
 * Компонент TextField - однострочное текстовое поле
 * с поддержкой отображения статуса, заголовка, плейсхолдера и иконок.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 13.06.2024
 */
@Suppress("LeakingThis")
open class TextField @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_textFieldStyle,
    defStyleRes: Int = R.style.Sdds_Components_TextField,
) : ViewGroup(context, attrs, defStyleAttr, defStyleRes), ColorStateHolder {

    /**
     * Тип заголовка
     */
    enum class HelperTextPlacement {
        None,

        /**
         * Внешний заголовок
         */
        Outer,

        /**
         * Внутренний заголовок
         */
        Inner,
    }

    /**
     * Режим "обязательности" поля
     */
    enum class RequirementMode {

        /**
         * Поле опционально
         */
        Optional,

        /**
         * Поле обязательно. Индикатор рисуется вначале поля
         */
        Start,

        /**
         * Поле обязательно. Индикатор рисуется вконце поля
         */
        End,
    }

    private val _outerLabelView: TextFieldTextView by unsafeLazy {
        TextFieldTextView(context).apply {
            id = R.id.sd_textFieldOuterLabel
            isFocusable = false
            isFocusableInTouchMode = false
        }
    }
    private val _captionView: TextFieldTextView by unsafeLazy {
        TextFieldTextView(context).apply {
            id = R.id.sd_textFieldCaption
            isFocusable = false
            isClickable = false
            isFocusableInTouchMode = false
        }
    }

    private val _counterView: TextFieldTextView by unsafeLazy {
        TextFieldTextView(context).apply {
            id = R.id.sd_textFieldCounter
            isFocusable = false
        }
    }
    private val _decorationBox: DecoratedFieldBox by unsafeLazy {
        DecoratedFieldBox(context, attrs, defStyleAttr).apply {
            id = R.id.sd_textFieldDecorationBox
            isFocusable = true
        }
    }

    private val _helperTextContainer: CellLayout by unsafeLazy {
        CellLayout(context).apply {
            id = R.id.sd_textFieldHelperTextContainer
        }
    }

    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    private var _indicator: IndicatorDrawable? = null

    private var _helperTextPadding: Int = 0
    private var _labelPadding: Int = 0

    private var _labelPlacement: HelperTextPlacement = HelperTextPlacement.Outer
    private var _captionPlacement: HelperTextPlacement = HelperTextPlacement.Outer
    private var _counterPlacement: HelperTextPlacement = HelperTextPlacement.Outer
    private var _label: CharSequence? = null
    private var _caption: CharSequence? = null
    private var _counter: CharSequence? = null
    private var _inDrawableStateChanged: Boolean = false
    private var _requirementMode: RequirementMode = RequirementMode.Optional
    private var _maximumHeight: Int = Int.MAX_VALUE
    private var _boxMinHeight: Int = 0

    init {
        setWillNotDraw(false)
        setAddStatesFromChildren(true)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        layoutChildren()
        clipChildren = false
        clipToPadding = false
        isFocusable = false
        isFocusableInTouchMode = false
        viewTreeObserver.addOnGlobalFocusChangeListener { oldFocus, newFocus ->
            isActivated = !_decorationBox.isFocused && hasFocus() && !isReadOnly
        }
    }

    override var colorState: ColorState? = null
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            _decorationBox.colorState = field
            _captionView.colorState = field
            _counterView.colorState = field
            _outerLabelView.colorState = field
        }

    /**
     * Заголовок текстового поля
     */
    open var label: CharSequence?
        get() = _label
        set(value) {
            if (_label != value) {
                _label = value
                updateLabel()
            }
        }

    /**
     * Расположение заголовка в текстовом поле
     */
    open var labelPlacement: HelperTextPlacement
        get() = _labelPlacement
        set(value) {
            if (_labelPlacement != value) {
                _labelPlacement = value
                updateLabel()
            }
        }

    /**
     * Расположение подписи в текстовом поле
     */
    open var captionPlacement: HelperTextPlacement
        get() = _captionPlacement
        set(value) {
            if (_captionPlacement != value) {
                _captionPlacement = value
                updateCaption()
            }
        }

    /**
     * Расположение счетчика в текстовом поле
     */
    open var counterPlacement: HelperTextPlacement
        get() = _counterPlacement
        set(value) {
            if (_counterPlacement != value) {
                _counterPlacement = value
                updateCounter()
            }
        }

    /**
     * Плейсхолдер текстового поля.
     * Отображается, когда в текстовом поле нет значение [value]
     */
    open var placeholder: String?
        get() = _decorationBox.placeholder?.toString()
        set(value) {
            _decorationBox.placeholder = value
        }

    /**
     * Значение текстового поля.
     */
    open var value: CharSequence?
        get() = _decorationBox.editText.text?.toString()
        set(value) {
            _decorationBox.editText.setText(value)
        }

    /**
     * Подпись к текстовому полю
     */
    open var caption: CharSequence?
        get() = _caption
        set(value) {
            if (_caption != value) {
                _caption = value
                updateCaption()
            }
        }

    /**
     * Подпись к текстовому полю
     */
    open var counter: CharSequence?
        get() = _counter
        set(value) {
            if (_counter != value) {
                _counter = value
                updateCounter()
            }
        }

    /**
     * [EditText] текстового поля
     */
    val editText: EditText
        get() = _decorationBox.editText

    /**
     * Режим не редактируемого поля
     */
    open var isReadOnly: Boolean
        get() = _decorationBox.editText.isReadOnly
        set(value) {
            _decorationBox.setReadOnly(value)
            _captionView.isReadOnly = value
            _counterView.isReadOnly = value
            _outerLabelView.isReadOnly = value
            refreshDrawableState()
        }

    /**
     * Режим "обязательности" [TextField]
     * @see [RequirementMode]
     */
    open var requirementMode: RequirementMode
        get() = _requirementMode
        set(value) {
            if (_requirementMode != value) {
                _requirementMode = value
                requestLayout()
            }
        }

    /**
     * Адаптер для чипов
     * @see ChipGroup.Adapter
     */
    var chipAdapter: ChipGroup.Adapter?
        get() = _decorationBox.chipAdapter
        set(value) {
            _decorationBox.chipAdapter = value
        }

    /**
     * Текст префикса значения текстового поля
     */
    var prefixText: CharSequence?
        get() = (_decorationBox.editText as? StatefulEditText)?.prefixText
        set(value) {
            (_decorationBox.editText as? StatefulEditText)?.prefixText = value
        }

    /**
     * [Drawable] префикса значения текстового поля.
     * Если переопределяется значение этого поля, то [prefixText] перестает работать,
     * т.к. по-умолчанию [prefixDrawable] устанавливается [StatefulEditText.TextDrawable].
     */
    var prefixDrawable: Drawable?
        get() = (_decorationBox.editText as? StatefulEditText)?.prefix
        set(value) {
            (_decorationBox.editText as? StatefulEditText)?.prefix = value
        }

    /**
     * Текст суффикса значения текстового поля
     */
    var suffixText: CharSequence?
        get() = (_decorationBox.editText as? StatefulEditText)?.suffixText
        set(value) {
            (_decorationBox.editText as? StatefulEditText)?.suffixText = value
        }

    /**
     * [Drawable] суффикса значения текстового поля.
     * Если переопределяется значение этого поля, то [suffixText] перестает работать,
     * т.к. по-умолчанию [suffixDrawable] устанавливается [StatefulEditText.TextDrawable].
     */
    var suffixDrawable: Drawable?
        get() = (_decorationBox.editText as? StatefulEditText)?.suffix
        set(value) {
            (_decorationBox.editText as? StatefulEditText)?.suffix = value
        }

    /**
     * Максимальная высота [TextField]
     */
    var maximumHeight: Int
        get() = _maximumHeight
        set(value) {
            if (_maximumHeight != value) {
                _maximumHeight = value
                invalidate()
                requestLayout()
            }
        }

    /**
     * Устанавливает стиль текста [label] в состоянии [HelperTextPlacement.Outer]
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setLabelAppearance(@StyleRes appearanceId: Int) {
        _outerLabelView.setTextAppearance(appearanceId)
        _decorationBox.setLabelAppearance(appearanceId)
    }

    /**
     * Устанавливает цвета текста [label]
     * @param colors цвета текста
     */
    open fun setLabelColor(colors: ColorStateList?) {
        if (colors != null) {
            _outerLabelView.setTextColor(colors)
            _decorationBox.setLabelColor(colors)
        }
    }

    /**
     * Устанавливает цвет текста [label]
     * @param color цвет текста
     */
    open fun setLabelColor(@ColorInt color: Int) {
        setLabelColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает стиль текста [value] текстового поля
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setValueAppearance(@StyleRes appearanceId: Int) {
        if (appearanceId != 0) {
            editText.setTextAppearance(appearanceId)
        }
    }

    /**
     * Устанавливает цвета текста [value] текстового поля
     * @param colors цвета текста
     */
    open fun setValueColor(colors: ColorStateList?) {
        if (colors != null) {
            editText.setTextColor(colors)
        }
    }

    /**
     * Устанавливает цвет текста [value] текстового поля
     * @param color цвет текста
     */
    open fun setValueColor(@ColorInt color: Int) {
        setValueColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета текста [placeholder] текстового поля
     * @param colors цвета текста
     */
    open fun setPlaceholderColor(colors: ColorStateList?) {
        _decorationBox.setPlaceholderColor(colors)
    }

    /**
     * Устанавливает цвет текста [placeholder] текстового поля
     * @param color цвет текста
     */
    open fun setPlaceholderColor(@ColorInt color: Int) {
        setPlaceholderColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает стиль текста [caption] текстового поля
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setCaptionAppearance(@StyleRes appearanceId: Int) {
        if (appearanceId != 0) {
            _captionView.setTextAppearance(appearanceId)
            _decorationBox.setCaptionAppearance(appearanceId)
        }
    }

    /**
     * Устанавливает цвета текста [caption] текстового поля
     * @param colors цвета текста
     */
    open fun setCaptionColor(colors: ColorStateList?) {
        if (colors != null) {
            _captionView.setTextColor(colors)
            _decorationBox.setCaptionColor(colors)
        }
    }

    /**
     * Устанавливает цвет текста [caption] текстового поля
     * @param color цвет текста
     */
    open fun setCaptionColor(@ColorInt color: Int) {
        setCaptionColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает стиль текста [caption] текстового поля
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setCounterAppearance(@StyleRes appearanceId: Int) {
        if (appearanceId != 0) {
            _counterView.setTextAppearance(appearanceId)
            _decorationBox.setCounterAppearance(appearanceId)
        }
    }

    /**
     * Устанавливает цвета текста [caption] текстового поля
     * @param colors цвета текста
     */
    open fun setCounterColor(colors: ColorStateList?) {
        if (colors != null) {
            _decorationBox.setCounterColor(colors)
        }
    }

    /**
     * Устанавливает цвет текста [caption] текстового поля
     * @param color цвет текста
     */
    open fun setCounterColor(@ColorInt color: Int) {
        setCounterColor(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает иконку слева текстового поля
     * @param drawable [Drawable] иконка текстового поля
     */
    open fun setIcon(drawable: Drawable?) {
        _decorationBox.setIcon(drawable)
    }

    /**
     * Устанавливает иконку слева текстового поля по идентификатору ресурса
     * @param drawableRes идентификатор ресурса иконки текстового поля
     */
    open fun setIcon(@DrawableRes drawableRes: Int) {
        setIcon(AppCompatResources.getDrawable(context, drawableRes))
    }

    /**
     * Устанавливает слушатель нажатий на иконку слева
     * @param clickListener слушатель нажатий
     */
    open fun setIconClickListener(clickListener: OnClickListener) {
        _decorationBox.iconView.setOnClickListener(clickListener)
    }

    /**
     * Устанавливает цвета иконки слева текстового поля
     * @param tint цвета иконки
     */
    open fun setIconTint(tint: ColorStateList?) {
        _decorationBox.setIconTint(tint)
    }

    /**
     * Устанавливает цвет иконки слева текстового поля
     * @param tint цвет иконки
     */
    open fun setIconTint(@ColorInt tint: Int) {
        setIconTint(ColorStateList.valueOf(tint))
    }

    /**
     * Устанавливает иконку справа текстового поля
     * @param drawable [Drawable] иконки текстового поля
     */
    open fun setAction(drawable: Drawable?) {
        _decorationBox.setAction(drawable)
    }

    /**
     * Устанавливает иконку справа текстового поля по идентификатору ресурса
     * @param drawableRes идентификатор ресурса иконки текстового поля
     */
    open fun setAction(@DrawableRes drawableRes: Int) {
        setAction(AppCompatResources.getDrawable(context, drawableRes))
    }

    /**
     * Устанавливает слушатель нажатий на иконку справа
     * @param clickListener слушатель нажатий
     */
    open fun setActionClickListener(clickListener: OnClickListener) {
        _decorationBox.actionView.setOnClickListener(clickListener)
    }

    /**
     * Устанавливает цвета иконки справа текстового поля
     * @param tint цвета иконки
     */
    open fun setActionTint(tint: ColorStateList?) {
        _decorationBox.setActionTint(tint)
    }

    /**
     * Устанавливает цвет иконки справа текстового поля
     * @param tint цвет иконки
     */
    open fun setActionTint(@ColorInt tint: Int) {
        setActionTint(ColorStateList.valueOf(tint))
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _decorationBox.isEnabled = enabled
        viewAlphaHelper.updateAlphaByEnabledState(this)
    }

    override fun getBaseline(): Int {
        return _decorationBox.baseline
    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        if (isRequired()) {
            _indicator?.draw(canvas)
        }
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        if (_inDrawableStateChanged || isReadOnly) {
            return
        }
        _inDrawableStateChanged = true
        _indicator?.state = drawableState
        _indicator?.invalidateSelf()
        _inDrawableStateChanged = false
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)

        val specWidth = MeasureSpec.getSize(widthMeasureSpec)
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)

        var totalHeight = 0

        fun measureChild(child: View) {
            if (child.isGone) return
            measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, totalHeight)
            totalHeight += child.fullHeight()
        }

        measureChild(_outerLabelView)
        measureChild(_helperTextContainer)
        _decorationBox.minimumHeight = (minimumHeight - totalHeight).coerceAtLeast(_boxMinHeight)
        _decorationBox.maximumHeight = _maximumHeight - totalHeight
        measureChild(_decorationBox)

        val totalWidth =
            maxOf(_outerLabelView.fullWidth(), _helperTextContainer.fullWidth(), _decorationBox.fullWidth())

        // Выбираем конечные размеры согласно требованиям родителя
        val desiredWidth = when (widthMode) {
            MeasureSpec.EXACTLY -> specWidth
            MeasureSpec.AT_MOST -> minOf(totalWidth, specWidth)
            else -> totalWidth
        }
        val desiredHeight = when (heightMode) {
            MeasureSpec.EXACTLY -> specHeight
            MeasureSpec.AT_MOST -> minOf(totalHeight, specHeight)
            else -> totalHeight
        }
        setMeasuredDimension(
            desiredWidth.coerceAtLeast(minimumWidth),
            desiredHeight.coerceIn(minimumHeight, _maximumHeight),
        )
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val left = paddingLeft
        var top = paddingTop

        fun layoutChild(child: View) {
            if (child.isGone) return
            child.layout(left, top, left + child.fullWidth(), top + child.fullHeight())
            top += child.fullHeight()
        }

        layoutChild(_outerLabelView)
        layoutChild(_decorationBox)
        layoutChild(_helperTextContainer)

        layoutIndicator()
    }

    private fun layoutIndicator() {
        val gravity = when (requirementMode) {
            RequirementMode.Optional -> {
                // пропускаем установку индикатора
                return
            }

            RequirementMode.Start -> Gravity.TOP or Gravity.START
            RequirementMode.End -> Gravity.TOP or Gravity.END
        }
        when (labelPlacement) {
            HelperTextPlacement.Outer -> {
                _indicator?.applyMode(
                    IndicatorDrawable.AlignmentMode.Outside,
                    IndicatorDrawable.AlignmentMode.Inside,
                    gravity,
                )
                _indicator?.setBounds(
                    _outerLabelView.left,
                    _outerLabelView.top,
                    _outerLabelView.right,
                    _outerLabelView.bottom,
                )
            }

            else -> {
                _indicator?.applyMode(
                    IndicatorDrawable.AlignmentMode.Inside,
                    IndicatorDrawable.AlignmentMode.Inside,
                    gravity,
                )
                _indicator?.setBounds(
                    _decorationBox.left,
                    _decorationBox.top,
                    _decorationBox.right,
                    _decorationBox.bottom,
                )
            }
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _indicator
    }

    override fun generateDefaultLayoutParams(): MarginLayoutParams {
        return MarginLayoutParams(
            WRAP_CONTENT,
            WRAP_CONTENT,
        )
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is MarginLayoutParams
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams {
        return CellLayout.LayoutParams(context, attrs)
    }

    override fun generateLayoutParams(p: LayoutParams?): LayoutParams {
        return MarginLayoutParams(p)
    }

    private fun isRequired(): Boolean = requirementMode != RequirementMode.Optional

    private fun updateLabel() {
        when (labelPlacement) {
            HelperTextPlacement.None -> {
                _outerLabelView.text = null
                _outerLabelView.isVisible = false
                _decorationBox.setLabel(null)
                _decorationBox.labelEnabled = false
            }

            HelperTextPlacement.Outer -> {
                _outerLabelView.text = label
                _outerLabelView.isVisible = !label.isNullOrBlank()
                _decorationBox.labelEnabled = false
                _decorationBox.setLabel(null)
            }

            HelperTextPlacement.Inner -> {
                _outerLabelView.text = null
                _outerLabelView.isVisible = false
                _decorationBox.setLabel(label)
                _decorationBox.labelEnabled = !label.isNullOrBlank()
            }
        }
        _decorationBox.updateTextOffset()
    }

    private fun updateCaption() {
        when (captionPlacement) {
            HelperTextPlacement.None -> {
                _captionView.text = null
                _captionView.isVisible = false
                _decorationBox.setCaption(null)
            }

            HelperTextPlacement.Outer -> {
                _captionView.text = _caption
                _captionView.isVisible = !caption.isNullOrBlank()
                _decorationBox.setCaption(null)
            }

            HelperTextPlacement.Inner -> {
                _captionView.text = null
                _captionView.isVisible = false
                _decorationBox.setCaption(_caption)
            }
        }
    }

    private fun updateCounter() {
        when (counterPlacement) {
            HelperTextPlacement.None -> {
                _decorationBox.setCounter(null)
                _counterView.text = null
                _counterView.isVisible = false
            }

            HelperTextPlacement.Outer -> {
                _decorationBox.setCounter(null)
                _counterView.text = _counter
                _counterView.isVisible = !_counter.isNullOrBlank()
            }

            HelperTextPlacement.Inner -> {
                _decorationBox.setCounter(_counter)
                _counterView.text = null
                _counterView.isVisible = false
            }
        }
    }

    private fun layoutChildren() {
        addView(
            _outerLabelView,
            MarginLayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                bottomMargin = _labelPadding
            },
        )

        addView(
            _helperTextContainer,
            MarginLayoutParams(MATCH_PARENT, WRAP_CONTENT),
        )
        _helperTextContainer.apply {
            addView(
                _counterView,
                CellLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                    gravity = Gravity.TOP
                    topMargin = _helperTextPadding
                    cellContent = CellLayout.CellContent.END
                },
            )
            addView(
                _captionView,
                CellLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                    gravity = Gravity.TOP
                    topMargin = _helperTextPadding
                    cellContent = CellLayout.CellContent.CENTER
                },
            )
        }

        addView(
            _decorationBox,
            MarginLayoutParams(MATCH_PARENT, MATCH_PARENT),
        )
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextField, defStyleAttr, defStyleRes)
        label = typedArray.getString(R.styleable.TextField_sd_label)
        labelPlacement = typedArray.getTextPlacement(R.styleable.TextField_sd_labelPlacement)
        _labelPadding = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_labelPadding, 0)
        setLabelAppearance(typedArray.getResourceId(R.styleable.TextField_sd_labelAppearance, 0))
        setLabelColor(typedArray.getColorStateList(R.styleable.TextField_sd_labelColor))

        val valueAppearance = typedArray.getResourceId(R.styleable.TextField_sd_valueAppearance, 0)
        val valueColor = typedArray.getColorStateList(R.styleable.TextField_sd_valueColor)
        value = typedArray.getString(R.styleable.TextField_sd_value)
        setValueAppearance(valueAppearance)
        setValueColor(valueColor)

        placeholder = typedArray.getString(R.styleable.TextField_sd_placeholder)
        setPlaceholderColor(typedArray.getColorStateList(R.styleable.TextField_sd_placeholderColor) ?: valueColor)

        caption = typedArray.getString(R.styleable.TextField_sd_caption)
        setCaptionAppearance(typedArray.getResourceId(R.styleable.TextField_sd_captionAppearance, 0))
        setCaptionColor(typedArray.getColorStateList(R.styleable.TextField_sd_captionColor))
        captionPlacement = typedArray.getTextPlacement(R.styleable.TextField_sd_captionPlacement)

        counter = typedArray.getString(R.styleable.TextField_sd_counter)
        setCounterAppearance(typedArray.getResourceId(R.styleable.TextField_sd_counterAppearance, 0))
        setCounterColor(typedArray.getColorStateList(R.styleable.TextField_sd_counterColor))
        counterPlacement = typedArray.getTextPlacement(R.styleable.TextField_sd_counterPlacement)

        _helperTextPadding = typedArray.getDimensionPixelOffset(R.styleable.TextField_sd_helperTextPadding, 0)
        _requirementMode = typedArray.getRequirementMode(R.styleable.TextField_sd_requirementMode)
        _indicator = IndicatorDrawable(
            size = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_indicatorSize, 0),
            verticalOffset = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_indicatorOffsetY, 0),
            horizontalOffset = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_indicatorOffsetX, 0),
        )
        val alignmentLineHeight = typedArray.getDimensionPixelSize(
            R.styleable.TextField_sd_alignmentLineHeight,
            0,
        )
        _boxMinHeight = typedArray.getDimensionPixelSize(
            R.styleable.TextField_sd_boxMinHeight,
            alignmentLineHeight,
        )
        _maximumHeight = typedArray.getDimensionPixelSize(R.styleable.TextField_android_maxHeight, Int.MAX_VALUE)
        colorState = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        typedArray.recycle()
        updateLabel()
        updateCounter()
        updateCaption()
    }

    private companion object {

        fun TypedArray.getTextPlacement(index: Int): HelperTextPlacement {
            return HelperTextPlacement.values()
                .getOrNull(getInt(index, 0))
                ?: HelperTextPlacement.None
        }

        fun TypedArray.getRequirementMode(index: Int): RequirementMode {
            return RequirementMode.values()
                .getOrNull(getInt(index, 0))
                ?: RequirementMode.Optional
        }

        fun View.fullWidth(): Int {
            val lp = layoutParams as MarginLayoutParams
            return measuredWidth + lp.leftMargin + lp.rightMargin
        }

        fun View.fullHeight(): Int {
            val lp = layoutParams as MarginLayoutParams
            return measuredHeight + lp.topMargin + lp.bottomMargin
        }
    }
}
