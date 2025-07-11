// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.colorstate

import android.content.Context
import android.util.AttributeSet
import androidx.`annotation`.Keep
import com.sdds.plasma.sd.service.R
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorStateProvider
import kotlin.Int
import kotlin.IntArray

/**
 * Реализация [ColorState] для компонента RectSkeleton
 */
public enum class RectSkeletonColorState(
    public override val attrs: IntArray,
) : ColorState {
    DEFAULT(intArrayOf(R.attr.plasma_rectskeleton_state_default)),
    LIGHTER(intArrayOf(R.attr.plasma_rectskeleton_state_lighter)),
}

/**
 * Реализация [ColorStateProvider] для RectSkeletonColorState
 */
@Keep
internal class RectSkeletonColorStateProvider : ColorStateProvider {
    public override fun obtain(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): RectSkeletonColorState? {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.RectSkeleton,
            defStyleAttr,
            defStyleRes,
        )
        val stateOrdinal: Int =
            typedArray.getInt(R.styleable.RectSkeleton_plasma_rectskeletonColors, 0)
        typedArray.recycle()
        return RectSkeletonColorState.values().getOrNull(stateOrdinal)
    }
}
