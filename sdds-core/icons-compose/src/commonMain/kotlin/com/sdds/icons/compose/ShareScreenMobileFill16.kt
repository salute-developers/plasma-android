package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenMobileFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenMobileFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.925 2.0 C 1.862 2.0 1.0 2.862 1.0 3.925 v 7.35 C 1.0 12.338 1.862 13.2 2.925 13.2 H 6.95 V 7.95 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 3.5 c 0.773 0.0 1.4 0.627 1.4 1.4 v 5.242 C 14.231 13.104 15.0 12.28 15.0 11.275 v -7.35 C 15.0 2.862 14.138 2.0 13.075 2.0 H 2.925 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 8.72 c 0.0 -0.392 0.0 -0.588 0.076 -0.738 c 0.067 -0.131 0.174 -0.239 0.306 -0.306 C 8.532 7.6 8.728 7.6 9.12 7.6 h 1.96 c 0.392 0.0 0.588 0.0 0.738 0.076 c 0.132 0.067 0.239 0.175 0.306 0.306 C 12.2 8.132 12.2 8.328 12.2 8.72 v 4.76 c 0.0 0.392 0.0 0.588 -0.076 0.738 c -0.067 0.132 -0.175 0.239 -0.306 0.306 c -0.15 0.076 -0.346 0.076 -0.738 0.076 H 9.12 c -0.392 0.0 -0.588 0.0 -0.738 -0.076 c -0.132 -0.067 -0.239 -0.174 -0.306 -0.306 C 8.0 14.068 8.0 13.872 8.0 13.48 V 8.72 Z")
        )
    }.build()
}
