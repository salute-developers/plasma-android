package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Brightness0Outline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Brightness0Outline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 5.5 C 6.62 5.5 5.5 6.62 5.5 8.0 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 S 9.38 5.5 8.0 5.5 Z M 4.5 8.0 c 0.0 -1.933 1.567 -3.5 3.5 -3.5 s 3.5 1.567 3.5 3.5 s -1.567 3.5 -3.5 3.5 S 4.5 9.933 4.5 8.0 Z")
        )
    }.build()
}
