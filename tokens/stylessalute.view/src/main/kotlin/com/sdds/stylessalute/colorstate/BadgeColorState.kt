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
 * Реализация [ColorState] для компонента Badge
 */
public enum class BadgeColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_badge_state_default)),
    ACCENT(intArrayOf(R.attr.salute_badge_state_accent)),
    NEGATIVE(intArrayOf(R.attr.salute_badge_state_negative)),
    POSITIVE(intArrayOf(R.attr.salute_badge_state_positive)),
    WARNING(intArrayOf(R.attr.salute_badge_state_warning)),
    DARK(intArrayOf(R.attr.salute_badge_state_dark)),
    LIGHT(intArrayOf(R.attr.salute_badge_state_light)),
}

/**
 * Реализация [ColorStateProvider] для BadgeColorState
 */
@Keep
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
