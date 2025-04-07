// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.serv.R
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
    DEFAULT(intArrayOf(R.attr.serv_textarea_state_default)),
    WARNING(intArrayOf(R.attr.serv_textarea_state_warning)),
    ERROR(intArrayOf(R.attr.serv_textarea_state_error)),
}

/**
 * Реализация [ColorStateProvider] для TextAreaColorState
 */
@Keep
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.TextArea_serv_textareaColors, 0)
        typedArray.recycle()
        return TextAreaColorState.values().getOrNull(stateOrdinal)
    }
}
