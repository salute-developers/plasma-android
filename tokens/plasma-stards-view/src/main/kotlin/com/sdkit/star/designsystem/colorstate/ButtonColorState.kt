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
 * Реализация [ColorState] для компонента Button
 */
public enum class ButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_button_state_default)),
    CLEAR(intArrayOf(R.attr.sdkit_button_state_clear)),
}

/**
 * Реализация [ColorStateProvider] для ButtonColorState
 */
@Keep
internal class ButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): ButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Button,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Button_sdkit_buttonColors, 0)
        typedArray.recycle()
        return ButtonColorState.values().getOrNull(stateOrdinal)
    }
}
