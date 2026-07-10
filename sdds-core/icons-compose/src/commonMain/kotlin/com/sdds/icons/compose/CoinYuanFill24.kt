package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 12.0 c 0.0 1.85 -0.558 3.57 -1.515 5.0 h -6.926 c 0.119 -0.133 0.191 -0.308 0.191 -0.5 v -0.558 h 2.05 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -2.05 v -1.115 h 2.05 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -1.412 l 2.24 -3.416 c 0.226 -0.346 0.13 -0.811 -0.217 -1.038 c -0.346 -0.227 -0.811 -0.13 -1.038 0.216 L 12.0 11.209 l -2.373 -3.62 C 9.4 7.242 8.935 7.146 8.59 7.373 C 8.242 7.6 8.146 8.065 8.373 8.41 l 2.239 3.416 H 9.2 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.05 v 1.115 H 9.2 c -0.414 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.336 0.75 0.75 0.75 h 2.05 V 16.5 c 0.0 0.192 0.072 0.367 0.191 0.5 H 4.516 C 3.558 15.57 3.0 13.85 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
