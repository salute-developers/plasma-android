package com.sdds.uikit.internal

import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View.MeasureSpec
import android.widget.CompoundButton
import androidx.annotation.StyleRes
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.applyTextAppearance
import com.sdds.uikit.internal.base.colorForState
import kotlin.math.max

/**
 * Делегат для [CompoundButton] с поддержкой
 * отрисовки дополнительного текста (описания)
 * @param compoundButton кнопка
 * @param attrs атрибуты кнопки
 * @param defStyleAttrs атрибут стиля по-умолчанию
 * @param defStyleRes идентификатор ресурса по умолчанию
 * @author Александр Малышев on 02.08.2023
 */
internal class CheckableDelegate(
    private val compoundButton: CompoundButton,
    attrs: AttributeSet?,
    defStyleAttrs: Int = 0,
    defStyleRes: Int = 0,
) {
    private val _descriptionPaint: TextPaint = TextPaint()
    private val _lastLineBounds: Rect = Rect()

    private var descriptionLayout: Layout? = null
    private var descriptionOffsetX: Float = 0f
    private var descriptionOffsetY: Float = 0f
    private var _description: CharSequence? = null
    private var _descriptionPadding: Int = 0
    private var _descriptionTextColor: ColorStateList? = null
    private var _descriptionTextAppearanceResId: Int = 0
    private var _textAppearanceResId: Int = 0
    private var _fontCallback: CancelableFontCallback? = null

    /**
     * Дополнительный текст (описание) для CheckBox и RadioBox
     */
    var description: CharSequence?
        get() = _description
        set(value) {
            if (_description != value) {
                _description = value
                compoundButton.requestLayout()
                compoundButton.invalidate()
            }
        }

    /**
     * Отступ между основным и дополнительным текстом
     */
    var descriptionPadding: Int
        get() = _descriptionPadding
        set(value) {
            if (_descriptionPadding != value) {
                _descriptionPadding = value
                compoundButton.requestLayout()
                compoundButton.invalidate()
            }
        }

    init {
        obtainAttributes(attrs, defStyleAttrs, defStyleRes)
    }

    /**
     * Устанавливает стиль дополнительного текста по идентификатору
     * @param textAppearanceId идентификатор стиля в ресурсах
     */
    fun setDescriptionTextAppearance(@StyleRes textAppearanceId: Int) {
        if (_descriptionTextAppearanceResId != textAppearanceId) {
            _descriptionTextAppearanceResId = textAppearanceId
            updateDescriptionTextAppearance()
        }
    }

    /**
     * Устанавливает цвета дополнительного текста
     * @param colors [ColorStateList] цвета дополнительного текста
     */
    fun setDescriptionTextColors(colors: ColorStateList?) {
        if (_descriptionTextColor != colors) {
            _descriptionTextColor = colors
            compoundButton.invalidate()
        }
    }

    /**
     * Отрисовка на [Canvas] дополнительного текста под основным текстом
     */
    fun drawDescription(canvas: Canvas) = with(canvas) {
        save()
        translate(descriptionOffsetX, descriptionOffsetY)
        descriptionLayout?.draw(this)
        restore()
    }

    /**
     * Измеряет новую ширину [compoundButton] согласно размеру дополнительного
     * текста [description] и ограничениям в [widthMeasureSpec]
     */
    fun measureWidth(widthMeasureSpec: Int): Int {
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        var width = compoundButton.measuredWidth
        if (_description == null) {
            descriptionLayout = null
            return compoundButton.measuredWidth
        }
        updateDescriptionLayout(widthMeasureSpec)
        updateDescriptionOffset()

        if (widthMode != MeasureSpec.EXACTLY) {
            val layoutWidth = (descriptionLayout?.width ?: 0)
            val newWidth = descriptionOffsetX.toInt() + layoutWidth + compoundButton.compoundPaddingEnd
            width = max(width, newWidth)
        }
        return width
    }

    /**
     * Измеряет новую высоту [compoundButton] согласно размеру дополнительного
     * текста [description] и ограничениям в [heightMeasureSpec]
     */
    fun measureHeight(heightMeasureSpec: Int): Int {
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        var height = compoundButton.measuredHeight
        if (description == null) {
            descriptionLayout = null
            return height
        }

        if (heightMode != MeasureSpec.EXACTLY) {
            val layoutHeight = (descriptionLayout?.height ?: 0)
            val paddingBottom = compoundButton.compoundPaddingBottom
            val newHeight = descriptionOffsetY.toInt() + layoutHeight + _descriptionPadding + paddingBottom
            height = max(height, newHeight)
        }
        return height
    }

    fun updateDescriptionColor() {
        val color = _descriptionTextColor.colorForState(compoundButton.drawableState)
        if (_descriptionPaint.color != color) {
            _descriptionPaint.color = color
        }
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) = with(compoundButton) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SdCheckable, defStyleAttr, defStyleRes)
        _description = typedArray.getString(R.styleable.SdCheckable_sd_description)
        _descriptionPadding = typedArray.getDimensionPixelSize(R.styleable.SdCheckable_sd_descriptionPadding, 0)
        _descriptionTextColor = typedArray.getColorStateList(R.styleable.SdCheckable_sd_descriptionTextColor)
        _descriptionTextAppearanceResId = typedArray.getResourceId(
            R.styleable.SdCheckable_sd_descriptionTextAppearance,
            typedArray.getResourceId(R.styleable.SdCheckable_android_textAppearance, 0),
        )
        typedArray.recycle()
        updateDescriptionTextAppearance()
        updateDescriptionColor()
    }

    private fun updateDescriptionLayout(widthSpec: Int) {
        if (description.isNullOrBlank()) {
            this.descriptionLayout = null
            return
        }
        val descriptionText = description ?: return
        val biggestLineWidth = descriptionText
            .lines()
            .maxOfOrNull { _descriptionPaint.measureText(it).toInt() }
            ?: 0
        val widthMode = MeasureSpec.getMode(widthSpec)
        val specWidth = MeasureSpec.getSize(widthSpec)
        val layoutWidth = if (widthMode != MeasureSpec.EXACTLY) {
            biggestLineWidth
        } else {
            specWidth - compoundButton.compoundPaddingStart - compoundButton.compoundPaddingEnd
        }
        if (this.descriptionLayout?.text == descriptionText && this.descriptionLayout?.width == layoutWidth) {
            return
        }
        this.descriptionLayout = StaticLayout.Builder
            .obtain(
                descriptionText,
                0,
                descriptionText.length,
                _descriptionPaint,
                layoutWidth,
            )
            .build()
    }

    private fun updateDescriptionTextAppearance() {
        val appearance = if (_descriptionTextAppearanceResId != 0) {
            _descriptionTextAppearanceResId
        } else {
            _textAppearanceResId
        }
        _fontCallback?.cancel()
        _fontCallback = _descriptionPaint.applyTextAppearance(compoundButton.context, appearance) {
            compoundButton.requestLayout()
        }
    }

    private fun updateDescriptionOffset() = with(compoundButton) {
        if (descriptionLayout == null) return
        val lastLineIndex = (lineCount - 1).coerceAtLeast(0)
        getLineBounds(lastLineIndex, _lastLineBounds)
        descriptionOffsetX = compoundButton.compoundPaddingStart.toFloat()
        descriptionOffsetY = if (text.isEmpty()) {
            val descriptionFirstLineHeight = descriptionLayout?.getLineBottom(0) ?: 0
            _lastLineBounds.top.toFloat() + (_lastLineBounds.height().toFloat() - descriptionFirstLineHeight) / 2f
        } else {
            _lastLineBounds.bottom.toFloat()
        }
    }
}
