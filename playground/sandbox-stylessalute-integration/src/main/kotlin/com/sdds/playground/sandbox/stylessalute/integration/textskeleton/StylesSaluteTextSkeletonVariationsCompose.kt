package com.sdds.playground.sandbox.stylessalute.integration.textskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.textskeleton.Default
import com.sdds.stylessalute.styles.textskeleton.TextSkeleton

internal object StylesSaluteTextSkeletonVariationsCompose :
    ComposeStyleProvider<String, TextSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> TextSkeletonStyle> =
        mapOf(
            "Default" to { TextSkeleton.Default.style() },
        )
}
