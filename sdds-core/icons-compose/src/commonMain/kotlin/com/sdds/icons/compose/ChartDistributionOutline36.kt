package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.083 6.5 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 21.749 h 6.333 V 7.75 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -3.833 Z m -3.25 1.25 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 h 3.833 c 1.795 0.0 3.25 1.455 3.25 3.25 v 2.81 h 5.083 c 1.795 0.0 3.25 1.455 3.25 3.25 v 16.688 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -8.296 h -0.037 h -8.333 h -0.003 H 5.5 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 V 18.356 c 0.0 -1.794 1.455 -3.25 3.25 -3.25 h 5.083 V 7.75 Z m 10.333 4.81 v 16.938 h 6.333 V 13.81 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -5.083 Z M 6.5 18.355 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 5.083 V 29.5 H 6.5 V 18.356 Z")
        )
    }.build()
}
