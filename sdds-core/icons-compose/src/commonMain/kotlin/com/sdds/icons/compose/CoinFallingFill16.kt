package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinFallingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinFallingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.326 2.225 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z m -2.8 -0.7 C 8.527 1.235 8.293 1.0 8.003 1.0 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.75 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.75 Z M 5.202 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 v 1.75 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -1.75 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z m 8.049 8.05 C 13.25 12.65 10.9 15.0 8.0 15.0 s -5.25 -2.35 -5.25 -5.25 S 5.1 4.5 8.0 4.5 s 5.25 2.35 5.25 5.25 Z M 6.774 7.125 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 h 1.488 c 0.918 0.0 1.662 0.744 1.662 1.663 c 0.0 0.918 -0.744 1.662 -1.662 1.662 H 7.474 v 1.05 h 1.4 c 0.194 0.0 0.35 0.157 0.35 0.35 c 0.0 0.193 -0.156 0.35 -0.35 0.35 h -1.4 v 0.7 c 0.0 0.193 -0.156 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -0.7 h -0.7 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 h 0.7 V 10.1 h -0.7 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 h 0.7 V 7.125 Z m 0.7 2.275 h 1.138 c 0.531 0.0 0.962 -0.43 0.962 -0.962 s -0.43 -0.963 -0.962 -0.963 H 7.474 V 9.4 Z")
        )
    }.build()
}
