package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.5 2.006 v 3.575 c 0.0 0.534 0.0 0.98 0.03 1.344 c 0.03 0.38 0.098 0.736 0.27 1.074 C 13.063 8.516 13.484 8.937 14.0 9.2 c 0.338 0.172 0.694 0.24 1.074 0.27 c 0.365 0.03 0.81 0.03 1.345 0.03 h 3.574 C 20.0 9.655 20.0 9.82 20.0 10.003 v 7.279 c 0.0 0.673 0.0 1.224 -0.037 1.671 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 16.506 22.0 15.955 22.0 15.281 22.0 H 8.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 4.0 18.506 4.0 17.955 4.0 17.282 V 6.719 c 0.0 -0.674 0.0 -1.224 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 7.495 2.0 8.045 2.0 8.719 2.0 h 3.278 c 0.182 0.0 0.348 0.0 0.503 0.006 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 2.5 v 3.05 c 0.0 0.572 0.0 0.957 0.025 1.253 c 0.023 0.287 0.065 0.424 0.111 0.515 c 0.12 0.235 0.311 0.426 0.546 0.546 c 0.091 0.046 0.228 0.088 0.515 0.111 C 15.493 8.0 15.877 8.0 16.45 8.0 h 3.05 c -0.159 -0.22 -0.36 -0.422 -0.606 -0.666 l -4.228 -4.228 C 14.422 2.86 14.22 2.659 14.0 2.5 Z")
        )
    }.build()
}
