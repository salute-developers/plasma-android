package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DevicesFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DevicesFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.53 4.0 h 16.94 c 0.122 0.0 0.255 0.0 0.37 0.01 c 0.13 0.01 0.3 0.036 0.477 0.126 c 0.236 0.12 0.427 0.311 0.547 0.547 c 0.09 0.176 0.116 0.348 0.127 0.478 C 22.0 5.275 22.0 5.408 22.0 5.53 v 9.94 c 0.0 0.122 0.0 0.255 -0.01 0.37 c -0.01 0.13 -0.036 0.3 -0.126 0.477 c -0.12 0.236 -0.311 0.427 -0.547 0.547 c -0.176 0.09 -0.348 0.116 -0.477 0.127 C 20.733 16.999 20.614 17.0 20.5 17.0 v -5.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -5.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 V 17.0 H 3.53 c -0.122 0.0 -0.255 0.0 -0.37 -0.01 c -0.13 -0.01 -0.3 -0.036 -0.477 -0.126 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.547 c -0.09 -0.176 -0.116 -0.348 -0.127 -0.478 C 2.0 15.725 2.0 15.592 2.0 15.47 V 5.53 c 0.0 -0.122 0.0 -0.255 0.01 -0.37 c 0.01 -0.13 0.036 -0.3 0.126 -0.477 c 0.12 -0.236 0.311 -0.427 0.547 -0.547 C 2.859 4.046 3.03 4.02 3.16 4.01 C 3.275 4.0 3.408 4.0 3.53 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 19.5 V 18.0 H 4.0 v 1.5 h 7.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 12.6 c 0.0 -0.56 0.0 -0.84 0.109 -1.054 c 0.096 -0.188 0.249 -0.341 0.437 -0.437 C 13.76 11.0 14.04 11.0 14.6 11.0 h 2.8 c 0.56 0.0 0.84 0.0 1.054 0.109 c 0.188 0.096 0.341 0.249 0.437 0.437 C 19.0 11.76 19.0 12.04 19.0 12.6 v 6.8 c 0.0 0.56 0.0 0.84 -0.109 1.054 c -0.096 0.188 -0.249 0.341 -0.437 0.437 C 18.24 21.0 17.96 21.0 17.4 21.0 h -2.8 c -0.56 0.0 -0.84 0.0 -1.054 -0.109 c -0.188 -0.096 -0.341 -0.249 -0.437 -0.437 C 13.0 20.24 13.0 19.96 13.0 19.4 v -6.8 Z m 1.0 6.65 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 3.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 0.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -3.5 C 14.112 20.0 14.0 19.888 14.0 19.75 v -0.5 Z")
        )
    }.build()
}
