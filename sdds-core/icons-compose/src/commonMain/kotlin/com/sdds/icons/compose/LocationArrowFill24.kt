package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 17.798 4.591 c 0.999 -0.365 1.969 0.605 1.603 1.603 l -5.537 15.144 c -0.426 1.167 -2.11 1.064 -2.391 -0.146 l -1.638 -7.035 L 2.8 12.52 c -1.21 -0.282 -1.312 -1.965 -0.145 -2.392 l 15.143 -5.537 Z")
            )
        }
    }.build()
}
