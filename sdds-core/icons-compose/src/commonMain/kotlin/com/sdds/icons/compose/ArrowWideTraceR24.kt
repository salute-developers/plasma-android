package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideTraceR24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideTraceR24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.53 4.22 c -0.214 -0.215 -0.537 -0.279 -0.817 -0.163 c -0.28 0.116 -0.463 0.39 -0.463 0.693 V 8.0 H 7.5 C 7.086 8.0 6.75 8.336 6.75 8.75 S 7.086 9.5 7.5 9.5 H 14.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 V 6.56 L 20.19 12.0 l -5.44 5.44 v -2.19 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 2.75 C 2.336 14.5 2.0 14.836 2.0 15.25 S 2.336 16.0 2.75 16.0 h 10.5 v 3.25 c 0.0 0.303 0.183 0.577 0.463 0.693 c 0.28 0.116 0.603 0.052 0.817 -0.163 l 7.25 -7.25 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 l -7.25 -7.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 11.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 8.414 11.25 8.0 11.25 H 4.5 Z")
        )
    }.build()
}
