package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DotsVerticalCenteredOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DotsVerticalCenteredOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 5.2 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 c -0.77 0.0 -1.4 0.63 -1.4 1.4 c 0.0 0.77 0.63 1.4 1.4 1.4 Z m 0.0 1.4 C 7.23 6.6 6.6 7.23 6.6 8.0 c 0.0 0.77 0.63 1.4 1.4 1.4 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 Z m 0.0 4.2 c -0.77 0.0 -1.4 0.63 -1.4 1.4 c 0.0 0.77 0.63 1.4 1.4 1.4 c 0.77 0.0 1.4 -0.63 1.4 -1.4 c 0.0 -0.77 -0.63 -1.4 -1.4 -1.4 Z")
        )
    }.build()
}
