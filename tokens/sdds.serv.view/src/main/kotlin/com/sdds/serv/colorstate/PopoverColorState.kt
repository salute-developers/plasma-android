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
 * Реализация [ColorState] для компонента Popover
 */
public enum class PopoverColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.serv_popover_state_default)),
    ACCENT(intArrayOf(R.attr.serv_popover_state_accent)),
}

/**
 * Реализация [ColorStateProvider] для PopoverColorState
 */
@Keep
internal class PopoverColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): PopoverColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.Popover,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Popover_serv_popoverColors, 0)
        typedArray.recycle()
        return PopoverColorState.values().getOrNull(stateOrdinal)
    }
}
