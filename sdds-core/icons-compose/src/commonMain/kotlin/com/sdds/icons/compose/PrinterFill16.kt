package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PrinterFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PrinterFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.41 4.45 h 0.04 v -2.1 C 3.45 2.157 3.605 2.0 3.8 2.0 h 8.4 c 0.193 0.0 0.35 0.157 0.35 0.35 v 2.1 h 0.045 h 0.004 c 0.068 0.002 0.135 0.006 0.201 0.013 C 14.037 4.588 15.0 5.632 15.0 6.9 v 3.85 c 0.0 0.387 -0.313 0.7 -0.7 0.7 h -1.75 v 2.1 c 0.0 0.193 -0.158 0.35 -0.35 0.35 H 3.8 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 v -2.1 H 1.7 c -0.387 0.0 -0.7 -0.313 -0.7 -0.7 V 6.9 c 0.0 -1.336 1.07 -2.422 2.4 -2.45 h 0.01 Z m 9.14 2.8 c 0.0 0.387 -0.313 0.7 -0.7 0.7 c -0.387 0.0 -0.7 -0.313 -0.7 -0.7 c 0.0 -0.386 0.313 -0.7 0.7 -0.7 c 0.387 0.0 0.7 0.314 0.7 0.7 Z m -1.0 -4.25 v 1.45 h -7.1 V 3.0 h 7.1 Z m -7.1 7.0 h 7.1 v 2.9 h -7.1 V 10.0 Z")
        )
    }.build()
}
