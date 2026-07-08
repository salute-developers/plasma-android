package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FocusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FocusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.05 8.0 c 0.0 -3.286 2.664 -5.95 5.95 -5.95 S 13.95 4.714 13.95 8.0 S 11.286 13.95 8.0 13.95 S 2.05 11.286 2.05 8.0 Z M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z m 4.9 7.0 c 0.0 2.707 -2.193 4.9 -4.9 4.9 c -2.706 0.0 -4.9 -2.193 -4.9 -4.9 c 0.0 -2.706 2.194 -4.9 4.9 -4.9 c 2.707 0.0 4.9 2.194 4.9 4.9 Z m -2.8 0.0 c 0.0 1.16 -0.94 2.1 -2.1 2.1 c -1.16 0.0 -2.1 -0.94 -2.1 -2.1 c 0.0 -1.16 0.94 -2.1 2.1 -2.1 c 1.16 0.0 2.1 0.94 2.1 2.1 Z")
        )
    }.build()
}
