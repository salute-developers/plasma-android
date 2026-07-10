package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Search16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Search16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.75 2.25 c -2.485 0.0 -4.5 2.015 -4.5 4.5 s 2.015 4.5 4.5 4.5 s 4.5 -2.015 4.5 -4.5 s -2.015 -4.5 -4.5 -4.5 Z m -5.5 4.5 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 c 0.0 1.339 -0.478 2.566 -1.273 3.52 l 3.627 3.626 c 0.195 0.196 0.195 0.512 0.0 0.708 c -0.196 0.195 -0.512 0.195 -0.708 0.0 l -3.627 -3.627 C 9.317 11.772 8.09 12.25 6.75 12.25 c -3.038 0.0 -5.5 -2.462 -5.5 -5.5 Z")
        )
    }.build()
}
