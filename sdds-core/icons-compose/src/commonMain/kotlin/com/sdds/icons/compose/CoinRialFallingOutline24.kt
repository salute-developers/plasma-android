package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFallingOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFallingOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z m -4.0 -1.0 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z m 4.0 5.5 c 3.314 0.0 6.0 2.686 6.0 6.0 s -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 s 2.686 -6.0 6.0 -6.0 Z m 7.5 6.0 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 4.142 3.358 7.5 7.5 7.5 c 4.142 0.0 7.5 -3.358 7.5 -7.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 11.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.412 C 14.065 11.0 15.0 11.935 15.0 13.088 c 0.0 0.859 -0.518 1.597 -1.26 1.917 l 1.202 2.26 c 0.13 0.244 0.036 0.547 -0.207 0.677 c -0.244 0.13 -0.547 0.036 -0.677 -0.207 L 12.7 15.177 H 12.0 V 17.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 11.0 17.776 11.0 17.5 v -6.0 Z m 1.0 2.677 h 0.912 c 0.6 0.0 1.088 -0.488 1.088 -1.089 c 0.0 -0.6 -0.487 -1.088 -1.088 -1.088 H 12.0 v 2.177 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.5 11.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 6.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 9.0 17.776 9.0 17.5 v -6.0 C 9.0 11.224 9.224 11.0 9.5 11.0 Z")
        )
    }.build()
}
