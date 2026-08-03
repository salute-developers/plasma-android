package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.09 1.0 h -4.9 c -0.28 0.0 -0.5 0.21 -0.5 0.5 c 0.0 0.28 0.22 0.5 0.5 0.5 H 5.9 v 3.72 c 0.0 0.11 -0.03 0.23 -0.09 0.33 l -3.7 6.88 C 1.6 13.86 2.28 15.0 3.34 15.0 h 9.31 c 1.06 0.0 1.74 -1.14 1.23 -2.07 l -3.7 -6.88 c -0.06 -0.1 -0.09 -0.22 -0.09 -0.33 V 2.0 h 0.7 c 0.29 0.0 0.5 -0.22 0.5 -0.5 c 0.0 -0.29 -0.21 -0.5 -0.5 -0.5 h -0.7 Z")
        )
    }.build()
}
