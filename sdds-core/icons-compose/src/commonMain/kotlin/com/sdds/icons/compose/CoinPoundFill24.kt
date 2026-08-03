package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 12.0 c 0.0 1.85 -0.558 3.57 -1.515 5.0 h -1.926 c 0.119 -0.133 0.191 -0.308 0.191 -0.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -2.85 v -2.66 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.55 V 9.25 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.3 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 7.9 c 0.0 0.234 0.095 0.446 0.248 0.6 h -0.739 c 0.119 -0.133 0.191 -0.308 0.191 -0.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 8.75 V 8.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 7.25 8.086 7.25 8.5 v 7.9 c 0.0 0.234 0.095 0.446 0.248 0.6 H 4.516 C 3.558 15.57 3.0 13.85 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
