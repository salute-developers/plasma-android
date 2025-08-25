package com.sdds.uikit

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.text.Editable
import android.text.InputFilter
import android.text.InputType
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.withStyledAttributes
import com.sdds.uikit.shape.ShapeModel

open class CodeField @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_codeFieldStyle,
    defStyleRes: Int = R.style.Sdds_Components_CodeField,
) : ViewGroup(context, attrs, defStyleAttr) {

    private var code: String = ""

    private var _codeLength: Int = 6
    private var _cellWidth: Int = 0
    private var _cellHeight: Int = 0
    private var _dotSize: Int = 0
    private var _itemSpacing: Int = 0
    private var _groupSpacing: Int = 0
    private var _itemShape: ShapeModel? = null
    private var _groupShape: ShapeModel? = null

//    private val _field = StatefulEditText(context).apply {
//        hint = null
//        background = null
//        clipToPadding = true
//        gravity = Gravity.TOP or Gravity.START
//        isVerticalScrollBarEnabled = false
//        isHorizontalScrollBarEnabled = false
//        isFocusable = true
//        isFocusableInTouchMode = true
//        isClickable = true
//        isLongClickable = true
//        showSoftInputOnFocus = true
//        setTextIsSelectable(true)
//        setPadding(0)
//    }

    private val _field = AppCompatEditText(context).apply {
        background = null
        isCursorVisible = false
        setTextColor( Color.TRANSPARENT)
        inputType = InputType.TYPE_CLASS_TEXT
        imeOptions = EditorInfo.IME_ACTION_UNSPECIFIED
        filters = arrayOf(InputFilter.LengthFilter(codeLength))
        isFocusable = true
        isClickable = true
        isFocusableInTouchMode = true
    }

    private val borderPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 4f
        color = Color.BLACK
    }

    private val textPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK
        textSize = 20f
        textAlign = Paint.Align.CENTER
    }


    /**
     * Устанавливает количество вводимых символов
     */
    open var codeLength: Int
        get() = _codeLength
        set(value) {
            if (_codeLength != value) {
                _codeLength = value
                limitMaxLength()
            }
        }

    var onCodeComplete: ((String) -> Unit)? = null

    init {
        initField()
        descendantFocusability = FOCUS_AFTER_DESCENDANTS
        context.withStyledAttributes(attrs, R.styleable.CodeField, defStyleAttr, defStyleRes) {
            _cellWidth = getDimensionPixelSize(R.styleable.CodeField_sd_cellWidth, 0)
            _cellHeight = getDimensionPixelSize(R.styleable.CodeField_sd_cellHeight, 0)
            _dotSize = getDimensionPixelSize(R.styleable.CodeField_sd_dotSize, 0)
            _itemSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_itemSpacing, 0)
            _groupSpacing = getDimensionPixelSize(R.styleable.CodeField_sd_groupSpacing, 0)
            val iSA = getResourceId(R.styleable.CodeField_sd_itemShapeAppearance, 0)
            _itemShape = ShapeModel.create(context, iSA)
            val gSA = getResourceId(R.styleable.CodeField_sd_groupShapeAppearance, 0)
            _groupShape = ShapeModel.create(context, gSA)
        }
    }

    private fun initField() {
        addView(_field)
        Log.d("codefielview", "childrencount = $childCount")
        _field.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                Log.d("codefield", "afterTextChange: $s")
                invalidate()
//                code = s?.toString().orEmpty()
//                invalidate()
//                if (code.length == _codeLength) {
//                    onCodeComplete?.invoke(code)
//                }
            }
        })
        setOnClickListener {
            _field.requestFocus()
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(_field, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    private fun limitMaxLength() {
        _field.filters = arrayOf(InputFilter.LengthFilter(_codeLength))
        requestLayout()
        invalidate()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = paddingStart + paddingEnd + codeLength * _cellWidth + (codeLength - 1) * _itemSpacing
        val height = paddingTop + paddingBottom + _cellHeight
        setMeasuredDimension(width, height)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        _field.layout(0, 0, r - l, t - b)
    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
        val text = _field.text?.toString().orEmpty()
//        Log.d("text", text)
        for(i in 0 until _codeLength) {
            val left = paddingLeft + i * (_cellWidth + _itemSpacing)
            val top = paddingTop

            canvas.drawRect(
                left.toFloat(),
                top.toFloat(),
                (left + _cellWidth).toFloat(),
                (top + _cellHeight).toFloat(),
                borderPaint
            )

            text.getOrNull(i)?.let { char ->
                val x = left + _cellWidth / 2f
                val y = top + _cellHeight / 2f - (textPaint.descent() + textPaint.ascent()) / 2
                canvas.drawText(char.toString(), x, y, textPaint)
            }
        }
    }
}