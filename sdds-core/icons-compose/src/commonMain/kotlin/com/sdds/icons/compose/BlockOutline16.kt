package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlockOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlockOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.125 3.418 l 8.454 8.454 c 1.997 -2.357 1.884 -5.892 -0.34 -8.115 c -2.223 -2.224 -5.757 -2.337 -8.114 -0.34 Z m 7.746 9.16 L 3.418 4.126 C 1.42 6.482 1.533 10.016 3.757 12.24 c 2.223 2.223 5.758 2.336 8.114 0.339 Z M 3.05 3.05 c 2.733 -2.733 7.164 -2.733 9.897 0.0 c 2.733 2.733 2.733 7.164 0.0 9.897 c -2.733 2.733 -7.164 2.733 -9.897 0.0 c -2.733 -2.733 -2.733 -7.164 0.0 -9.897 Z")
        )
    }.build()
}
