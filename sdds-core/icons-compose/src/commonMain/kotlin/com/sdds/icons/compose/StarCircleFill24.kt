package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 0.476 -17.536 c -0.15 -0.461 -0.802 -0.461 -0.952 0.0 l -1.432 4.41 c -0.067 0.205 -0.26 0.345 -0.476 0.345 H 4.98 c -0.484 0.0 -0.685 0.62 -0.294 0.904 l 3.752 2.726 c 0.175 0.127 0.248 0.353 0.181 0.559 l -1.433 4.41 c -0.15 0.46 0.378 0.843 0.77 0.559 l 3.751 -2.726 c 0.175 -0.127 0.413 -0.127 0.588 0.0 l 3.751 2.726 c 0.392 0.284 0.92 -0.099 0.77 -0.56 l -1.433 -4.41 c -0.067 -0.205 0.006 -0.43 0.181 -0.558 l 3.752 -2.726 c 0.391 -0.284 0.19 -0.904 -0.294 -0.904 h -4.637 c -0.217 0.0 -0.409 -0.14 -0.476 -0.346 l -1.432 -4.41 Z")
        )
    }.build()
}
