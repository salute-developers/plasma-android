package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherBrillianceFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherBrillianceFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.813 8.87 c 0.0 -2.685 2.167 -4.87 4.852 -4.87 c 2.684 0.0 4.851 2.185 4.851 4.87 h 7.446 c 0.617 0.0 1.118 0.502 1.118 1.123 c 0.0 0.62 -0.5 1.123 -1.118 1.123 h -1.863 v 8.656 l -0.504 -1.537 c -0.786 -2.403 -4.169 -2.403 -4.955 0.0 l -0.785 2.398 c -0.222 0.678 -0.751 1.21 -1.426 1.433 l -2.386 0.788 c -2.392 0.79 -2.392 4.19 0.0 4.98 l 1.53 0.506 h -5.309 c -1.003 0.0 -1.824 0.0 -2.491 -0.055 c -0.69 -0.057 -1.314 -0.178 -1.897 -0.476 c -0.911 -0.467 -1.653 -1.211 -2.117 -2.127 c -0.297 -0.585 -0.417 -1.212 -0.473 -1.906 c -0.055 -0.67 -0.055 -1.495 -0.055 -2.504 V 11.116 H 5.368 c -0.618 0.0 -1.118 -0.503 -1.118 -1.123 s 0.5 -1.124 1.118 -1.124 h 7.445 Z m 2.25 0.0 c 0.0 -1.452 1.17 -2.62 2.602 -2.62 c 1.431 0.0 2.601 1.168 2.601 2.62 h -5.202 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.474 18.944 c -0.113 -0.344 -0.6 -0.344 -0.713 0.0 l -0.781 2.387 c -0.445 1.358 -1.508 2.424 -2.865 2.873 l -2.373 0.784 c -0.343 0.113 -0.343 0.599 0.0 0.712 l 2.373 0.784 c 1.357 0.449 2.42 1.515 2.865 2.873 l 0.781 2.387 c 0.113 0.344 0.6 0.344 0.713 0.0 l 0.781 -2.387 C 26.7 28.0 27.763 26.933 29.12 26.484 l 2.373 -0.784 c 0.343 -0.113 0.343 -0.599 0.0 -0.712 l -2.373 -0.784 c -1.357 -0.449 -2.42 -1.515 -2.865 -2.873 l -0.781 -2.387 Z")
        )
    }.build()
}
