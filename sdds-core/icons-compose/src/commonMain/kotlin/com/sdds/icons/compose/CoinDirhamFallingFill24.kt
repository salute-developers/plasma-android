package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFallingFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z m -4.0 -1.0 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z m 4.0 19.0 c 4.142 0.0 7.5 -3.358 7.5 -7.5 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 4.142 3.358 7.5 7.5 7.5 Z m 1.333 -10.25 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.5 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 v -2.36 H 15.0 v 2.36 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -5.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.14 h -1.667 v -2.14 Z M 8.0 11.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.088 c 1.885 0.0 3.412 1.527 3.412 3.412 c 0.0 1.705 -1.383 3.088 -3.088 3.088 H 8.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -5.5 Z m 1.0 0.535 v 4.463 c 1.112 -0.046 2.0 -0.963 2.0 -2.086 c 0.0 -1.192 -0.864 -2.182 -2.0 -2.377 Z")
        )
    }.build()
}
