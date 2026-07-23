package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlipHorizontalOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlipHorizontalOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.625 4.393 c 0.5 -0.904 1.874 -0.55 1.875 0.483 V 18.5 c 0.0 0.829 -0.672 1.5 -1.5 1.5 H 2.695 l -0.14 -0.01 c -0.678 -0.092 -1.08 -0.849 -0.735 -1.473 L 9.625 4.393 Z M 3.543 18.499 H 10.0 V 6.815 L 3.543 18.499 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 4.876 c 0.0 -1.032 1.375 -1.387 1.875 -0.483 l 7.804 14.123 c 0.346 0.625 -0.056 1.381 -0.735 1.473 L 21.304 20.0 H 14.0 c -0.829 0.0 -1.5 -0.671 -1.5 -1.5 V 4.876 Z M 14.0 18.5 h 6.457 L 14.0 6.815 v 11.684 Z")
        )
    }.build()
}
