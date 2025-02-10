package com.themebuilder.tokens.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.stylessalute.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider

/**
 * Реализация [ColorState] для компонента IconBadge
 */
public enum class IconBadgeColorState( public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_iconBadge_state_default)),
    ACCENT(intArrayOf(R.attr.salute_iconBadge_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_iconBadge_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_iconBadge_state_negative)),
    WARNING(intArrayOf(R.attr.salute_iconBadge_state_warning)),
    CLEAR(intArrayOf(R.attr.salute_iconBadge_state_clear)),
    BLACK(intArrayOf(R.attr.salute_iconBadge_state_black)),
    WHITE(intArrayOf(R.attr.salute_iconBadge_state_white)),
}

/**
 * Реализация [ColorStateProvider] для IconBadgeColorState
 */
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.IconBadge_salute_iconBadgeColors, 0)
        typedArray.recycle()
        return IconBadgeColorState.values().getOrNull(stateOrdinal)
    }
}
