package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.114 3.678 c 0.328 -0.788 1.444 -0.788 1.772 0.0 l 2.077 4.994 l 5.391 0.432 c 0.851 0.068 1.196 1.13 0.548 1.686 l -4.107 3.518 l 1.254 5.26 c 0.199 0.831 -0.705 1.487 -1.434 1.042 L 12.0 17.791 l -4.615 2.82 c -0.729 0.444 -1.632 -0.212 -1.434 -1.043 l 1.254 -5.26 l -4.107 -3.518 C 2.45 10.234 2.795 9.172 3.646 9.104 l 5.39 -0.432 l 2.078 -4.994 Z M 12.0 5.453 l -1.705 4.1 c -0.138 0.332 -0.45 0.559 -0.81 0.587 L 5.06 10.495 l 3.372 2.888 c 0.273 0.235 0.393 0.602 0.309 0.952 l -1.03 4.319 l 3.789 -2.315 c 0.307 -0.187 0.693 -0.187 1.0 0.0 l 3.79 2.315 l -1.031 -4.319 c -0.084 -0.35 0.036 -0.718 0.31 -0.952 l 3.37 -2.888 l -4.424 -0.355 c -0.36 -0.028 -0.672 -0.255 -0.81 -0.588 L 12.0 5.453 Z")
        )
    }.build()
}
