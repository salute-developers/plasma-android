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
 * Реализация [ColorState] для компонента Slider
 */
public enum class SliderColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_slider_state_default)),
    ACCENT(intArrayOf(R.attr.serv_slider_state_accent)),
    GRADIENT(intArrayOf(R.attr.serv_slider_state_gradient)),
}

/**
 * Реализация [ColorStateProvider] для SliderColorState
 */
@Keep
internal class SliderColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): SliderColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Slider,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Slider_serv_sliderColors, 0)
        typedArray.recycle()
        return SliderColorState.values().getOrNull(stateOrdinal)
    }
}
