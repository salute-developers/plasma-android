package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProductExportOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProductExportOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.68 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.07 1.679 -3.75 3.75 -3.75 Z m 0.589 1.798 c -0.137 -0.137 -0.359 -0.136 -0.495 0.0 c -0.136 0.137 -0.136 0.358 0.0 0.494 L 13.2 11.65 H 9.955 c -0.193 0.0 -0.35 0.156 -0.35 0.35 c 0.0 0.192 0.157 0.35 0.35 0.35 h 3.246 l -1.107 1.106 c -0.137 0.137 -0.137 0.359 0.0 0.495 c 0.136 0.137 0.358 0.137 0.495 0.0 l 1.705 -1.704 c 0.136 -0.136 0.136 -0.358 0.0 -0.495 l -1.705 -1.704 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.519 1.13 c 0.307 -0.173 0.684 -0.173 0.99 0.0 l 5.739 3.234 c 0.207 0.117 0.286 0.344 0.238 0.544 c 0.003 0.022 0.007 0.044 0.007 0.067 v 3.28 c -0.308 -0.207 -0.643 -0.376 -0.999 -0.5 V 5.646 l -4.98 2.806 v 0.701 c -0.568 0.695 -0.93 1.563 -1.0 2.513 V 8.453 L 5.516 7.326 V 9.23 c 0.0 0.272 -0.224 0.493 -0.5 0.493 c -0.275 0.0 -0.5 -0.221 -0.5 -0.493 V 6.764 L 2.5 5.627 v 5.423 l 5.015 2.736 v -1.453 c 0.07 0.963 0.442 1.842 1.024 2.542 c -0.363 0.173 -0.79 0.166 -1.146 -0.028 l -5.377 -2.935 C 1.697 11.74 1.5 11.408 1.5 11.05 V 4.953 c 0.0 -0.054 0.012 -0.107 0.028 -0.156 C 1.527 4.63 1.61 4.46 1.78 4.364 L 7.52 1.13 Z m 3.387 2.485 c -0.037 0.048 -0.083 0.09 -0.137 0.122 L 6.082 6.511 l 1.796 1.013 c 0.043 -0.012 0.089 -0.02 0.136 -0.02 c 0.047 0.0 0.092 0.008 0.135 0.02 l 4.845 -2.73 l -2.088 -1.179 Z m -7.87 1.178 l 2.083 1.174 l 0.088 -0.087 l 4.74 -2.806 l -1.933 -1.088 l -4.979 2.807 Z")
        )
    }.build()
}
