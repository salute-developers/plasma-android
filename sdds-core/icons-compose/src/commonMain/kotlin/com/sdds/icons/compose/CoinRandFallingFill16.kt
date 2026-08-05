package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFallingFill16",
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
            pathData = addPathNodes("M 7.1 9.494 h 1.153 C 8.776 9.494 9.2 9.07 9.2 8.547 C 9.2 8.024 8.776 7.6 8.253 7.6 H 7.1 v 1.894 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.25 9.75 C 13.25 12.65 10.9 15.0 8.0 15.0 s -5.25 -2.35 -5.25 -5.25 S 5.1 4.5 8.0 4.5 s 5.25 2.35 5.25 5.25 Z M 6.4 7.25 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 h 1.503 C 9.163 6.9 9.9 7.637 9.9 8.547 c 0.0 0.744 -0.493 1.373 -1.17 1.577 l 1.12 1.844 c 0.1 0.166 0.047 0.38 -0.118 0.481 c -0.166 0.1 -0.38 0.048 -0.481 -0.117 l -1.298 -2.138 H 7.1 v 1.956 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -4.9 Z")
        )
    }.build()
}
