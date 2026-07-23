package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVert36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVert36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.797 12.04 c -0.392 0.388 -0.395 1.021 -0.007 1.414 c 0.389 0.392 1.022 0.395 1.415 0.007 l 3.599 -3.564 V 28.5 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 9.897 l 3.599 3.564 c 0.392 0.388 1.025 0.385 1.414 -0.007 c 0.389 -0.393 0.386 -1.026 -0.007 -1.415 l -5.303 -5.25 c -0.39 -0.385 -1.017 -0.385 -1.407 0.0 l -5.303 5.25 Z M 19.19 23.96 c -0.392 -0.388 -0.396 -1.021 -0.007 -1.414 c 0.389 -0.392 1.022 -0.395 1.414 -0.007 l 3.6 3.564 V 7.5 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 18.603 l 3.599 -3.564 c 0.392 -0.388 1.025 -0.385 1.414 0.007 c 0.388 0.393 0.385 1.026 -0.007 1.415 L 25.9 29.21 c -0.39 0.386 -1.017 0.386 -1.407 0.0 l -5.303 -5.25 Z")
        )
    }.build()
}
