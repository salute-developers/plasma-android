package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.204 7.024 C 3.0 7.424 3.0 7.95 3.0 9.0 v 13.71 c 0.0 1.05 0.0 1.575 0.204 1.976 c 0.18 0.353 0.467 0.64 0.82 0.82 C 4.424 25.71 4.95 25.71 6.0 25.71 h 24.0 c 1.05 0.0 1.575 0.0 1.976 -0.205 c 0.353 -0.18 0.64 -0.466 0.82 -0.82 C 33.0 24.286 33.0 23.76 33.0 22.71 V 9.0 c 0.0 -1.05 0.0 -1.575 -0.204 -1.976 c -0.18 -0.353 -0.467 -0.64 -0.82 -0.82 C 31.576 6.0 31.05 6.0 30.0 6.0 H 6.0 C 4.95 6.0 4.425 6.0 4.024 6.204 c -0.353 0.18 -0.64 0.467 -0.82 0.82 Z M 30.0 27.5 H 6.0 v 2.0 h 24.0 v -2.0 Z")
        )
    }.build()
}
