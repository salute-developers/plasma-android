package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Percent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Percent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 4.5 C 5.62 4.5 4.5 5.62 4.5 7.0 S 5.62 9.5 7.0 9.5 S 9.5 8.38 9.5 7.0 S 8.38 4.5 7.0 4.5 Z M 3.0 7.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 s -1.79 4.0 -4.0 4.0 s -4.0 -1.79 -4.0 -4.0 Z m 16.53 -2.53 c 0.293 0.293 0.293 0.767 0.0 1.06 l -14.0 14.0 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 14.0 -14.0 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z M 14.5 17.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 s -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 Z m 2.5 -4.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z")
        )
    }.build()
}
