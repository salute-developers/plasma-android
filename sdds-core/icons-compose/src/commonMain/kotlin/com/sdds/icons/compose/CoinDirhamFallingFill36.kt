package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.5 5.51 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 3.765 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.51 Z m -6.0 -1.506 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 7.77 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 4.004 Z m -7.0 0.506 c 0.552 0.0 1.0 0.447 1.0 1.0 v 3.765 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 V 5.51 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z m 6.0 28.494 c 6.213 0.0 11.25 -5.058 11.25 -11.299 c 0.0 -6.24 -5.037 -11.299 -11.25 -11.299 s -11.25 5.059 -11.25 11.3 c 0.0 6.24 5.037 11.298 11.25 11.298 Z M 20.0 17.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 8.25 c 0.0 0.414 0.336 0.75 0.75 0.75 S 20.0 26.163 20.0 25.749 v -3.54 h 2.5 v 3.54 c 0.0 0.414 0.336 0.75 0.75 0.75 S 24.0 26.163 24.0 25.749 v -8.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.21 H 20.0 V 17.5 Z m -8.0 0.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 0.132 c 2.827 0.0 5.118 2.291 5.118 5.118 c 0.0 2.558 -2.074 4.632 -4.632 4.632 H 12.75 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -8.25 Z m 1.5 0.803 v 6.694 c 1.669 -0.07 3.0 -1.444 3.0 -3.13 c 0.0 -1.787 -1.296 -3.271 -3.0 -3.564 Z")
        )
    }.build()
}
