package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQualityHD24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQualityHD24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.165 17.0 v -3.99 H 4.433 V 17.0 h -2.24 V 7.2 h 2.24 v 3.71 h 4.732 V 7.2 h 2.24 V 17.0 h -2.24 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.452 7.2 h 3.318 c 3.976 0.0 5.74 1.694 5.74 4.704 c 0.0 3.486 -2.24 5.096 -5.614 5.096 h -3.444 V 7.2 Z m 2.24 7.7 h 1.274 c 2.226 0.0 3.206 -1.12 3.206 -2.828 c 0.0 -1.82 -0.868 -2.772 -3.234 -2.772 h -1.246 v 5.6 Z")
        )
    }.build()
}
