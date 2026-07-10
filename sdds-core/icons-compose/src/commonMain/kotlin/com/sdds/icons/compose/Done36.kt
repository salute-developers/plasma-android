package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Done36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Done36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.706 9.291 c 0.39 0.39 0.392 1.023 0.003 1.415 l -15.931 16.0 C 15.59 26.894 15.335 27.0 15.069 27.0 c -0.266 0.0 -0.521 -0.106 -0.709 -0.294 L 8.291 20.61 c -0.39 -0.391 -0.388 -1.024 0.003 -1.414 c 0.392 -0.39 1.025 -0.388 1.415 0.003 l 5.36 5.384 L 30.291 9.294 c 0.39 -0.39 1.023 -0.392 1.415 -0.003 Z")
        )
    }.build()
}
