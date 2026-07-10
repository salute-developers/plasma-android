package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DotsHorizontalOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DotsHorizontalOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.8 6.6 C 3.03 6.6 2.4 7.23 2.4 8.0 c 0.0 0.77 0.63 1.4 1.4 1.4 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 Z m 8.4 0.0 c -0.77 0.0 -1.4 0.63 -1.4 1.4 c 0.0 0.77 0.63 1.4 1.4 1.4 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 Z M 8.0 6.6 C 7.23 6.6 6.6 7.23 6.6 8.0 c 0.0 0.77 0.63 1.4 1.4 1.4 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 Z")
        )
    }.build()
}
