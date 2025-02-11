// AUTO-GENERATED. DO NOT MODIFY this file.
package com.themebuilder.tokens.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента TextArea
 */
public enum class TextAreaColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_textarea_state_default)),
    WARNING(intArrayOf(R.attr.plasma_textarea_state_warning)),
    ERROR(intArrayOf(R.attr.plasma_textarea_state_error)),
}

/**
 * Реализация [ColorStateProvider] для TextAreaColorState
 */
internal class TextAreaColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): TextAreaColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.TextArea,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.TextArea_plasma_textareaColors, 0)
        typedArray.recycle()
        return TextAreaColorState.values().getOrNull(stateOrdinal)
    }
}
