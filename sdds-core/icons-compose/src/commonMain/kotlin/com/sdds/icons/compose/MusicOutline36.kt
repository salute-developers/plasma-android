package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.156 5.05 c 0.798 -0.228 1.592 0.372 1.592 1.202 v 2.312 L 14.83 12.531 V 9.506 c 0.0 -0.559 0.37 -1.05 0.908 -1.202 L 27.155 5.05 Z m 1.592 16.26 V 10.643 L 14.83 14.61 v 13.584 v 0.025 c 0.0 2.643 -2.147 4.78 -4.79 4.78 c -2.643 0.0 -4.79 -2.137 -4.79 -4.78 c 0.0 -2.642 2.147 -4.78 4.79 -4.78 c 1.04 0.0 2.004 0.331 2.79 0.894 V 9.506 c 0.0 -1.452 0.963 -2.728 2.36 -3.126 l 11.418 -3.254 c 2.075 -0.591 4.14 0.968 4.14 3.126 v 18.943 c 0.0 2.643 -2.147 4.78 -4.79 4.78 c -2.643 0.0 -4.79 -2.137 -4.79 -4.78 c 0.0 -2.642 2.147 -4.78 4.79 -4.78 c 1.04 0.0 2.004 0.332 2.79 0.895 Z M 12.83 28.2 c -0.01 -1.524 -1.253 -2.76 -2.79 -2.76 c -1.543 0.0 -2.79 1.246 -2.79 2.78 c 0.0 1.532 1.247 2.78 2.79 2.78 s 2.79 -1.248 2.79 -2.78 V 28.2 Z m 13.128 -5.785 c -1.543 0.0 -2.79 1.247 -2.79 2.78 c 0.0 1.533 1.247 2.78 2.79 2.78 c 1.544 0.0 2.79 -1.247 2.79 -2.78 c 0.0 -1.533 -1.247 -2.78 -2.79 -2.78 Z")
        )
    }.build()
}
