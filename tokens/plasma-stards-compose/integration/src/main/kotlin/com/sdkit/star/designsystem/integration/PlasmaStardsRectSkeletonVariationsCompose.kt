// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.rectskeleton.Default
import com.sdkit.star.designsystem.styles.rectskeleton.RectSkeleton

internal object PlasmaStardsRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { RectSkeleton.Default.style() },
        )
}
