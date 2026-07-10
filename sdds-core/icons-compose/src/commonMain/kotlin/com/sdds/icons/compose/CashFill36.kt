package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.75 25.5 v -12.0 c 0.0 -1.05 0.0 -1.574 -0.204 -1.976 c -0.18 -0.352 -0.467 -0.64 -0.82 -0.819 c -0.291 -0.149 -0.649 -0.189 -1.226 -0.2 v 10.562 c 0.0 0.467 0.0 0.942 -0.033 1.348 c -0.037 0.452 -0.126 1.012 -0.417 1.583 c -0.395 0.776 -1.026 1.407 -1.802 1.802 c -0.57 0.291 -1.132 0.38 -1.583 0.417 c -0.406 0.033 -0.881 0.033 -1.348 0.033 H 6.752 c 0.005 0.504 0.028 0.808 0.128 1.062 c 0.19 0.485 0.574 0.868 1.059 1.059 c 0.33 0.13 0.747 0.13 1.58 0.13 H 30.75 c 1.05 0.0 1.575 0.0 1.976 -0.205 c 0.353 -0.18 0.64 -0.466 0.82 -0.819 c 0.204 -0.401 0.204 -0.926 0.204 -1.976 Z M 6.947 24.0 H 26.25 c 1.05 0.0 1.575 0.0 1.976 -0.204 c 0.353 -0.18 0.64 -0.467 0.82 -0.82 c 0.025 -0.05 0.047 -0.102 0.067 -0.157 c 0.137 -0.383 0.137 -0.9 0.137 -1.819 V 9.0 c 0.0 -1.05 0.0 -1.575 -0.204 -1.976 c -0.18 -0.353 -0.467 -0.64 -0.82 -0.82 C 27.826 6.0 27.3 6.0 26.25 6.0 h -21.0 C 4.2 6.0 3.675 6.0 3.274 6.204 c -0.353 0.18 -0.64 0.467 -0.82 0.82 C 2.25 7.424 2.25 7.95 2.25 9.0 v 12.0 c 0.0 1.05 0.0 1.575 0.204 1.976 c 0.18 0.353 0.467 0.64 0.82 0.82 C 3.674 24.0 4.2 24.0 5.25 24.0 h 1.697 Z m 8.803 -12.125 c -1.726 0.0 -3.125 1.4 -3.125 3.125 c 0.0 1.726 1.4 3.125 3.125 3.125 c 1.726 0.0 3.125 -1.4 3.125 -3.125 c 0.0 -1.726 -1.4 -3.125 -3.125 -3.125 Z M 10.625 15.0 c 0.0 -2.83 2.294 -5.125 5.125 -5.125 c 2.83 0.0 5.125 2.294 5.125 5.125 c 0.0 2.83 -2.294 5.125 -5.125 5.125 c -2.83 0.0 -5.125 -2.294 -5.125 -5.125 Z")
        )
    }.build()
}
