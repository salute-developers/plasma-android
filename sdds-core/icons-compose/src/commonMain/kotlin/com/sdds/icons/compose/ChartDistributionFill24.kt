package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 4.5 V 21.0 h 5.0 V 4.5 C 14.5 3.672 13.828 3.0 13.0 3.0 h -2.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 8.5 V 21.0 h 5.0 V 8.5 C 21.5 7.672 20.828 7.0 20.0 7.0 h -2.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.5 11.5 V 21.0 h 5.0 v -9.5 C 7.5 10.672 6.828 10.0 6.0 10.0 H 4.0 c -0.828 0.0 -1.5 0.672 -1.5 1.5 Z")
        )
    }.build()
}
