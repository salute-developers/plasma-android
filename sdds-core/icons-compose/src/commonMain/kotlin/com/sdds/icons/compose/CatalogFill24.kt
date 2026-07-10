package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CatalogFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CatalogFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 6.694 c 0.0 -0.978 0.707 -1.812 1.671 -1.973 l 8.0 -1.333 C 13.891 3.185 15.0 4.125 15.0 5.361 v 13.278 c 0.0 1.236 -1.11 2.176 -2.329 1.973 l -8.0 -1.333 C 3.707 19.117 3.0 18.283 3.0 17.306 V 6.694 Z m 15.747 12.133 l 0.1 0.008 c 1.161 0.09 2.153 -0.83 2.153 -1.994 V 7.16 c 0.0 -1.166 -0.992 -2.084 -2.154 -1.995 l -0.099 0.008 C 18.907 5.462 19.0 5.794 19.0 6.149 v 11.704 c 0.0 0.354 -0.092 0.687 -0.253 0.974 Z m -2.89 1.02 l -0.249 -0.017 C 15.854 19.5 16.0 19.089 16.0 18.64 V 5.36 c 0.0 -0.449 -0.146 -0.86 -0.392 -1.19 l 0.25 -0.017 C 17.016 4.07 18.0 4.988 18.0 6.149 v 11.704 c 0.0 1.16 -0.984 2.077 -2.142 1.995 Z")
        )
    }.build()
}
