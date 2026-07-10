package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Typography16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Typography16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.4 12.8 H 8.01 l -0.863 -2.464 H 3.17 L 2.319 12.8 H 1.0 L 4.427 3.0 h 1.498 L 9.4 12.8 Z M 3.637 8.964 h 3.031 L 5.146 4.582 l -1.51 4.382 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.213 5.8 c 0.449 0.0 0.846 0.045 1.19 0.136 c 0.351 0.08 0.646 0.216 0.884 0.405 c 0.238 0.189 0.414 0.441 0.528 0.757 C 14.94 7.404 15.0 7.782 15.0 8.232 v 4.46 h -1.241 v -1.175 c -0.168 0.378 -0.445 0.688 -0.832 0.931 c -0.388 0.234 -0.846 0.352 -1.374 0.352 c -0.66 0.0 -1.184 -0.18 -1.572 -0.54 c -0.387 -0.36 -0.58 -0.88 -0.58 -1.555 c 0.0 -0.378 0.06 -0.688 0.184 -0.932 c 0.132 -0.252 0.317 -0.45 0.555 -0.594 c 0.237 -0.153 0.524 -0.261 0.858 -0.325 c 0.343 -0.063 0.727 -0.094 1.15 -0.094 h 1.532 V 8.34 c 0.0 -0.521 -0.133 -0.877 -0.397 -1.067 c -0.255 -0.198 -0.612 -0.297 -1.07 -0.297 c -0.563 0.0 -1.035 0.112 -1.413 0.337 C 10.43 7.54 10.13 7.841 9.902 8.22 V 6.436 c 0.22 -0.172 0.524 -0.32 0.912 -0.447 c 0.387 -0.126 0.853 -0.19 1.399 -0.19 Z m 0.053 3.919 c -0.528 0.0 -0.916 0.063 -1.162 0.19 c -0.247 0.116 -0.37 0.346 -0.37 0.689 c 0.0 0.288 0.102 0.522 0.304 0.702 c 0.203 0.18 0.502 0.27 0.897 0.27 c 0.3 0.0 0.556 -0.04 0.767 -0.122 c 0.211 -0.08 0.388 -0.18 0.528 -0.297 c 0.141 -0.126 0.246 -0.256 0.317 -0.391 c 0.07 -0.144 0.115 -0.276 0.133 -0.393 V 9.72 h -1.414 Z")
        )
    }.build()
}
