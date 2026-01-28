package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.L
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.S
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonBody
import com.sdds.plasma.homeds.styles.textskeleton.Xs
import com.sdds.plasma.homeds.styles.textskeleton.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsTextSkeletonBodyVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "L" to { TextSkeletonBody.L.style() },
            "M" to { TextSkeletonBody.M.style() },
            "S" to { TextSkeletonBody.S.style() },
            "Xs" to { TextSkeletonBody.Xs.style() },
            "Xxs" to { TextSkeletonBody.Xxs.style() },
        )
}
