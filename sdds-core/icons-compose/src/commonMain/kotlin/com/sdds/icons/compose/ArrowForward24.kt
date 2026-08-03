package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.97 4.72 c 0.274 -0.275 0.71 -0.292 1.004 -0.052 L 16.03 4.72 l 3.75 3.75 C 19.92 8.61 20.0 8.8 20.0 9.0 s -0.08 0.39 -0.22 0.53 l -3.75 3.75 l -0.056 0.052 c -0.295 0.24 -0.73 0.223 -1.004 -0.052 c -0.275 -0.274 -0.292 -0.709 -0.052 -1.004 l 0.052 -0.056 l 2.47 -2.47 H 9.124 c -2.002 0.0 -3.625 1.623 -3.625 3.625 S 7.123 17.0 9.125 17.0 H 11.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 9.125 C 6.295 18.5 4.0 16.206 4.0 13.375 c 0.0 -2.83 2.295 -5.125 5.125 -5.125 h 8.314 l -2.47 -2.47 c -0.292 -0.293 -0.292 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
