// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.textskeleton.L
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.S
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonDisplay

internal object PlasmaStardsTextSkeletonDisplayVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TextSkeletonDisplay.L.style() },
            "M" to ComposeStyleReference { TextSkeletonDisplay.M.style() },
            "S" to ComposeStyleReference { TextSkeletonDisplay.S.style() },
        )
}
