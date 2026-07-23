package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.175 4.82 c -0.177 0.918 -0.664 1.756 -1.395 2.359 L 9.73 8.878 c -0.203 0.167 -0.32 0.417 -0.32 0.68 v 3.726 c 0.0 0.235 -0.155 0.442 -0.38 0.507 L 7.23 14.479 c -0.158 0.046 -0.328 0.014 -0.46 -0.085 c -0.13 -0.1 -0.207 -0.256 -0.207 -0.421 v -2.54 l 6.613 -6.614 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.727 1.5 c 0.256 0.0 0.468 0.186 0.514 0.43 l 0.285 -0.284 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 L 2.353 14.232 c -0.194 0.196 -0.51 0.196 -0.706 0.0 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 l 4.629 -4.63 l -0.033 -0.03 L 4.22 7.178 C 3.29 6.41 2.751 5.263 2.751 4.05 V 2.027 c 0.0 -0.29 0.234 -0.527 0.523 -0.527 h 9.453 Z M 8.509 3.785 c -0.29 0.0 -0.525 0.236 -0.525 0.526 c 0.0 0.29 0.235 0.525 0.525 0.525 h 1.827 l 1.042 -1.043 c -0.026 -0.004 -0.052 -0.008 -0.079 -0.008 H 8.51 Z")
        )
    }.build()
}
