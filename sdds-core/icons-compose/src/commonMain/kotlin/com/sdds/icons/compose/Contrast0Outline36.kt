package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast0Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast0Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 12.625 v 10.75 c 2.968 0.0 5.375 -2.407 5.375 -5.375 c 0.0 -2.969 -2.407 -5.375 -5.375 -5.375 Z m 0.0 -2.0 c -4.073 0.0 -7.375 3.302 -7.375 7.375 s 3.302 7.375 7.375 7.375 s 7.375 -3.302 7.375 -7.375 s -3.302 -7.375 -7.375 -7.375 Z")
        )
    }.build()
}
