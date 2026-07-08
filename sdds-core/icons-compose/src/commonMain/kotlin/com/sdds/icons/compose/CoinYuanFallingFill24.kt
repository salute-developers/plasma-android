package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFallingFill24",
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
            pathData = addPathNodes("M 12.0 22.0 c 4.142 0.0 7.5 -3.358 7.5 -7.5 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 4.142 3.358 7.5 7.5 7.5 Z m 2.333 -6.461 H 12.5 v 1.307 h 1.833 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 12.5 V 18.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -0.654 H 9.667 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 H 11.5 V 15.54 H 9.667 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 1.435 l -2.027 -3.276 c -0.145 -0.235 -0.073 -0.543 0.162 -0.688 c 0.235 -0.145 0.543 -0.073 0.688 0.162 L 12.0 14.088 l 2.075 -3.351 c 0.145 -0.235 0.453 -0.307 0.688 -0.162 c 0.235 0.145 0.307 0.453 0.162 0.688 l -2.027 3.276 h 1.435 c 0.277 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.223 0.5 -0.5 0.5 Z")
        )
    }.build()
}
