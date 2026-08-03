package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 5.01 c 1.706 -0.985 3.59 -1.625 5.542 -1.882 c 1.953 -0.257 3.938 -0.127 5.84 0.383 l -1.681 6.277 C 19.498 9.6 18.76 9.5 18.0 9.5 c -1.549 0.0 -3.0 0.414 -4.25 1.138 L 10.5 5.01 Z M 18.0 11.5 c 0.582 0.0 1.146 0.076 1.683 0.22 c 0.555 0.148 1.081 0.368 1.567 0.65 c 1.473 0.852 2.58 2.265 3.03 3.947 c 0.143 0.537 0.22 1.101 0.22 1.683 c 0.0 3.59 -2.91 6.5 -6.5 6.5 c -1.184 0.0 -2.294 -0.317 -3.25 -0.87 c -0.494 -0.285 -0.946 -0.633 -1.346 -1.034 C 12.227 21.42 11.5 19.795 11.5 18.0 s 0.727 -3.42 1.904 -4.596 c 0.4 -0.4 0.852 -0.749 1.345 -1.034 c 0.957 -0.553 2.067 -0.87 3.251 -0.87 Z m 4.25 -0.862 c 1.927 1.114 3.375 2.962 3.962 5.162 l 6.277 -1.682 c -1.03 -3.843 -3.544 -7.12 -6.989 -9.108 l -3.25 5.628 Z M 18.0 26.5 c 4.694 0.0 8.5 -3.806 8.5 -8.5 H 33.0 c 0.0 2.633 -0.693 5.22 -2.01 7.5 c -1.316 2.28 -3.21 4.174 -5.49 5.49 C 23.22 32.307 20.633 33.0 18.0 33.0 s -5.22 -0.693 -7.5 -2.01 l 3.25 -5.628 C 15.0 26.086 16.45 26.5 18.0 26.5 Z M 9.5 18.0 c 0.0 2.347 0.951 4.472 2.49 6.01 l -4.597 4.597 c -1.392 -1.393 -2.497 -3.047 -3.251 -4.867 C 3.388 21.92 3.0 19.97 3.0 18.0 c 0.0 -1.97 0.388 -3.92 1.142 -5.74 C 4.896 10.44 6.0 8.786 7.393 7.393 l 4.597 4.597 C 10.45 13.528 9.5 15.653 9.5 18.0 Z")
        )
    }.build()
}
