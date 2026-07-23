package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 5.965 c -1.385 0.4 -2.51 1.098 -3.405 2.046 c -1.436 1.52 -2.179 3.577 -2.593 5.736 c -0.415 2.163 -0.521 4.55 -0.597 6.808 l -0.023 0.686 c -0.055 1.691 -0.107 3.29 -0.262 4.719 H 6.75 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 22.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -1.37 c -0.155 -1.43 -0.207 -3.028 -0.262 -4.72 l -0.023 -0.685 c -0.076 -2.259 -0.182 -4.645 -0.597 -6.808 c -0.415 -2.159 -1.157 -4.215 -2.593 -5.736 c -0.896 -0.948 -2.02 -1.646 -3.405 -2.046 c -0.007 -0.378 -0.085 -0.751 -0.228 -1.1 c -0.151 -0.367 -0.372 -0.7 -0.65 -0.98 c -0.28 -0.28 -0.61 -0.503 -0.974 -0.655 C 18.784 3.078 18.394 3.0 18.0 3.0 c -0.394 0.0 -0.784 0.078 -1.148 0.23 c -0.364 0.152 -0.695 0.374 -0.973 0.655 c -0.279 0.28 -0.5 0.613 -0.65 0.98 c -0.144 0.349 -0.222 0.722 -0.228 1.1 Z M 25.87 25.96 c -0.148 -1.465 -0.2 -3.058 -0.251 -4.644 l -0.023 -0.693 c -0.076 -2.271 -0.18 -4.51 -0.563 -6.5 c -0.382 -1.994 -1.023 -3.617 -2.082 -4.74 c -1.027 -1.086 -2.55 -1.81 -4.951 -1.81 c -2.402 0.0 -3.924 0.724 -4.95 1.81 c -1.06 1.123 -1.7 2.746 -2.084 4.74 c -0.381 1.99 -0.486 4.229 -0.562 6.5 l -0.023 0.692 c -0.051 1.586 -0.103 3.18 -0.25 4.645 h 15.738 Z m -12.114 4.02 C 14.374 31.74 16.041 33.0 18.0 33.0 c 1.96 0.0 3.627 -1.26 4.244 -3.02 h -8.488 Z")
        )
    }.build()
}
