package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFallingFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFallingFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z m -4.0 -1.0 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z m 4.0 19.0 c 4.142 0.0 7.5 -3.358 7.5 -7.5 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 4.142 3.358 7.5 7.5 7.5 Z m -0.5 -11.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 6.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -2.323 h 0.7 l 1.358 2.558 c 0.13 0.243 0.433 0.336 0.677 0.207 c 0.243 -0.13 0.336 -0.433 0.207 -0.677 l -1.201 -2.26 C 14.48 14.685 15.0 13.947 15.0 13.088 C 15.0 11.935 14.065 11.0 12.912 11.0 H 11.5 Z m 1.412 3.177 H 12.0 V 12.0 h 0.912 c 0.6 0.0 1.088 0.487 1.088 1.088 c 0.0 0.601 -0.487 1.089 -1.088 1.089 Z M 9.5 11.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 6.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 9.0 17.776 9.0 17.5 v -6.0 C 9.0 11.224 9.224 11.0 9.5 11.0 Z")
        )
    }.build()
}
