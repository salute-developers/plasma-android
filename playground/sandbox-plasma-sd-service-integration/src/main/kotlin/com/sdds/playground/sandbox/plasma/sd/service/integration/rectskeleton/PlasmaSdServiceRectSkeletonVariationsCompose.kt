package com.sdds.playground.sandbox.plasma.sd.service.integration.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.rectskeleton.Default
import com.sdds.plasma.sd.service.styles.rectskeleton.RectSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceRectSkeletonVariationsCompose :
    ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
        )
}
