package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbCFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbCFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 8.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 h 12.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 H 6.0 Z m 0.75 3.25 C 6.336 11.25 6.0 11.586 6.0 12.0 s 0.336 0.75 0.75 0.75 h 10.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 6.75 Z")
        )
    }.build()
}
