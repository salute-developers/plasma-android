package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.132 2.75 c -0.304 0.0 -0.55 0.246 -0.55 0.55 v 3.809 v 0.02 v 6.125 h 2.832 V 5.039 v -0.02 V 3.3 c 0.0 -0.304 -0.246 -0.55 -0.55 -0.55 H 7.132 Z M 6.058 14.253 h 0.024 h 3.817 l 0.015 0.001 h 3.832 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 6.089 c 0.0 -0.856 -0.693 -1.55 -1.55 -1.55 h -2.281 V 3.3 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 H 7.131 c -0.856 0.0 -1.55 0.694 -1.55 1.55 v 3.33 H 3.3 c -0.856 0.0 -1.55 0.694 -1.55 1.55 v 5.573 c 0.0 0.276 0.224 0.5 0.5 0.5 h 3.808 Z M 5.582 7.63 v 5.623 H 2.75 V 8.18 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 2.282 Z m 7.664 5.624 h -2.832 V 5.539 h 2.283 c 0.303 0.0 0.55 0.246 0.55 0.55 v 7.165 Z")
        )
    }.build()
}
