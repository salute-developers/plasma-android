package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideRightOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideRightOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.713 4.057 c 0.28 -0.116 0.603 -0.052 0.817 0.163 l 7.25 7.25 c 0.293 0.293 0.293 0.768 0.0 1.06 l -7.25 7.25 c -0.214 0.215 -0.537 0.279 -0.817 0.163 c -0.28 -0.116 -0.463 -0.39 -0.463 -0.693 V 16.0 h -9.5 C 2.784 16.0 2.0 15.216 2.0 14.25 v -4.5 C 2.0 8.784 2.784 8.0 3.75 8.0 h 9.5 V 4.75 c 0.0 -0.303 0.183 -0.577 0.463 -0.693 Z m 1.037 2.504 V 8.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 3.75 C 3.612 9.5 3.5 9.612 3.5 9.75 v 4.5 c 0.0 0.138 0.112 0.25 0.25 0.25 H 14.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.19 L 20.19 12.0 l -5.44 -5.44 Z")
        )
    }.build()
}
