package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.75 4.639 C 9.042 3.893 10.508 3.5 12.0 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 12.414 2.0 12.0 2.0 c -1.755 0.0 -3.48 0.462 -5.0 1.34 c -0.359 0.207 -0.482 0.666 -0.275 1.024 C 6.933 4.723 7.391 4.846 7.75 4.64 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.364 6.725 C 4.723 6.933 4.846 7.391 4.64 7.75 C 3.893 9.042 3.5 10.508 3.5 12.0 s 0.393 2.958 1.139 4.25 c 0.207 0.359 0.084 0.817 -0.275 1.024 C 4.006 17.482 3.547 17.36 3.34 17.0 C 2.462 15.48 2.0 13.755 2.0 12.0 s 0.462 -3.48 1.34 -5.0 c 0.207 -0.359 0.666 -0.482 1.024 -0.275 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.25 11.25 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 1.755 -0.462 3.48 -1.34 5.0 c -0.877 1.52 -2.14 2.783 -3.66 3.66 c -1.52 0.878 -3.245 1.34 -5.0 1.34 s -3.48 -0.462 -5.0 -1.34 c -0.359 -0.207 -0.482 -0.666 -0.275 -1.024 c 0.208 -0.359 0.666 -0.482 1.025 -0.275 C 9.042 20.107 10.508 20.5 12.0 20.5 s 2.958 -0.393 4.25 -1.139 c 1.292 -0.746 2.365 -1.819 3.111 -3.111 c 0.746 -1.292 1.139 -2.758 1.139 -4.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.976 3.614 C 16.183 3.256 16.64 3.133 17.0 3.34 c 1.52 0.877 2.783 2.14 3.66 3.66 c 0.207 0.359 0.084 0.817 -0.274 1.025 c -0.359 0.207 -0.818 0.084 -1.025 -0.275 c -0.746 -1.292 -1.819 -2.365 -3.111 -3.111 c -0.359 -0.207 -0.482 -0.666 -0.274 -1.025 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 6.25 c -3.176 0.0 -5.75 2.574 -5.75 5.75 s 2.574 5.75 5.75 5.75 s 5.75 -2.574 5.75 -5.75 S 15.176 6.25 12.0 6.25 Z M 7.75 12.0 c 0.0 -2.347 1.903 -4.25 4.25 -4.25 s 4.25 1.903 4.25 4.25 s -1.903 4.25 -4.25 4.25 S 7.75 14.347 7.75 12.0 Z")
        )
    }.build()
}
