package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyReal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyReal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.85 4.7 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 0.527 C 9.24 5.435 8.8 6.014 8.8 6.695 V 6.8 c 0.0 0.856 0.694 1.55 1.55 1.55 c 0.304 0.0 0.55 0.246 0.55 0.55 v 0.105 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 9.533 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 9.85 V 11.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.527 c 0.61 -0.209 1.05 -0.787 1.05 -1.468 V 8.9 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 c -0.304 0.0 -0.55 -0.246 -0.55 -0.55 V 6.695 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 0.817 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 10.85 V 4.7 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.1 4.9 c -0.276 0.0 -0.5 0.224 -0.5 0.5 V 11.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 8.865 h 0.6 l 1.259 2.37 c 0.13 0.243 0.432 0.336 0.676 0.207 c 0.244 -0.13 0.336 -0.433 0.207 -0.677 L 7.238 8.688 C 7.923 8.376 8.4 7.685 8.4 6.882 C 8.4 5.787 7.513 4.9 6.418 4.9 H 5.1 Z m 1.318 2.965 H 5.6 V 5.9 h 0.818 C 6.96 5.9 7.4 6.34 7.4 6.882 c 0.0 0.543 -0.44 0.983 -0.982 0.983 Z")
        )
    }.build()
}
