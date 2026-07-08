package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.941 9.41 V 4.677 L 6.588 6.476 v 6.23 v 0.023 c 0.0 1.255 -1.027 2.273 -2.294 2.273 C 3.027 15.002 2.0 13.984 2.0 12.728 c 0.0 -1.255 1.027 -2.273 2.294 -2.273 c 0.455 0.0 0.879 0.131 1.235 0.357 V 4.074 c 0.0 -0.703 0.47 -1.32 1.152 -1.513 l 5.294 -1.5 C 12.99 0.775 14.0 1.53 14.0 2.576 v 8.705 v 0.046 c 0.0 1.255 -1.027 2.273 -2.294 2.273 c -1.267 0.0 -2.294 -1.018 -2.294 -2.274 c 0.0 -1.255 1.027 -2.273 2.294 -2.273 c 0.455 0.0 0.879 0.131 1.235 0.357 Z")
        )
    }.build()
}
