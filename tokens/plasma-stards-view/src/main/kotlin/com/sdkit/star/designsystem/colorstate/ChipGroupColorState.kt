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
 * Реализация [ColorState] для компонента ChipGroup
 */
public enum class ChipGroupColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_chipgroup_state_default)),
    ACCENT(intArrayOf(R.attr.sdkit_chipgroup_state_accent)),
    NEGATIVE(intArrayOf(R.attr.sdkit_chipgroup_state_negative)),
    POSITIVE(intArrayOf(R.attr.sdkit_chipgroup_state_positive)),
    SECONDARY(intArrayOf(R.attr.sdkit_chipgroup_state_secondary)),
    WARNING(intArrayOf(R.attr.sdkit_chipgroup_state_warning)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.ChipGroup_sdkit_chipgroupColors, 0)
        typedArray.recycle()
        return ChipGroupColorState.values().getOrNull(stateOrdinal)
    }
}
