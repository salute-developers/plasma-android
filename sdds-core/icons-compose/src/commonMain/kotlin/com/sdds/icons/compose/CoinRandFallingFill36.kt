package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.5 5.51 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 3.765 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.51 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.5 4.004 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 7.77 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 4.004 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 4.51 c 0.552 0.0 1.0 0.447 1.0 1.0 v 3.765 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 V 5.51 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.75 21.308 h 2.236 h 0.026 h 0.209 c 1.12 0.0 2.029 -0.909 2.029 -2.03 c 0.0 -1.12 -0.909 -2.029 -2.03 -2.029 h -2.47 v 4.059 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.75 21.705 c 0.0 6.24 -5.037 11.3 -11.25 11.3 s -11.25 -5.06 -11.25 -11.3 c 0.0 -6.24 5.037 -11.299 11.25 -11.299 s 11.25 5.059 11.25 11.3 Z M 14.25 16.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.22 c 1.95 0.0 3.53 1.58 3.53 3.53 c 0.0 1.594 -1.057 2.94 -2.508 3.379 l 2.4 3.952 c 0.214 0.354 0.101 0.815 -0.253 1.03 c -0.354 0.215 -0.815 0.102 -1.03 -0.252 l -2.781 -4.58 H 15.75 v 4.191 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -10.5 Z")
        )
    }.build()
}
