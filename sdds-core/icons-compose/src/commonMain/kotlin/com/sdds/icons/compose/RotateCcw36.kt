package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCcw36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCcw36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 10.512 C 7.591 6.023 12.442 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -6.217 0.0 -11.548 -3.782 -13.823 -9.166 c -0.215 -0.51 0.023 -1.096 0.532 -1.31 c 0.509 -0.216 1.095 0.023 1.31 0.531 C 7.992 27.725 12.615 31.0 18.0 31.0 c 7.18 0.0 13.0 -5.82 13.0 -13.0 S 25.18 5.0 18.0 5.0 c -4.833 0.0 -9.053 2.638 -11.293 6.556 h 2.737 c 0.553 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.447 1.0 -1.0 1.0 H 5.12 H 5.075 H 4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 7.11 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 3.401 Z")
        )
    }.build()
}
