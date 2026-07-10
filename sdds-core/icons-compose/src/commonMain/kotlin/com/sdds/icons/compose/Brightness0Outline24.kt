package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Brightness0Outline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Brightness0Outline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 12.0 c 0.0 -2.761 2.239 -5.0 5.0 -5.0 s 5.0 2.239 5.0 5.0 s -2.239 5.0 -5.0 5.0 s -5.0 -2.239 -5.0 -5.0 Z m 5.0 -3.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z")
        )
    }.build()
}
