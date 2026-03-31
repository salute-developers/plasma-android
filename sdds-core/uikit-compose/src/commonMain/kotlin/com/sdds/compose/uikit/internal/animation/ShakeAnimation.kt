package com.sdds.compose.uikit.internal.animation

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.keyframes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.animation.ShakeAnimationDefaults.DefaultShakeAnimationDurationMs
import com.sdds.compose.uikit.internal.animation.ShakeAnimationDefaults.DefaultShakeCount
import com.sdds.compose.uikit.internal.animation.ShakeAnimationDefaults.DefaultShakeOffsetDp

@Composable
internal fun rememberShakeAnimationSpec(
    shakeCount: Int = DefaultShakeCount,
    durationMs: Int = DefaultShakeAnimationDurationMs,
    shakeOffsetDp: Dp = DefaultShakeOffsetDp.dp,
): AnimationSpec<Float> {
    val shakeOffsetPx = with(LocalDensity.current) { shakeOffsetDp.toPx() }
    return remember {
        keyframes {
            durationMillis = durationMs
            for (i in 1..shakeCount * 2) {
                val offset = if (i % 2 == 0) shakeOffsetPx else -shakeOffsetPx
                offset at i * (durationMillis / (shakeCount * 2))
            }
            0f at durationMillis
        }
    }
}

internal object ShakeAnimationDefaults {
    internal const val DefaultShakeOffsetDp = 2
    internal const val DefaultShakeCount = 3
    internal const val DefaultShakeAnimationDurationMs = 300
}
