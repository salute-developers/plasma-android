// Copyright 2025, Christopher Banes and the Haze project contributors
// SPDX-License-Identifier: Apache-2.0

package com.sdds.haze.blur

import androidx.compose.ui.graphics.drawscope.DrawScope
import com.sdds.haze.VisualEffectContext

internal actual fun BlurVisualEffect.updateDelegate(context: VisualEffectContext, drawScope: DrawScope) {
    when {
        blurEnabled -> {
            if (delegate !is RenderEffectBlurVisualEffectDelegate) {
                delegate = RenderEffectBlurVisualEffectDelegate(this)
            }
        }

        else -> {
            if (delegate !is ScrimBlurVisualEffectDelegate) {
                delegate = ScrimBlurVisualEffectDelegate(this)
            }
        }
    }
}
