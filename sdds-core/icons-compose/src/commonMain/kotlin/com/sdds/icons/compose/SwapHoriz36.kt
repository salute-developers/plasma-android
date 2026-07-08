package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHoriz36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHoriz36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.96 4.796 c -0.388 -0.392 -1.021 -0.395 -1.414 -0.007 c -0.392 0.389 -0.395 1.022 -0.007 1.415 l 3.564 3.599 H 7.5 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 18.603 l -3.564 3.599 c -0.388 0.392 -0.385 1.026 0.007 1.414 c 0.393 0.389 1.026 0.386 1.415 -0.007 l 5.25 -5.303 c 0.386 -0.39 0.386 -1.017 0.0 -1.407 l -5.25 -5.303 Z M 12.04 19.19 c 0.388 -0.392 1.021 -0.395 1.414 -0.007 c 0.392 0.389 0.395 1.022 0.007 1.414 l -3.564 3.6 H 28.5 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 9.897 l 3.564 3.599 c 0.388 0.392 0.385 1.025 -0.007 1.414 c -0.393 0.389 -1.026 0.385 -1.415 -0.007 l -5.25 -5.303 c -0.385 -0.39 -0.385 -1.017 0.0 -1.407 l 5.25 -5.303 Z")
        )
    }.build()
}
