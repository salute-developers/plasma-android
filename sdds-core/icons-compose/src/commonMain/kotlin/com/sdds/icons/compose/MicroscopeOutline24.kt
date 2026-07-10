package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicroscopeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicroscopeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 2.25 c 1.243 0.0 2.25 1.007 2.25 2.25 v 2.254 c 2.703 0.096 5.465 1.734 6.908 4.388 c 1.477 2.715 1.19 6.155 -1.017 9.108 H 21.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 2.586 20.25 3.0 20.25 h 14.183 c 2.61 -2.76 2.951 -6.015 1.659 -8.392 c -1.185 -2.179 -3.446 -3.506 -5.592 -3.602 V 12.5 c 0.0 1.243 -1.007 2.25 -2.25 2.25 H 8.5 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 v -8.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 H 11.0 Z m -2.5 1.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 8.0 c 0.0 0.414 0.336 0.75 0.75 0.75 H 11.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -8.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.303 16.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 12.717 18.0 12.303 18.0 H 7.19 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 5.113 Z")
        )
    }.build()
}
