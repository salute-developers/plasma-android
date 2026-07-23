package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 4.206 C 8.868 3.416 10.42 3.0 12.0 3.0 s 3.132 0.416 4.5 1.206 c 1.368 0.79 2.504 1.926 3.294 3.294 S 21.0 10.42 21.0 12.0 s -0.416 3.132 -1.206 4.5 c -0.207 0.359 -0.666 0.482 -1.024 0.274 c -0.359 -0.207 -0.482 -0.665 -0.275 -1.024 c 0.659 -1.14 1.005 -2.434 1.005 -3.75 c 0.0 -1.316 -0.346 -2.61 -1.005 -3.75 c -0.658 -1.14 -1.605 -2.087 -2.745 -2.745 C 14.61 4.847 13.316 4.5 12.0 4.5 c -1.316 0.0 -2.61 0.347 -3.75 1.005 C 7.11 6.163 6.163 7.11 5.505 8.25 C 4.847 9.39 4.5 10.684 4.5 12.0 c 0.0 1.316 0.347 2.61 1.005 3.75 c 0.207 0.359 0.084 0.817 -0.275 1.024 c -0.358 0.208 -0.817 0.085 -1.024 -0.274 C 3.416 15.132 3.0 13.58 3.0 12.0 s 0.416 -3.132 1.206 -4.5 C 4.996 6.132 6.132 4.996 7.5 4.206 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 19.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 18.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 21.664 20.0 21.25 20.0 H 2.75 C 2.336 20.0 2.0 19.664 2.0 19.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.75 7.0 C 10.336 7.0 10.0 7.336 10.0 7.75 v 3.75 H 9.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 8.836 13.0 9.25 13.0 H 10.0 v 1.0 H 9.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 10.0 v 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 15.5 h 1.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 13.664 14.0 13.25 14.0 H 11.5 v -1.0 H 13.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 h -2.25 Z M 13.0 11.5 h -1.5 v -3.0 H 13.0 c 0.828 0.0 1.5 0.672 1.5 1.5 s -0.672 1.5 -1.5 1.5 Z")
        )
    }.build()
}
