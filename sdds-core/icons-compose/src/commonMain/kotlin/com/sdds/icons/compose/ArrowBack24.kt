package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBack24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBack24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.026 4.668 c 0.295 -0.24 0.73 -0.223 1.004 0.052 c 0.293 0.293 0.293 0.767 0.0 1.06 L 6.56 8.25 h 8.315 c 2.83 0.0 5.125 2.295 5.125 5.125 S 17.706 18.5 14.875 18.5 H 12.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 12.086 17.0 12.5 17.0 h 2.375 c 2.002 0.0 3.625 -1.623 3.625 -3.625 S 16.877 9.75 14.875 9.75 H 6.561 l 2.47 2.47 l 0.051 0.056 c 0.24 0.295 0.223 0.73 -0.052 1.004 c -0.274 0.275 -0.709 0.292 -1.004 0.052 L 7.97 13.28 L 4.22 9.53 C 4.08 9.39 4.0 9.2 4.0 9.0 s 0.08 -0.39 0.22 -0.53 l 3.75 -3.75 l 0.056 -0.052 Z")
        )
    }.build()
}
