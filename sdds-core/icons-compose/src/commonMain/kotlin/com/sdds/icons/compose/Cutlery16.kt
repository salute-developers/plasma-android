package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Cutlery16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Cutlery16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.679 1.75 c 0.296 0.0 0.536 0.233 0.536 0.52 v 4.835 c 0.078 -0.002 0.147 -0.005 0.21 -0.01 c 0.171 -0.01 0.255 -0.03 0.31 -0.053 c 0.219 -0.088 0.393 -0.257 0.483 -0.47 c 0.023 -0.054 0.044 -0.135 0.056 -0.302 c 0.012 -0.172 0.012 -0.394 0.012 -0.725 V 2.271 c 0.0 -0.288 0.24 -0.521 0.536 -0.521 c 0.296 0.0 0.536 0.233 0.536 0.52 v 3.293 c 0.0 0.309 0.0 0.566 -0.015 0.778 c -0.015 0.22 -0.049 0.428 -0.135 0.63 C 8.01 7.439 7.627 7.81 7.145 8.004 C 6.938 8.088 6.724 8.12 6.497 8.135 c -0.086 0.006 -0.18 0.01 -0.282 0.012 v 5.582 c 0.0 0.288 -0.24 0.52 -0.536 0.52 c -0.296 0.0 -0.536 -0.232 -0.536 -0.52 V 8.147 C 5.041 8.143 4.947 8.14 4.861 8.134 C 4.634 8.12 4.42 8.088 4.213 8.005 C 3.73 7.81 3.349 7.438 3.15 6.97 C 3.064 6.769 3.03 6.56 3.015 6.34 C 3.0 6.129 3.0 5.87 3.0 5.563 V 2.271 C 3.0 1.983 3.24 1.75 3.536 1.75 c 0.296 0.0 0.536 0.233 0.536 0.52 v 3.275 c 0.0 0.331 0.0 0.553 0.012 0.725 c 0.012 0.167 0.033 0.249 0.056 0.302 c 0.09 0.213 0.264 0.382 0.483 0.47 c 0.055 0.022 0.139 0.043 0.31 0.054 c 0.063 0.004 0.132 0.007 0.21 0.009 V 2.27 c 0.0 -0.288 0.24 -0.521 0.536 -0.521 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.464 1.75 H 12.11 c -1.085 0.0 -1.965 0.855 -1.965 1.91 V 9.2 c 0.0 0.997 0.785 1.814 1.783 1.903 v 2.626 c 0.0 0.288 0.24 0.521 0.536 0.521 c 0.296 0.0 0.536 -0.233 0.536 -0.52 V 2.27 c 0.0 -0.138 -0.056 -0.27 -0.157 -0.368 c -0.1 -0.098 -0.237 -0.153 -0.379 -0.153 Z")
        )
    }.build()
}
