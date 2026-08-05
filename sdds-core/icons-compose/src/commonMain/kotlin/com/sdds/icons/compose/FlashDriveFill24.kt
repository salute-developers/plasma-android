package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashDriveFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashDriveFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.75 2.0 C 8.784 2.0 8.0 2.784 8.0 3.75 v 3.264 C 6.875 7.138 6.0 8.092 6.0 9.25 v 10.5 C 6.0 20.993 7.007 22.0 8.25 22.0 h 7.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 V 9.25 c 0.0 -1.158 -0.875 -2.112 -2.0 -2.236 V 3.75 C 16.0 2.784 15.216 2.0 14.25 2.0 h -4.5 Z m 4.75 5.0 V 3.75 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -4.5 C 9.612 3.5 9.5 3.612 9.5 3.75 V 7.0 h 5.0 Z")
        )
    }.build()
}
