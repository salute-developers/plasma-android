package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailTrayFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailTrayFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.723 6.0 H 11.277 c -1.22 0.0 -2.203 0.0 -3.0 0.065 c -0.82 0.067 -1.54 0.209 -2.206 0.548 c -1.058 0.54 -1.919 1.4 -2.458 2.458 c -0.34 0.667 -0.481 1.387 -0.548 2.207 C 3.0 12.074 3.0 13.058 3.0 14.277 V 20.0 h 8.979 c 0.906 0.0 1.65 0.49 2.122 1.077 c 0.249 0.31 0.536 0.592 0.855 0.837 c 0.873 0.67 1.943 1.033 3.044 1.033 c 1.1 0.0 2.17 -0.363 3.044 -1.033 c 0.32 -0.245 0.606 -0.527 0.855 -0.837 C 22.37 20.49 23.115 20.0 24.02 20.0 H 33.0 v -5.723 c 0.0 -1.22 0.0 -2.203 -0.065 -3.0 c -0.067 -0.82 -0.209 -1.54 -0.548 -2.206 c -0.54 -1.058 -1.4 -1.919 -2.458 -2.458 c -0.667 -0.34 -1.387 -0.481 -2.207 -0.548 C 26.926 6.0 25.942 6.0 24.723 6.0 Z M 33.0 22.0 h -8.979 c -0.155 0.0 -0.37 0.09 -0.563 0.33 c -0.348 0.434 -0.75 0.827 -1.197 1.17 c -1.222 0.939 -2.72 1.447 -4.261 1.447 s -3.039 -0.508 -4.261 -1.446 c -0.448 -0.344 -0.85 -0.737 -1.198 -1.172 C 12.35 22.09 12.134 22.0 11.98 22.0 H 3.0 c 0.0 1.092 0.005 1.987 0.065 2.722 c 0.067 0.82 0.209 1.54 0.548 2.207 c 0.54 1.058 1.4 1.919 2.458 2.458 c 0.667 0.34 1.387 0.481 2.207 0.548 C 9.074 30.0 10.058 30.0 11.277 30.0 h 13.446 c 1.22 0.0 2.203 0.0 3.0 -0.065 c 0.82 -0.067 1.54 -0.209 2.206 -0.548 c 1.058 -0.54 1.919 -1.4 2.458 -2.458 c 0.34 -0.667 0.481 -1.387 0.548 -2.207 C 32.995 23.987 33.0 23.092 33.0 22.0 Z M 7.625 16.125 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 18.75 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 8.625 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 1.0 -5.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 18.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 8.625 Z")
        )
    }.build()
}
