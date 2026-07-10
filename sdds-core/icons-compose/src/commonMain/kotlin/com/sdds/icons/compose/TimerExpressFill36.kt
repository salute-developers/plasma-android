package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.875 4.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 8.25 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -8.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z M 18.0 33.0 c 7.042 0.0 12.75 -5.785 12.75 -12.92 c 0.0 -3.367 -1.27 -6.433 -3.353 -8.733 l 1.065 -1.078 c 0.388 -0.393 0.384 -1.026 -0.01 -1.414 c -0.392 -0.388 -1.026 -0.384 -1.414 0.009 l -1.095 1.109 C 23.764 8.213 21.003 7.16 18.0 7.16 c -7.042 0.0 -12.75 5.784 -12.75 12.92 C 5.25 27.215 10.958 33.0 18.0 33.0 Z m 2.596 -19.77 c 0.084 -0.256 -0.02 -0.536 -0.25 -0.673 c -0.229 -0.136 -0.52 -0.09 -0.7 0.109 l -7.5 8.36 c -0.15 0.167 -0.188 0.407 -0.098 0.614 c 0.09 0.206 0.292 0.34 0.514 0.34 h 4.47 l -1.628 4.949 c -0.084 0.256 0.02 0.536 0.25 0.672 c 0.229 0.136 0.52 0.09 0.7 -0.108 l 7.5 -8.36 c 0.15 -0.167 0.188 -0.408 0.098 -0.614 c -0.09 -0.207 -0.292 -0.34 -0.515 -0.34 h -4.47 l 1.63 -4.95 Z")
        )
    }.build()
}
