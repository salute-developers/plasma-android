package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DotsHorizontalOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DotsHorizontalOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 10.0 c -1.1 0.0 -2.0 0.9 -2.0 2.0 s 0.9 2.0 2.0 2.0 s 2.0 -0.9 2.0 -2.0 s -0.9 -2.0 -2.0 -2.0 Z m 12.0 0.0 c -1.1 0.0 -2.0 0.9 -2.0 2.0 s 0.9 2.0 2.0 2.0 s 2.0 -0.9 2.0 -2.0 s -0.9 -2.0 -2.0 -2.0 Z m -6.0 0.0 c -1.1 0.0 -2.0 0.9 -2.0 2.0 s 0.9 2.0 2.0 2.0 s 2.0 -0.9 2.0 -2.0 s -0.9 -2.0 -2.0 -2.0 Z")
        )
    }.build()
}
