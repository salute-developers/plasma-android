package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.InputType
import android.util.AttributeSet
import android.view.ActionMode
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.getSystemService
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.withTranslation
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.statelist.ColorValueHolder
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.StyleStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getStyleForState
import com.sdds.uikit.statelist.getStyleStateList

/**
 * [AppCompatEditText] с поддержкой [ColorState], [ColorValueStateList], [StyleStateList]
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию.
 */
open class Editable @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_editableStyle,
    defStyleRes: Int = R.style.Sdds_Components_Editable,
) : AppCompatEditText(context, attrs, defStyleAttr), ColorStateHolder {

    private var _iconTint: ColorValueStateList? = null
    private var _icon: Drawable? = null
    private var _iconMargin: Int = 0
    private var _iconSize: Int = 0
    private var _textColors: ColorValueStateList? = null
    private var _textAppearances: StyleStateList? = null
    private var currentTextAppearance: Int = 0
    private var _iconPlacement: Int = ICON_PLACEMENT_RELATIVE

    private var cursorColors: ColorStateList? = null

    private val viewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private var currentImeAction: Int = 0
    private val keyListener = KeyListener()
    private val editorListener = EditorListener()
    private val insertionReadOnlyCallback = ReadOnlyInsertionActionModeCallback()
    private val selectionReadOnlyCallback = ReadOnlySelectionActionModeCallback()
    private var _keyHandled: Boolean = false
    private var _originalInputType: Int? = null
    private var _pendingEditorListener: OnEditorActionListener? = null

    protected open var manageOwnAlpha: Boolean = true

    /**
     * Устанавливает [Editable] в режим "Только для чтения"
     */
    open var isReadOnly: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                updateReadOnlyState()
                refreshDrawableState()
            }
        }

    /**
     * Управляет переносом строки при нажатии на `Enter`
     * если true - строка переносится на новую
     */
    var allowBreakLines: Boolean = true

    /**
     * Иконка
     */
    open var icon: Drawable?
        get() = _icon
        set(value) {
            if (_icon != value) {
                _icon = value
                updateIcon()
            }
        }

    /**
     * Расположение иконки.
     */
    open var iconPlacement: Int
        get() = _iconPlacement
        set(value) {
            if (_iconPlacement != value) {
                _iconPlacement = value
                updateCompoundDrawable()
            }
        }

    /**
     * Отступ иконки от текстового поля.
     */
    open var iconMargin: Int
        get() = _iconMargin
        set(value) {
            if (_iconMargin != value) {
                _iconMargin = value
                updateCompoundDrawable()
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
                updateIcon()
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
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        clipToOutline = false
        super.setOnKeyListener(keyListener)
        editorListener.userListener = _pendingEditorListener
        super.setOnEditorActionListener(editorListener)
    }

    /**
     * Устанавливает список [StyleStateList] с соответствиями стилей текста с drawableState
     */
    open fun setTextAppearancesList(valueAppearances: StyleStateList?) {
        if (_textAppearances != valueAppearances) {
            _textAppearances = valueAppearances
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает цвета текста текстового поля
     * @param colors цвета текста
     */
    open fun setTextColors(colors: ColorValueStateList?) {
        if (_textColors != colors) {
            _textColors = colors
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает цвета курсора текстового поля
     * @param colors цвета курсора
     */
    open fun setCursorColors(colors: ColorStateList?) {
        if (cursorColors != colors) {
            cursorColors = colors
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает цвет курсора текстового поля
     * @param color цвет курсора
     */
    open fun setCursorColor(@ColorInt color: Int) {
        setCursorColors(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета иконки
     * @param colors цвета иконки
     */
    open fun setIconTints(colors: ColorValueStateList?) {
        if (_iconTint != colors) {
            _iconTint = colors
            refreshDrawableState()
        }
    }

    /**
     * Устанавливает цвета иконки
     * @param colors цвета иконки
     */
    open fun setIconTints(colors: ColorStateList?) {
        setIconTints(ColorValueStateList.valueOf(colors))
    }

    /**
     * Устанавливает окрас иконки
     * @param color окрас иконки
     */
    open fun setIconTint(@ColorInt color: Int) {
        setIconTints(ColorValueStateList.valueOf(color))
    }

    /**
     * Возвращает true если [Editable] однострочный
     */
    fun singleLine(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            isSingleLine
        } else {
            !isMultilineInputType() && maxLines == 1
        }
    }

    /**
     * Запрашивает фокус и клавиатуру
     */
    fun forceFocus(showIme: Boolean = true) {
        if (requestFocus() && !isReadOnly && showIme) {
            showImeImplicit()
        }
        setSelection(text?.length ?: 0)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        if (manageOwnAlpha) {
            viewAlphaHelper?.updateAlphaByEnabledState(this)
        }
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        refreshTextAppearanceIfNeed()
        resetTextColor()
        resetCursorColor()
        updateIcon()
    }

    override fun setTextAppearance(resId: Int) {
        setTextAppearancesList(StyleStateList.valueOf(resId))
    }

    override fun setTextColor(colors: ColorStateList?) {
        setTextColors(ColorValueStateList.valueOf(colors))
    }

    override fun setTextColor(@ColorInt color: Int) {
        setTextColors(ColorValueStateList.valueOf(color))
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 2)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        if (isReadOnly) {
            mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_readonly))
        }
        return drawableState
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (icon == null || iconPlacement == ICON_PLACEMENT_RELATIVE) return
        icon?.state = drawableState
        icon?.alpha = (alpha * 255).toInt()
        val iconHeight = icon?.bounds?.height() ?: 0
        val x = scrollX + width + _iconMargin
        val y = scrollY + (height - iconHeight) / 2f
        canvas.withTranslation(x.toFloat(), y) {
            icon?.draw(this)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val contentMinWidth = getContentMinWidth()
        minWidth = maxOf(contentMinWidth, minWidth)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun setOnKeyListener(l: OnKeyListener?) {
        keyListener.userKeyListener = l
    }

    override fun setOnEditorActionListener(l: OnEditorActionListener?) {
        // Может быть не инициализирован при вызове setOnEditorActionListener из супер класса,
        if (editorListener == null) {
            _pendingEditorListener = l
        } else {
            editorListener.userListener = l
        }
    }

    override fun onCreateInputConnection(outAttrs: EditorInfo?): InputConnection? {
        val connection = super.onCreateInputConnection(outAttrs)
        if (!allowBreakLines) {
            outAttrs?.apply {
                imeOptions = imeOptions and EditorInfo.IME_FLAG_NO_ENTER_ACTION.inv()
                currentImeAction = imeOptions and EditorInfo.IME_MASK_ACTION
            }
        }
        return connection
    }

    protected open fun getContentMinWidth() =
        compoundPaddingStart + compoundPaddingEnd + paint.measureText(DUMMY_MEASURE_TEXT).toInt()

    private fun updateCompoundDrawable() {
        icon?.let {
            if (iconPlacement == ICON_PLACEMENT_RELATIVE && isEnabled) {
                setCompoundDrawablesRelative(null, null, it, null)
                compoundDrawablePadding = _iconMargin
            } else {
                setCompoundDrawablesRelative(null, null, null, null)
                compoundDrawablePadding = 0
            }
        }
    }

    private fun updateIcon() {
        icon = icon?.let { iconDrawable ->
            val wrappedIcon = DrawableCompat.wrap(iconDrawable).mutate()
            DrawableCompat.setTintList(wrappedIcon, getDrawableTintList())
            DrawableCompat.setTintMode(wrappedIcon, PorterDuff.Mode.SRC_IN)
            val width = if (iconSize != 0) iconSize else wrappedIcon.intrinsicWidth
            val height = if (iconSize != 0) iconSize else wrappedIcon.intrinsicHeight
            wrappedIcon.setBounds(0, 0, width, height)
            wrappedIcon
        }
        updateCompoundDrawable()
    }

    private fun refreshTextAppearanceIfNeed() {
        val stateList = _textAppearances ?: return
        val old = currentTextAppearance
        currentTextAppearance = stateList.getStyleForState(drawableState)
        if (old != currentTextAppearance) {
            super.setTextAppearance(currentTextAppearance)
        }
    }

    private fun resetTextColor() {
        _textColors?.let {
            val colorValue = if (it.isStateful()) {
                it.getValueForState(drawableState)
            } else {
                it.getDefaultValue()
            }
            when (colorValue) {
                is ColorValueHolder.ColorValue -> super.setTextColor(ColorStateList.valueOf(colorValue.value))
                is ColorValueHolder.ColorListValue -> super.setTextColor(colorValue.value)
                else -> Unit
            }
        }
    }

    private fun resetCursorColor() {
        cursorColors?.let {
            val color = it.getColorForState(drawableState, it.defaultColor)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val cursorDrawable = textCursorDrawable
                cursorDrawable?.mutate()?.let { drawable ->
                    drawable.setTint(color)
                    textCursorDrawable = drawable
                }
            }
        }
    }

    private fun getDrawableTintList(): ColorStateList? {
        return _iconTint?.let {
            val imageTintValue = if (it.isStateful()) {
                it.getValueForState(drawableState)
            } else {
                it.getDefaultValue()
            }
            when (imageTintValue) {
                is ColorValueHolder.ColorValue -> ColorStateList.valueOf(imageTintValue.value)
                is ColorValueHolder.ColorListValue -> imageTintValue.value
                else -> null
            }
        }
    }

    private fun showImeImplicit() {
        context.getSystemService<InputMethodManager>()
            ?.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    }

    private fun isMultilineInputType(): Boolean {
        val mask = (EditorInfo.TYPE_MASK_CLASS or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE)
        return inputType and mask == EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE
    }

    private fun updateReadOnlyState() {
        if (_originalInputType == null) {
            _originalInputType = inputType
        }
        inputType = if (isReadOnly) {
            InputType.TYPE_NULL
        } else {
            _originalInputType ?: InputType.TYPE_NULL
        }
        customInsertionActionModeCallback = insertionReadOnlyCallback.takeIf { isReadOnly }
        customSelectionActionModeCallback = selectionReadOnlyCallback.takeIf { isReadOnly }
        showSoftInputOnFocus = !isReadOnly
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.Editable, defStyleAttr, defStyleRes) {
            _iconTint = getColorValueStateList(context, R.styleable.Editable_sd_iconTint)
            _icon = getDrawable(R.styleable.Editable_sd_icon)
            _iconMargin = getDimensionPixelSize(R.styleable.Editable_sd_iconMargin, 0)
            _iconSize = getDimensionPixelSize(R.styleable.Editable_sd_iconSize, 0)
            val fallBackAppearance = getResourceId(R.styleable.Editable_android_textAppearance, 0)
            _textAppearances = getStyleStateList(context, R.styleable.Editable_sd_valueAppearance)
            if (fallBackAppearance != 0 && _textAppearances == null) {
                _textAppearances = StyleStateList.valueOf(fallBackAppearance)
            }
            val fallBackColors = getColorStateList(R.styleable.Editable_android_textColor)
            _textColors = getColorValueStateList(context, R.styleable.Editable_sd_valueColor)
            if (fallBackColors != null && _textColors == null) {
                _textColors = ColorValueStateList.valueOf(fallBackColors)
            }
            _iconPlacement = getInt(R.styleable.Editable_sd_editableIconPlacement, 0)
            cursorColors = getColorStateList(R.styleable.Editable_sd_cursorColor)
        }
    }

    private inner class KeyListener : OnKeyListener {

        var userKeyListener: OnKeyListener? = null

        override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
            // Сначала режем ввод в read-only
            if (this@Editable.isReadOnly && event?.action == KeyEvent.ACTION_DOWN) {
                return when (keyCode) {
                    // Разрешаем только навигацию/модификаторы, чтобы можно было двигать курсор и выделять
                    KeyEvent.KEYCODE_DPAD_LEFT,
                    KeyEvent.KEYCODE_DPAD_RIGHT,
                    KeyEvent.KEYCODE_DPAD_UP,
                    KeyEvent.KEYCODE_DPAD_DOWN,
                    KeyEvent.KEYCODE_MOVE_HOME,
                    KeyEvent.KEYCODE_MOVE_END,
                    KeyEvent.KEYCODE_PAGE_UP,
                    KeyEvent.KEYCODE_PAGE_DOWN,
                    KeyEvent.KEYCODE_SHIFT_LEFT,
                    KeyEvent.KEYCODE_SHIFT_RIGHT,
                    KeyEvent.KEYCODE_ALT_LEFT,
                    KeyEvent.KEYCODE_ALT_RIGHT,
                    KeyEvent.KEYCODE_CTRL_LEFT,
                    KeyEvent.KEYCODE_CTRL_RIGHT,
                    -> {
                        // не перехватываем — пусть система двигает курсор/выделение
                        userKeyListener?.onKey(v, keyCode, event) == true
                    }

                    else -> {
                        // любые символы, Backspace, Enter и т.п. – гасим
                        true
                    }
                }
            }

            if (keyCode == KeyEvent.KEYCODE_ENTER && !singleLine()) {
                _keyHandled = userKeyListener?.onKey(v, keyCode, event) == true
                return _keyHandled || !allowBreakLines
            }
            return userKeyListener?.onKey(v, keyCode, event) == true
        }
    }

    private inner class EditorListener : OnEditorActionListener {

        var userListener: OnEditorActionListener? = null

        override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
            return (userListener?.onEditorAction(v, actionId, event) == true)
        }
    }

    private class ReadOnlySelectionActionModeCallback : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean = true

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            menu ?: return false
            runCatching {
                val copyItem = menu.findItem(android.R.id.copy)
                val title = copyItem.title
                menu.clear()
                menu.add(0, android.R.id.copy, 0, title)
            }
            return true
        }

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean = false

        override fun onDestroyActionMode(mode: ActionMode?) = Unit
    }

    private class ReadOnlyInsertionActionModeCallback : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean = false

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean = false

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean = false

        override fun onDestroyActionMode(mode: ActionMode?) = Unit
    }

    companion object {
        private const val DUMMY_MEASURE_TEXT = "M"

        /**
         * Расположение иконки не влияет на размер [Editable].
         * Иконка рисуется за границей [Editable]
         */
        const val ICON_PLACEMENT_ABSOLUTE = 0

        /**
         * Расположение иконки влияет на размер [Editable].
         * Иконка рисуется в пределах границ [Editable]
         */
        const val ICON_PLACEMENT_RELATIVE = 1
    }
}
