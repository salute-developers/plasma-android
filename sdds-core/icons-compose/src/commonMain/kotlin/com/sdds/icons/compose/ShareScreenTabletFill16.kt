package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenTabletFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenTabletFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.925 2.0 C 1.862 2.0 1.0 2.862 1.0 3.925 v 7.35 C 1.0 12.338 1.862 13.2 2.925 13.2 H 6.25 V 9.35 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 H 15.0 V 3.925 C 15.0 2.862 14.138 2.0 13.075 2.0 H 2.925 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.3 10.12 c 0.0 -0.392 0.0 -0.588 0.077 -0.738 c 0.067 -0.132 0.174 -0.239 0.306 -0.306 C 7.833 9.0 8.029 9.0 8.421 9.0 h 5.46 c 0.392 0.0 0.588 0.0 0.738 0.076 c 0.131 0.067 0.238 0.174 0.306 0.306 C 15.0 9.532 15.0 9.728 15.0 10.12 v 3.36 c 0.0 0.392 0.0 0.588 -0.076 0.738 c -0.068 0.132 -0.175 0.239 -0.306 0.306 c -0.15 0.076 -0.346 0.076 -0.738 0.076 H 8.42 c -0.392 0.0 -0.588 0.0 -0.738 -0.076 c -0.132 -0.067 -0.239 -0.174 -0.306 -0.306 c -0.076 -0.15 -0.076 -0.346 -0.076 -0.738 v -3.36 Z")
        )
    }.build()
}
