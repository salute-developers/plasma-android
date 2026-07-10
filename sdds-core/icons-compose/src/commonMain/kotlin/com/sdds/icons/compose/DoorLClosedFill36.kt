package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLClosedFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLClosedFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.868 4.843 C 7.5 5.565 7.5 6.51 7.5 8.4 v 19.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 10.065 33.0 11.01 33.0 12.9 33.0 h 10.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 28.5 30.435 28.5 29.49 28.5 27.6 V 8.4 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 C 25.935 3.0 24.99 3.0 23.1 3.0 H 12.9 c -1.89 0.0 -2.835 0.0 -3.557 0.368 C 8.708 3.69 8.19 4.208 7.868 4.843 Z M 21.75 21.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 s -1.007 -2.25 -2.25 -2.25 s -2.25 1.007 -2.25 2.25 S 20.507 21.0 21.75 21.0 Z")
        )
    }.build()
}
