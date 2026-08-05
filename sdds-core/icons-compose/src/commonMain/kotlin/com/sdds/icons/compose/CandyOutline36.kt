package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CandyOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CandyOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.539 3.404 c -0.747 -0.747 -2.021 -0.409 -2.299 0.61 l -1.05 3.85 c -1.769 -0.853 -3.957 -0.546 -5.424 0.921 l -7.98 7.98 c -1.466 1.467 -1.773 3.656 -0.92 5.424 L 4.015 23.24 c -1.019 0.278 -1.357 1.552 -0.61 2.299 l 7.055 7.056 c 0.747 0.747 2.021 0.408 2.299 -0.61 l 1.05 -3.853 c 1.77 0.854 3.958 0.547 5.425 -0.92 l 7.98 -7.98 c 1.466 -1.467 1.773 -3.654 0.92 -5.423 l 3.851 -1.05 c 1.018 -0.278 1.357 -1.553 0.61 -2.3 L 25.54 3.405 Z m -3.496 6.77 l 0.03 0.032 l 3.72 3.719 l 0.032 0.03 c 1.047 1.077 1.038 2.798 -0.027 3.863 l -7.98 7.98 c -1.073 1.074 -2.814 1.074 -3.888 0.0 l -3.73 -3.73 c -1.073 -1.073 -1.073 -2.815 0.0 -3.889 l 7.98 -7.98 c 1.065 -1.065 2.787 -1.074 3.863 -0.026 Z m 4.755 1.926 l 3.62 -0.987 l -5.532 -5.534 L 23.9 9.2 l 2.9 2.9 Z M 9.201 23.898 L 5.58 24.886 l 5.533 5.533 l 0.988 -3.622 L 9.2 23.898 Z m 11.1 -9.442 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.415 0.0 l -5.844 5.845 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 l 5.845 -5.845 Z")
        )
    }.build()
}
