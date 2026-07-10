package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SunFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SunFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 7.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 19.243 3.0 18.0 3.0 s -2.25 1.007 -2.25 2.25 S 16.757 7.5 18.0 7.5 Z M 18.0 33.0 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 19.243 28.5 18.0 28.5 s -2.25 1.007 -2.25 2.25 S 16.757 33.0 18.0 33.0 Z m 7.5 -15.0 c 0.0 4.142 -3.357 7.5 -7.5 7.5 c -4.141 0.0 -7.5 -3.358 -7.5 -7.5 c 0.0 -4.142 3.359 -7.5 7.5 -7.5 c 4.143 0.0 7.5 3.358 7.5 7.5 Z m 3.106 -7.425 c -0.879 0.879 -2.303 0.879 -3.182 0.0 c -0.878 -0.878 -0.878 -2.303 0.0 -3.182 c 0.879 -0.878 2.303 -0.878 3.182 0.0 c 0.879 0.879 0.879 2.304 0.0 3.182 Z M 10.574 28.607 c -0.879 0.878 -2.303 0.878 -3.182 0.0 c -0.879 -0.879 -0.879 -2.303 0.0 -3.182 s 2.303 -0.879 3.182 0.0 c 0.879 0.878 0.879 2.303 0.0 3.182 Z m 0.004 -18.032 c 0.878 -0.879 0.878 -2.303 0.0 -3.182 c -0.88 -0.879 -2.304 -0.879 -3.182 0.0 c -0.88 0.879 -0.88 2.303 0.0 3.182 c 0.878 0.879 2.303 0.879 3.182 0.0 Z M 28.61 28.606 c 0.878 -0.878 0.878 -2.303 0.0 -3.182 c -0.879 -0.878 -2.303 -0.878 -3.182 0.0 c -0.879 0.88 -0.879 2.304 0.0 3.182 c 0.878 0.88 2.303 0.88 3.182 0.0 Z M 5.25 15.75 c 1.243 0.0 2.25 1.007 2.25 2.25 s -1.007 2.25 -2.25 2.25 S 3.0 19.243 3.0 18.0 s 1.007 -2.25 2.25 -2.25 Z m 25.5 0.0 c 1.243 0.0 2.25 1.007 2.25 2.25 s -1.007 2.25 -2.25 2.25 S 28.5 19.243 28.5 18.0 s 1.007 -2.25 2.25 -2.25 Z")
        )
    }.build()
}
