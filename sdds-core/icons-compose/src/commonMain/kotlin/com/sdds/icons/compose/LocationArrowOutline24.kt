package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 17.801 4.59 c 0.999 -0.365 1.969 0.605 1.603 1.604 l -5.537 15.143 c -0.427 1.167 -2.11 1.065 -2.391 -0.145 l -1.638 -7.035 l -7.035 -1.638 c -1.21 -0.281 -1.312 -1.965 -0.146 -2.391 L 17.801 4.59 Z m 0.01 1.594 L 3.96 11.248 l 6.369 1.483 c 0.464 0.108 0.826 0.47 0.934 0.934 l 1.482 6.37 l 5.065 -13.85 Z")
            )
        }
    }.build()
}
