// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.textskeleton.Default
import com.sdds.serv.styles.textskeleton.Lighter
import com.sdds.serv.styles.textskeleton.TextSkeleton

internal object SddsServTextSkeletonVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { TextSkeleton.Default.style() },
            "Lighter" to ComposeStyleReference { TextSkeleton.Lighter.style() },
        )
}
