package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipHorizontalOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipHorizontalOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.537 2.875 C 6.887 2.242 7.85 2.49 7.85 3.214 v 9.536 l -0.005 0.107 C 7.791 13.387 7.344 13.8 6.8 13.8 H 1.687 c -0.533 0.0 -0.87 -0.572 -0.613 -1.038 l 5.463 -9.887 Z M 2.196 12.8 H 6.8 c 0.028 0.0 0.05 -0.023 0.05 -0.05 V 4.377 L 2.196 12.8 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.55 3.214 c 0.0 -0.723 0.963 -0.972 1.313 -0.34 l 5.462 9.888 c 0.258 0.466 -0.079 1.038 -0.612 1.038 H 9.6 c -0.544 0.0 -0.991 -0.413 -1.045 -0.943 L 8.55 12.75 V 3.214 Z m 1.0 9.536 c 0.0 0.027 0.022 0.05 0.05 0.05 h 4.604 L 9.55 4.377 v 8.373 Z")
        )
    }.build()
}
