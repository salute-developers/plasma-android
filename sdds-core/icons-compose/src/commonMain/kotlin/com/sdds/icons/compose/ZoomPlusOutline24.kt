package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ZoomPlusOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ZoomPlusOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.25 7.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 9.75 6.586 9.75 7.0 v 2.75 H 7.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 6.586 11.25 7.0 11.25 h 2.75 V 14.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -2.75 H 14.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 14.414 9.75 14.0 9.75 h -2.75 V 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.25 10.5 c 0.0 -4.004 3.246 -7.25 7.25 -7.25 s 7.25 3.246 7.25 7.25 c 0.0 1.732 -0.607 3.322 -1.62 4.569 l 4.9 4.9 c 0.293 0.294 0.293 0.768 0.0 1.061 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -4.901 -4.9 c -1.247 1.013 -2.837 1.62 -4.569 1.62 c -4.004 0.0 -7.25 -3.246 -7.25 -7.25 Z m 7.25 -5.75 c -3.176 0.0 -5.75 2.574 -5.75 5.75 s 2.574 5.75 5.75 5.75 s 5.75 -2.574 5.75 -5.75 s -2.574 -5.75 -5.75 -5.75 Z")
        )
    }.build()
}
