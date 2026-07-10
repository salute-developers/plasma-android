package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Brightness0Outline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Brightness0Outline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 12.5 c -3.038 0.0 -5.5 2.462 -5.5 5.5 s 2.462 5.5 5.5 5.5 s 5.5 -2.462 5.5 -5.5 s -2.462 -5.5 -5.5 -5.5 Z M 10.5 18.0 c 0.0 -4.142 3.358 -7.5 7.5 -7.5 c 4.142 0.0 7.5 3.358 7.5 7.5 c 0.0 4.142 -3.358 7.5 -7.5 7.5 c -4.142 0.0 -7.5 -3.358 -7.5 -7.5 Z")
        )
    }.build()
}
