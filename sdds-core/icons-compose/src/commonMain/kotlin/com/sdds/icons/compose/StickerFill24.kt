package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.496 2.415 c -0.626 1.22 -0.868 2.602 -0.688 3.966 c 0.194 1.473 0.868 2.841 1.919 3.892 c 1.05 1.05 2.419 1.725 3.892 1.92 c 1.364 0.179 2.747 -0.063 3.966 -0.689 l -0.042 -0.08 c -0.226 -0.418 -0.509 -0.7 -0.888 -1.08 l -7.0 -7.0 c -0.378 -0.378 -0.661 -0.661 -1.078 -0.887 l -0.08 -0.042 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.937 13.0 c -0.003 0.268 -0.043 0.49 -0.092 0.762 l -0.003 0.02 C 21.0 18.454 16.915 22.0 12.0 22.0 C 6.477 22.0 2.0 17.523 2.0 12.0 c 0.0 -4.915 3.545 -9.0 8.218 -9.842 l 0.02 -0.003 c 0.272 -0.05 0.494 -0.09 0.762 -0.092 c -0.644 1.406 -0.883 2.97 -0.68 4.514 c 0.238 1.8 1.062 3.473 2.346 4.757 c 1.285 1.284 2.957 2.109 4.757 2.346 c 1.544 0.203 3.108 -0.035 4.514 -0.68 Z")
        )
    }.build()
}
