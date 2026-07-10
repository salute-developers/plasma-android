package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.125 5.625 C 25.125 5.004 24.621 4.5 24.0 4.5 s -1.125 0.504 -1.125 1.125 v 3.75 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 v -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.125 4.125 C 19.125 3.504 18.621 3.0 18.0 3.0 s -1.125 0.504 -1.125 1.125 v 3.75 C 16.875 8.496 17.379 9.0 18.0 9.0 s 1.125 -0.504 1.125 -1.125 v -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 4.5 c 0.621 0.0 1.125 0.504 1.125 1.125 v 3.75 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -3.75 C 10.875 5.004 11.379 4.5 12.0 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 6.213 0.0 11.25 -5.037 11.25 -11.25 S 24.213 10.5 18.0 10.5 S 6.75 15.537 6.75 21.75 S 11.787 33.0 18.0 33.0 Z m 3.5 -9.692 h -2.75 v 1.961 h 2.75 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 0.415 -0.336 0.75 -0.75 0.75 h -2.75 v 0.981 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -0.98 H 14.5 c -0.414 0.0 -0.75 -0.337 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 h 2.75 v -1.962 H 14.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 h 2.154 l -3.042 -4.913 c -0.218 -0.352 -0.109 -0.815 0.243 -1.033 c 0.352 -0.218 0.815 -0.109 1.033 0.243 L 18.0 21.133 l 3.112 -5.028 c 0.218 -0.352 0.68 -0.46 1.033 -0.243 c 0.352 0.218 0.46 0.68 0.243 1.033 l -3.042 4.913 H 21.5 c 0.414 0.0 0.75 0.335 0.75 0.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 Z")
        )
    }.build()
}
