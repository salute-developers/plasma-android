package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.29 2.8 v 11.45 h 3.42 V 2.8 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 H 7.34 c -0.58 0.0 -1.05 0.47 -1.05 1.05 Z m 4.789 2.778 v 8.672 H 14.5 V 5.578 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 h -1.321 c -0.58 0.0 -1.05 0.47 -1.05 1.05 Z M 1.5 14.249 V 7.661 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 1.321 c 0.58 0.0 1.05 0.47 1.05 1.05 v 6.588 H 1.5 Z")
        )
    }.build()
}
