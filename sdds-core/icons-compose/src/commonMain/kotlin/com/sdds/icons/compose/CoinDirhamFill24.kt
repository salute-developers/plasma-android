package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 12.0 c 0.0 1.85 -0.558 3.57 -1.515 5.0 h -1.926 c 0.119 -0.133 0.191 -0.308 0.191 -0.5 v -8.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.09 h -2.31 V 8.5 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 8.0 c 0.0 0.192 0.073 0.367 0.191 0.5 H 9.635 c 1.404 -0.542 2.4 -1.905 2.4 -3.5 v -2.0 c 0.0 -2.071 -1.678 -3.75 -3.75 -3.75 H 7.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 8.0 c 0.0 0.192 0.072 0.367 0.191 0.5 H 4.516 C 3.558 15.57 3.0 13.85 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 Z m -7.06 1.09 v 3.41 c 0.0 0.192 -0.072 0.367 -0.19 0.5 h 2.691 c -0.119 -0.133 -0.191 -0.308 -0.191 -0.5 v -3.41 h -2.31 Z M 7.75 9.25 v 6.5 h 0.536 c 1.242 0.0 2.25 -1.007 2.25 -2.25 v -2.0 c 0.0 -1.243 -1.008 -2.25 -2.25 -2.25 H 7.75 Z m -5.0 9.25 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
