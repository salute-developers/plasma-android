package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.935 7.273 h 9.44 c 1.38 0.0 2.5 1.12 2.5 2.5 v 14.233 c 0.0 1.38 -1.12 2.5 -2.5 2.5 h -4.061 c -0.038 0.068 -0.08 0.14 -0.125 0.217 c -0.288 0.485 -0.74 1.124 -1.401 1.762 c -1.341 1.292 -3.506 2.538 -6.788 2.538 c -3.282 0.0 -5.447 -1.246 -6.788 -2.538 c -0.662 -0.638 -1.113 -1.277 -1.401 -1.762 c -0.046 -0.076 -0.087 -0.149 -0.125 -0.217 H 5.625 c -1.38 0.0 -2.5 -1.12 -2.5 -2.5 V 9.773 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 h 9.44 C 15.353 5.917 16.558 4.898 18.0 4.898 s 2.647 1.019 2.935 2.375 Z M 18.0 10.898 c 1.161 0.0 2.168 -0.66 2.667 -1.625 h 9.708 c 0.276 0.0 0.5 0.224 0.5 0.5 v 14.233 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 5.625 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 9.773 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 9.708 c 0.499 0.966 1.506 1.625 2.667 1.625 Z m -5.4 16.147 c -0.188 -0.182 -0.355 -0.364 -0.5 -0.539 h 11.8 c -0.145 0.175 -0.311 0.357 -0.5 0.539 c -1.003 0.966 -2.682 1.978 -5.4 1.978 c -2.718 0.0 -4.397 -1.012 -5.4 -1.978 Z")
        )
    }.build()
}
