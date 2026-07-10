package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.909 5.333 l -0.144 0.025 C 9.786 6.434 5.25 11.665 5.25 17.953 c 0.0 7.067 5.73 12.797 12.797 12.797 c 6.288 0.0 11.519 -4.536 12.595 -10.515 l 0.025 -0.144 c -0.937 0.23 -1.917 0.353 -2.925 0.353 c -6.73 0.0 -12.187 -5.456 -12.187 -12.187 c 0.0 -1.007 0.123 -1.987 0.354 -2.924 Z m 2.0 0.254 c -0.23 0.85 -0.354 1.745 -0.354 2.67 c 0.0 5.627 4.561 10.187 10.187 10.187 c 0.925 0.0 1.82 -0.123 2.67 -0.353 c -0.174 -0.32 -0.376 -0.532 -1.022 -1.179 L 19.087 6.61 c -0.646 -0.646 -0.859 -0.848 -1.178 -1.023 Z m -2.471 -2.202 c 0.584 -0.105 1.0 -0.18 1.685 -0.104 c 0.117 0.013 0.238 0.034 0.353 0.059 c 0.438 0.092 0.993 0.276 1.375 0.483 c 0.607 0.328 1.017 0.739 1.586 1.309 c 0.022 0.02 0.043 0.042 0.065 0.064 l 10.302 10.302 l 0.064 0.064 c 0.57 0.57 0.98 0.98 1.309 1.587 c 0.207 0.382 0.39 0.937 0.483 1.375 c 0.025 0.115 0.046 0.235 0.059 0.353 c 0.076 0.684 0.0 1.1 -0.104 1.685 l -0.005 0.027 c -1.244 6.915 -7.29 12.16 -14.563 12.16 c -8.172 0.0 -14.797 -6.624 -14.797 -14.796 c 0.0 -7.273 5.246 -13.319 12.16 -14.563 l 0.028 -0.005 Z")
        )
    }.build()
}
