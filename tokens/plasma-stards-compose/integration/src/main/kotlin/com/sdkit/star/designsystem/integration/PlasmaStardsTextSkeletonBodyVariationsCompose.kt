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
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonBody
import com.sdkit.star.designsystem.styles.textskeleton.Xs
import com.sdkit.star.designsystem.styles.textskeleton.Xxs

internal object PlasmaStardsTextSkeletonBodyVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TextSkeletonBody.L.style() },
            "M" to ComposeStyleReference { TextSkeletonBody.M.style() },
            "S" to ComposeStyleReference { TextSkeletonBody.S.style() },
            "Xs" to ComposeStyleReference { TextSkeletonBody.Xs.style() },
            "Xxs" to ComposeStyleReference { TextSkeletonBody.Xxs.style() },
        )
}
