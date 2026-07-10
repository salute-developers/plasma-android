package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ParkingFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ParkingFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.75 c -1.256 0.0 -2.275 1.019 -2.275 2.275 v 7.95 c 0.0 1.256 1.019 2.275 2.275 2.275 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -7.95 c 0.0 -1.256 -1.019 -2.275 -2.275 -2.275 h -7.95 Z M 6.09 4.896 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.208 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 9.021 h 2.104 c 1.14 0.0 2.063 -0.924 2.063 -2.063 c 0.0 -1.139 -0.923 -2.062 -2.063 -2.062 H 6.09 Z M 8.694 8.02 H 6.59 V 5.896 h 2.104 c 0.587 0.0 1.063 0.475 1.063 1.062 c 0.0 0.587 -0.476 1.063 -1.063 1.063 Z")
        )
    }.build()
}
