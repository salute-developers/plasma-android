// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.stylessalute.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Chip
 */
public enum class ChipColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_chip_state_default)),
    ACCENT(intArrayOf(R.attr.salute_chip_state_accent)),
    SECONDARY(intArrayOf(R.attr.salute_chip_state_secondary)),
}

/**
 * Реализация [ColorStateProvider] для ChipColorState
 */
@Keep
internal class ChipColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ChipColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Chip,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Chip_salute_chipColors, 0)
        typedArray.recycle()
        return ChipColorState.values().getOrNull(stateOrdinal)
    }
}
