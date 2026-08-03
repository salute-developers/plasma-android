package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OdnoklassnikiFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OdnoklassnikiFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.084 19.716 c 0.633 -1.004 1.962 -1.305 2.968 -0.675 c 3.03 1.893 6.878 1.894 9.909 0.0 c 1.0 -0.615 2.308 -0.317 2.944 0.668 c 0.647 1.001 0.358 2.335 -0.644 2.981 c -1.316 0.827 -2.761 1.427 -4.276 1.77 l 4.114 4.116 c 0.84 0.841 0.84 2.203 0.0 3.044 c -0.842 0.84 -2.205 0.84 -3.047 0.0 l -4.044 -4.042 l -4.042 4.042 c -0.833 0.786 -2.134 0.786 -2.967 0.0 c -0.867 -0.819 -0.905 -2.185 -0.085 -3.05 l 4.115 -4.112 c -1.513 -0.345 -2.958 -0.943 -4.272 -1.768 l -0.003 -0.003 c -1.007 -0.635 -1.306 -1.966 -0.67 -2.971 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.005 3.75 c 4.064 -0.001 7.36 3.29 7.362 7.352 c 0.002 4.06 -3.292 7.356 -7.357 7.357 c -4.063 -0.003 -7.357 -3.292 -7.363 -7.352 c 0.0 -4.06 3.294 -7.356 7.358 -7.357 Z m 0.005 4.312 c -1.683 0.001 -3.047 1.364 -3.05 3.045 c 0.001 1.683 1.366 3.047 3.05 3.047 c 1.684 0.0 3.05 -1.363 3.05 -3.046 c 0.0 -1.682 -1.366 -3.046 -3.05 -3.046 Z")
        )
    }.build()
}
