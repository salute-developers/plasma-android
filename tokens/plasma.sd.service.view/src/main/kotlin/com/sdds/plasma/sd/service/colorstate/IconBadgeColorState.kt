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
 * Реализация [ColorState] для компонента IconBadge
 */
public enum class IconBadgeColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_iconbadge_state_default)),
    ACCENT(intArrayOf(R.attr.plasma_iconbadge_state_accent)),
    NEGATIVE(intArrayOf(R.attr.plasma_iconbadge_state_negative)),
    POSITIVE(intArrayOf(R.attr.plasma_iconbadge_state_positive)),
    WARNING(intArrayOf(R.attr.plasma_iconbadge_state_warning)),
    DARK(intArrayOf(R.attr.plasma_iconbadge_state_dark)),
    LIGHT(intArrayOf(R.attr.plasma_iconbadge_state_light)),
}

/**
 * Реализация [ColorStateProvider] для IconBadgeColorState
 */
@Keep
internal class IconBadgeColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): IconBadgeColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.IconBadge,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.IconBadge_plasma_iconbadgeColors, 0)
        typedArray.recycle()
        return IconBadgeColorState.values().getOrNull(stateOrdinal)
    }
}
