// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdkit.star.designsystem.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import com.sdkit.star.designsystem.R
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента TextField
 */
public enum class TextFieldColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_textfield_state_default)),
    ERROR(intArrayOf(R.attr.sdkit_textfield_state_error)),
}

/**
 * Реализация [ColorStateProvider] для TextFieldColorState
 */
@Keep
internal class TextFieldColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): TextFieldColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.TextField,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.TextField_sdkit_textfieldColors, 0)
        typedArray.recycle()
        return TextFieldColorState.values().getOrNull(stateOrdinal)
    }
}
