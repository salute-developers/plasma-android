package com.sdds.uikit.internal.base

import android.animation.TimeInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import androidx.annotation.FloatRange
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator

/**
 * Utility class for animations containing Material interpolators.
 */
internal object AnimationUtils {
    val LINEAR_INTERPOLATOR: TimeInterpolator = LinearInterpolator()
    val FAST_OUT_SLOW_IN_INTERPOLATOR: TimeInterpolator = FastOutSlowInInterpolator()
    val FAST_OUT_LINEAR_IN_INTERPOLATOR: TimeInterpolator = FastOutLinearInInterpolator()
    val LINEAR_OUT_SLOW_IN_INTERPOLATOR: TimeInterpolator = LinearOutSlowInInterpolator()
    val DECELERATE_INTERPOLATOR: TimeInterpolator = DecelerateInterpolator()

    /** Linear interpolation between `startValue` and `endValue` by `fraction`.  */
    fun lerp(startValue: Float, endValue: Float, fraction: Float): Float {
        return startValue + fraction * (endValue - startValue)
    }

    /** Linear interpolation between `startValue` and `endValue` by `fraction`.  */
    fun lerp(startValue: Int, endValue: Int, fraction: Float): Int {
        return startValue + Math.round(fraction * (endValue - startValue))
    }

    /**
     * Linear interpolation between `startValue` and `endValue` when `fraction` is
     * between `startFraction` and `endFraction`.
     */
    fun lerp(
        startValue: Float,
        endValue: Float,
        @FloatRange(from = 0.0, to = 1.0) startFraction: Float,
        @FloatRange(from = 0.0, to = 1.0) endFraction: Float,
        @FloatRange(from = 0.0, to = 1.0) fraction: Float,
    ): Float {
        if (fraction < startFraction) {
            return startValue
        }
        return if (fraction > endFraction) {
            endValue
        } else {
            lerp(
                startValue,
                endValue,
                (fraction - startFraction) / (endFraction - startFraction),
            )
        }
    }
}
