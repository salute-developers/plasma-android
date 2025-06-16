package com.sdds.playground.sandbox.plasma.giga.app.integration.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.textskeleton.Default
import com.sdds.plasma.giga.app.styles.textskeleton.TextSkeleton
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppTextSkeletonVariationsCompose :
    ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "Default" to { TextSkeleton.Default.style() },
        )
}
