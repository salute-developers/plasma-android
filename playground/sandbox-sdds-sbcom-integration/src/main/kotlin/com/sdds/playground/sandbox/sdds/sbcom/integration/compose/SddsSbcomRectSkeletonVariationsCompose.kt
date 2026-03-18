package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.rectskeleton.Default
import com.sdds.sbcom.styles.rectskeleton.Pulse
import com.sdds.sbcom.styles.rectskeleton.RectSkeleton

internal object SddsSbcomRectSkeletonVariationsCompose : ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
            "Pulse" to { RectSkeleton.Pulse.style() },
        )
}
