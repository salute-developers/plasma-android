package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQualityHD16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQualityHD16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.804 11.5 V 8.65 h -3.26 v 2.85 H 1.0 v -7.0 h 1.544 v 2.65 h 3.26 V 4.5 h 1.544 v 7.0 H 5.804 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.758 4.5 h 2.287 C 13.785 4.5 15.0 5.71 15.0 7.86 c 0.0 2.49 -1.543 3.64 -3.868 3.64 H 8.758 v -7.0 Z m 1.544 5.5 h 0.878 c 1.534 0.0 2.209 -0.8 2.209 -2.02 c 0.0 -1.3 -0.598 -1.98 -2.228 -1.98 H 10.3 v 4.0 Z")
        )
    }.build()
}
