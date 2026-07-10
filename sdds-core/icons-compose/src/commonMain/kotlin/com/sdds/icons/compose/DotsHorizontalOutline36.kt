package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DotsHorizontalOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DotsHorizontalOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 15.0 c -1.65 0.0 -3.0 1.35 -3.0 3.0 s 1.35 3.0 3.0 3.0 s 3.0 -1.35 3.0 -3.0 s -1.35 -3.0 -3.0 -3.0 Z m 18.0 0.0 c -1.65 0.0 -3.0 1.35 -3.0 3.0 s 1.35 3.0 3.0 3.0 s 3.0 -1.35 3.0 -3.0 s -1.35 -3.0 -3.0 -3.0 Z m -9.0 0.0 c -1.65 0.0 -3.0 1.35 -3.0 3.0 s 1.35 3.0 3.0 3.0 s 3.0 -1.35 3.0 -3.0 s -1.35 -3.0 -3.0 -3.0 Z")
        )
    }.build()
}
