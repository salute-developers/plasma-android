package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileWavesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileWavesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.646 1.0 H 6.27 C 5.388 1.0 4.947 1.0 4.61 1.172 C 4.314 1.322 4.073 1.564 3.922 1.86 C 3.75 2.197 3.75 2.638 3.75 3.52 v 8.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 4.947 15.0 5.388 15.0 6.27 15.0 h 3.46 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 c 0.172 -0.337 0.172 -0.778 0.172 -1.66 V 8.493 C 12.167 8.498 12.084 8.5 12.0 8.5 C 9.515 8.5 7.5 6.485 7.5 4.0 c 0.0 -0.075 0.002 -0.15 0.006 -0.225 H 7.113 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 7.67 C 7.857 2.108 8.196 1.503 8.646 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 4.0 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m -5.44 -0.044 c 0.05 -0.187 0.242 -0.298 0.429 -0.248 c 0.364 0.098 0.686 0.313 0.916 0.612 c 0.23 0.3 0.354 0.666 0.354 1.044 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.223 -0.074 -0.44 -0.21 -0.617 c -0.135 -0.177 -0.326 -0.305 -0.541 -0.362 c -0.187 -0.05 -0.298 -0.242 -0.248 -0.43 Z m 0.958 -2.189 c -0.187 -0.05 -0.378 0.061 -0.428 0.248 c -0.05 0.187 0.06 0.378 0.247 0.428 c 0.65 0.175 1.225 0.559 1.635 1.093 c 0.41 0.534 0.632 1.189 0.632 1.862 c 0.0 0.194 0.157 0.35 0.35 0.35 c 0.194 0.0 0.35 -0.156 0.35 -0.35 c 0.0 -0.827 -0.273 -1.632 -0.776 -2.288 c -0.504 -0.657 -1.21 -1.128 -2.01 -1.343 Z")
        )
    }.build()
}
