package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.textskeleton.Default
import com.sdds.plasma.giga.styles.textskeleton.Lighter
import com.sdds.plasma.giga.styles.textskeleton.TextSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaTextSkeletonVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "Default" to { TextSkeleton.Default.style() },
            "Lighter" to { TextSkeleton.Lighter.style() },
        )
}
