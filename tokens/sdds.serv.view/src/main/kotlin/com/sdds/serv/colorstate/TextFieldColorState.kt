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
 * Реализация [ColorState] для компонента TextField
 */
public enum class TextFieldColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_textfield_state_default)),
    SUCCESS(intArrayOf(R.attr.serv_textfield_state_success)),
    WARNING(intArrayOf(R.attr.serv_textfield_state_warning)),
    ERROR(intArrayOf(R.attr.serv_textfield_state_error)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.TextField_serv_textfieldColors, 0)
        typedArray.recycle()
        return TextFieldColorState.values().getOrNull(stateOrdinal)
    }
}
