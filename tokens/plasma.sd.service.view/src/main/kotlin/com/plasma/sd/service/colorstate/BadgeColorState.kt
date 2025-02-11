package com.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.plasma.sd.service.R
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
    DEFAULT(intArrayOf(R.attr.plasma_badge_state_default)),
    ACCENT(intArrayOf(R.attr.plasma_badge_state_accent)),
    POSITIVE(intArrayOf(R.attr.plasma_badge_state_positive)),
    NEGATIVE(intArrayOf(R.attr.plasma_badge_state_negative)),
    WARNING(intArrayOf(R.attr.plasma_badge_state_warning)),
    CLEAR(intArrayOf(R.attr.plasma_badge_state_clear)),
    BLACK(intArrayOf(R.attr.plasma_badge_state_black)),
    WHITE(intArrayOf(R.attr.plasma_badge_state_white)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Badge_plasma_badgeColors, 0)
        typedArray.recycle()
        return BadgeColorState.values().getOrNull(stateOrdinal)
    }
}
