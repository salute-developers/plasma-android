package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRandFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRandFallingFill24",
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
            pathData = addPathNodes("M 10.75 14.206 h 1.647 c 0.747 0.0 1.353 -0.606 1.353 -1.353 S 13.144 11.5 12.397 11.5 H 10.75 v 2.706 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 14.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 C 4.5 10.358 7.858 7.0 12.0 7.0 c 4.142 0.0 7.5 3.358 7.5 7.5 Z M 9.75 11.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.147 c 1.3 0.0 2.353 1.053 2.353 2.353 c 0.0 1.063 -0.705 1.96 -1.672 2.253 l 1.6 2.635 c 0.143 0.236 0.067 0.543 -0.169 0.686 c -0.236 0.144 -0.543 0.069 -0.686 -0.168 l -1.854 -3.053 H 10.75 V 18.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -7.0 Z")
        )
    }.build()
}
