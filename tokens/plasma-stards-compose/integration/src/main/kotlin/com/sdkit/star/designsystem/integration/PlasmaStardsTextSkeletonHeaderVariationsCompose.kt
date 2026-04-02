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
import com.sdkit.star.designsystem.styles.textskeleton.H1
import com.sdkit.star.designsystem.styles.textskeleton.H2
import com.sdkit.star.designsystem.styles.textskeleton.H3
import com.sdkit.star.designsystem.styles.textskeleton.H4
import com.sdkit.star.designsystem.styles.textskeleton.H5
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonHeader

internal object PlasmaStardsTextSkeletonHeaderVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "H1" to ComposeStyleReference { TextSkeletonHeader.H1.style() },
            "H2" to ComposeStyleReference { TextSkeletonHeader.H2.style() },
            "H3" to ComposeStyleReference { TextSkeletonHeader.H3.style() },
            "H4" to ComposeStyleReference { TextSkeletonHeader.H4.style() },
            "H5" to ComposeStyleReference { TextSkeletonHeader.H5.style() },
        )
}
