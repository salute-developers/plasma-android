package com.sdds.playground.sandbox.sdds.serv.integration.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.textskeleton.Default
import com.sdds.serv.styles.textskeleton.Lighter
import com.sdds.serv.styles.textskeleton.TextSkeleton

internal object SddsServTextSkeletonVariationsCompose :
    ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "Default" to { TextSkeleton.Default.style() },
            "Lighter" to { TextSkeleton.Lighter.style() },
        )
}
