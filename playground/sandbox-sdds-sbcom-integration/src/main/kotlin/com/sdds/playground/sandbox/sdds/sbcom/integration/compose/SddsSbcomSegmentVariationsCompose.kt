package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.segment.Default
import com.sdds.sbcom.styles.segment.Segment

internal object SddsSbcomSegmentVariationsCompose : ComposeStyleProvider<String, SegmentStyle>() {
    override val variations: Map<String, @Composable () -> SegmentStyle> =
        mapOf(
            "Default" to { Segment.Default.style() },
        )
}
