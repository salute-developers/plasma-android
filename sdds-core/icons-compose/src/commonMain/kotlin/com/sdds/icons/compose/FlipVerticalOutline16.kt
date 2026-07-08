package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipVerticalOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipVerticalOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.125 6.337 c 0.633 0.35 0.384 1.313 -0.339 1.313 H 3.25 L 3.143 7.645 C 2.613 7.591 2.2 7.144 2.2 6.6 V 1.487 c 0.0 -0.533 0.572 -0.87 1.038 -0.613 l 9.887 5.463 Z M 3.2 1.996 V 6.6 c 0.0 0.028 0.023 0.05 0.05 0.05 h 8.373 L 3.2 1.996 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.786 8.35 c 0.723 0.0 0.972 0.963 0.34 1.313 l -9.888 5.462 C 2.772 15.383 2.2 15.046 2.2 14.513 V 9.4 c 0.0 -0.544 0.413 -0.991 0.943 -1.045 L 3.25 8.35 h 9.536 Z m -9.536 1.0 C 3.223 9.35 3.2 9.372 3.2 9.4 v 4.604 l 8.423 -4.654 H 3.25 Z")
        )
    }.build()
}
