package com.sdds.playground.sandbox.plasma.giga.app.integration.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.rectskeleton.Default
import com.sdds.plasma.giga.app.styles.rectskeleton.Lighter
import com.sdds.plasma.giga.app.styles.rectskeleton.RectSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppRectSkeletonVariationsCompose :
    ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
            "Lighter" to { RectSkeleton.Lighter.style() },
        )
}
