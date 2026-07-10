package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RealFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RealFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.6 7.865 h 0.818 c 0.542 0.0 0.982 -0.44 0.982 -0.983 C 7.4 6.34 6.96 5.9 6.418 5.9 H 5.6 v 1.965 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 8.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 Z M 4.6 5.4 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.318 C 7.512 4.9 8.4 5.787 8.4 6.882 c 0.0 0.803 -0.477 1.494 -1.162 1.806 l 1.104 2.077 c 0.13 0.244 0.036 0.547 -0.207 0.676 c -0.244 0.13 -0.547 0.037 -0.677 -0.207 L 6.2 8.864 H 5.6 V 11.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 S 4.6 11.276 4.6 11.0 V 5.4 Z m 6.25 -0.7 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 0.527 C 9.24 5.435 8.8 6.014 8.8 6.695 V 6.8 c 0.0 0.856 0.694 1.55 1.55 1.55 c 0.304 0.0 0.55 0.246 0.55 0.55 v 0.105 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 9.533 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 9.85 V 11.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.527 c 0.61 -0.209 1.05 -0.787 1.05 -1.468 V 8.9 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 c -0.304 0.0 -0.55 -0.246 -0.55 -0.55 V 6.695 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 0.817 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 10.85 V 4.7 Z")
        )
    }.build()
}
