package com.stylessalute.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента Badge
 */
public enum class BadgeColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_badge_state_default)),
    ACCENT(intArrayOf(R.attr.salute_badge_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_badge_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_badge_state_negative)),
    WARNING(intArrayOf(R.attr.salute_badge_state_warning)),
    CLEAR(intArrayOf(R.attr.salute_badge_state_clear)),
    BLACK(intArrayOf(R.attr.salute_badge_state_black)),
    WHITE(intArrayOf(R.attr.salute_badge_state_white)),
}

/**
 * Реализация [ColorStateProvider] для BadgeColorState
 */
internal class BadgeColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): BadgeColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Badge,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Badge_salute_badgeColors, 0)
        typedArray.recycle()
        return BadgeColorState.values().getOrNull(stateOrdinal)
    }
}
