package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 H 10.0 v -1.5 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 8.836 14.0 9.25 14.0 H 10.0 v -1.0 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 10.0 V 7.75 C 10.0 7.336 10.336 7.0 10.75 7.0 H 13.0 c 1.657 0.0 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 h -1.5 v 1.0 h 1.75 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 11.5 V 17.0 h 7.985 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.5 11.5 H 13.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 13.828 8.5 13.0 8.5 h -1.5 v 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
