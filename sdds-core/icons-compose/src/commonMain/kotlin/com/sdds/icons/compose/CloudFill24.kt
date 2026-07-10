package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.22 8.706 C 3.787 9.376 2.0 11.604 2.0 14.25 C 2.0 17.426 4.574 20.0 7.75 20.0 h 9.75 c 2.485 0.0 4.5 -2.015 4.5 -4.5 c 0.0 -1.782 -1.035 -3.32 -2.536 -4.05 c 0.024 -0.23 0.036 -0.464 0.036 -0.7 C 19.5 7.022 16.478 4.0 12.75 4.0 c -2.353 0.0 -4.423 1.203 -5.632 3.028 c 0.566 -0.05 1.138 -0.033 1.702 0.052 c 0.984 0.146 1.926 0.494 2.77 1.02 c 0.843 0.527 1.57 1.221 2.133 2.04 c 0.563 0.82 0.952 1.746 1.143 2.722 c 0.08 0.406 -0.186 0.8 -0.593 0.88 c -0.406 0.079 -0.8 -0.187 -0.88 -0.593 c -0.15 -0.774 -0.459 -1.509 -0.906 -2.158 c -0.447 -0.65 -1.023 -1.2 -1.692 -1.618 C 10.126 8.955 9.38 8.68 8.6 8.563 c -0.78 -0.116 -1.576 -0.071 -2.337 0.133 L 6.22 8.706 Z")
        )
    }.build()
}
