package com.sdds.playground.sandbox.stylessalute.integration.rectskeleton

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.rectskeleton.Default
import com.sdds.stylessalute.styles.rectskeleton.RectSkeleton

internal object StylesSaluteRectSkeletonVariationsCompose :
    ComposeStyleProvider<String, RectSkeletonStyle>() {
    override val variations: Map<String, @Composable () -> RectSkeletonStyle> =
        mapOf(
            "Default" to { RectSkeleton.Default.style() },
        )
}
