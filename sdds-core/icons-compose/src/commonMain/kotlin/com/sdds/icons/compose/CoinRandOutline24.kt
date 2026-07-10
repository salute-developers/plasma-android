package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.0 c -1.58 0.0 -3.132 0.416 -4.5 1.206 C 6.132 4.996 4.996 6.132 4.206 7.5 S 3.0 10.42 3.0 12.0 s 0.416 3.132 1.206 4.5 c 0.207 0.359 0.666 0.482 1.024 0.274 c 0.359 -0.207 0.482 -0.665 0.275 -1.024 C 4.847 14.61 4.5 13.316 4.5 12.0 c 0.0 -1.316 0.347 -2.61 1.005 -3.75 C 6.163 7.11 7.11 6.163 8.25 5.505 C 9.39 4.847 10.684 4.5 12.0 4.5 c 1.316 0.0 2.61 0.347 3.75 1.005 c 1.14 0.658 2.087 1.605 2.745 2.745 C 19.154 9.39 19.5 10.684 19.5 12.0 c 0.0 1.316 -0.346 2.61 -1.005 3.75 c -0.207 0.359 -0.084 0.817 0.275 1.024 c 0.358 0.208 0.817 0.085 1.024 -0.274 C 20.584 15.132 21.0 13.58 21.0 12.0 s -0.416 -3.132 -1.206 -4.5 c -0.79 -1.368 -1.926 -2.504 -3.294 -3.294 S 13.58 3.0 12.0 3.0 Z M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.25 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.25 c 1.657 0.0 3.0 1.343 3.0 3.0 c 0.0 1.248 -0.762 2.318 -1.847 2.77 l 1.75 3.112 c 0.204 0.361 0.076 0.819 -0.285 1.022 c -0.361 0.203 -0.819 0.075 -1.022 -0.286 l -2.035 -3.618 H 10.75 v 3.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 8.0 Z m 2.985 3.75 H 10.75 h 1.485 Z m 0.026 0.0 c 0.823 -0.006 1.489 -0.675 1.489 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 h -1.5 v 3.0")
        )
    }.build()
}
