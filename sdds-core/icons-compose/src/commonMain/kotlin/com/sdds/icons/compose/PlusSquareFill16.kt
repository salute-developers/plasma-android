package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.75 c -1.256 0.0 -2.275 1.019 -2.275 2.275 v 7.95 c 0.0 1.256 1.019 2.275 2.275 2.275 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -7.95 c 0.0 -1.256 -1.019 -2.275 -2.275 -2.275 h -7.95 Z M 8.0 3.83 c 0.29 0.0 0.525 0.236 0.525 0.525 v 3.121 h 3.122 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 8.525 v 3.121 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 8.526 h -3.12 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.236 -0.525 0.525 -0.525 h 3.12 v -3.12 C 7.475 4.065 7.71 3.83 8.0 3.83 Z")
        )
    }.build()
}
