package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MinusSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MinusSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.75 c -1.256 0.0 -2.275 1.019 -2.275 2.275 v 7.95 c 0.0 1.256 1.019 2.275 2.275 2.275 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -7.95 c 0.0 -1.256 -1.019 -2.275 -2.275 -2.275 h -7.95 Z M 4.354 7.5 c -0.277 0.0 -0.5 0.224 -0.5 0.5 s 0.223 0.5 0.5 0.5 h 7.291 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.354 Z")
        )
    }.build()
}
