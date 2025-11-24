package com.sdds.uikit.internal.textfield.mask

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.text.TextPaint
import android.util.AttributeSet
import com.redmadrobot.inputmask.MaskedTextChangedListener
import com.redmadrobot.inputmask.model.Notation
import com.sdds.uikit.R
import com.sdds.uikit.TextField
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.textfield.StatefulEditText

internal open class MaskedEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : StatefulEditText(context, attrs, defStyleAttr), MaskedTextChangedListener.ValueListener {
    private var _listener: MaskedTextChangedListener? = null

    private var tail: CharSequence? = null
    private var oldMinWidth: Int = 0
    private var canSaveOldMinWidth: Boolean = true
    private var _currentMask: TextField.Mask? = null

    private val tailPaint = TextPaint().apply {
        isAntiAlias = true
    }

    var mask: TextField.Mask?
        get() = _currentMask
        set(value) {
            updateMask(value)
        }

    var maskDisplayMode: Int = MASK_DISPLAY_MODE_ALWAYS
        set(value) {
            if (field != value) {
                field = value
                invalidate()
            }
        }

    val isMaskVisible: Boolean
        get() {
            return if (maskDisplayMode == MASK_DISPLAY_MODE_ALWAYS) {
                val textIsEmpty = text.isNullOrEmpty()
                val placeholderIsEmpty = placeholder.isNullOrEmpty()
                mask != null && (!textIsEmpty || placeholderIsEmpty)
            } else {
                false
            }
        }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
        tailPaint.applyTextAppearance(context, resId)
    }

    override fun onTextChanged(
        maskFilled: Boolean,
        extractedValue: String,
        formattedValue: String,
        tailPlaceholder: String,
    ) {
        this.tail = tailPlaceholder
    }

    override fun getLastLineWidth(): Float {
        return super.getLastLineWidth() + getTailWidth()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val maskListener = _listener
        if (mask != null && maskListener != null && isMaskVisible) {
            if (canSaveOldMinWidth) {
                oldMinWidth = minWidth
                canSaveOldMinWidth = false
            }
            minWidth = maxOf(
                oldMinWidth,
                compoundPaddingStart + compoundPaddingEnd + paint.measureText(maskListener.placeholder()).toInt(),
            )
        } else {
            minWidth = oldMinWidth
            canSaveOldMinWidth = true
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
        _listener?.onFocusChange(this, focused)
        if (!focused && !isMaskVisible) {
            minWidth = oldMinWidth
            requestLayout()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val t = tail ?: return
        val l = layout ?: return
        val end = text?.length ?: 0
        if (!isMaskVisible) return

        val line = l.getLineForOffset(end)

        tailPaint.color = currentHintTextColor

        val x = totalPaddingLeft - scrollX + l.getPrimaryHorizontal(end)
        val y = totalPaddingTop - scrollY + l.getLineBaseline(line).toFloat()

        canvas.drawText(t, 0, t.length, x, y, tailPaint)
    }

    private fun getTailWidth(): Float {
        if (!isMaskVisible) return 0f
        val t = tail ?: return 0f
        return tailPaint.measureText(t, 0, t.length)
    }

    private fun updateMask(mask: TextField.Mask?) {
        if (_currentMask != mask) {
            _currentMask = mask
            _listener?.let { listener ->
                removeTextChangedListener(listener)
            }
            val listener = mask?.install().also { _listener = it }
            tail = listener?.placeholder()

            invalidate()
        }
    }

    private fun TextField.Mask.install(): MaskedTextChangedListener {
        return when (this) {
            is TextField.Mask.Number -> NumberInputListener.installOn(
                primaryFormat = this.pattern,
                editText = this@MaskedEditText,
                valueListener = this@MaskedEditText,
                groupingSeparator = groupSeparator,
                decimalSeparator = decimalSeparator,
                decimalCount = decimalMinCount..decimalMaxCount,
            )

            is TextField.Mask.Date -> MaskedTextChangedListener.installOn(
                editText = this@MaskedEditText,
                primaryFormat = getDatePattern(this.format),
                valueListener = this@MaskedEditText,
                customNotations = createCustomDateNotations(),
            )

            else -> {
                MaskedTextChangedListener.installOn(
                    editText = this@MaskedEditText,
                    primaryFormat = this.pattern,
                    valueListener = this@MaskedEditText,
                )
            }
        }.also {
            // MaskedTextChangedListener.installOn устанавливает обработчик фокуса, нам это не нужно,
            // мы обрабатываем сами
            onFocusChangeListener = null
        }
    }

    private fun getDatePattern(format: Int): String {
        return when (format) {
            TextField.Mask.Date.MEDIUM -> context.getString(R.string.sd_mask_notation_date_medium)
            else -> context.getString(R.string.sd_mask_notation_date_short)
        }
    }

    private fun createCustomDateNotations(): List<Notation> {
        return arrayListOf(
            Notation(resources.getString(R.string.sd_mask_notation_date_day)[0], DateDigits, false),
            Notation(resources.getString(R.string.sd_mask_notation_date_month)[0], DateDigits, false),
            Notation(resources.getString(R.string.sd_mask_notation_date_year)[0], DateDigits, false),
        )
    }

    companion object {
        val DateDigits = ('0'..'9').toSet().joinToString("")
        const val MASK_DISPLAY_MODE_ALWAYS = 0
        const val MASK_DISPLAY_MODE_ON_INPUT = 1

        const val MASK_RU_PHONE_NUMBER_PREFIX = "+7"

        /**
         * Маска для номера телефона, без префикса
         */
        const val MASK_PHONE_NUMBER = "[000] [000]-[00]-[00]"

        /**
         * Маска для времени в формате HH:MM
         */
        const val MASK_TIME = "[00]:[00]"

        const val MASK_NUMBER = "[0]"

        const val MASK_NUMBER_GROUP_SEPARATOR = ' '

        const val MASK_NUMBER_DECIMAL_SEPARATOR = ','
    }
}
