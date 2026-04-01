// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.L
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.S
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonBody
import com.sdds.plasma.homeds.styles.textskeleton.Xs
import com.sdds.plasma.homeds.styles.textskeleton.Xxs

internal object PlasmaHomedsTextSkeletonBodyVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "L" to ComposeStyleReference { TextSkeletonBody.L.style() },
            "M" to ComposeStyleReference { TextSkeletonBody.M.style() },
            "S" to ComposeStyleReference { TextSkeletonBody.S.style() },
            "Xs" to ComposeStyleReference { TextSkeletonBody.Xs.style() },
            "Xxs" to ComposeStyleReference { TextSkeletonBody.Xxs.style() },
        )
}
