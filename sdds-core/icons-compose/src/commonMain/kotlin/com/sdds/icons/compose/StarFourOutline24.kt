package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.357 3.273 c 0.564 -1.523 2.72 -1.523 3.284 0.0 l 1.873 5.064 c 0.025 0.068 0.079 0.122 0.147 0.147 l 5.064 1.873 c 1.523 0.564 1.523 2.72 0.0 3.284 l -5.064 1.873 c -0.068 0.025 -0.122 0.079 -0.147 0.147 l -1.873 5.064 c -0.564 1.523 -2.72 1.523 -3.284 0.0 L 8.484 15.66 c -0.025 -0.068 -0.079 -0.122 -0.147 -0.147 L 3.273 13.64 c -1.523 -0.564 -1.523 -2.72 0.0 -3.284 l 5.064 -1.873 C 8.405 8.46 8.459 8.405 8.484 8.337 l 1.873 -5.064 Z m 1.876 0.521 c -0.08 -0.218 -0.388 -0.218 -0.468 0.0 L 9.89 8.857 c -0.178 0.48 -0.555 0.856 -1.034 1.034 l -5.063 1.874 c -0.218 0.08 -0.218 0.388 0.0 0.468 l 5.063 1.874 c 0.479 0.178 0.856 0.555 1.034 1.034 l 1.874 5.063 c 0.08 0.218 0.388 0.218 0.468 0.0 l 1.874 -5.063 c 0.178 -0.479 0.555 -0.856 1.034 -1.034 l 5.063 -1.874 c 0.218 -0.08 0.218 -0.388 0.0 -0.468 L 15.141 9.89 c -0.479 -0.178 -0.856 -0.555 -1.034 -1.034 l -1.874 -5.063 Z")
        )
    }.build()
}
