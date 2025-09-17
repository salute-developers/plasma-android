package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import androidx.core.view.isVisible
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder

/**
 * Контент для компонента уведомлений [Notification]
 *
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class NotificationContent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_notificationContentStyle,
    defStyleRes: Int = R.style.Sdds_Components_NotificationContent,
) : LinearLayout(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
),
    ColorStateHolder {

    /**
     * Расположение иконки
     */
    enum class IconPlacement {
        None, Start, Top
    }

    /**
     * Способ размещения кнопок
     */
    enum class ButtonLayout {

        /**
         * Кнопки имеют ширину по контенту
         */
        Normal,

        /**
         * Кнопки равномерно растягиваются на всю ширину notification
         */
        Stretch,
    }

    /**
     * Группа кнопок
     */
    var buttonGroup: ButtonGroup? = null
        private set

    override fun onViewAdded(child: View?) {
        super.onViewAdded(child)
        buttonGroup = child as? ButtonGroup? ?: return
        updateButtonGroupLayout()
    }

    override var colorState: ColorState? =
        ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            resetChildrenColorState()
        }

    private var content: LinearLayout? = null
    private var imageView: ImageView? = null
    private var textBox: LinearLayout? = null
    private var titleTv: TextView? = null
    private var textTv: TextView? = null

    private var _icon: Drawable? = null
    private var _iconSize: Int = 0
    private var _iconTint: ColorStateList? = null
    private var _iconMargin: Int = 0
    private var _iconPlacement: IconPlacement = IconPlacement.None
    private var _title: CharSequence? = null

    @StyleRes
    private var _titleAppearance: Int? = null
    private var _titleColor: ColorStateList? = null
    private var _text: CharSequence? = null

    @StyleRes
    private var _textAppearance: Int? = null
    private var _textColor: ColorStateList? = null
    private var _textPadding: Int = 0
    private var _contentStartPadding: Int = 0
    private var _contentEndPadding: Int = 0
    private var _contentTopPadding: Int = 0
    private var _contentBottomPadding: Int = 0
    private var _textBoxStartPadding: Int = 0
    private var _textBoxEndPadding: Int = 0
    private var _textBoxTopPadding: Int = 0
    private var _textBoxBottomPadding: Int = 0
    private var _buttonGroupStartPadding: Int = 0
    private var _buttonGroupEndPadding: Int = 0
    private var _buttonGroupTopPadding: Int = 0
    private var _buttonGroupBottomPadding: Int = 0

    private var _buttonLayout: ButtonLayout = ButtonLayout.Normal

    init {
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        initViews()
        resetChildrenColorState()
    }

    private fun initViews() {
        orientation = VERTICAL
        setupIcon()
        setupTitle()
        setupText()
        setupTextBox()
        setupContent()
    }

    private fun updateButtonGroupLayout() {
        buttonGroup?.apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
                .apply {
                    setMargins(
                        _buttonGroupStartPadding,
                        _buttonGroupTopPadding,
                        _buttonGroupEndPadding,
                        _buttonGroupBottomPadding,
                    )
                }
            val weight = if (_buttonLayout == ButtonLayout.Normal) 0f else 1f
            children
                .filter { it is Button }
                .forEach { button ->
                    val lp = button.layoutParams as? LayoutParams
                    lp?.weight = weight
                    button.layoutParams = lp
                }
        }
    }

    private fun setupIcon() {
        imageView = ImageView(context)
        updateIconLayout()
        updateIcon()
    }

    private fun updateIconLayout() {
        imageView?.apply {
            layoutParams = LayoutParams(_iconSize, _iconSize).apply {
                when (_iconPlacement) {
                    IconPlacement.Start -> setMargins(0, 0, _iconMargin, 0)
                    IconPlacement.Top -> setMargins(0, 0, 0, _iconMargin)
                    else -> {
                        width = 0
                        height = 0
                        setMargins(0, 0, 0, 0)
                    }
                }
            }
        }
    }

    private fun updateIcon() {
        imageView?.apply {
            imageTintList = _iconTint
            setImageDrawable(_icon)
        }
    }

    private fun setupTitle() {
        titleTv = TextView(context).apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        }
        updateTitle()
    }

    private fun updateTitle() {
        titleTv?.apply {
            text = _title
            _titleAppearance?.let(::setTextAppearance)
            setTextColor(_titleColor)
            isVisible = !_title.isNullOrEmpty()
        }
    }

    private fun setupText() {
        textTv = TextView(context)
        updateText()
    }

    private fun updateText() {
        textTv?.apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
                .apply {
                    val topPadding = if (_title.isNullOrEmpty() || titleTv == null) 0 else _textPadding
                    setMargins(0, topPadding, 0, 0)
                }
            text = _text
            _textAppearance?.let(::setTextAppearance)
            setTextColor(_textColor)
            isVisible = !_text.isNullOrEmpty()
        }
    }

    private fun setupTextBox() {
        textBox = LinearLayout(context).apply {
            orientation = VERTICAL
            layoutParams = WrapContent
                .apply {
                    setPadding(
                        _textBoxStartPadding,
                        _textBoxTopPadding,
                        _textBoxEndPadding,
                        _textBoxBottomPadding,
                    )
                }
            addView(titleTv)
            addView(textTv)
        }
    }

    private fun setupContent() {
        content = LinearLayout(context).apply {
            orientation = when (_iconPlacement) {
                IconPlacement.Start -> HORIZONTAL
                else -> VERTICAL
            }
            layoutParams = WrapContent
                .apply {
                    setPadding(
                        _contentStartPadding,
                        _contentTopPadding,
                        _contentEndPadding,
                        _contentBottomPadding,
                    )
                }
            addView(imageView)
            addView(textBox)
        }
        addView(content)
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(
            set = attrs,
            attrs = R.styleable.NotificationContent,
            defStyleAttr = defStyleAttr,
            defStyleRes = defStyleRes,
        ) {
            _iconPlacement =
                getIconPlacement(R.styleable.NotificationContent_sd_notificationIconPlacement)
            _buttonLayout = getButtonLayout(R.styleable.NotificationContent_sd_buttonLayout)
            _titleAppearance = getResourceId(R.styleable.NotificationContent_sd_titleAppearance, 0)
            _textAppearance = getResourceId(R.styleable.NotificationContent_sd_textAppearance, 0)

            _title = getString(R.styleable.NotificationContent_sd_title)
            _text = getString(R.styleable.NotificationContent_sd_text)
            _icon = getDrawable(R.styleable.NotificationContent_sd_icon)
            _iconTint = getColorStateList(R.styleable.NotificationContent_sd_iconTint)
            _titleColor = getColorStateList(R.styleable.NotificationContent_sd_titleColor)
            _textColor = getColorStateList(R.styleable.NotificationContent_sd_textColor)
            _iconSize = getDimensionPixelSize(R.styleable.NotificationContent_sd_iconSize, 0)
            _iconMargin = getDimensionPixelSize(R.styleable.NotificationContent_sd_iconMargin, 0)
            _textPadding = getDimensionPixelSize(R.styleable.NotificationContent_sd_textPadding, 0)
            _contentStartPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_contentStartPadding, 0)
            _contentEndPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_contentEndPadding, 0)
            _contentTopPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_contentTopPadding, 0)
            _contentBottomPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_contentBottomPadding, 0)
            _textBoxStartPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_textBoxStartPadding, 0)
            _textBoxEndPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_textBoxEndPadding, 0)
            _textBoxTopPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_textBoxTopPadding, 0)
            _textBoxBottomPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_textBoxBottomPadding, 0)
            _buttonGroupStartPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_buttonGroupStartPadding, 0)
            _buttonGroupEndPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_buttonGroupEndPadding, 0)
            _buttonGroupTopPadding =
                getDimensionPixelSize(R.styleable.NotificationContent_sd_buttonGroupTopPadding, 0)
            _buttonGroupBottomPadding = getDimensionPixelSize(
                R.styleable.NotificationContent_sd_buttonGroupBottomPadding,
                0,
            )
        }
    }

    private fun resetChildrenColorState() {
        textTv?.colorState = colorState
        titleTv?.colorState = colorState
        imageView?.colorState = colorState
    }

    /**
     * Размещение кнопок
     */
    open var buttonLayout: ButtonLayout
        get() = _buttonLayout
        set(value) {
            if (_buttonLayout != value) {
                _buttonLayout = value
                updateButtonGroupLayout()
            }
        }

    /**
     * Иконка
     */
    open var icon: Drawable?
        get() = _icon
        set(value) {
            if (_icon != value) {
                _icon = value
                updateIcon()
                updateIconLayout()
            }
        }

    /**
     * Размер иконки
     */
    open var iconSize: Int
        get() = _iconSize
        set(value) {
            if (_iconSize != value) {
                _iconSize = value
                updateIconLayout()
            }
        }

    /**
     * Цвет иконки
     */
    open var iconTint: ColorStateList?
        get() = _iconTint
        set(value) {
            if (_iconTint != value) {
                _iconTint = value
                updateIcon()
            }
        }

    /**
     * Отступ иконки
     */
    open var iconMargin: Int
        get() = _iconMargin
        set(value) {
            if (_iconMargin != value) {
                _iconMargin = value
                updateIconLayout()
            }
        }

    /**
     * Размещение иконки
     */
    open var iconPlacement: IconPlacement
        get() = _iconPlacement
        set(value) {
            if (_iconPlacement != value) {
                _iconPlacement = value
                updateIconLayout()
            }
        }

    /**
     * Заголовок уведомления
     */
    open var title: CharSequence?
        get() = _title
        set(value) {
            if (_title != value) {
                _title = value
                updateTitle()
                updateText()
            }
        }

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    open fun setTitleColor(titleColor: ColorStateList?) {
        if (_titleColor != titleColor) {
            _titleColor = titleColor
            updateTitle()
        }
    }

    /**
     * Устанавливает цвет заголовка [titleColor]
     */
    open fun setTitleColor(@ColorInt titleColor: Int) = setTitleColor(ColorStateList.valueOf(titleColor))

    /**
     * Стиль текста заголовка уведомления
     */
    open var titleAppearance: Int?
        get() = _titleAppearance
        set(value) {
            if (_titleAppearance != value) {
                _titleAppearance = value
                updateTitle()
            }
        }

    /**
     * Текст уведомления
     */
    open var text: CharSequence?
        get() = _text
        set(value) {
            if (_text != value) {
                _text = value
                updateText()
            }
        }

    /**
     * Стиль текста уведомления
     */
    open var textAppearance: Int?
        get() = _textAppearance
        set(value) {
            if (_textAppearance != value) {
                _textAppearance = value
                updateText()
            }
        }

    /**
     * Устанавливает цвет текста [textColor]
     */
    open fun setTextColor(textColor: ColorStateList?) {
        if (_textColor != textColor) {
            _textColor = textColor
            updateText()
        }
    }

    /**
     * Устанавливает цвет текста [textColor]
     */
    open fun setTextColor(@ColorInt textColor: Int) = setTextColor(ColorStateList.valueOf(textColor))

    /**
     * Отступ до текста
     */
    open var textPadding: Int
        get() = _textPadding
        set(value) {
            if (_textPadding != value) {
                _textPadding = value
                updateText()
            }
        }

    private companion object {
        fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            val typedArray =
                context.obtainStyledAttributes(
                    attrs,
                    R.styleable.NotificationContent,
                    defStyleAttr,
                    defStyleRes,
                )
            val buttonGroupStyleOverlay =
                typedArray.getResourceId(
                    R.styleable.NotificationContent_sd_buttonGroupStyleOverlay,
                    0,
                )
            val themeOverlay =
                if (buttonGroupStyleOverlay != 0) {
                    ContextThemeWrapper(context, buttonGroupStyleOverlay)
                } else {
                    context
                }
            typedArray.recycle()
            return themeOverlay
        }

        val WrapContent: LayoutParams
            get() = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

        fun TypedArray.getIconPlacement(index: Int): IconPlacement {
            return IconPlacement.values()
                .getOrNull(getInt(index, 0))
                ?: IconPlacement.None
        }

        fun TypedArray.getButtonLayout(index: Int): ButtonLayout {
            return ButtonLayout.values()
                .getOrNull(getInt(index, 0))
                ?: ButtonLayout.Normal
        }
    }
}
