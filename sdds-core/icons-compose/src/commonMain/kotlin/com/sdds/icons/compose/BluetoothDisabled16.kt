package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothDisabled16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothDisabled16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.315 10.861 c 0.117 0.095 0.185 0.239 0.185 0.39 c 0.0 0.15 -0.068 0.292 -0.185 0.387 l -4.0 3.25 c -0.15 0.121 -0.356 0.146 -0.53 0.063 c -0.174 -0.083 -0.285 -0.258 -0.285 -0.45 V 9.378 l 1.532 -1.186 l 3.283 2.668 Z M 8.5 13.45 l 2.707 -2.199 L 8.5 9.05 v 4.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.785 1.048 c 0.174 -0.083 0.38 -0.058 0.53 0.063 l 3.228 2.623 l 2.107 -1.63 c 0.219 -0.168 0.533 -0.129 0.702 0.09 c 0.17 0.218 0.129 0.533 -0.09 0.702 L 1.805 12.533 c -0.218 0.17 -0.532 0.129 -0.7 -0.09 c -0.17 -0.218 -0.13 -0.532 0.09 -0.7 l 5.438 -4.21 l -2.949 -2.395 C 3.47 4.964 3.438 4.648 3.612 4.435 C 3.786 4.22 4.101 4.187 4.315 4.36 l 3.13 2.543 L 7.5 6.862 V 1.5 c 0.0 -0.193 0.11 -0.37 0.285 -0.452 Z M 8.5 6.089 l 2.23 -1.727 L 8.5 2.55 v 3.539 Z")
        )
    }.build()
}
