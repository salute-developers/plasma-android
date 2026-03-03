package com.sdds.uikit.internal.textfield

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import com.sdds.uikit.Editable
import com.sdds.uikit.drawable.TextDrawable

/**
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 21.06.2024
 */
internal open class StatefulEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle,
) : Editable(context, attrs, defStyleAttr) {

    private var _suffixDrawable: Drawable? = null
    private var _prefixDrawable: Drawable? = null
    private var _valueTextAppearance: Int = 0
    private var _prefixPadding: Int = 0
    private var _suffixPadding: Int = 0

    var placeholderEnabled: Boolean = true
        set(value) {
            if (field != value) {
                field = value
                resetHint()
            }
        }

    open var placeholder: CharSequence? = null
        set(value) {
            if (field != value) {
                field = value
                resetHint()
            }
        }

    var prefix: Drawable?
        get() = _prefixDrawable
        set(value) {
            if (_prefixDrawable != value) {
                _prefixDrawable = value
                updatePrefixSuffixDrawable()
            }
        }

    var suffix: Drawable?
        get() = _suffixDrawable
        set(value) {
            if (_suffixDrawable != value) {
                _suffixDrawable = value
                updatePrefixSuffixDrawable()
            }
        }

    var prefixText: CharSequence?
        get() = prefix?.getText()
        set(value) {
            if (value.isNullOrBlank()) {
                prefix = null
            } else if (prefix == null) {
                prefix = TextDrawable(context)
                    .apply { text = value }
            } else {
                prefix?.tryUpdateText(value)
            }
            updatePrefixSuffixDrawable()
        }

    var suffixText: CharSequence?
        get() = suffix?.getText()
        set(value) {
            if (value.isNullOrBlank()) {
                suffix = null
            } else if (suffix == null) {
                suffix = TextDrawable(context)
                    .apply { text = value }
            } else {
                suffix?.tryUpdateText(value)
            }
            updatePrefixSuffixDrawable()
        }

    var prefixTextPadding: Int
        get() = _prefixPadding
        set(value) {
            if (_prefixPadding != value) {
                _prefixPadding = value
                requestLayout()
            }
        }
    var suffixTextPadding: Int
        get() = _suffixPadding
        set(value) {
            if (_suffixPadding != value) {
                _suffixPadding = value
                requestLayout()
            }
        }

    override var icon: Drawable?
        get() = null
        set(value) {}

    override var iconPlacement: Int
        get() = ICON_PLACEMENT_ABSOLUTE
        set(value) {}

    init {
        clipToOutline = false
        manageOwnAlpha = false
        updatePrefixSuffixDrawable()
    }

    /**
     * Возвращает true если [StatefulEditText] есть префикс
     */
    fun hasPrefix(): Boolean {
        return if (prefix is TextDrawable) !prefixText.isNullOrBlank() else prefix != null
    }

    /**
     * Возвращает true если [StatefulEditText] есть суффикс
     */
    fun hasSuffix(): Boolean {
        return if (suffix is TextDrawable) !suffixText.isNullOrBlank() else suffix != null
    }

    /**
     * Устанавливает цвета [colors] для [placeholder]
     */
    fun setPlaceholderColors(colors: ColorStateList?) {
        setHintTextColor(colors)
        updatePrefixSuffixDrawable()
    }

    override fun setTextAppearance(resId: Int) {
        super.setTextAppearance(resId)
        _valueTextAppearance = resId
        updatePrefixSuffixDrawable()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val newMinWidth = if (singleLine() && !placeholder.isNullOrEmpty()) {
            compoundPaddingStart + compoundPaddingEnd + paint.measureText(placeholder?.toString().orEmpty()).toInt()
        } else {
            getContentMinWidth()
        }
        minWidth = maxOf(newMinWidth, minWidth)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        updateSuffixPrefixPosition()
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        super.onTextChanged(s, start, before, count)
        updateSuffixPrefixPosition()
    }

    private fun updatePrefixSuffixDrawable() {
        (_prefixDrawable as? TextDrawable)?.apply {
            setTintList(null)
            setTextAppearance(context, _valueTextAppearance)
            setTextColor(hintTextColors)
            textAlignment = TextDrawable.TextAlignment.START
            tryUpdatePaddings(0, _prefixPadding)
        }
        (_suffixDrawable as? TextDrawable)?.apply {
            setTintList(null)
            setTextAppearance(context, _valueTextAppearance)
            setTextColor(hintTextColors)
            textAlignment = TextDrawable.TextAlignment.START
            tryUpdatePaddings(_suffixPadding, 0)
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(
            _prefixDrawable,
            null,
            _suffixDrawable,
            null,
        )
        updateSuffixPrefixPosition()
        refreshDrawableState()
    }

    protected fun updateSuffixPrefixPosition() {
        _prefixDrawable?.apply {
            val top = ((intrinsicHeight - measuredHeight) / 2)
            setBounds(
                0,
                top,
                intrinsicWidth,
                top + intrinsicHeight,
            )
        }

        _suffixDrawable?.apply {
            val suffixLeft = when {
                text.isNullOrBlank() && placeholderEnabled && !placeholder.isNullOrEmpty() -> 0
                layout != null -> getLastLineWidth().toInt() - getAvailableLayoutWidth()
                else -> 0
            }
            val top = ((measuredHeight - intrinsicHeight) / 2)
            setBounds(
                suffixLeft,
                top,
                suffixLeft + intrinsicWidth,
                top + intrinsicHeight,
            )
        }
    }

    protected open fun getLastLineWidth(): Float {
        val l = layout ?: return 0f
        val end = text?.length ?: 0
        return l.getPrimaryHorizontal(end)
    }

    private fun getAvailableLayoutWidth() = measuredWidth - compoundPaddingStart - compoundPaddingEnd

    private fun resetHint() {
        if (placeholderEnabled) {
            super.setHint(placeholder)
        } else {
            super.setHint(null)
        }
        isCursorVisible = true
    }

    private companion object {

        fun Drawable.tryUpdateText(text: CharSequence?) {
            (this as? TextDrawable)?.text = text ?: return
        }

        fun Drawable.tryUpdatePaddings(paddingStart: Int = 0, paddingEnd: Int = 0) {
            (this as? TextDrawable)?.apply {
                setPaddings(paddingStart, 0, paddingEnd, 0)
            }
        }

        fun Drawable.getText(): CharSequence? {
            return (this as? TextDrawable)?.text
        }
    }
}
