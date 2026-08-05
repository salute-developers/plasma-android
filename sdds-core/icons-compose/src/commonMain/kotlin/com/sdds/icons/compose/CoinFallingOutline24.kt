package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinFallingOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinFallingOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 10.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.125 c 1.45 0.0 2.625 1.175 2.625 2.625 s -1.175 2.625 -2.625 2.625 H 11.5 v 1.0 h 1.75 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 11.5 v 0.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 10.0 18.914 10.0 18.5 v -0.75 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 10.0 v -1.0 H 9.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 H 10.0 v -3.0 Z m 1.5 3.0 h 1.375 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 13.496 11.5 12.875 11.5 H 11.5 v 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.0 c 4.142 0.0 7.5 3.358 7.5 7.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 C 4.5 10.358 7.858 7.0 12.0 7.0 Z m 6.0 7.5 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 s -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 Z")
        )
    }.build()
}
