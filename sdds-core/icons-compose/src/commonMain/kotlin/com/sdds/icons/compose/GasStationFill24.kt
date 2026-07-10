package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GasStationFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GasStationFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.25 2.0 C 5.455 2.0 4.0 3.455 4.0 5.25 V 20.5 H 3.75 C 3.336 20.5 3.0 20.836 3.0 21.25 S 3.336 22.0 3.75 22.0 h 13.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 17.0 v -1.8 c 0.375 0.192 0.8 0.3 1.25 0.3 c 1.519 0.0 2.75 -1.231 2.75 -2.75 v -4.344 c 0.0 -0.843 -0.13 -1.68 -0.383 -2.484 l -1.152 -3.648 c -0.125 -0.395 -0.546 -0.614 -0.94 -0.49 c -0.396 0.126 -0.615 0.547 -0.49 0.942 l 1.152 3.647 c 0.207 0.658 0.313 1.344 0.313 2.033 v 4.344 c 0.0 0.69 -0.56 1.25 -1.25 1.25 S 17.0 16.94 17.0 16.25 v -11.0 C 17.0 3.455 15.545 2.0 13.75 2.0 h -6.5 Z m 0.386 5.183 C 7.5 7.45 7.5 7.8 7.5 8.5 v 1.0 c 0.0 0.7 0.0 1.05 0.136 1.318 c 0.12 0.235 0.311 0.426 0.547 0.546 C 8.45 11.5 8.8 11.5 9.5 11.5 h 2.0 c 0.7 0.0 1.05 0.0 1.318 -0.136 c 0.235 -0.12 0.426 -0.311 0.546 -0.546 C 13.5 10.55 13.5 10.2 13.5 9.5 v -1.0 c 0.0 -0.7 0.0 -1.05 -0.136 -1.317 c -0.12 -0.236 -0.311 -0.427 -0.546 -0.547 C 12.55 6.5 12.2 6.5 11.5 6.5 h -2.0 c -0.7 0.0 -1.05 0.0 -1.317 0.136 c -0.236 0.12 -0.427 0.311 -0.547 0.547 Z")
        )
    }.build()
}
