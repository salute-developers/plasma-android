package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.25 5.25 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 5.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 5.5 c 0.0 1.657 -1.343 3.0 -3.0 3.0 h -5.5 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -5.5 Z m 1.0 0.75 v 4.75 c 0.0 1.105 0.895 2.0 2.0 2.0 h 5.5 c 1.105 0.0 2.0 -0.895 2.0 -2.0 V 6.0 h -9.5 Z")
        )
    }.build()
}
