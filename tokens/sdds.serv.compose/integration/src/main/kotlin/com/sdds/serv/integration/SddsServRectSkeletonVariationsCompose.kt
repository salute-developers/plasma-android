// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.rectskeleton.Default
import com.sdds.serv.styles.rectskeleton.Lighter
import com.sdds.serv.styles.rectskeleton.RectSkeleton

internal object SddsServRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { RectSkeleton.Default.style() },
            "Lighter" to ComposeStyleReference { RectSkeleton.Lighter.style() },
        )
}
