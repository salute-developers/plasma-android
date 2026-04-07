// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.segment.Default
import com.sdds.sbcom.styles.segment.Segment

internal object SddsSbcomSegmentVariationsCompose : ComposeStyleProvider<SegmentStyle>() {
    override val variations: Map<String, ComposeStyleReference<SegmentStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Segment.Default.style() },
        )
}
