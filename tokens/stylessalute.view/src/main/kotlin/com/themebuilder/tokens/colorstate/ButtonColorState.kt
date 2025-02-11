// AUTO-GENERATED. DO NOT MODIFY this file.
package com.themebuilder.tokens.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Button
 */
public enum class ButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_button_state_default)),
    SECONDARY(intArrayOf(R.attr.salute_button_state_secondary)),
    ACCENT(intArrayOf(R.attr.salute_button_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_button_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_button_state_negative)),
    WARNING(intArrayOf(R.attr.salute_button_state_warning)),
    CLEAR(intArrayOf(R.attr.salute_button_state_clear)),
    DARK(intArrayOf(R.attr.salute_button_state_dark)),
    BLACK(intArrayOf(R.attr.salute_button_state_black)),
    WHITE(intArrayOf(R.attr.salute_button_state_white)),
}

/**
 * Реализация [ColorStateProvider] для ButtonColorState
 */
internal class ButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Button,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Button_salute_buttonColors, 0)
        typedArray.recycle()
        return ButtonColorState.values().getOrNull(stateOrdinal)
    }
}
