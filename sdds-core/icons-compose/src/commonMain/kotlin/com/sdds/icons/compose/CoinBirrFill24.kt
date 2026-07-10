package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinBirrFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinBirrFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 H 7.44 c -0.119 -0.133 -0.191 -0.308 -0.191 -0.5 V 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.375 c 1.588 0.0 2.875 1.287 2.875 2.875 c 0.0 0.639 -0.208 1.229 -0.56 1.706 c 0.902 0.476 1.522 1.42 1.535 2.51 c 0.014 1.183 -0.688 2.205 -1.7 2.659 h 2.416 c -0.119 -0.133 -0.191 -0.308 -0.191 -0.5 v -4.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 v 0.01 c 0.505 -0.322 1.106 -0.51 1.75 -0.51 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 2.0 c 0.0 0.192 -0.072 0.367 -0.191 0.5 h 4.426 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.75 13.0 v 2.75 h 1.6 c 0.766 0.0 1.384 -0.626 1.375 -1.391 C 11.715 13.606 11.103 13.0 10.35 13.0 h -1.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.75 11.5 h 0.625 c 0.76 0.0 1.375 -0.616 1.375 -1.375 c 0.0 -0.76 -0.616 -1.375 -1.375 -1.375 H 8.75 v 2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
