package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z m 3.0 5.0 C 9.895 6.0 9.0 6.895 9.0 8.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 Z M 4.0 7.0 C 3.448 7.0 3.0 7.448 3.0 8.0 s 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 Z m 2.0 1.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
