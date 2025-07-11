package com.sdds.playground.sandbox.plasma.giga.integration.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.rectskeleton.Default
import com.sdds.plasma.giga.styles.rectskeleton.Lighter
import com.sdds.plasma.giga.styles.rectskeleton.RectSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaRectSkeletonVariationsCompose :
    ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
            "Lighter" to { RectSkeleton.Lighter.style() },
        )
}
