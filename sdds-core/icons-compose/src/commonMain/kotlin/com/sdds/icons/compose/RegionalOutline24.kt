package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RegionalOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RegionalOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.288 3.288 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.061 0.0 c -0.627 0.626 -1.124 1.37 -1.463 2.19 C 5.424 5.235 5.25 6.113 5.25 7.0 c 0.0 0.887 0.175 1.765 0.514 2.584 c 0.339 0.819 0.836 1.563 1.463 2.19 c 0.293 0.292 0.768 0.292 1.06 0.0 c 0.294 -0.293 0.294 -0.768 0.0 -1.061 C 7.8 10.225 7.414 9.647 7.15 9.01 C 6.886 8.373 6.75 7.69 6.75 7.0 c 0.0 -0.689 0.136 -1.372 0.4 -2.009 c 0.263 -0.637 0.65 -1.215 1.138 -1.703 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.712 2.227 c 0.293 -0.292 0.768 -0.292 1.061 0.0 c 0.627 0.627 1.124 1.371 1.463 2.19 c 0.34 0.82 0.514 1.697 0.514 2.583 c 0.0 0.887 -0.175 1.765 -0.514 2.584 c -0.339 0.819 -0.836 1.563 -1.463 2.19 c -0.293 0.292 -0.768 0.292 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.061 c 0.487 -0.488 0.874 -1.066 1.137 -1.703 c 0.264 -0.637 0.4 -1.32 0.4 -2.01 c 0.0 -0.689 -0.136 -1.372 -0.4 -2.009 c -0.264 -0.637 -0.65 -1.215 -1.138 -1.703 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.25 C 9.929 3.25 8.25 4.93 8.25 7.0 c 0.0 1.454 0.827 2.714 2.035 3.336 L 7.278 21.048 c -0.112 0.399 0.12 0.813 0.52 0.925 c 0.398 0.111 0.812 -0.121 0.924 -0.52 l 0.619 -2.203 l 4.238 -3.853 l 1.699 6.056 c 0.112 0.399 0.526 0.631 0.925 0.52 c 0.399 -0.112 0.631 -0.526 0.52 -0.925 l -3.007 -10.712 C 14.924 9.713 15.75 8.453 15.75 7.0 c 0.0 -2.07 -1.679 -3.75 -3.75 -3.75 Z M 9.75 7.0 c 0.0 -1.242 1.007 -2.25 2.25 -2.25 S 14.25 5.758 14.25 7.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 S 9.75 8.243 9.75 7.0 Z m 2.522 3.74 c -0.09 0.007 -0.18 0.01 -0.272 0.01 c -0.09 0.0 -0.181 -0.003 -0.27 -0.01 l -1.625 5.788 l 3.02 -2.746 l -0.853 -3.041 Z")
        )
    }.build()
}
