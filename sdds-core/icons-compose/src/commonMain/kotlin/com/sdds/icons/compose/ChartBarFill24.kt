package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartBarFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartBarFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 16.0 4.5 V 21.0 h 5.0 V 4.5 C 21.0 3.672 20.328 3.0 19.5 3.0 h -2.0 C 16.672 3.0 16.0 3.672 16.0 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 9.5 7.5 V 21.0 h 5.0 V 7.5 C 14.5 6.672 13.828 6.0 13.0 6.0 h -2.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 3.0 21.0 v -7.5 C 3.0 12.672 3.672 12.0 4.5 12.0 h 2.0 C 7.328 12.0 8.0 12.672 8.0 13.5 V 21.0 H 3.0 Z")
        )
    }.build()
}
