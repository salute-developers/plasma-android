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
 * Реализация [ColorState] для компонента IconButton
 */
public enum class IconButtonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.sdkit_iconbutton_state_default)),
    CLEAR(intArrayOf(R.attr.sdkit_iconbutton_state_clear)),
}

/**
 * Реализация [ColorStateProvider] для IconButtonColorState
 */
@Keep
internal class IconButtonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): IconButtonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.IconButton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int = typedArray.getInt(R.styleable.IconButton_sdkit_iconbuttonColors, 0)
        typedArray.recycle()
        return IconButtonColorState.values().getOrNull(stateOrdinal)
    }
}
