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
 * Реализация [ColorState] для компонента LinkButton
 */
public enum class LinkButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_linkbutton_state_default)),
    SECONDARY(intArrayOf(R.attr.salute_linkbutton_state_secondary)),
    ACCENT(intArrayOf(R.attr.salute_linkbutton_state_accent)),
    POSITIVE(intArrayOf(R.attr.salute_linkbutton_state_positive)),
    NEGATIVE(intArrayOf(R.attr.salute_linkbutton_state_negative)),
    WARNING(intArrayOf(R.attr.salute_linkbutton_state_warning)),
}

/**
 * Реализация [ColorStateProvider] для LinkButtonColorState
 */
@Keep
internal class LinkButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): LinkButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.LinkButton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.LinkButton_salute_linkbuttonColors, 0)
        typedArray.recycle()
        return LinkButtonColorState.values().getOrNull(stateOrdinal)
    }
}
