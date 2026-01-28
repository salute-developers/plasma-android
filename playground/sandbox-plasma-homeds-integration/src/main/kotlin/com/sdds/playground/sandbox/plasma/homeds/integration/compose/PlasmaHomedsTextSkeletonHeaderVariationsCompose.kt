package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.H1
import com.sdds.plasma.homeds.styles.textskeleton.H2
import com.sdds.plasma.homeds.styles.textskeleton.H3
import com.sdds.plasma.homeds.styles.textskeleton.H4
import com.sdds.plasma.homeds.styles.textskeleton.H5
import com.sdds.plasma.homeds.styles.textskeleton.H6
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonHeader
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsTextSkeletonHeaderVariationsCompose : ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "H1" to { TextSkeletonHeader.H1.style() },
            "H2" to { TextSkeletonHeader.H2.style() },
            "H3" to { TextSkeletonHeader.H3.style() },
            "H4" to { TextSkeletonHeader.H4.style() },
            "H5" to { TextSkeletonHeader.H5.style() },
            "H6" to { TextSkeletonHeader.H6.style() },
        )
}
