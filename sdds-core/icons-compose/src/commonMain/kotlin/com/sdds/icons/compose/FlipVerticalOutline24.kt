package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipVerticalOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipVerticalOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.607 9.625 c 0.904 0.5 0.55 1.875 -0.483 1.875 H 5.5 C 4.672 11.5 4.0 10.83 4.0 10.0 V 2.696 l 0.01 -0.14 c 0.093 -0.679 0.85 -1.08 1.474 -0.736 l 14.123 7.805 Z M 5.5 3.543 V 10.0 h 11.685 L 5.5 3.543 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.123 12.5 c 1.033 0.0 1.387 1.375 0.484 1.875 L 5.484 22.18 c -0.625 0.345 -1.381 -0.056 -1.474 -0.735 L 4.0 21.305 V 14.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 h 13.623 Z M 5.5 14.0 v 6.457 L 17.185 14.0 H 5.5 Z")
        )
    }.build()
}
