package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertCircFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertCircFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 18.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 Z m -22.546 4.08 c 0.44 -0.44 1.152 -0.44 1.591 0.0 l 1.08 1.079 V 10.125 C 13.125 9.504 13.629 9.0 14.25 9.0 s 1.125 0.504 1.125 1.125 v 15.75 c 0.0 0.455 -0.274 0.865 -0.694 1.04 c -0.42 0.174 -0.905 0.077 -1.226 -0.244 l -3.0 -3.0 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 Z m 15.091 -8.16 c -0.439 0.44 -1.151 0.44 -1.59 0.0 l -1.08 -1.079 v 13.034 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -15.75 c 0.0 -0.455 0.274 -0.865 0.695 -1.04 c 0.42 -0.173 0.904 -0.077 1.226 0.245 l 3.0 3.0 c 0.439 0.439 0.439 1.151 0.0 1.59 Z")
        )
    }.build()
}
