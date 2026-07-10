package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TrashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TrashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.375 9.0 c 0.0 -2.485 2.015 -4.5 4.5 -4.5 h 2.25 c 2.485 0.0 4.5 2.015 4.5 4.5 v 1.125 h 5.25 c 0.621 0.0 1.125 0.504 1.125 1.125 s -0.504 1.125 -1.125 1.125 H 27.0 v 13.246 c 0.0 0.8 0.0 1.47 -0.045 2.016 c -0.046 0.57 -0.147 1.105 -0.405 1.61 c -0.395 0.777 -1.026 1.408 -1.802 1.803 c -0.506 0.258 -1.041 0.359 -1.611 0.405 c -0.546 0.045 -1.215 0.045 -2.016 0.045 h -6.242 c -0.8 0.0 -1.47 0.0 -2.016 -0.045 c -0.57 -0.046 -1.105 -0.147 -1.61 -0.405 c -0.777 -0.395 -1.408 -1.026 -1.803 -1.802 c -0.258 -0.506 -0.359 -1.041 -0.405 -1.611 C 9.0 27.091 9.0 26.422 9.0 25.621 V 12.375 H 7.125 C 6.504 12.375 6.0 11.871 6.0 11.25 s 0.504 -1.125 1.125 -1.125 h 5.25 V 9.0 Z m 2.25 1.125 h 6.75 V 9.0 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 h -2.25 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 1.125 Z M 15.0 16.5 c 0.621 0.0 1.125 0.504 1.125 1.125 v 9.0 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -9.0 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 Z m 7.125 1.125 c 0.0 -0.621 -0.504 -1.125 -1.125 -1.125 s -1.125 0.504 -1.125 1.125 v 9.0 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 v -9.0 Z")
        )
    }.build()
}
