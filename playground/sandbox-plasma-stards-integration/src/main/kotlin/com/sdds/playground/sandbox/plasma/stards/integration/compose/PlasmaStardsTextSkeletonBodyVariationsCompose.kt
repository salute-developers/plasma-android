package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.textskeleton.L
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.S
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonBody
import com.sdkit.star.designsystem.styles.textskeleton.Xs
import com.sdkit.star.designsystem.styles.textskeleton.Xxs

internal object PlasmaStardsTextSkeletonBodyVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "L" to { TextSkeletonBody.L.style() },
            "M" to { TextSkeletonBody.M.style() },
            "S" to { TextSkeletonBody.S.style() },
            "Xs" to { TextSkeletonBody.Xs.style() },
            "Xxs" to { TextSkeletonBody.Xxs.style() },
        )
}
