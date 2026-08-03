package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SafeDiagramFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SafeDiagramFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.96 2.051 C 1.75 2.463 1.75 3.001 1.75 4.08 v 6.463 c 0.0 1.078 0.0 1.617 0.21 2.029 c 0.184 0.362 0.479 0.656 0.841 0.84 c 0.108 0.056 0.226 0.097 0.36 0.127 v 0.96 c 0.0 0.276 0.223 0.5 0.5 0.5 c 0.275 0.0 0.5 -0.224 0.5 -0.5 v -0.88 c 0.197 0.004 0.418 0.004 0.669 0.004 h 6.34 c 0.252 0.0 0.474 0.0 0.672 -0.003 v 0.879 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.96 c 0.133 -0.03 0.25 -0.071 0.357 -0.126 c 0.362 -0.185 0.657 -0.48 0.841 -0.841 c 0.21 -0.412 0.21 -0.951 0.21 -2.03 V 4.08 c 0.0 -1.078 0.0 -1.617 -0.21 -2.029 C 13.856 1.69 13.561 1.394 13.2 1.21 C 12.787 1.0 12.249 1.0 11.17 1.0 H 4.83 C 3.752 1.0 3.213 1.0 2.801 1.21 C 2.44 1.394 2.144 1.689 1.96 2.05 Z m 9.867 4.21 c 0.194 -0.196 0.193 -0.513 -0.003 -0.707 c -0.197 -0.194 -0.513 -0.193 -0.707 0.003 L 8.694 8.004 L 6.966 6.259 C 6.872 6.164 6.744 6.11 6.611 6.11 c -0.134 0.0 -0.262 0.054 -0.356 0.149 L 4.172 8.362 C 3.978 8.56 3.98 8.875 4.176 9.07 c 0.196 0.195 0.512 0.193 0.707 -0.003 L 6.61 7.321 l 1.728 1.745 C 8.433 9.161 8.56 9.214 8.694 9.214 c 0.133 0.0 0.261 -0.053 0.355 -0.148 l 2.778 -2.805 Z")
        )
    }.build()
}
