package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.5 5.51 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 3.765 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.51 Z m -6.0 -1.506 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 7.77 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 4.004 Z m -7.0 0.506 c 0.552 0.0 1.0 0.447 1.0 1.0 v 3.765 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 V 5.51 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z m 6.0 28.494 c 6.213 0.0 11.25 -5.058 11.25 -11.299 c 0.0 -6.24 -5.037 -11.299 -11.25 -11.299 s -11.25 5.059 -11.25 11.3 c 0.0 6.24 5.037 11.298 11.25 11.298 Z M 17.25 16.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 9.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 18.0 26.913 18.0 26.499 v -3.485 h 1.05 l 2.038 3.837 c 0.194 0.366 0.648 0.505 1.014 0.31 c 0.366 -0.194 0.505 -0.648 0.31 -1.014 l -1.8 -3.39 c 1.11 -0.481 1.888 -1.588 1.888 -2.876 c 0.0 -1.73 -1.402 -3.132 -3.132 -3.132 H 17.25 Z m 2.118 4.765 H 18.0 v -3.265 h 1.368 c 0.901 0.0 1.632 0.73 1.632 1.632 c 0.0 0.902 -0.73 1.633 -1.632 1.633 Z m -5.118 -4.765 c 0.414 0.0 0.75 0.336 0.75 0.75 v 9.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -9.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
