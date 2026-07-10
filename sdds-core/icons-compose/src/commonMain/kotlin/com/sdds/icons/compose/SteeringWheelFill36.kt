package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.125 30.332 c 3.862 -1.291 6.916 -4.345 8.207 -8.207 H 25.5 c -1.864 0.0 -3.375 1.511 -3.375 3.375 v 4.832 Z m -8.25 -4.832 v 4.832 c -3.862 -1.291 -6.916 -4.345 -8.207 -8.207 H 10.5 c 1.864 0.0 3.375 1.511 3.375 3.375 Z m 16.738 -10.662 c -2.17 -0.184 -3.65 -1.038 -5.296 -1.999 l -0.035 -0.02 c -1.88 -1.098 -3.977 -2.322 -7.282 -2.322 c -3.216 0.0 -5.114 1.102 -6.858 2.114 l -0.175 0.102 c -1.533 0.888 -3.026 1.713 -5.516 1.881 C 6.947 9.066 11.999 5.0 18.0 5.0 c 6.09 0.0 11.2 4.187 12.613 9.838 Z M 33.0 18.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 Z m -15.0 3.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 Z")
        )
    }.build()
}
