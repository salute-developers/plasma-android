// Copyright 2025, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

package com.sdds.haze.blur

import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import com.sdds.haze.ExperimentalHazeApi
import com.sdds.haze.InternalHazeApi
import com.sdds.haze.VisualEffectContext

@OptIn(ExperimentalHazeApi::class, InternalHazeApi::class)
internal class ScrimBlurVisualEffectDelegate(
    val blurVisualEffect: BlurVisualEffect,
) : BlurVisualEffect.Delegate {
    override fun DrawScope.draw(context: VisualEffectContext) {
        val scrimTint = blurVisualEffect.fallbackTint.takeIf { it.isSpecified }
            ?: blurVisualEffect.colorEffects.firstOrNull()
                ?.boostForFallback(blurVisualEffect.blurRadius.takeOrElse { 0.dp })
            ?: return

        withAlpha(alpha = blurVisualEffect.alpha, context = context) {
            drawScrim(
                colorEffect = scrimTint,
                context = context,
                mask = blurVisualEffect.mask ?: blurVisualEffect.progressive?.asBrush(),
            )
        }
    }
}
