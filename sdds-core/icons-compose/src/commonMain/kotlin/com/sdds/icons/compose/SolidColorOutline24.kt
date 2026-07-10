package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SolidColorOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SolidColorOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.714 2.0 C 20.08 2.0 22.0 3.92 22.0 6.286 v 11.428 C 22.0 20.08 20.08 22.0 17.714 22.0 H 6.286 C 3.92 22.0 2.0 20.08 2.0 17.714 V 6.286 C 2.0 3.92 3.92 2.0 6.286 2.0 h 11.428 Z M 6.286 3.429 c -1.578 0.0 -2.857 1.28 -2.857 2.857 v 11.428 c 0.0 1.578 1.28 2.857 2.857 2.857 h 11.428 c 1.578 0.0 2.857 -1.28 2.857 -2.857 V 6.286 c 0.0 -1.578 -1.28 -2.857 -2.857 -2.857 H 6.286 Z m 10.0 2.857 c 0.789 0.0 1.428 0.64 1.428 1.428 v 8.572 c 0.0 0.789 -0.64 1.428 -1.428 1.428 H 7.714 c -0.789 0.0 -1.428 -0.64 -1.428 -1.428 V 7.714 c 0.0 -0.789 0.64 -1.428 1.428 -1.428 h 8.572 Z")
        )
    }.build()
}
