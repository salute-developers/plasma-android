package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertOff36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.16 5.496 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -3.55 3.55 V 7.501 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 2.131 L 11.803 22.025 V 9.898 l 3.599 3.564 c 0.392 0.388 1.026 0.385 1.414 -0.008 c 0.389 -0.392 0.386 -1.025 -0.007 -1.414 l -5.303 -5.25 c -0.39 -0.385 -1.017 -0.385 -1.407 0.0 l -5.303 5.25 c -0.392 0.389 -0.395 1.022 -0.007 1.415 c 0.389 0.392 1.022 0.395 1.415 0.007 l 3.599 -3.564 v 14.127 L 4.29 29.538 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.16 5.496 Z M 11.803 27.613 l -1.649 1.649 c 0.175 0.149 0.401 0.239 0.649 0.239 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -0.888 Z m 14.393 -1.51 V 13.22 l -2.0 2.0 v 10.884 l -3.6 -3.564 c -0.392 -0.388 -1.025 -0.385 -1.414 0.007 c -0.388 0.393 -0.385 1.026 0.007 1.415 l 5.303 5.25 c 0.39 0.385 1.017 0.385 1.407 0.0 l 5.303 -5.25 c 0.392 -0.389 0.395 -1.022 0.007 -1.415 c -0.389 -0.392 -1.022 -0.395 -1.414 -0.007 l -3.6 3.564 Z")
        )
    }.build()
}
