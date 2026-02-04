package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.L
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.S
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonDisplay
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsTextSkeletonDisplayVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "L" to { TextSkeletonDisplay.L.style() },
            "M" to { TextSkeletonDisplay.M.style() },
            "S" to { TextSkeletonDisplay.S.style() },
        )
}
