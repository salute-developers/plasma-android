package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.EditText
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.textfield.DecoratedFieldBox
import com.sdds.uikit.internal.textfield.IndicatorDrawable
import com.sdds.uikit.internal.textfield.StatefulEditText
import com.sdds.uikit.viewstate.ViewState

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
) : FlowLayout(context, attrs, defStyleAttr, defStyleRes) {

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

    /**
     * Состояние поля для ввода
     */
    enum class FieldState {
        /**
         * Нормальное состояние поля
         */
        Default,

        /**
         * Обозначение позитивного сценария
         */
        Positive,

        /**
         * Обозначение предупреждения
         */
        Warning,

        /**
         * Обозначение негативного сценария
         */
        Negative,
    }

    private val _outerLabelView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldOuterLabel
            isFocusable = false
            isFocusableInTouchMode = false
        }
    }
    private val _captionView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldCaption
            isFocusable = false
            isFocusableInTouchMode = false
        }
    }

    private val _counterView: TextView by unsafeLazy {
        TextView(context).apply {
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

    private var _state: ViewState? = null
        set(value) {
            if (field != value) {
                field = value
                _decorationBox.state = field
                _captionView.state = field
                _counterView.state = field
                _outerLabelView.state = field
                refreshDrawableState()
            }
        }

    init {
        setWillNotDraw(false)
        setAddStatesFromChildren(true)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        layoutChildren()
        isFocusable = false
        isFocusableInTouchMode = false
    }

    /**
     * Состояние текстового поля
     * @see ViewState
     */
    var state: FieldState
        get() = when (_state) {
            ViewState.POSITIVE -> FieldState.Positive
            ViewState.WARNING -> FieldState.Warning
            ViewState.NEGATIVE -> FieldState.Negative
            else -> FieldState.Default
        }
        set(value) {
            _state = when (value) {
                FieldState.Default -> ViewState.PRIMARY
                FieldState.Positive -> ViewState.POSITIVE
                FieldState.Warning -> ViewState.WARNING
                FieldState.Negative -> ViewState.NEGATIVE
            }
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
            val newState = if (value) ViewState.SECONDARY else _state
            _captionView.state = newState
            _counterView.state = newState
            _outerLabelView.state = newState
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

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
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
        val isActivated = _decorationBox.isActivated
        _captionView.state = if (isActivated) ViewState.PRIMARY else _state
        _counterView.state = if (isActivated) ViewState.PRIMARY else _state
        _indicator?.state = drawableState
        _indicator?.invalidateSelf()
        _inDrawableStateChanged = false
    }

    override fun onMeasureChild(child: View, widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val specHeight = MeasureSpec.getSize(heightMeasureSpec)
        val specMode = MeasureSpec.getMode(heightMeasureSpec)
        val newHeightSpec =
            if (child == _decorationBox && !_decorationBox.isSingleLine() && specMode != MeasureSpec.UNSPECIFIED) {
                val captionHeight = if (!_captionView.isGone) {
                    super.onMeasureChild(_captionView, widthMeasureSpec, heightMeasureSpec)
                    _captionView.measuredHeight
                } else {
                    0
                }
                val counterHeight = if (!_counterView.isGone) {
                    super.onMeasureChild(_counterView, widthMeasureSpec, heightMeasureSpec)
                    _counterView.measuredHeight
                } else {
                    0
                }

                val newSpecHeight = specHeight - maxOf(captionHeight, counterHeight)
                if (newSpecHeight != specHeight) {
                    MeasureSpec.makeMeasureSpec(newSpecHeight, specMode)
                } else {
                    heightMeasureSpec
                }
            } else {
                heightMeasureSpec
            }
        super.onMeasureChild(child, widthMeasureSpec, newHeightSpec)
    }

    @Suppress("ReturnCount")
    override fun onLayoutChild(child: View, left: Int, top: Int, right: Int, bottom: Int, rowBounds: Rect) {
        super.onLayoutChild(child, left, top, right, bottom, rowBounds)
        if (labelPlacement == HelperTextPlacement.Inner && child != _decorationBox) return
        if (labelPlacement == HelperTextPlacement.Outer && child != _outerLabelView) return
        if (requirementMode == RequirementMode.Optional) return

        val gravity: Int
        val horizontalAlignment: IndicatorDrawable.AlignmentMode
        val verticalAlignment: IndicatorDrawable.AlignmentMode
        when (child) {
            _decorationBox -> {
                horizontalAlignment = IndicatorDrawable.AlignmentMode.Inside
                verticalAlignment = horizontalAlignment
                gravity = Gravity.TOP or if (requirementMode == RequirementMode.Start) Gravity.START else Gravity.END
            }
            _outerLabelView -> {
                horizontalAlignment = IndicatorDrawable.AlignmentMode.Outside
                verticalAlignment = IndicatorDrawable.AlignmentMode.Inside
                gravity = if (requirementMode == RequirementMode.Start) {
                    Gravity.CENTER_VERTICAL or Gravity.START
                } else {
                    Gravity.TOP or Gravity.END
                }
            }
            else -> return
        }
        _indicator?.applyMode(horizontalAlignment, verticalAlignment, gravity)
        _indicator?.setBounds(left, top, right, bottom)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _indicator
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
                _decorationBox.labelEnabled = true
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
            LayoutParams(WRAP_CONTENT, WRAP_CONTENT).apply {
                occupy = true
                bottomMargin = _labelPadding
            },
        )
        addView(
            _decorationBox,
            LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                gravity = Gravity.START
                occupy = true
            },
        )
        addView(
            _counterView,
            generateDefaultLayoutParams().apply {
                gravity = Gravity.TOP or Gravity.END
                topMargin = _helperTextPadding
            },
        )
        addView(
            _captionView,
            LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                gravity = Gravity.TOP or Gravity.START
                occupy = true
                topMargin = _helperTextPadding
            },
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
        typedArray.recycle()
        _state = ViewState.obtain(context, attrs, defStyleAttr)
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
    }
}
