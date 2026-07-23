package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvPlayFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvPlayFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 9.0 c 0.0 -1.05 0.0 -1.575 0.204 -1.976 c 0.18 -0.353 0.467 -0.64 0.82 -0.82 C 4.424 6.0 4.95 6.0 6.0 6.0 h 24.0 c 1.05 0.0 1.575 0.0 1.976 0.204 c 0.353 0.18 0.64 0.467 0.82 0.82 C 33.0 7.424 33.0 7.95 33.0 9.0 v 13.71 c 0.0 1.05 0.0 1.575 -0.204 1.976 c -0.18 0.353 -0.467 0.64 -0.82 0.82 c -0.4 0.204 -0.926 0.204 -1.976 0.204 H 6.0 c -1.05 0.0 -1.575 0.0 -1.976 -0.205 c -0.353 -0.18 -0.64 -0.466 -0.82 -0.82 C 3.0 24.286 3.0 23.76 3.0 22.71 V 9.0 Z m 3.0 18.5 h 24.0 v 2.0 H 6.0 v -2.0 Z m 16.875 -11.35 c 0.5 -0.29 0.5 -1.01 0.0 -1.3 l -6.75 -3.897 c -0.5 -0.288 -1.125 0.072 -1.125 0.65 v 7.794 c 0.0 0.578 0.625 0.938 1.125 0.65 l 6.75 -3.898 Z")
        )
    }.build()
}
