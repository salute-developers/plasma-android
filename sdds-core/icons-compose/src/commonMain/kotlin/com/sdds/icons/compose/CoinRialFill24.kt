package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 12.0 c 0.0 1.85 -0.558 3.57 -1.515 5.0 H 16.45 c 0.298 -0.223 0.39 -0.639 0.202 -0.971 l -1.74 -3.056 c 1.079 -0.447 1.838 -1.51 1.838 -2.75 c 0.0 -1.642 -1.331 -2.973 -2.973 -2.973 H 11.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 8.4 c 0.0 0.245 0.118 0.463 0.3 0.6 H 9.059 c 0.119 -0.133 0.191 -0.308 0.191 -0.5 V 8.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 7.75 7.586 7.75 8.0 v 8.5 c 0.0 0.192 0.072 0.367 0.191 0.5 H 4.516 C 3.558 15.57 3.0 13.85 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 Z m -9.05 5.0 c 0.182 -0.137 0.3 -0.355 0.3 -0.6 v -3.203 h 1.064 l 2.034 3.574 c 0.053 0.092 0.122 0.17 0.202 0.229 h -3.6 Z m 1.785 -5.303 H 12.25 V 8.75 h 1.527 c 0.813 0.0 1.473 0.66 1.473 1.473 c 0.0 0.814 -0.66 1.474 -1.473 1.474 h -0.014 h -0.018 h -0.01 Z M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
