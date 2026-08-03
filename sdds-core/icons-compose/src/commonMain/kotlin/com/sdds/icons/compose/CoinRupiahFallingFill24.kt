package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFallingFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z m -4.0 -1.0 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z m 11.5 11.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 C 4.5 10.358 7.858 7.0 12.0 7.0 c 4.142 0.0 7.5 3.358 7.5 7.5 Z m -10.0 -4.0 c -0.276 0.0 -0.5 0.21 -0.5 0.47 s 0.224 0.47 0.5 0.47 h 1.857 c 0.61 0.0 1.057 0.245 1.36 0.574 c 0.17 0.183 0.29 0.389 0.366 0.586 H 9.965 c -0.276 0.0 -0.5 0.21 -0.5 0.47 s 0.224 0.47 0.5 0.47 h 3.118 c -0.075 0.198 -0.196 0.403 -0.365 0.587 c -0.301 0.325 -0.744 0.569 -1.346 0.573 h -0.015 h -1.609 c -0.54 0.0 -0.805 0.618 -0.416 0.97 l 3.536 3.199 c 0.199 0.18 0.515 0.174 0.707 -0.013 c 0.191 -0.187 0.185 -0.485 -0.014 -0.665 l -2.82 -2.55 h 0.616 c 0.93 0.0 1.643 -0.386 2.116 -0.897 c 0.332 -0.36 0.552 -0.79 0.65 -1.204 h 0.949 c 0.276 0.0 0.5 -0.21 0.5 -0.47 s -0.224 -0.47 -0.5 -0.47 h -0.95 c -0.093 -0.398 -0.3 -0.809 -0.61 -1.16 h 1.56 c 0.276 0.0 0.5 -0.21 0.5 -0.47 s -0.224 -0.47 -0.5 -0.47 H 9.5 Z")
        )
    }.build()
}
