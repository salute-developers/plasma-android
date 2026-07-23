package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerSquareOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerSquareOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 7.719 v 6.531 c 0.0 0.199 -0.079 0.39 -0.22 0.53 l -6.0 6.0 C 14.64 20.921 14.45 21.0 14.25 21.0 H 7.719 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 3.0 17.506 3.0 16.955 3.0 16.281 V 7.72 c 0.0 -0.674 0.0 -1.225 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 6.494 3.0 7.045 3.0 7.719 3.0 h 8.562 c 0.674 0.0 1.225 0.0 1.672 0.037 c 0.463 0.037 0.882 0.118 1.273 0.317 c 0.611 0.312 1.108 0.809 1.42 1.42 c 0.199 0.391 0.28 0.81 0.317 1.273 C 21.0 6.495 21.0 7.045 21.0 7.719 Z m -1.532 -1.55 c -0.03 -0.37 -0.085 -0.57 -0.159 -0.713 c -0.168 -0.33 -0.435 -0.597 -0.765 -0.765 c -0.144 -0.074 -0.343 -0.13 -0.713 -0.16 C 17.45 4.502 16.962 4.5 16.25 4.5 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 0.032 C 5.798 4.562 5.6 4.617 5.455 4.69 C 5.126 4.859 4.859 5.126 4.69 5.456 C 4.617 5.6 4.56 5.799 4.53 6.169 C 4.502 6.55 4.5 7.038 4.5 7.75 v 8.5 c 0.0 0.712 0.0 1.202 0.032 1.58 c 0.03 0.371 0.085 0.57 0.159 0.715 c 0.168 0.329 0.435 0.596 0.765 0.764 c 0.144 0.074 0.343 0.13 0.713 0.16 c 0.38 0.03 0.869 0.031 1.581 0.031 h 5.75 v -2.08 c 0.0 -0.535 0.0 -0.98 0.03 -1.345 c 0.03 -0.38 0.098 -0.736 0.27 -1.073 c 0.263 -0.518 0.684 -0.939 1.201 -1.202 c 0.338 -0.172 0.694 -0.24 1.074 -0.27 c 0.365 -0.03 0.81 -0.03 1.345 -0.03 h 2.08 V 7.75 c 0.0 -0.712 0.0 -1.202 -0.032 -1.58 Z M 18.44 15.0 L 15.0 18.44 v -0.99 c 0.0 -0.572 0.0 -0.957 0.025 -1.252 c 0.023 -0.288 0.065 -0.425 0.111 -0.516 c 0.12 -0.235 0.311 -0.426 0.546 -0.546 c 0.091 -0.046 0.228 -0.088 0.516 -0.111 C 16.493 15.0 16.878 15.0 17.45 15.0 h 0.99 Z")
        )
    }.build()
}
