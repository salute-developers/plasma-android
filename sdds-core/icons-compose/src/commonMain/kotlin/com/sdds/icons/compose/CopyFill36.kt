package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CopyFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CopyFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.182 9.0 h 13.136 c 0.593 0.0 1.105 0.0 1.526 0.034 c 0.445 0.037 0.887 0.117 1.313 0.334 c 0.635 0.323 1.152 0.84 1.475 1.475 c 0.217 0.425 0.297 0.868 0.334 1.313 C 27.0 12.577 27.0 13.089 27.0 13.682 v 13.136 c 0.0 0.593 0.0 1.105 -0.034 1.526 c -0.037 0.445 -0.117 0.887 -0.334 1.313 c -0.323 0.635 -0.84 1.152 -1.475 1.475 c -0.425 0.217 -0.868 0.297 -1.313 0.334 c -0.421 0.034 -0.933 0.034 -1.526 0.034 H 9.182 c -0.593 0.0 -1.105 0.0 -1.526 -0.034 c -0.445 -0.037 -0.888 -0.117 -1.313 -0.334 c -0.635 -0.323 -1.152 -0.84 -1.475 -1.475 c -0.217 -0.425 -0.297 -0.868 -0.334 -1.313 C 4.5 27.923 4.5 27.411 4.5 26.818 V 13.682 c 0.0 -0.593 0.0 -1.105 0.034 -1.526 c 0.037 -0.445 0.117 -0.888 0.334 -1.313 c 0.323 -0.635 0.84 -1.152 1.475 -1.475 C 6.768 9.15 7.21 9.07 7.656 9.034 C 8.077 9.0 8.589 9.0 9.182 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.25 14.025 c 0.0 -1.489 0.0 -2.538 -0.068 -3.357 c -0.066 -0.805 -0.19 -1.29 -0.382 -1.666 c -0.395 -0.776 -1.026 -1.407 -1.802 -1.802 c -0.377 -0.192 -0.86 -0.316 -1.666 -0.382 c -0.82 -0.067 -1.868 -0.068 -3.357 -0.068 h -10.35 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 S 11.004 4.5 11.625 4.5 h 10.399 h 0.14 h 4.654 c 0.593 0.0 1.105 0.0 1.526 0.034 c 0.445 0.037 0.887 0.117 1.313 0.334 c 0.635 0.323 1.152 0.84 1.475 1.475 c 0.217 0.425 0.297 0.868 0.334 1.313 C 31.5 8.077 31.5 8.589 31.5 9.182 v 4.711 v 0.083 v 10.399 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -10.35 Z")
        )
    }.build()
}
