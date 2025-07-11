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
 * Реализация [ColorState] для компонента TextSkeleton
 */
public enum class TextSkeletonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.salute_textskeleton_state_default)),
    LIGHTER(intArrayOf(R.attr.salute_textskeleton_state_lighter)),
}

/**
 * Реализация [ColorStateProvider] для TextSkeletonColorState
 */
@Keep
internal class TextSkeletonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): TextSkeletonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.TextSkeleton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.TextSkeleton_salute_textskeletonColors, 0)
        typedArray.recycle()
        return TextSkeletonColorState.values().getOrNull(stateOrdinal)
    }
}
