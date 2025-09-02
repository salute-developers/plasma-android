package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.InputFilter
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.annotation.StyleRes
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.animation.doOnEnd
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.withSave
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.dp
import com.sdds.uikit.internal.codefield.CodeContent
import com.sdds.uikit.internal.codefield.CodeGroup
import com.sdds.uikit.internal.codefield.CodeItem
import com.sdds.uikit.internal.codefield.codeGroups
import com.sdds.uikit.shape.ShapeModel

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
) : ViewGroup(context, attrs, defStyleAttr) {

    private var code: String = ""

    private var _codeLength: Int = 6
    private var cellWidth: Int = 0
    private var cellHeight: Int = 0
    private var dotSize: Int = 0
    private var itemSpacing: Int = 0
    private var groupSpacing: Int = 0
    private var captionSpacing: Int = 0
    private var captionAlignment: CaptionAlignment = CaptionAlignment.Start
    private var itemShape: ShapeModel = ShapeModel()
    private var groupShape: ShapeModel? = null
    private var _errorChar: Char? = null
    private var globalError: Boolean = false

    private val codeItem: CodeItem = CodeItem(context)
    private val dutyRect: Rect = Rect()
    private val cursorRect: Rect = Rect()
    private var _hidden: Boolean = false
    private var codeGroup: CodeGroup = defaultCodeGroups(_codeLength)
    private val itemErrors: MutableList<Char?> = MutableList(_codeLength) { null }

    private var cursorColor: ColorStateList? = null

    private var cursorAlpha: Int = 0
    private val cursorPaint: Paint = Paint().configure(isAntiAlias = true, color = Color.BLACK)
    private val cursorAnimator = ValueAnimator.ofInt(0, 255).apply {
        duration = 500
        repeatMode = ValueAnimator.REVERSE
        repeatCount = ValueAnimator.INFINITE
        addUpdateListener {
            cursorAlpha = it.animatedValue as Int
            postInvalidateOnAnimation(cursorRect.left, cursorRect.top, cursorRect.right, cursorRect.bottom)
        }
    }

    private val shakeItemAnimator: ValueAnimator = createShakeItemAnimation()
    private val shakeFieldAnimator: ValueAnimator = createShakeFieldAnimation()
    private var errorItemOffset: Int = 0

    private var startItemShape: ShapeModel = ShapeModel()
    private var endItemShape: ShapeModel = ShapeModel()

    private val editField = AppCompatEditText(context).apply {
        background = null
        isCursorVisible = false
        setTextColor(Color.TRANSPARENT)
        inputType = InputType.TYPE_CLASS_TEXT
        imeOptions = EditorInfo.IME_ACTION_UNSPECIFIED
        filters = arrayOf(InputFilter.LengthFilter(codeLength))
        isFocusable = true
        isClickable = true
        isFocusableInTouchMode = true
    }

    private val captionView: TextView = TextView(context).apply {
        text = ""
        isSingleLine = true
        gravity = Gravity.START
    }

    /**
     * Устанавливает количество вводимых символов
     */
    open var codeLength: Int
        get() = _codeLength
        set(value) {
            if (_codeLength != value) {
                _codeLength = value
                codeGroup = defaultCodeGroups(_codeLength)
                itemErrors.clear()
                repeat(_codeLength){itemErrors.add(null)}
                setLengthFilter()
            }
        }

    /**
     * Устанавливает запрет на ввод конкретного символа
     */
    open var errorChar: Char?
        get() = _errorChar
        set(value) {
            if (_errorChar != value)
                _errorChar = value
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
                invalidate()
            }
        }

    /**
     * Колбэк для проверки введенного кода
     */
    var onCodeComplete: ((String) -> Boolean) = { true }

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
        Center
    }

    init {
//        descendantFocusability = FOCUS_AFTER_DESCENDANTS
        context.withStyledAttributes(attrs, R.styleable.CodeField, defStyleAttr, defStyleRes) {
            cellWidth = getDimensionPixelSize(R.styleable.CodeField_sd_cellWidth, 0)
            cellHeight = getDimensionPixelSize(R.styleable.CodeField_sd_cellHeight, 0)
            dotSize = getDimensionPixelSize(R.styleable.CodeField_sd_dotSize, 0)
            itemSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_itemSpacing, 0)
            captionSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_captionPadding, 0)
            groupSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_groupSpacing, 0)
            val itemSA = getResourceId(R.styleable.CodeField_sd_itemShapeAppearance, 0)
            itemShape = ShapeModel.create(context, itemSA)
            val groupSA = getResourceId(R.styleable.CodeField_sd_groupShapeAppearance, 0)
            if (groupSA != 0) groupShape = ShapeModel.create(context, groupSA)
            cursorColor = getColorStateList(R.styleable.CodeField_sd_cursorColor)
            cursorPaint.color = cursorColor.colorForState(drawableState)
            setBgTintList(getColorStateList(R.styleable.CodeField_sd_background))
            setTextAppearanceRes(context, getResourceId(R.styleable.CodeField_sd_valueAppearance, 0))
            setTextColor(getColorStateList(R.styleable.CodeField_sd_valueColor))
            val captionAppearance = getResourceId(R.styleable.CodeField_sd_captionAppearance, 0)
            if (captionAppearance != 0) captionView.setTextAppearance(captionAppearance)
            captionView.setTextColor(getColorStateList(R.styleable.CodeField_sd_captionColor))
            setDotSize(getDimensionPixelSize(R.styleable.CodeField_sd_dotSize,0))
        }
        initField()
        updateShapes()
    }

    /**
     * Устанавливает цвета заливки
     */
    fun setBgTintList(bgTintList: ColorStateList? = null) {
        codeItem.setItemTintList(bgTintList)

    }

    /**
     * Устанавливает стиль текста
     */
    fun setTextAppearanceRes(context: Context, @StyleRes appearanceId: Int) {
        codeItem.setTextAppearance(context, appearanceId)
    }

    /**
     * Устанавливает цвета текста
     * @param colors цвета текста
     */
    fun setTextColor(colors: ColorStateList?) {
        codeItem.setTextColor(colors)
    }

    /**
     * Устанавливает размер точки, когда отображение символов запрещено
     * @param size размер точки
     */
    fun setDotSize(size: Int) {
        codeItem.setHiddenDotSize(size)
        if (hidden) invalidate()
    }

    /**
     * Устанавливает выравнивание caption
     * @param alignment выравнивание
     * @see CaptionAlignment
     */
    fun setCaptionAlignment(alignment: CaptionAlignment) {
        if (captionAlignment != alignment) {
            captionAlignment = alignment
            when (alignment) {
                CaptionAlignment.Start -> captionView.gravity = Gravity.START
                CaptionAlignment.Center -> captionView.gravity = Gravity.CENTER_HORIZONTAL
            }
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val editWidth = paddingStart + paddingEnd + codeLength * cellWidth + (codeLength - 1) * itemSpacing
        val editHeight = paddingTop + paddingBottom + cellHeight
        measureChild(captionView, widthMeasureSpec, heightMeasureSpec)
        val captionHeight = captionView.measuredHeight
        val captionWidth = captionView.measuredWidth + paddingStart + paddingEnd
        val desiredW = maxOf(editWidth, captionWidth)
        val desiredH = captionHeight + editHeight + captionSpacing
        val w = resolveSize(desiredW, widthMeasureSpec)
        val h = resolveSize(desiredH, heightMeasureSpec)
        setMeasuredDimension(w, h)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val width = r - l
        val height = b - t
        editField.layout(0, 0, width, height)
        val captionTop = paddingTop + cellHeight + captionSpacing
        captionView.layout(
            paddingLeft,
            captionTop,
            width - paddingRight,
            captionTop + captionView.measuredHeight
        )
    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
        var left = paddingLeft
        val top = paddingTop
        var codeIndex = 0
        for (groupIndex in 0 until codeGroup.groupCount) {
            val groupSize = codeGroup.groups[groupIndex]
            repeat(groupSize) { posIndex ->
                updateCellBounds(left, top)
                codeItem.bounds = dutyRect
                codeItem.setShapeModel(defineShape(groupSize, posIndex))
                val content = defineContent(codeIndex)
                val state = buildCellState(codeIndex)
                codeItem.setContent(content)
                codeItem.setState(state)
                if (itemErrors[codeIndex] != null) {
                    canvas.withSave {
                        canvas.translate(errorItemOffset.toFloat(), 0f)
                        codeItem.draw(canvas)
                    }
                } else {
                    codeItem.draw(canvas)
                }
                if (checkActivated(state)) drawCursor(canvas, dutyRect)
                left += cellWidth + itemSpacing
                codeIndex++
            }
            if (groupIndex < codeGroup.groupCount - 1) left += groupSpacing - itemSpacing
        }
    }

    private fun initField() {
        addView(editField)
        addView(captionView)
        editField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                code = s?.toString().orEmpty()
                if (code.length == _codeLength) {
                    val isValid = onCodeComplete.invoke(code)
                    if (!isValid) {
                       onErrorCode()
                    }
                }
            }
        })
        setOnClickListener {
            editField.requestFocus()
            editField.post {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showSoftInput(editField, InputMethodManager.SHOW_IMPLICIT)
            }
        }
        editField.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                startBlinkCursor()
            } else {
                stopBlinkCursor()
            }
        }
        setInputFilter()
    }

    private fun setLengthFilter() {
        val old = editField.filters?.filterNot { it is InputFilter.LengthFilter } ?: emptyList()
        editField.filters = (old + InputFilter.LengthFilter(_codeLength)).toTypedArray()
        requestLayout()
        invalidate()
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

    private fun updateCellBounds(left: Int, top: Int) {
        val right = left + cellWidth
        val bottom = top + cellHeight
        dutyRect.set(left, top, right, bottom)
    }

    private fun defineContent(codeIndex: Int): CodeContent {
        itemErrors[codeIndex]?.let { return CodeContent.Character(it) }
        return code.getOrNull(codeIndex)?.let {
            if (_hidden) {
                CodeContent.HiddenDot
            } else {
                CodeContent.Character(it)
            }
        } ?: CodeContent.Empty
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

    private fun buildCellState(index: Int): IntArray {
        val base = drawableState
        val tmp = IntArray(base.size + 1)
        System.arraycopy(base, 0, tmp, 0, base.size)
        var p = base.size
        val sel = editField.selectionStart.coerceIn(0, code.length)
        val activated = editField.isFocused && index == sel
        val error = editField.isFocused && itemErrors[index] != null
        if (error || globalError) tmp[p++] = R.attr.sd_state_error
        else if (activated) tmp[p++] = R.attr.sd_state_activated
        return tmp.copyOf(p)
    }

    private fun drawCursor(canvas: Canvas, rect: Rect) {
        cursorPaint.alpha = cursorAlpha
        cursorRect.set(rect)
        val cx = rect.centerX().toFloat()
        val height = 8
        val width = 1
        val top = (rect.centerY() - height.dp).toFloat()
        val bottom = (rect.centerY() + height.dp).toFloat()
        canvas.drawRect(cx - width.dp, top, cx + width, bottom, cursorPaint)
    }

    private fun checkActivated(state: IntArray) = state.contains(ActivatedState)

    private fun startBlinkCursor() {
        if (!cursorAnimator.isRunning) cursorAnimator.start()
    }

    private fun stopBlinkCursor() {
        cursorAnimator.cancel()
        cursorAlpha = 0
    }

    private fun setInputFilter() {
        val old = editField.filters?.toMutableList() ?: mutableListOf()
        val inputFilter = InputFilter { source, start, end, _, _, _ ->
            if (end - start > 1) {
                ""
            } else if (source.isNotEmpty()) {
                val char = source[start]
                if (char == _errorChar) {
                    val index = editField.selectionStart
                    onErrorInput(index, char)
                    ""
                } else {
                    null
                }
            } else {
                null
            }
        }
        editField.filters = (old + inputFilter).toTypedArray()
    }

    private fun onErrorInput(index: Int, char: Char) {
        itemErrors[index] = char
        stopBlinkCursor()
        shakeItemAnimator.start()
    }

    private fun onErrorCode() {
        stopBlinkCursor()
        setGlobalError(true)
        shakeFieldAnimator.start()
    }

    private fun setGlobalError(enabled: Boolean) {
        if (globalError != enabled) {
            globalError = enabled
            refreshDrawableState()
        }
    }

    private fun createShakeItemAnimation(
        shakeDuration: Long = DefaultShakeDuration,
        count: Int = DefaultShakeCount,
        shakeOffset: Int = DefaultShakeOffSet
    ): ValueAnimator {
        val values = createShakeKeyFrames(count, shakeOffset)
        return ValueAnimator.ofInt(*values.toIntArray()).apply {
            duration = shakeDuration
            addUpdateListener { animator ->
                val value = animator.animatedValue as Int
                errorItemOffset = value
                invalidate()
            }
            doOnEnd {
                itemErrors.fill(null)
                errorItemOffset = 0
                startBlinkCursor()
            }
        }
    }

    private fun createShakeFieldAnimation(
        shakeDuration: Long = DefaultShakeDuration,
        count: Int = DefaultShakeCount,
        shakeOffset: Int = DefaultShakeOffSet
    ): ValueAnimator {
        val values = createShakeKeyFrames(count, shakeOffset)
        return ValueAnimator.ofInt(*values.toIntArray()).apply {
            duration = shakeDuration
            addUpdateListener { animator ->
                val value = animator.animatedValue as Int
                this@CodeField.translationX = value.toFloat()
                invalidate()
            }
            doOnEnd {
                itemErrors.fill(null)
                setGlobalError(false)
                code = ""
                editField.text?.clear()
                startBlinkCursor()
            }
        }
    }

    private fun createShakeKeyFrames(
        count: Int,
        shakeOffset: Int
    ) = mutableListOf<Int>().apply {
        for (i in 1..count * 2) {
            val offset = if (i % 2 == 0) shakeOffset
            else -shakeOffset
            add(offset)
        }
        add(0)
    }


    private companion object {
        val ActivatedState = R.attr.sd_state_activated
        val ErrorState = R.attr.sd_state_error

        val DefaultShakeCount = 3
        val DefaultShakeDuration = 300L
        val DefaultShakeOffSet = 2.dp
    }
}
