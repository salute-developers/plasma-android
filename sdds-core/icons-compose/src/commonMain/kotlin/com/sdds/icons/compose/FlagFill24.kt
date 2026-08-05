package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.83 3.13 C 5.698 1.86 7.334 1.47 8.85 1.597 c 1.479 0.122 2.77 0.733 3.916 1.29 l 0.126 0.062 c 1.134 0.553 2.126 1.036 3.202 1.183 c 1.063 0.145 2.258 -0.037 3.746 -1.01 c 0.23 -0.15 0.524 -0.162 0.766 -0.031 C 20.85 3.22 21.0 3.474 21.0 3.75 V 14.5 c 0.0 0.26 -0.135 0.502 -0.356 0.639 c -1.757 1.08 -3.273 1.348 -4.681 1.159 c -1.261 -0.17 -2.394 -0.707 -3.422 -1.196 l -0.236 -0.111 c -1.127 -0.532 -2.17 -0.989 -3.362 -1.08 C 7.86 13.832 6.592 14.05 5.0 14.933 v 6.318 C 5.0 21.664 4.664 22.0 4.25 22.0 S 3.5 21.664 3.5 21.25 V 3.75 c 0.0 -0.249 0.123 -0.48 0.33 -0.62 Z")
        )
    }.build()
}
