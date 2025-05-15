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
 * Реализация [ColorState] для компонента CheckBox
 */
public enum class CheckBoxColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_checkbox_state_default)),
}

/**
 * Реализация [ColorStateProvider] для CheckBoxColorState
 */
@Keep
internal class CheckBoxColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): CheckBoxColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.CheckBox,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.CheckBox_salute_checkboxColors, 0)
        typedArray.recycle()
        return CheckBoxColorState.values().getOrNull(stateOrdinal)
    }
}
