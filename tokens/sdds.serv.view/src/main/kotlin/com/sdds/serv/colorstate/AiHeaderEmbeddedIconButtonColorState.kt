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
 * Реализация [ColorState] для компонента AiHeaderEmbeddedIconButton
 */
public enum class AiHeaderEmbeddedIconButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_default)),
    SECONDARY(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_secondary)),
    ACCENT(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_accent)),
    POSITIVE(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_negative)),
    WARNING(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_warning)),
    INFO(intArrayOf(R.attr.serv_aiheaderembeddediconbutton_state_info)),
}

/**
 * Реализация [ColorStateProvider] для AiHeaderEmbeddedIconButtonColorState
 */
@Keep
internal class AiHeaderEmbeddedIconButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): AiHeaderEmbeddedIconButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.AiHeaderEmbeddedIconButton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(
                R.styleable.AiHeaderEmbeddedIconButton_serv_aiheaderembeddediconbuttonColors,
                0,
            )
        typedArray.recycle()
        return AiHeaderEmbeddedIconButtonColorState.values().getOrNull(stateOrdinal)
    }
}
