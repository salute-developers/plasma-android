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
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonText
import com.sdkit.star.designsystem.styles.textskeleton.Xs

internal object PlasmaStardsTextSkeletonTextVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TextSkeletonText.L.style() },
            "M" to ComposeStyleReference { TextSkeletonText.M.style() },
            "S" to ComposeStyleReference { TextSkeletonText.S.style() },
            "Xs" to ComposeStyleReference { TextSkeletonText.Xs.style() },
        )
}
