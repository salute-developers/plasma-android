package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximize24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximize24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.5 7.5 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 h 9.0 c 2.21 0.0 4.0 1.79 4.0 4.0 v 9.0 c 0.0 2.21 -1.79 4.0 -4.0 4.0 h -9.0 c -2.21 0.0 -4.0 -1.79 -4.0 -4.0 v -9.0 Z M 5.0 9.0 v 7.5 C 5.0 17.88 6.12 19.0 7.5 19.0 h 9.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 V 9.0 H 5.0 Z")
        )
    }.build()
}
