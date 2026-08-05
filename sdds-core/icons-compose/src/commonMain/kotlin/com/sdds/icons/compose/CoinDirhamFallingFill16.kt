package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.326 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z m -2.8 -0.7 C 8.527 1.235 8.293 1.0 8.003 1.0 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z M 5.202 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 8.0 15.0 c 2.9 0.0 5.25 -2.35 5.25 -5.25 S 10.9 4.5 8.0 4.5 S 2.75 6.85 2.75 9.75 S 5.1 15.0 8.0 15.0 Z m 0.933 -7.25 c 0.0 -0.193 -0.156 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 3.85 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.194 0.0 0.35 -0.157 0.35 -0.35 V 9.948 H 10.1 V 11.6 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 V 7.75 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.498 H 8.933 V 7.75 Z m -3.733 0.0 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 h 0.062 C 6.93 7.4 8.0 8.47 8.0 9.788 c 0.0 1.194 -0.968 2.162 -2.162 2.162 H 5.55 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 V 7.75 Z m 0.7 0.374 v 3.125 c 0.779 -0.033 1.4 -0.674 1.4 -1.46 c 0.0 -0.835 -0.605 -1.528 -1.4 -1.665 Z")
        )
    }.build()
}
