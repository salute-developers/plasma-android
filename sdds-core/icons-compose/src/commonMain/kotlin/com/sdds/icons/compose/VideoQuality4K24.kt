package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoQuality4K24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoQuality4K24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.747 13.052 L 7.143 7.2 h 2.24 v 5.74 h 1.092 v 1.862 H 9.383 V 17.0 H 7.27 v -2.198 H 2.747 v -1.75 Z m 2.114 -0.112 H 7.27 V 9.818 L 4.861 12.94 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.425 13.01 V 17.0 h -2.24 V 7.2 h 2.24 v 3.892 h 1.288 L 18.26 7.2 h 2.66 l -3.276 4.592 L 21.579 17.0 H 18.75 l -2.912 -3.99 h -1.414 Z")
        )
    }.build()
}
