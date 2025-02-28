package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import com.sdds.serv.R
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
    DEFAULT(intArrayOf(R.attr.serv_iconBadge_state_default)),
    ACCENT(intArrayOf(R.attr.serv_iconBadge_state_accent)),
    POSITIVE(intArrayOf(R.attr.serv_iconBadge_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_iconBadge_state_negative)),
    WARNING(intArrayOf(R.attr.serv_iconBadge_state_warning)),
    CLEAR(intArrayOf(R.attr.serv_iconBadge_state_clear)),
    BLACK(intArrayOf(R.attr.serv_iconBadge_state_black)),
    WHITE(intArrayOf(R.attr.serv_iconBadge_state_white)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.IconBadge_serv_iconBadgeColors, 0)
        typedArray.recycle()
        return IconBadgeColorState.values().getOrNull(stateOrdinal)
    }
}
