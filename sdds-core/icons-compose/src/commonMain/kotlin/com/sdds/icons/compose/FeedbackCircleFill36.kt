package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FeedbackCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FeedbackCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.203 29.046 c 0.363 1.102 -0.607 2.182 -1.741 1.938 l -5.272 -1.136 c -3.19 1.568 -6.905 2.04 -10.453 1.329 c -3.548 -0.712 -6.688 -2.56 -8.837 -5.198 c -2.148 -2.64 -3.159 -5.89 -2.843 -9.15 c 0.315 -3.26 1.935 -6.305 4.558 -8.57 c 2.623 -2.265 6.07 -3.596 9.702 -3.745 c 3.63 -0.149 7.199 0.894 10.04 2.935 c 2.841 2.04 4.762 4.94 5.406 8.16 c 0.644 3.22 -0.034 6.541 -1.906 9.345 l 1.346 4.091 Z M 10.355 12.31 c 0.19 -0.126 0.41 -0.158 0.632 -0.158 c 0.442 0.0 0.884 0.221 1.137 0.664 c 0.506 0.917 2.022 0.917 2.56 -0.031 c 0.347 -0.601 1.137 -0.822 1.769 -0.475 c 0.6 0.348 0.821 1.138 0.474 1.77 c -0.727 1.265 -2.054 2.024 -3.539 2.024 c -1.453 0.0 -2.812 -0.79 -3.507 -2.055 c -0.348 -0.6 -0.126 -1.391 0.474 -1.739 Z m 15.29 0.025 c -0.632 -0.348 -1.422 -0.126 -1.77 0.474 c -0.537 0.949 -2.053 0.949 -2.527 0.0 c -0.253 -0.442 -0.695 -0.663 -1.137 -0.663 c -0.222 0.0 -0.443 0.031 -0.632 0.158 c -0.632 0.379 -0.853 1.138 -0.506 1.77 c 0.695 1.264 2.054 2.055 3.507 2.055 c 1.485 0.0 2.812 -0.759 3.539 -2.023 c 0.347 -0.633 0.126 -1.423 -0.474 -1.77 Z M 12.566 23.7 c -0.095 0.506 0.316 0.98 0.853 0.98 h 9.163 c 0.537 0.0 0.947 -0.506 0.853 -0.98 c -0.474 -2.56 -2.717 -4.52 -5.435 -4.52 c -2.717 0.0 -4.96 1.96 -5.434 4.52 Z")
        )
    }.build()
}
