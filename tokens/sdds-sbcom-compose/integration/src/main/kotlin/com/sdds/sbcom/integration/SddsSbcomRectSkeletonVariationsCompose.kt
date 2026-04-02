// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.rectskeleton.Default
import com.sdds.sbcom.styles.rectskeleton.Pulse
import com.sdds.sbcom.styles.rectskeleton.RectSkeleton

internal object SddsSbcomRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { RectSkeleton.Default.style() },
            "Pulse" to ComposeStyleReference { RectSkeleton.Pulse.style() },
        )
}
