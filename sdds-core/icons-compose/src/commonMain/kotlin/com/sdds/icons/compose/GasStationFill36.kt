package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GasStationFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GasStationFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.25 3.0 C 8.558 3.0 6.375 5.183 6.375 7.875 V 31.0 H 6.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 20.25 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -0.375 v -3.09 c 0.56 0.296 1.198 0.465 1.875 0.465 c 2.21 0.0 4.0 -1.79 4.0 -4.0 v -6.516 c 0.0 -1.251 -0.192 -2.495 -0.569 -3.689 L 29.454 8.7 c -0.167 -0.527 -0.729 -0.819 -1.255 -0.653 c -0.527 0.167 -0.819 0.728 -0.653 1.255 l 1.728 5.472 c 0.316 0.998 0.476 2.039 0.476 3.086 v 6.516 c 0.0 1.105 -0.895 2.0 -2.0 2.0 c -0.86 0.0 -1.592 -0.542 -1.875 -1.302 V 7.875 C 25.875 5.183 23.692 3.0 21.0 3.0 h -9.75 Z m 0.58 7.774 c -0.205 0.4 -0.205 0.926 -0.205 1.976 v 1.5 c 0.0 1.05 0.0 1.575 0.204 1.976 c 0.18 0.353 0.467 0.64 0.82 0.82 c 0.4 0.204 0.926 0.204 1.976 0.204 h 3.0 c 1.05 0.0 1.575 0.0 1.976 -0.204 c 0.353 -0.18 0.64 -0.467 0.82 -0.82 c 0.204 -0.4 0.204 -0.926 0.204 -1.976 v -1.5 c 0.0 -1.05 0.0 -1.575 -0.204 -1.976 c -0.18 -0.353 -0.467 -0.64 -0.82 -0.82 c -0.4 -0.204 -0.926 -0.204 -1.976 -0.204 h -3.0 c -1.05 0.0 -1.575 0.0 -1.976 0.204 c -0.353 0.18 -0.64 0.467 -0.82 0.82 Z")
        )
    }.build()
}
