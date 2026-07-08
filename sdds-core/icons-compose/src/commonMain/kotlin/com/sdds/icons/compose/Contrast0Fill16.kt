package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast0Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast0Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 5.55 v 4.9 c -1.353 0.0 -2.45 -1.097 -2.45 -2.45 c 0.0 -1.353 1.097 -2.45 2.45 -2.45 Z m 0.0 5.95 c -1.933 0.0 -3.5 -1.567 -3.5 -3.5 S 6.067 4.5 8.0 4.5 s 3.5 1.567 3.5 3.5 s -1.567 3.5 -3.5 3.5 Z")
        )
    }.build()
}
