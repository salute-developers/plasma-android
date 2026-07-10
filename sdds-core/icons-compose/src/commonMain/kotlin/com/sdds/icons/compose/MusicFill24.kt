package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.5 13.764 V 6.997 l -9.0 2.572 v 8.934 c 0.0 1.795 -1.455 3.25 -3.25 3.25 S 3.0 20.298 3.0 18.503 s 1.455 -3.25 3.25 -3.25 c 0.644 0.0 1.245 0.188 1.75 0.51 V 6.135 C 8.0 5.13 8.666 4.247 9.632 3.971 l 7.5 -2.143 C 18.569 1.418 20.0 2.497 20.0 3.992 v 12.511 c 0.0 1.795 -1.455 3.25 -3.25 3.25 s -3.25 -1.455 -3.25 -3.25 s 1.455 -3.25 3.25 -3.25 c 0.644 0.0 1.245 0.188 1.75 0.51 Z")
        )
    }.build()
}
