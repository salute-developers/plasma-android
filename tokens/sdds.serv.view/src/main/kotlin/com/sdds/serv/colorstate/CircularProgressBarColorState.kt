// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.serv.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента CircularProgressBar
 */
public enum class CircularProgressBarColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_circularprogressbar_state_default)),
    SECONDARY(intArrayOf(R.attr.serv_circularprogressbar_state_secondary)),
    ACCENT(intArrayOf(R.attr.serv_circularprogressbar_state_accent)),
    GRADIENT(intArrayOf(R.attr.serv_circularprogressbar_state_gradient)),
    INFO(intArrayOf(R.attr.serv_circularprogressbar_state_info)),
    NEGATIVE(intArrayOf(R.attr.serv_circularprogressbar_state_negative)),
    POSITIVE(intArrayOf(R.attr.serv_circularprogressbar_state_positive)),
    WARNING(intArrayOf(R.attr.serv_circularprogressbar_state_warning)),
}

/**
 * Реализация [ColorStateProvider] для CircularProgressBarColorState
 */
@Keep
internal class CircularProgressBarColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): CircularProgressBarColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.CircularProgressBar,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.CircularProgressBar_serv_circularprogressbarColors, 0)
        typedArray.recycle()
        return CircularProgressBarColorState.values().getOrNull(stateOrdinal)
    }
}
