// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.rectskeleton.Default
import com.sdds.plasma.sd.service.styles.rectskeleton.Lighter
import com.sdds.plasma.sd.service.styles.rectskeleton.RectSkeleton

internal object PlasmaB2cRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { RectSkeleton.Default.style() },
            "Lighter" to ComposeStyleReference { RectSkeleton.Lighter.style() },
        )
}
