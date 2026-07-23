package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.326 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.527 1.525 C 8.527 1.235 8.292 1.0 8.002 1.0 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.201 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 2.9 0.0 5.25 -2.35 5.25 -5.25 S 10.9 4.5 8.0 4.5 S 2.75 6.85 2.75 9.75 S 5.1 15.0 8.0 15.0 Z M 5.95 7.75 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 4.13 c 0.0 0.232 0.188 0.42 0.42 0.42 h 1.89 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 5.95 V 7.75 Z M 8.89 8.1 h 1.447 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 8.54 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 4.13 c 0.0 0.232 0.188 0.42 0.42 0.42 h 1.89 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 8.89 v -1.484 h 1.447 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 8.89 V 8.1 Z")
        )
    }.build()
}
