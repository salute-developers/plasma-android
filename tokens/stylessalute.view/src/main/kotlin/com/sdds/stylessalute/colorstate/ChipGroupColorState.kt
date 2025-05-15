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
 * Реализация [ColorState] для компонента ChipGroup
 */
public enum class ChipGroupColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_chipgroup_state_default)),
    ACCENT(intArrayOf(R.attr.salute_chipgroup_state_accent)),
    SECONDARY(intArrayOf(R.attr.salute_chipgroup_state_secondary)),
}

/**
 * Реализация [ColorStateProvider] для ChipGroupColorState
 */
@Keep
internal class ChipGroupColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ChipGroupColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.ChipGroup,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.ChipGroup_salute_chipgroupColors, 0)
        typedArray.recycle()
        return ChipGroupColorState.values().getOrNull(stateOrdinal)
    }
}
