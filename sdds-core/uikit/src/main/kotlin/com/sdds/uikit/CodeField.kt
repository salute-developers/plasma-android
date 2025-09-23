package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.text.Editable
import android.text.InputFilter
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.Gravity
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.animation.doOnEnd
import androidx.core.content.withStyledAttributes
import androidx.core.view.children
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.ViewAlphaHelper
import com.sdds.uikit.internal.base.dp
import com.sdds.uikit.internal.codefield.CodeContent
import com.sdds.uikit.internal.codefield.CodeGroup
import com.sdds.uikit.internal.codefield.CodeItem
import com.sdds.uikit.internal.codefield.codeGroups
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getNumberStateList

/**
 * Компонент CodeField
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @see ViewGroup
 */
open class CodeField @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_codeFieldStyle,
    defStyleRes: Int = R.style.Sdds_Components_CodeField,
) : ViewGroup(context, attrs, defStyleAttr), ColorStateHolder {

    private var code: String = ""
    private var _focusGain: Boolean = false
    private var _codeLength: Int = 6

    private var itemWidth: Int = 0
    private var itemHeight: Int = 0

    private var itemSpacing: Int = 0
    private var groupSpacing: Int = 0
    private var captionSpacing: Int = 0

    private var captionAlignment: CaptionAlignment = CaptionAlignment.Start
    private var itemShape: ShapeModel = ShapeModel()
    private var groupShape: ShapeModel? = null
    private var globalError: Boolean = false

    private var _hidden: Boolean = false
    private var codeGroup: CodeGroup = defaultCodeGroups(_codeLength)
    private val itemErrors: MutableList<Char?> = mutableListOf()

    private val shakeItemAnimator: ValueAnimator = createShakeItemAnimation()
    private val shakeFieldAnimator: ValueAnimator = createShakeFieldAnimation()
    private var errorOnCaption: Boolean = false

    private var dotStrokeWidth: Float = 0f
    private var dotSizeNumberList: NumberStateList? = null
    private var dotStrokeColorList: ColorStateList? = null
    private var dotFillColorList: ColorStateList? = null
    private var cursorColorList: ColorStateList? = null
    private var itemTintColorList: ColorStateList? = null
    private var itemTextColorList: ColorStateList? = null
    private var itemTextAppearanceRes: Int = 0

    private val codeItems: MutableList<CodeItem> = mutableListOf()

    private var startItemShape: ShapeModel = ShapeModel()
    private var endItemShape: ShapeModel = ShapeModel()

    private val _viewAlphaHelper: ViewAlphaHelper = ViewAlphaHelper(context, attrs, defStyleAttr)
    private var _charValidateBehavior: CharErrorBehavior = CharErrorBehavior.Remove
    private var _codeValidateBehavior: CodeErrorBehavior = CodeErrorBehavior.Remove

    private val editField = AppCompatEditText(context).apply {
        background = null
        isCursorVisible = false
        setTextColor(Color.TRANSPARENT)
        setTextIsSelectable(false)
        filters = arrayOf(InputFilter.LengthFilter(codeLength))
        isFocusable = true
        isClickable = false
        isFocusableInTouchMode = true
        isSingleLine = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            importantForAutofill = View.IMPORTANT_FOR_AUTOFILL_NO
        }
    }

    private val captionView: CaptionView = CaptionView(context).apply {
        text = ""
        isFocusable = false
    }

    /**
     * Устанавливает текст caption
     */
    open var captionText: CharSequence
        get() = captionView.text
        set(value) {
            captionView.text = value
        }

    /**
     * Скрывает вводимые символы
     */
    open var hidden: Boolean
        get() = _hidden
        set(value) {
            if (_hidden != value) {
                _hidden = value
                for (index in 0 until codeLength) {
                    updateItemContent(index)
                }
            }
        }

    /**
     * Может ли ячейка [CodeItem] получать фокус
     */
    open var focusGain: Boolean
        get() = _focusGain
        set(value) {
            if (_focusGain != value) {
                _focusGain = value
                isFocusable = _focusGain
                invalidate()
            }
        }

    /**
     * Максимальная длина кода
     */
    open var codeLength: Int
        get() = _codeLength
        set(value) {
            if (_codeLength != value) {
                editField.text?.clear()
                code = ""
                _codeLength = value
                codeGroup = defaultCodeGroups(_codeLength)
                clearErrors()
                repopulateItems()
                setItemsShapes()
                setLengthFilter()
            }
        }

    /**
     * Наличие курсора
     */
    open var hasCursor: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                codeItems.forEach { it.setCursorEnabled(value) }
            }
        }

    /**
     * Поведение при обработке введенного некорректно символа
     */
    open var charValidateBehavior: CharErrorBehavior
        get() = _charValidateBehavior
        set(value) {
            if (_charValidateBehavior != value) {
                _charValidateBehavior = value
            }
        }

    /**
     * Поведение при обработке введенного некорректно кода
     */
    open var codeValidateBehavior: CodeErrorBehavior
        get() = _codeValidateBehavior
        set(value) {
            if (_codeValidateBehavior != value) {
                _codeValidateBehavior = value
            }
        }

    /**
     * Состояние внешнего вида [CodeField]
     * @see ColorState
     */
    override var colorState: ColorState? = null
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
            captionView.colorState = field
            codeItems.forEach { it.colorState = field }
        }

    /**
     * Колбэк для проверки введенного символа
     */
    var onCharValidate: ((String) -> Boolean) = { true }

    /**
     * Колбэк для проверки введенного кода
     */
    var onCodeComplete: ((String) -> Boolean) = { true }

    /**
     * Поведение отдельной ячейки при обработке
     * введенного некорректного символа
     */
    enum class CharErrorBehavior {

        /**
         *  Автоматическое очищение после ввода некорректного символа
         */
        Remove,

        /**
         *  Некорректный символ останется после его ввода (автоматического удаления не произойдет)
         */
        Keep,

        /**
         * Ввод некорректного символа никак не обрабатывается.
         * Фактически ввод не произойдет, ячейка останется пустой, пока не будет введен корректный символ
         */
        None,
    }

    /**
     * Поведение всего кодового поля
     * при обработке введенного кода целиком
     */
    enum class CodeErrorBehavior {

        /**
         *  Автоматическое очищение после ввода некорректного кода
         */
        Remove,

        /**
         *  Некорректный код останется после его ввода (автоматического удаления не произойдет)
         */
        Keep,
    }

    /**
     * Выравнивание caption относительно поля ввода
     */
    enum class CaptionAlignment {

        /**
         * Выравнивание относительно начала поля ввода
         */
        Start,

        /**
         * Выравнивание по центру поля ввода
         */
        Center,
    }

    init {
        isFocusable = false
        clipToPadding = false
        clipChildren = false
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        repeat(_codeLength) {
            codeItems.add(CodeItem(context, attrs, defStyleAttr).apply { setCursorEnabled(hasCursor) })
            itemErrors.add(null)
        }
        initField()
        setItemsShapes()
    }

    /**
     * Устанавливает выравнивание caption
     * @param alignment выравнивание
     * @see CaptionAlignment
     */
    open fun setCaptionAlignment(alignment: CaptionAlignment) {
        if (captionAlignment != alignment) {
            captionAlignment = alignment
            when (alignment) {
                CaptionAlignment.Start -> {
                    captionView.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                    captionView.gravity = Gravity.START
                }

                CaptionAlignment.Center -> {
                    captionView.textAlignment = View.TEXT_ALIGNMENT_CENTER
                    captionView.gravity = Gravity.CENTER_HORIZONTAL
                }
            }
        }
    }

    /**
     * Устанавливает толщину бордера точки, скрывающей вводимый символ
     * @param strokeWidth толщина бордера
     */
    open fun setDotStrokeWidth(strokeWidth: Float) {
        codeItems.forEach { it.setStrokeWidth(strokeWidth) }
    }

    /**
     * Устанавливает цвета бордера точки, скрвыающей символы
     * @param colors цвета
     * @see ColorStateList
     */
    open fun setDotStrokeColorList(colors: ColorStateList?) {
        codeItems.forEach { it.setDotStrokeTintList(colors) }
    }

    /**
     * Устанавливает цвет бордера точки, скрвыающей символы
     * @param color цвет бордера точки
     */
    fun setDotStrokeColor(@ColorInt color: Int) {
        setDotStrokeColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет бордера точки, скрвыающей символы, по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setDotStrokeColorResource(@ColorRes colorRes: Int) {
        setDotStrokeColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета точки, скрвыающей символы
     * @param colors цвета
     * @see ColorStateList
     */
    open fun setDotTintColorList(colors: ColorStateList?) {
        codeItems.forEach { it.setDotFillColorList(colors) }
    }

    /**
     * Устанавливает цвет точки, скрвыающей символы
     * @param color цвет точки
     */
    fun setDotTintColor(@ColorInt color: Int) {
        setDotTintColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет точки, скрвыающей символы по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setDotTintColorResource(@ColorRes colorRes: Int) {
        setDotTintColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета фона кодовой ячеки
     * @param colors цвета фона
     * @see ColorStateList
     */
    open fun setItemTintList(colors: ColorStateList?) {
        codeItems.forEach { it.setTintList(colors) }
    }

    /**
     * Устанавливает цвет фона кодовой ячеки
     * @param color цвет фона кодовой ячеки
     */
    fun setItemTintColor(@ColorInt color: Int) {
        setItemTintList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет фона кодовой ячеки по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setItemTintColorResource(@ColorRes colorRes: Int) {
        setItemTintList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает стиль текста
     * @param context контекст
     * @param appearanceId ссылка на ресурс стиля
     */
    open fun setItemTextAppearance(context: Context, @StyleRes appearanceId: Int) {
        codeItems.forEach { it.setTextAppearance(context, appearanceId) }
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     * @see ColorStateList
     */
    open fun setItemTextColorList(colors: ColorStateList?) {
        codeItems.forEach { it.setTextColorList(colors) }
    }

    /**
     * Устанавливает цвет текста
     * @param color цвет текста
     */
    fun setItemTextColor(@ColorInt color: Int) {
        setItemTextColorList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет текста по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setItemTextColorResource(@ColorRes colorRes: Int) {
        setItemTextColorList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета курсора
     * @param tint цвета курсора
     */
    open fun setCursorTintList(tint: ColorStateList?) {
        codeItems.forEach { it.setCursorTint(tint) }
    }

    /**
     * Устанавливает цвет курсора
     * @param color цвет курсора
     */
    fun setCursorTintColor(@ColorInt color: Int) {
        setCursorTintList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет курсора по идентификатору
     * @param colorRes идентификатор цвета в ресурсах
     */
    fun setCursorTintColorResource(@ColorRes colorRes: Int) {
        setCursorTintList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает размеры точки, скрывающей вводимый символ
     * @param sizeList размеры точки
     */
    open fun setDotSizeNumberStateList(sizeList: NumberStateList?) {
        codeItems.forEach { it.setDotSizeNumberList(sizeList) }
    }

    /**
     * Устанавливает размер точки, скрывающей вводимый символ
     * @param size размер точки
     */
    fun setDotSize(size: Int) {
        setDotSizeNumberStateList(NumberStateList.valueOf(size))
    }

    /**
     * Устанавливает новые опции редактора метода ввода
     * @param options опции
     */
    open fun setImeOptions(options: Int) {
        editField.imeOptions = options or EditorInfo.IME_FLAG_NO_EXTRACT_UI
    }

    /**
     * Устанавливает тип вводимого контента
     * @param type
     */
    open fun setInputType(type: Int) {
        editField.inputType = type or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
    }

    @Suppress("UNNECESSARY_SAFE_CALL")
    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        _viewAlphaHelper?.updateAlphaByEnabledState(this)
        this.children.forEach {
            it.isEnabled = enabled
        }
    }

    override fun addView(child: View?, index: Int, params: LayoutParams?) {
        if (child == captionView || child == editField || child is CodeItem) {
            super.addView(child, index, params)
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val summaryGroupsSpacing = (codeGroup.groupCount - 1) * groupSpacing
        val editWidth =
            paddingStart + paddingEnd + codeLength * itemWidth + (codeLength - 1) * itemSpacing + summaryGroupsSpacing
        val editHeight = paddingTop + paddingBottom + itemHeight
        val captionWidthSpec =
            when (widthMode) {
                MeasureSpec.EXACTLY -> MeasureSpec.makeMeasureSpec(widthSize, MeasureSpec.EXACTLY)
                else -> MeasureSpec.makeMeasureSpec(editWidth, MeasureSpec.EXACTLY)
            }
        captionView.measure(captionWidthSpec, heightMeasureSpec)
        val captionHeight = captionView.measuredHeight
        val desiredH = captionHeight + editHeight + captionSpacing
        val w = when (widthMode) {
            MeasureSpec.EXACTLY -> widthSize
            else -> editWidth
        }
        val h = resolveSize(desiredH, heightMeasureSpec)
        setMeasuredDimension(w, h)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val width = r - l
        val captionLeft = (width - captionView.measuredWidth) / 2
        val captionTop = paddingTop + itemHeight + captionSpacing
//        Устанавливаем высоту для editField равной 1, для того чтоб исключить перемещение курсора, при получении
//        клика на редактируемом поле.
        editField.layout(0, 0, width, 1)
        setItemsBounds()
        captionView.layout(
            captionLeft,
            captionTop,
            width - paddingRight,
            captionTop + captionView.measuredHeight,
        )
    }

    private fun initField() {
        addView(editField)
        codeItems.forEach { addView(it) }
        addView(captionView)
        addTextChangeListener()
        addOnKeyListener()
        setOnClickListener {
            editField.requestFocus()
        }
        setOnFocusChangeListener { _, hasFocus ->
            val char = getErrorChar()
            val length = editField.text?.length ?: 0

            if (char == null && editField.selectionStart < codeLength) {
                updateItemState()
            }
            if (hasFocus) {
                if (char != null) setSelectionIfErrorKept(char)
            } else {
                editField.setSelection(length)
            }
        }
        editField.setOnFocusChangeListener { v, hasFocus ->
            val char = getErrorChar()
            val length = editField.text?.length ?: 0

            if (char == null && editField.selectionStart < codeLength) {
                updateItemState()
            }
            if (hasFocus) {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showSoftInput(editField, InputMethodManager.SHOW_IMPLICIT)
                if (char != null) setSelectionIfErrorKept(char)
            } else {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
                editField.setSelection(length)
            }
        }
        setInputFilter()
    }

    private fun updateItemContent(codeIndex: Int) {
        itemErrors[codeIndex]?.let {
            codeItems[codeIndex].setContent(
                if (hidden) {
                    CodeContent.HiddenDot
                } else {
                    CodeContent.Character(it)
                },
            )
            return
        }
        val content = code.getOrNull(codeIndex)?.let {
            if (hidden) {
                CodeContent.HiddenDot
            } else {
                CodeContent.Character(it)
            }
        } ?: CodeContent.Empty
        codeItems[codeIndex].setContent(content)
    }

    private fun updateItemState(index: Int = editField.selectionStart) {
        val selected = editField.selectionStart.coerceIn(0, codeLength)
        codeItems[index].codeItemState = when {
            (editField.isFocused && itemErrors[index] != null) || globalError -> CodeItem.CodeItemState.ERROR
            editField.isFocused && index == selected -> CodeItem.CodeItemState.ACTIVATED
            this@CodeField.isFocused && index == selected -> CodeItem.CodeItemState.FOCUSED
            else -> CodeItem.CodeItemState.ORDINARY
        }
    }

    private fun setItemsBounds() {
        val width = measuredWidth
        val summaryGroupsSpacing = (codeGroup.groupCount - 1) * groupSpacing
        val editWidth =
            paddingStart + paddingEnd + codeLength * itemWidth + (codeLength - 1) * itemSpacing + summaryGroupsSpacing
        var left = (width - editWidth) / 2
        val top = paddingTop
        var codeIndex = 0
        for (groupIndex in 0 until codeGroup.groupCount) {
            val groupSize = codeGroup.groups[groupIndex]
            repeat(groupSize) { itemIndex ->
                val item = codeItems[codeIndex]
                val right = left + itemWidth
                val bottom = top + itemHeight
                item.layout(left, top, right, bottom)
                val isLastGroup = groupIndex == codeGroup.groupCount - 1
                val isLastItem = itemIndex == groupSize - 1
                left += if (!(isLastGroup && isLastItem)) {
                    itemWidth + itemSpacing
                } else {
                    itemSpacing
                }
                codeIndex++
            }
            if (groupIndex < codeGroup.groupCount - 1) left += groupSpacing
        }
    }

    private fun setItemsShapes() {
        updateShapes()
        var codeIndex = 0
        for (groupIndex in 0 until codeGroup.groupCount) {
            val groupSize = codeGroup.groups[groupIndex]
            repeat(groupSize) { posIndex ->
                val item = codeItems[codeIndex]
                item.setShapeModel(defineShape(groupSize, posIndex))
                codeIndex++
            }
        }
    }

    private fun defineShape(groupSize: Int, posInGroup: Int) = when {
        groupSize == 0 -> itemShape
        posInGroup == 0 -> startItemShape
        posInGroup == groupSize - 1 -> endItemShape
        else -> itemShape
    }

    private fun updateShapes() {
        if (groupShape != null) {
            updateStartItemShape()
            updateEndItemShape()
        } else {
            startItemShape = itemShape
            endItemShape = itemShape
        }
    }

    private fun updateStartItemShape() {
        groupShape?.let { gShape ->
            startItemShape = startItemShape.copy(
                cornerSizeTopLeft = gShape.cornerSizeTopLeft,
                cornerSizeBottomLeft = gShape.cornerSizeBottomLeft,
                cornerSizeTopRight = itemShape.cornerSizeTopRight,
                cornerSizeBottomRight = itemShape.cornerSizeBottomRight,
            )
        }
    }

    private fun updateEndItemShape() {
        groupShape?.let { gShape ->
            endItemShape = endItemShape.copy(
                cornerSizeTopLeft = itemShape.cornerSizeTopLeft,
                cornerSizeBottomLeft = itemShape.cornerSizeBottomLeft,
                cornerSizeTopRight = gShape.cornerSizeTopRight,
                cornerSizeBottomRight = gShape.cornerSizeBottomRight,
            )
        }
    }

    private fun defaultCodeGroups(codeLength: Int): CodeGroup {
        return codeGroups(codeLength) {
            if (codeLength < 6 || codeLength % 2 != 0) {
                group(codeLength)
            } else {
                equalGroups(codeLength / 2)
            }
        }
    }

    private fun setLengthFilter() {
        val old = editField.filters?.filterNot { it is InputFilter.LengthFilter } ?: emptyList()
        editField.filters = (old + InputFilter.LengthFilter(_codeLength)).toTypedArray()
        invalidate()
    }

    private fun setInputFilter() {
        val old = editField.filters?.toMutableList() ?: mutableListOf()
        val inputFilter = InputFilter { source, start, end, _, _, _ ->
            if (!editField.isFocused || !isEnabled) return@InputFilter ""
            if (end - start > 1) {
                ""
            } else if (source.isNotEmpty()) {
                val char = source[start]
                val valid = onCharValidate.invoke(char.toString())
                if (!valid) {
                    val result = errorProcessing(char)
                    result
                } else {
                    itemErrors.fill(null)
                    null
                }
            } else {
                null
            }
        }
        editField.filters = (old + inputFilter).toTypedArray()
    }

    private fun errorProcessing(char: Char): String {
        return when (charValidateBehavior) {
            CharErrorBehavior.Remove -> {
                onErrorInputWithSaveError(char)
                ""
            }

            CharErrorBehavior.Keep -> {
                val error = getErrorChar()
                if (error != null) {
                    onErrorInputAgain()
                } else {
                    onErrorInputWithSaveError(char)
                }
                char.toString()
            }

            else -> ""
        }
    }

    private fun setGlobalError(enabled: Boolean) {
        if (globalError != enabled) {
            globalError = enabled
        }
    }

    private fun clearErrors() {
        itemErrors.clear()
        repeat(codeLength) { itemErrors.add(null) }
    }

    private fun createShakeKeyFrames(
        count: Int,
        shakeOffset: Int,
    ): IntArray {
        val result = IntArray(count * 2 + 1)
        for (index in 0 until count * 2) {
            result[index] = if (index % 2 == 0) shakeOffset else -shakeOffset
        }
        result[count * 2] = 0
        return result
    }

    private fun onErrorInputWithSaveError(char: Char) {
        val index = findIndexUnderCurrentInput()
        itemErrors[index] = char
        updateItemState()
        updateItemContent(index)
        shakeCodeItem(codeItems[index])
    }

    private fun onErrorInputAgain() {
        val index = itemErrors.indexOf(getErrorChar())
        shakeCodeItem(codeItems[index])
    }

    private fun onErrorCode() {
        setGlobalError(true)
        for (i in 0 until codeLength) {
            updateItemState(i)
        }
        captionView.refreshDrawableState()
        errorOnCaption = true
        shakeFieldAnimator.start()
    }

    private fun repopulateItems() {
        codeItems.forEach { removeView(it) }
        codeItems.clear()
        repeat(_codeLength) {
            codeItems.add(
                CodeItem(context).apply {
                    setStrokeWidth(dotStrokeWidth)
                    setDotStrokeTintList(dotStrokeColorList)
                    setTintList(itemTintColorList)
                    setTextAppearance(context, itemTextAppearanceRes)
                    setTextColorList(itemTextColorList)
                    setDotFillColorList(dotFillColorList)
                    setCursorTint(cursorColorList)
                    setDotSizeNumberList(dotSizeNumberList)
                    setCursorEnabled(hasCursor)
                },
            )
        }
        codeItems.forEach { addView(it) }
    }

    private fun refreshCaptionError() {
        if (errorOnCaption) captionView.refreshDrawableState()
        errorOnCaption = false
    }

    private fun findIndexUnderCurrentInput() =
        editField.selectionStart.coerceIn(0 until codeLength)

    @Suppress("SpreadOperator")
    private fun createShakeItemAnimation(
        shakeDuration: Long = DEFAULT_SHAKE_DURATION,
        count: Int = DEFAULT_SHAKE_COUNT,
        shakeOffset: Int = DefaultShakeOffSet,
    ): ValueAnimator {
        val values = createShakeKeyFrames(count, shakeOffset)
        return ValueAnimator.ofInt(*values).apply {
            duration = shakeDuration
        }
    }

    private fun shakeCodeItem(codeItem: CodeItem) {
        shakeItemAnimator.removeAllUpdateListeners()
        shakeItemAnimator.removeAllListeners()
        shakeItemAnimator.addUpdateListener { v ->
            codeItem.translationX = (v.animatedValue as Int).toFloat()
        }
        if (shakeItemAnimator.isRunning) shakeItemAnimator.cancel()
        shakeItemAnimator.start()
        shakeItemAnimator.doOnEnd {
            val index = codeItems.indexOf(codeItem)
            if (charValidateBehavior == CharErrorBehavior.Remove) {
                itemErrors[index] = null
                updateItemContent(index)
                updateItemState(index)
            }
        }
    }

    @Suppress("SpreadOperator")
    private fun createShakeFieldAnimation(
        shakeDuration: Long = DEFAULT_SHAKE_DURATION,
        count: Int = DEFAULT_SHAKE_COUNT,
        shakeOffset: Int = DefaultShakeOffSet,
    ): ValueAnimator {
        val values = createShakeKeyFrames(count, shakeOffset)
        return ValueAnimator.ofInt(*values).apply {
            duration = shakeDuration
            addUpdateListener { animator ->
                val value = animator.animatedValue as Int
                this@CodeField.translationX = value.toFloat()
                invalidate()
            }
            doOnEnd {
                setGlobalError(false)
                if (codeValidateBehavior == CodeErrorBehavior.Remove) {
                    code = ""
                    editField.text?.clear()
                    for (i in 0 until codeLength) {
                        updateItemState(i)
                    }
                }
            }
        }
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.CodeField, defStyleAttr, defStyleRes) {
            hasCursor = getBoolean(R.styleable.CodeField_sd_hasCursor, false)
            itemWidth = getDimensionPixelSize(R.styleable.CodeField_sd_itemWidth, 0)
            itemHeight = getDimensionPixelSize(R.styleable.CodeField_sd_itemHeight, 0)
            itemSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_itemSpacing, 0)
            captionSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_captionPadding, 0)
            groupSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_groupSpacing, 0)
            val itemSA = getResourceId(R.styleable.CodeField_sd_itemShapeAppearance, 0)
            itemShape = ShapeModel.create(context, itemSA)
            val groupSA = getResourceId(R.styleable.CodeField_sd_groupShapeAppearance, 0)
            if (groupSA != 0) groupShape = ShapeModel.create(context, groupSA)
            val captionAppearance = getResourceId(R.styleable.CodeField_sd_captionAppearance, 0)
            if (captionAppearance != 0) captionView.setTextAppearance(captionAppearance)
            captionView.setTextColor(getColorStateList(R.styleable.CodeField_sd_captionColor))
            colorState = ColorState.obtain(context, attrs, defStyleAttr, defStyleRes)
            val length = getInt(R.styleable.CodeField_sd_codeLength, 0)
            if (length > 0 && length != _codeLength) {
                _codeLength = length
                codeGroup = defaultCodeGroups(_codeLength)
            } else {
                setLengthFilter()
            }
            val text = getString(R.styleable.CodeField_sd_caption)
            text?.let { captionText = it }
            val capAlignment = getInt(R.styleable.CodeField_sd_captionAlignment, 0)
            when (capAlignment) {
                0 -> captionView.gravity = Gravity.START
                1 -> captionView.gravity = Gravity.CENTER_HORIZONTAL
            }
            focusGain = getBoolean(R.styleable.CodeField_sd_focusGain, false)
            val inputType = getInt(
                R.styleable.CodeField_android_inputType, InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                        or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            )
            setInputType(inputType)
            val imeOptions = getInt(R.styleable.CodeField_android_imeOptions, EditorInfo.IME_FLAG_NO_EXTRACT_UI)
            setImeOptions(imeOptions)
            val charBehavior = getInt(R.styleable.CodeField_sd_charValidateBehavior, 0)
            val codeBehavior = getInt(R.styleable.CodeField_sd_codeValidateBehavior, 0)
            charValidateBehavior = CharErrorBehavior.values().getOrElse(charBehavior) { CharErrorBehavior.Remove }
            codeValidateBehavior = CodeErrorBehavior.values().getOrElse(codeBehavior) { CodeErrorBehavior.Remove }

            dotStrokeWidth = getDimensionPixelSize(R.styleable.CodeField_sd_strokeWidth, 0).toFloat()
            dotSizeNumberList = getNumberStateList(context, R.styleable.CodeField_sd_dotSize)
            cursorColorList = getColorStateList(R.styleable.CodeField_sd_cursorColor)
            dotStrokeColorList = getColorStateList(R.styleable.CodeField_sd_strokeColor)
            itemTintColorList = getColorStateList(R.styleable.CodeField_sd_background)
            itemTextAppearanceRes = getResourceId(R.styleable.CodeField_sd_valueAppearance, 0)
            itemTextColorList = getColorStateList(R.styleable.CodeField_sd_valueColor)
            dotFillColorList = getColorStateList(R.styleable.CodeField_sd_dotColor)
        }
    }

    private fun getErrorChar() = itemErrors.find { it != null }

    private fun setSelectionIfErrorKept(char: Char?) {
        val currentIndex = editField.selectionStart
        val errorIndex = itemErrors.indexOf(char)
        editField.setSelection(errorIndex, currentIndex)
    }

    private fun addTextChangeListener() {
        editField.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit

                override fun afterTextChanged(s: Editable?) {
                    val char = getErrorChar()
                    if (char != null) {
                        val currentIndex = editField.selectionStart
                        val errorIndex = itemErrors.indexOf(char)
                        if (errorIndex == editField.text?.length) {
                            itemErrors[errorIndex] = null
                            updateItemState(errorIndex)
                            updateItemContent(errorIndex)
                        } else {
                            editField.setSelection(errorIndex, currentIndex)
                        }
                    } else {
                        for (i in 0 until codeLength) {
                            updateItemState(i)
                        }
                        code = s?.toString().orEmpty()
                        for (i in 0 until codeLength) updateItemContent(i)
                        if (code.isNotEmpty()) refreshCaptionError()
                        if (code.length == _codeLength) {
                            val isValid = onCodeComplete.invoke(code)
                            if (!isValid) {
                                onErrorCode()
                            }
                        }
                    }
                }
            },
        )
    }

    private fun addOnKeyListener() {
        editField.setOnKeyListener { v, keyCode, event ->
            if (event.action != KeyEvent.ACTION_DOWN) return@setOnKeyListener false
            val direction = when (keyCode) {
                KeyEvent.KEYCODE_DPAD_LEFT -> View.FOCUS_LEFT
                KeyEvent.KEYCODE_DPAD_RIGHT -> View.FOCUS_RIGHT
                KeyEvent.KEYCODE_DPAD_UP -> View.FOCUS_UP
                KeyEvent.KEYCODE_DPAD_DOWN -> View.FOCUS_DOWN
                KeyEvent.KEYCODE_MOVE_HOME, KeyEvent.KEYCODE_MOVE_END -> return@setOnKeyListener true
                else -> return@setOnKeyListener false
            }
            val next = v.focusSearch(direction)
            next?.requestFocus()
            true
        }
    }

    private inner class CaptionView(context: Context) : TextView(context) {
        override fun onCreateDrawableState(extraSpace: Int): IntArray {
            val drawableState = super.onCreateDrawableState(extraSpace + 1)
            if (globalError) mergeDrawableStates(drawableState, intArrayOf(R.attr.sd_state_error))
            return drawableState
        }
    }

    private companion object {
        const val DEFAULT_SHAKE_COUNT = 3
        const val DEFAULT_SHAKE_DURATION = 300L
        val DefaultShakeOffSet = 2.dp
    }
}
