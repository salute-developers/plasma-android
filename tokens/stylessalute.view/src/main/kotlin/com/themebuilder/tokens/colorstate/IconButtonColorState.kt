// AUTO-GENERATED. DO NOT MODIFY this file.
package com.themebuilder.tokens.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import com.themebuilder.tokens.colorstate.IconButtonColorState
import com.themebuilder.tokens.colorstate.IconButtonColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента IconButton
 */
public enum class IconButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_iconbutton_state_default)),
    SECONDARY(intArrayOf(R.attr.salute_iconbutton_state_secondary)),
    ACCENT(intArrayOf(R.attr.salute_iconbutton_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_iconbutton_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_iconbutton_state_negative)),
    WARNING(intArrayOf(R.attr.salute_iconbutton_state_warning)),
    CLEAR(intArrayOf(R.attr.salute_iconbutton_state_clear)),
    DARK(intArrayOf(R.attr.salute_iconbutton_state_dark)),
    BLACK(intArrayOf(R.attr.salute_iconbutton_state_black)),
    WHITE(intArrayOf(R.attr.salute_iconbutton_state_white)),
    ;
}

/**
 * Реализация [ColorStateProvider] для IconButtonColorState
 */
internal class IconButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): IconButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.IconButton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.IconButton_salute_iconbuttonColors, 0)
        typedArray.recycle()
        return IconButtonColorState.values().getOrNull(stateOrdinal)
    }
}
