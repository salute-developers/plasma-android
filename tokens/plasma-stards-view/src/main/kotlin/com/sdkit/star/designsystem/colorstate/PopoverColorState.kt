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
 * Реализация [ColorState] для компонента Popover
 */
public enum class PopoverColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_popover_state_default)),
    ACCENT(intArrayOf(R.attr.sdkit_popover_state_accent)),
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
        val stateOrdinal: Int = typedArray.getInt(R.styleable.Popover_sdkit_popoverColors, 0)
        typedArray.recycle()
        return PopoverColorState.values().getOrNull(stateOrdinal)
    }
}
