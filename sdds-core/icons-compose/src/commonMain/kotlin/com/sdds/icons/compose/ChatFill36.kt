package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.54 10.818 c 3.148 1.875 5.257 5.313 5.257 9.243 c 0.0 0.997 -0.136 1.963 -0.39 2.881 c -0.261 0.94 -0.353 1.815 -0.149 2.591 l 0.766 2.908 c 0.414 1.574 -1.022 3.01 -2.596 2.596 l -2.91 -0.764 c -0.776 -0.205 -1.65 -0.113 -2.589 0.148 c -0.918 0.255 -1.885 0.39 -2.882 0.39 c -2.408 0.0 -4.63 -0.791 -6.423 -2.128 c 1.11 -0.027 2.187 -0.193 3.213 -0.48 c 0.994 0.392 2.077 0.608 3.21 0.608 c 0.814 0.0 1.601 -0.11 2.347 -0.318 c 1.095 -0.304 2.368 -0.488 3.635 -0.155 l 2.908 0.765 c 0.092 0.025 0.177 -0.06 0.153 -0.153 l -0.765 -2.908 c -0.334 -1.266 -0.15 -2.54 0.155 -3.635 c 0.207 -0.745 0.317 -1.532 0.317 -2.346 c 0.0 -2.369 -0.941 -4.518 -2.47 -6.093 c -0.133 -1.097 -0.401 -2.153 -0.788 -3.15 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.5 5.0 c 5.937 0.0 10.75 4.813 10.75 10.75 S 20.437 26.5 14.5 26.5 c -0.996 0.0 -1.963 -0.136 -2.882 -0.39 c -0.94 -0.261 -1.813 -0.353 -2.59 -0.15 L 6.12 26.728 c -1.573 0.413 -3.01 -1.023 -2.595 -2.596 l 0.765 -2.91 c 0.205 -0.776 0.113 -1.65 -0.148 -2.59 c -0.255 -0.917 -0.39 -1.884 -0.39 -2.881 C 3.75 9.813 8.562 5.0 14.5 5.0 Z")
        )
    }.build()
}
