package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Bluetooth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Bluetooth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.785 1.049 c 0.174 -0.083 0.38 -0.059 0.53 0.063 l 4.0 3.25 C 12.432 4.457 12.5 4.599 12.5 4.75 c 0.0 0.15 -0.068 0.293 -0.185 0.388 L 8.793 8.0 l 3.522 2.862 c 0.117 0.095 0.185 0.237 0.185 0.388 c 0.0 0.15 -0.068 0.293 -0.185 0.388 l -4.0 3.25 c -0.15 0.122 -0.356 0.146 -0.53 0.063 C 7.611 14.87 7.5 14.694 7.5 14.5 V 9.05 l -3.185 2.588 c -0.214 0.174 -0.529 0.142 -0.703 -0.073 c -0.174 -0.214 -0.142 -0.529 0.073 -0.703 L 7.207 8.0 L 3.685 5.138 C 3.47 4.964 3.438 4.65 3.612 4.435 C 3.786 4.22 4.101 4.188 4.315 4.362 L 7.5 6.95 V 1.5 c 0.0 -0.193 0.111 -0.369 0.285 -0.451 Z M 8.5 9.05 l 2.707 2.2 l -2.707 2.2 v -4.4 Z m 0.0 -2.1 v -4.4 l 2.707 2.2 L 8.5 6.95 Z")
        )
    }.build()
}
