// AUTO-GENERATED. DO NOT MODIFY this file.
package com.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.plasma.sd.service.R
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
    DEFAULT(intArrayOf(R.attr.plasma_button_state_default)),
    SECONDARY(intArrayOf(R.attr.plasma_button_state_secondary)),
    ACCENT(intArrayOf(R.attr.plasma_button_state_accent)),
    POSITIVE(intArrayOf(R.attr.plasma_button_state_positive)),
    NEGATIVE(intArrayOf(R.attr.plasma_button_state_negative)),
    WARNING(intArrayOf(R.attr.plasma_button_state_warning)),
    CLEAR(intArrayOf(R.attr.plasma_button_state_clear)),
    DARK(intArrayOf(R.attr.plasma_button_state_dark)),
    BLACK(intArrayOf(R.attr.plasma_button_state_black)),
    WHITE(intArrayOf(R.attr.plasma_button_state_white)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Button_plasma_buttonColors, 0)
        typedArray.recycle()
        return ButtonColorState.values().getOrNull(stateOrdinal)
    }
}
