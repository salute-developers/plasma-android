package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQuality4K16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQuality4K16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 8.68 L 4.535 4.5 H 6.08 v 4.1 h 0.754 v 1.33 H 6.08 v 1.57 h -1.46 V 9.93 H 1.5 V 8.68 Z M 2.96 8.6 h 1.662 V 6.37 L 2.959 8.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.561 8.65 v 2.85 H 8.015 v -7.0 h 1.546 v 2.78 h 0.89 l 1.758 -2.78 h 1.837 l -2.262 3.28 L 14.5 11.5 h -1.952 l -2.01 -2.85 H 9.56 Z")
        )
    }.build()
}
