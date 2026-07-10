package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartDistributionOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartDistributionOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.5 10.0 H 5.25 C 4.007 10.0 3.0 11.007 3.0 12.25 v 8.0 C 3.0 20.664 3.336 21.0 3.75 21.0 h 16.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -11.0 C 21.0 8.007 19.993 7.0 18.75 7.0 H 15.5 V 5.25 C 15.5 4.007 14.493 3.0 13.25 3.0 h -2.5 C 9.507 3.0 8.5 4.007 8.5 5.25 V 10.0 Z m 2.25 -5.5 C 10.336 4.5 10.0 4.836 10.0 5.25 V 19.5 h 4.0 V 5.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -2.5 Z m -2.25 15.0 v -8.0 H 5.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 7.25 h 4.0 Z m 7.0 0.0 v -11.0 h 3.25 c 0.414 0.0 0.75 0.336 0.75 0.75 V 19.5 h -4.0 Z")
        )
    }.build()
}
