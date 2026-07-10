package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.25 6.75 V 31.5 h 7.5 V 6.75 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 h -3.0 c -1.243 0.0 -2.25 1.007 -2.25 2.25 Z m 10.5 6.0 V 31.5 h 7.5 V 12.75 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 h -3.0 c -1.243 0.0 -2.25 1.007 -2.25 2.25 Z m -21.0 18.75 V 17.25 C 3.75 16.007 4.757 15.0 6.0 15.0 h 3.0 c 1.243 0.0 2.25 1.007 2.25 2.25 V 31.5 h -7.5 Z")
        )
    }.build()
}
