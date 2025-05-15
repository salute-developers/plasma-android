// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.plasma.sd.service.R
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
    DEFAULT(intArrayOf(R.attr.plasma_chipgroup_state_default)),
    ACCENT(intArrayOf(R.attr.plasma_chipgroup_state_accent)),
    NEGATIVE(intArrayOf(R.attr.plasma_chipgroup_state_negative)),
    POSITIVE(intArrayOf(R.attr.plasma_chipgroup_state_positive)),
    SECONDARY(intArrayOf(R.attr.plasma_chipgroup_state_secondary)),
    WARNING(intArrayOf(R.attr.plasma_chipgroup_state_warning)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.ChipGroup_plasma_chipgroupColors, 0)
        typedArray.recycle()
        return ChipGroupColorState.values().getOrNull(stateOrdinal)
    }
}
