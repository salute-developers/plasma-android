package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.678 3.475 c -0.953 1.856 -1.32 3.963 -1.047 6.04 c 0.295 2.244 1.323 4.329 2.924 5.93 c 1.602 1.6 3.686 2.629 5.931 2.924 c 2.076 0.274 4.183 -0.094 6.039 -1.046 c -0.038 -0.085 -0.077 -0.165 -0.117 -0.239 c -0.34 -0.627 -0.766 -1.053 -1.336 -1.623 L 20.539 4.928 c -0.57 -0.57 -0.996 -0.996 -1.623 -1.336 c -0.074 -0.04 -0.154 -0.079 -0.238 -0.117 Z m 14.32 15.842 c 0.012 0.468 -0.054 0.83 -0.136 1.287 l -0.005 0.03 C 31.592 27.663 25.444 33.0 18.047 33.0 C 9.738 33.0 3.0 26.263 3.0 17.952 C 3.0 10.556 8.335 4.408 15.367 3.143 l 0.03 -0.005 C 15.851 3.056 16.215 2.99 16.683 3.0 c -0.978 2.107 -1.341 4.456 -1.036 6.774 c 0.353 2.682 1.58 5.172 3.493 7.084 c 1.913 1.912 4.403 3.14 7.084 3.493 c 2.318 0.305 4.667 -0.058 6.774 -1.035 Z")
        )
    }.build()
}
