package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.view.updatePaddingRelative
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.base.shape.ShapeHelper
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.textfield.DecoratedFieldBox
import com.sdds.uikit.viewstate.ViewState

/**
 * Компонент TextField - однострочное текстовое поле
 * с поддержкой отображения статуса, заголовка, плейсхолдера и иконок.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 13.06.2024
 */
open class TextField @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_textFieldStyle,
    defStyleRes: Int = R.style.Sdds_Components_TextField,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    /**
     * Тип заголовка
     */
    enum class LabelType {
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

    private val _footerContainer: FrameLayout by unsafeLazy { FrameLayout(context) }
    private val _outerLabelView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldOuterLabel
        }
    }
    private val _captionView: TextView by unsafeLazy {
        TextView(context).apply {
            id = R.id.sd_textFieldCaption
        }
    }
    private val _decorationBox: DecoratedFieldBox by unsafeLazy {
        DecoratedFieldBox(context, attrs, defStyleAttr).apply {
            id = R.id.sd_textFieldDecorationBox
            ShapeHelper(this, attrs, defStyleAttr)
        }
    }
    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)

    private var _boxHeight: Int = ViewGroup.LayoutParams.WRAP_CONTENT
    private var _captionPadding: Int = 0
    private var _labelPadding: Int = 0

    private var _labelType: LabelType = LabelType.Outer
    private var _label: String? = null
    private var _caption: String? = null
    private var _inDrawableStateChanged: Boolean = false

    private var _state: ViewState? = null
        set(value) {
            if (field != value) {
                field = value
                _decorationBox.state = field
                _captionView.state = field
                _outerLabelView.state = field
                refreshDrawableState()
            }
        }

    init {
        setAddStatesFromChildren(true)
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
        layoutChildren()
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
    open var label: String?
        get() = _label
        set(value) {
            if (_label != value) {
                _label = value
                updateLabel()
            }
        }

    /**
     * Тип заголовка текстового поля
     */
    open var labelType: LabelType
        get() = _labelType
        set(value) {
            if (_labelType != value) {
                _labelType = value
                updateLabel()
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
    open var value: String?
        get() = _decorationBox.editText.text.toString()
        set(value) {
            _decorationBox.editText.setText(value)
        }

    /**
     * Подпись к текстовому полю
     */
    open var caption: String?
        get() = _caption
        set(value) {
            if (_caption != value) {
                _caption = value
                _captionView.text = value
                _captionView.isGone = value.isNullOrBlank()
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
    var isReadOnly: Boolean
        get() = _decorationBox.editText.isReadOnly
        set(value) {
            _decorationBox.editText.isReadOnly = value
            val newState = if (value) ViewState.SECONDARY else _state
            _captionView.state = newState
            _outerLabelView.state = newState
            refreshDrawableState()
        }

    /**
     * Устанавливает стиль текста [label] в состоянии [LabelType.Outer]
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setOuterLabelAppearance(@StyleRes appearanceId: Int) {
        _outerLabelView.setTextAppearance(appearanceId)
    }

    /**
     * Устанавливает стиль текста [label] в состоянии [LabelType.Inner]
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setInnerLabelAppearance(@StyleRes appearanceId: Int) {
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
     * Устанавливает стиль текста [placeholder] текстового поля
     * @param appearanceId идентификатор ресурса стиля текста
     */
    open fun setPlaceholderAppearance(@StyleRes appearanceId: Int) {
        if (appearanceId != 0) {
            _decorationBox.setPlaceholderAppearance(appearanceId)
        }
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
        }
    }

    /**
     * Устанавливает цвета текста [caption] текстового поля
     * @param colors цвета текста
     */
    open fun setCaptionColor(colors: ColorStateList?) {
        if (colors != null) {
            _captionView.setTextColor(colors)
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

    /**
     * Функция всегда устанавливает [LinearLayout.VERTICAL] независимо от параметра [orientation]
     */
    override fun setOrientation(orientation: Int) {
        super.setOrientation(VERTICAL)
    }

    /**
     * Функция всегда устанавливает [Gravity.CENTER_HORIZONTAL] независимо от параметра [gravity]
     */
    override fun setGravity(gravity: Int) {
        super.setGravity(Gravity.CENTER_HORIZONTAL)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _decorationBox.isEnabled = enabled
        viewAlphaHelper.updateAlphaByEnabledState(this)
    }

    override fun getBaseline(): Int {
        return _decorationBox.baseline
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        if (_inDrawableStateChanged || isReadOnly) {
            return
        }
        _inDrawableStateChanged = true
        _captionView.state = if (drawableState.contains(android.R.attr.state_focused)) ViewState.PRIMARY else _state
        _inDrawableStateChanged = false
    }

    private fun updateLabel() {
        if (labelType == LabelType.Outer) {
            _outerLabelView.text = label
        } else {
            _decorationBox.setLabel(label)
            _outerLabelView.text = null
        }
        _decorationBox.labelEnabled = labelType == LabelType.Inner && _decorationBox.shouldDisplayInnerLabel(_boxHeight)
        _outerLabelView.isVisible = labelType == LabelType.Outer && !label.isNullOrBlank()
        _decorationBox.updateTextOffset()
    }

    private fun layoutChildren() {
        orientation = VERTICAL

        _footerContainer.apply {
            setPadding(0, _captionPadding, 0, 0)
            addView(
                _captionView,
                FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
                    gravity = Gravity.CENTER_VERTICAL or Gravity.START
                },
            )
        }
        if (labelType == LabelType.Outer) {
            _outerLabelView.updatePaddingRelative(bottom = _labelPadding)
            addView(_outerLabelView, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
        }
        addView(_decorationBox, LayoutParams(LayoutParams.MATCH_PARENT, _boxHeight))
        addView(_footerContainer, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextField, defStyleAttr, defStyleRes)

        _boxHeight = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_boxHeight, LayoutParams.WRAP_CONTENT)

        label = typedArray.getString(R.styleable.TextField_sd_label)
        labelType = LabelType.values()
            .getOrNull(typedArray.getInt(R.styleable.TextField_sd_labelType, 0))
            ?: LabelType.Outer
        _labelPadding = typedArray.getDimensionPixelSize(R.styleable.TextField_sd_outerLabelPadding, 0)
        setOuterLabelAppearance(typedArray.getResourceId(R.styleable.TextField_sd_outerLabelAppearance, 0))
        setInnerLabelAppearance(typedArray.getResourceId(R.styleable.TextField_sd_innerLabelAppearance, 0))
        setLabelColor(typedArray.getColorStateList(R.styleable.TextField_sd_labelColor))

        val valueAppearance = typedArray.getResourceId(R.styleable.TextField_sd_valueAppearance, 0)
        val valueColor = typedArray.getColorStateList(R.styleable.TextField_sd_valueColor)
        value = typedArray.getString(R.styleable.TextField_sd_value)
        setValueAppearance(valueAppearance)
        setValueColor(valueColor)

        placeholder = typedArray.getString(R.styleable.TextField_sd_placeholder)
        setPlaceholderAppearance(
            typedArray.getResourceId(
                R.styleable.TextField_sd_placeholderAppearance,
                valueAppearance,
            ),
        )
        setPlaceholderColor(typedArray.getColorStateList(R.styleable.TextField_sd_placeholderColor) ?: valueColor)

        caption = typedArray.getString(R.styleable.TextField_sd_caption)
        setCaptionAppearance(typedArray.getResourceId(R.styleable.TextField_sd_captionAppearance, 0))
        setCaptionColor(typedArray.getColorStateList(R.styleable.TextField_sd_captionColor))
        _captionPadding = typedArray.getDimensionPixelOffset(R.styleable.TextField_sd_captionPadding, 0)
        typedArray.recycle()
        _state = ViewState.obtain(context, attrs, defStyleAttr)
    }
}
