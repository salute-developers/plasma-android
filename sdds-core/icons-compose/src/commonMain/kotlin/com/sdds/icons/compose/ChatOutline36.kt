package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.837 28.203 c -1.026 0.287 -2.102 0.452 -3.212 0.48 c 1.792 1.337 4.015 2.128 6.423 2.128 c 0.996 0.0 1.963 -0.136 2.881 -0.39 c 0.94 -0.261 1.814 -0.353 2.59 -0.149 l 2.909 0.766 c 1.574 0.414 3.01 -1.023 2.596 -2.596 l -0.766 -2.91 c -0.204 -0.776 -0.112 -1.65 0.149 -2.59 c 0.255 -0.918 0.39 -1.884 0.39 -2.88 c 0.0 -3.931 -2.109 -7.37 -5.258 -9.244 c 0.387 0.997 0.655 2.052 0.788 3.15 c 1.529 1.575 2.47 3.724 2.47 6.093 c 0.0 0.814 -0.11 1.601 -0.317 2.347 c -0.305 1.095 -0.49 2.367 -0.156 3.634 l 0.766 2.909 c 0.024 0.092 -0.06 0.177 -0.153 0.152 l -2.909 -0.765 c -1.266 -0.333 -2.538 -0.149 -3.634 0.155 c -0.746 0.207 -1.532 0.318 -2.346 0.318 c -1.134 0.0 -2.217 -0.215 -3.211 -0.608 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.5 7.0 c -4.832 0.0 -8.75 3.918 -8.75 8.75 c 0.0 0.814 0.111 1.6 0.318 2.346 c 0.304 1.096 0.489 2.368 0.155 3.634 l -0.765 2.91 c -0.024 0.092 0.06 0.177 0.153 0.152 l 2.909 -0.765 c 1.266 -0.334 2.538 -0.15 3.634 0.155 c 0.745 0.207 1.532 0.318 2.346 0.318 c 4.833 0.0 8.75 -3.918 8.75 -8.75 S 19.333 7.0 14.5 7.0 Z M 3.75 15.75 C 3.75 9.813 8.563 5.0 14.5 5.0 s 10.75 4.813 10.75 10.75 S 20.437 26.5 14.5 26.5 c -0.997 0.0 -1.963 -0.136 -2.881 -0.39 c -0.94 -0.262 -1.814 -0.354 -2.59 -0.15 l -2.91 0.766 c -1.573 0.414 -3.01 -1.022 -2.595 -2.596 l 0.765 -2.908 c 0.205 -0.777 0.113 -1.65 -0.148 -2.59 c -0.255 -0.919 -0.39 -1.885 -0.39 -2.882 Z")
        )
    }.build()
}
