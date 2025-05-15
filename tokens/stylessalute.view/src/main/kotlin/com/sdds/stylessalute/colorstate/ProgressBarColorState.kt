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
 * Реализация [ColorState] для компонента ProgressBar
 */
public enum class ProgressBarColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_progressbar_state_default)),
    SECONDARY(intArrayOf(R.attr.salute_progressbar_state_secondary)),
    ACCENT(intArrayOf(R.attr.salute_progressbar_state_accent)),
    GRADIENT(intArrayOf(R.attr.salute_progressbar_state_gradient)),
    NEGATIVE(intArrayOf(R.attr.salute_progressbar_state_negative)),
    POSITIVE(intArrayOf(R.attr.salute_progressbar_state_positive)),
    WARNING(intArrayOf(R.attr.salute_progressbar_state_warning)),
}

/**
 * Реализация [ColorStateProvider] для ProgressBarColorState
 */
@Keep
internal class ProgressBarColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ProgressBarColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.ProgressBar,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(
            R.styleable.ProgressBar_salute_progressbarColors,
            0,
        )
        typedArray.recycle()
        return ProgressBarColorState.values().getOrNull(stateOrdinal)
    }
}
