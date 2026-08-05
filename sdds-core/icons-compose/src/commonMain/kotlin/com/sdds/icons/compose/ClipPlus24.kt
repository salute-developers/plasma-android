package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClipPlus24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClipPlus24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.586 4.93 c 2.343 -2.344 6.142 -2.344 8.485 0.0 c 1.813 1.812 2.223 4.496 1.23 6.704 c -0.449 -0.216 -0.927 -0.38 -1.427 -0.488 c 0.819 -1.679 0.531 -3.761 -0.864 -5.156 c -1.757 -1.757 -4.606 -1.757 -6.364 0.0 l -7.778 7.778 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 7.778 -7.779 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.212 19.152 c 0.139 0.53 0.343 1.034 0.603 1.501 c -1.198 1.013 -2.941 1.11 -4.25 0.204 c -1.796 -1.244 -2.027 -3.809 -0.483 -5.353 l 7.04 -7.04 c 0.292 -0.292 0.767 -0.292 1.06 0.0 c 0.293 0.294 0.293 0.769 0.0 1.061 l -7.04 7.04 c -0.882 0.882 -0.75 2.348 0.277 3.058 c 0.794 0.55 1.869 0.453 2.552 -0.23 l 0.24 -0.24 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 20.538 12.0 17.5 c 0.0 -3.037 2.462 -5.5 5.5 -5.5 s 5.5 2.463 5.5 5.5 Z M 17.5 14.0 c 0.276 0.0 0.5 0.224 0.5 0.5 V 17.0 h 2.5 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 18.0 v 2.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 S 17.0 20.777 17.0 20.5 V 18.0 h -2.5 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 17.0 v -2.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
