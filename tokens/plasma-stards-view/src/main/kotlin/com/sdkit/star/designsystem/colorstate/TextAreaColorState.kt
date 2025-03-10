// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdkit.star.designsystem.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import com.sdkit.star.designsystem.R
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента TextArea
 */
public enum class TextAreaColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_textarea_state_default)),
    ERROR(intArrayOf(R.attr.sdkit_textarea_state_error)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.TextArea_sdkit_textareaColors, 0)
        typedArray.recycle()
        return TextAreaColorState.values().getOrNull(stateOrdinal)
    }
}
