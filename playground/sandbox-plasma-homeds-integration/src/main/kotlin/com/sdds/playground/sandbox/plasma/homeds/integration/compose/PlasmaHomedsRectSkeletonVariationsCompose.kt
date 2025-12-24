package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.rectskeleton.Default
import com.sdds.plasma.homeds.styles.rectskeleton.RectSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsRectSkeletonVariationsCompose : ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
        )
}
