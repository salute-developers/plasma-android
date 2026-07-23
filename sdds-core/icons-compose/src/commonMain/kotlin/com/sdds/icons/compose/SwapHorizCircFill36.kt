package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHorizCircFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHorizCircFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -4.08 -22.546 c 0.44 0.44 0.44 1.152 0.0 1.591 l -1.079 1.08 h 13.034 c 0.621 0.0 1.125 0.504 1.125 1.125 s -0.504 1.125 -1.125 1.125 h -15.75 c -0.455 0.0 -0.865 -0.274 -1.04 -0.694 c -0.174 -0.42 -0.077 -0.905 0.244 -1.226 l 3.0 -3.0 c 0.44 -0.44 1.152 -0.44 1.591 0.0 Z m 8.16 15.091 c -0.44 -0.439 -0.44 -1.151 0.0 -1.59 l 1.079 -1.08 H 10.125 C 9.504 22.875 9.0 22.371 9.0 21.75 s 0.504 -1.125 1.125 -1.125 h 15.75 c 0.455 0.0 0.865 0.274 1.04 0.695 c 0.174 0.42 0.077 0.904 -0.244 1.226 l -3.0 3.0 c -0.44 0.439 -1.152 0.439 -1.591 0.0 Z")
        )
    }.build()
}
