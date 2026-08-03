package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.525 c -1.453 0.0 -2.63 1.178 -2.63 2.63 v 4.041 c 0.0 1.453 1.177 2.63 2.63 2.63 c 1.452 0.0 2.63 -1.177 2.63 -2.63 v -4.04 c 0.0 -1.453 -1.178 -2.63 -2.63 -2.63 Z m -1.63 2.63 c 0.0 -0.9 0.73 -1.63 1.63 -1.63 c 0.9 0.0 1.63 0.73 1.63 1.63 v 4.041 c 0.0 0.9 -0.73 1.63 -1.63 1.63 c -0.9 0.0 -1.63 -0.73 -1.63 -1.63 v -4.04 Z m 6.35 4.704 c 0.036 -0.274 -0.156 -0.526 -0.43 -0.563 c -0.273 -0.036 -0.525 0.155 -0.562 0.429 c -0.118 0.875 -0.559 1.68 -1.244 2.266 C 9.8 11.576 8.916 11.9 8.0 11.9 c -0.916 0.0 -1.8 -0.325 -2.485 -0.91 C 4.83 10.405 4.39 9.6 4.271 8.725 C 4.234 8.451 3.982 8.26 3.708 8.297 C 3.435 8.332 3.243 8.585 3.28 8.858 c 0.152 1.122 0.717 2.15 1.586 2.892 c 0.742 0.634 1.663 1.024 2.634 1.124 v 1.6 c 0.0 0.277 0.223 0.5 0.5 0.5 c 0.276 0.0 0.5 -0.223 0.5 -0.5 v -1.6 c 0.97 -0.1 1.891 -0.49 2.634 -1.124 c 0.869 -0.743 1.434 -1.77 1.585 -2.892 Z")
        )
    }.build()
}
