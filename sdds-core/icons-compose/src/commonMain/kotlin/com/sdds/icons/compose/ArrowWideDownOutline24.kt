package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.057 13.713 c 0.116 -0.28 0.39 -0.463 0.693 -0.463 H 8.0 v -9.5 C 8.0 2.784 8.784 2.0 9.75 2.0 h 4.5 C 15.216 2.0 16.0 2.784 16.0 3.75 v 9.5 h 3.25 c 0.303 0.0 0.577 0.183 0.693 0.463 c 0.116 0.28 0.052 0.603 -0.163 0.817 l -7.25 7.25 c -0.292 0.293 -0.767 0.293 -1.06 0.0 l -7.25 -7.25 c -0.215 -0.214 -0.279 -0.537 -0.163 -0.817 Z M 12.0 20.189 l 5.44 -5.439 h -2.19 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 3.75 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -4.5 C 9.612 3.5 9.5 3.612 9.5 3.75 V 14.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 H 6.56 L 12.0 20.19 Z")
        )
    }.build()
}
