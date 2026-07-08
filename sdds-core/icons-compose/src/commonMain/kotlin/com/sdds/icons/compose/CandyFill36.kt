package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CandyFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CandyFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.284 3.384 c -0.748 -0.748 -2.025 -0.406 -2.3 0.615 l -0.99 3.686 c -1.806 -0.863 -4.026 -0.554 -5.51 0.93 l -7.888 7.888 c -1.485 1.485 -1.793 3.704 -0.93 5.51 l -3.687 0.991 c -1.021 0.275 -1.363 1.552 -0.615 2.3 l 7.037 7.038 c 0.748 0.748 2.026 0.406 2.3 -0.616 l 0.991 -3.686 c 1.806 0.863 4.026 0.555 5.511 -0.93 l 7.887 -7.888 c 1.485 -1.485 1.794 -3.704 0.93 -5.51 l 3.686 -0.99 c 1.022 -0.275 1.364 -1.553 0.615 -2.3 l -7.037 -7.038 Z M 5.543 24.654 l 3.444 -0.925 l 2.99 2.99 l -0.926 3.444 l -5.508 -5.508 Z M 26.7 11.997 l 3.442 -0.925 l -5.507 -5.508 l -0.926 3.443 l 2.99 2.99 Z m -6.585 2.357 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -5.784 5.784 c -0.39 0.391 -0.39 1.024 0.0 1.415 c 0.39 0.39 1.024 0.39 1.414 0.0 l 5.784 -5.784 Z")
        )
    }.build()
}
