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
 * Реализация [ColorState] для компонента ListItemView
 */
public enum class ListItemViewColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_listitemview_state_default)),
    POSITIVE(intArrayOf(R.attr.sdkit_listitemview_state_positive)),
    NEGATIVE(intArrayOf(R.attr.sdkit_listitemview_state_negative)),
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
        val stateOrdinal: Int = typedArray.getInt(
            R.styleable.ListItemView_sdkit_listitemviewColors,
            0,
        )
        typedArray.recycle()
        return ListItemViewColorState.values().getOrNull(stateOrdinal)
    }
}
