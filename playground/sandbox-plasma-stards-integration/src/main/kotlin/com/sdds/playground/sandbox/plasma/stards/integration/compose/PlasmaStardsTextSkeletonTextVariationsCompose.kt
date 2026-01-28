package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textskeleton.L
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.S
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonText
import com.sdkit.star.designsystem.styles.textskeleton.Xs

internal object PlasmaStardsTextSkeletonTextVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "L" to { TextSkeletonText.L.style() },
            "M" to { TextSkeletonText.M.style() },
            "S" to { TextSkeletonText.S.style() },
            "Xs" to { TextSkeletonText.Xs.style() },
        )
}
