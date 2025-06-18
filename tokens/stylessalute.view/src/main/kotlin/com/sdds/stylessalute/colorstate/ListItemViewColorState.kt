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
 * Реализация [ColorState] для компонента ListItemView
 */
public enum class ListItemViewColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_listitemview_state_default)),
    POSITIVE(intArrayOf(R.attr.salute_listitemview_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_listitemview_state_negative)),
}

/**
 * Реализация [ColorStateProvider] для ListItemViewColorState
 */
@Keep
internal class ListItemViewColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ListItemViewColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.ListItemView,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.ListItemView_salute_listitemviewColors, 0)
        typedArray.recycle()
        return ListItemViewColorState.values().getOrNull(stateOrdinal)
    }
}
