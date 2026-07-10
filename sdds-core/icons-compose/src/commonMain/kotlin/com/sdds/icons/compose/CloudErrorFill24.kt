package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 6.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 9.538 12.0 6.5 S 14.462 1.0 17.5 1.0 S 23.0 3.462 23.0 6.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 17.5 5.793 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 18.207 6.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 17.5 7.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 16.793 6.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 15.5 c 0.0 -1.292 -0.544 -2.457 -1.416 -3.277 C 19.666 12.72 18.616 13.0 17.5 13.0 c -1.063 0.0 -2.067 -0.255 -2.953 -0.708 c -0.077 0.189 -0.23 0.346 -0.437 0.422 c -0.389 0.143 -0.82 -0.057 -0.962 -0.446 c -0.495 -1.347 -1.476 -2.461 -2.75 -3.122 s -2.75 -0.822 -4.136 -0.45 L 6.22 8.706 C 3.787 9.376 2.0 11.604 2.0 14.25 C 2.0 17.425 4.574 20.0 7.75 20.0 h 9.75 c 2.485 0.0 4.5 -2.015 4.5 -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.118 7.027 c 0.98 -1.478 2.526 -2.55 4.33 -2.902 C 11.157 4.861 11.0 5.662 11.0 6.5 c 0.0 0.46 0.048 0.908 0.138 1.34 l -0.05 -0.026 C 9.86 7.177 8.482 6.908 7.119 7.027 Z")
        )
    }.build()
}
