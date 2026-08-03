package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.057 10.287 C 3.941 10.007 4.005 9.684 4.22 9.47 l 7.25 -7.25 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 7.25 7.25 c 0.215 0.214 0.279 0.537 0.163 0.817 c -0.116 0.28 -0.39 0.463 -0.693 0.463 H 16.0 v 9.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -4.5 C 8.784 22.0 8.0 21.216 8.0 20.25 v -9.5 H 4.75 c -0.303 0.0 -0.577 -0.183 -0.693 -0.463 Z M 6.561 9.25 H 8.75 C 9.164 9.25 9.5 9.586 9.5 10.0 v 10.25 c 0.0 0.138 0.112 0.25 0.25 0.25 h 4.5 c 0.138 0.0 0.25 -0.112 0.25 -0.25 V 10.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.19 L 12.0 3.81 L 6.56 9.25 Z")
        )
    }.build()
}
