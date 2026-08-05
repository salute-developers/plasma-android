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
 * Реализация [ColorState] для компонента EmbeddedIconButton
 */
public enum class EmbeddedIconButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_embeddediconbutton_state_default)),
    SECONDARY(intArrayOf(R.attr.serv_embeddediconbutton_state_secondary)),
    ACCENT(intArrayOf(R.attr.serv_embeddediconbutton_state_accent)),
    POSITIVE(intArrayOf(R.attr.serv_embeddediconbutton_state_positive)),
    NEGATIVE(intArrayOf(R.attr.serv_embeddediconbutton_state_negative)),
    WARNING(intArrayOf(R.attr.serv_embeddediconbutton_state_warning)),
    INFO(intArrayOf(R.attr.serv_embeddediconbutton_state_info)),
}

/**
 * Реализация [ColorStateProvider] для EmbeddedIconButtonColorState
 */
@Keep
internal class EmbeddedIconButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): EmbeddedIconButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.EmbeddedIconButton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.EmbeddedIconButton_serv_embeddediconbuttonColors, 0)
        typedArray.recycle()
        return EmbeddedIconButtonColorState.values().getOrNull(stateOrdinal)
    }
}
