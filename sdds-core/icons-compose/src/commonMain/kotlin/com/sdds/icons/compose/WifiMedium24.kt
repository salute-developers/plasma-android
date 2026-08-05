package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiMedium24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiMedium24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 15.36 c 1.381 0.0 2.5 1.12 2.5 2.5 c 0.0 1.381 -1.119 2.5 -2.5 2.5 c -1.38 0.0 -2.5 -1.119 -2.5 -2.5 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 10.25 c 2.056 0.0 4.027 0.816 5.48 2.27 c 0.293 0.292 0.293 0.768 0.0 1.061 c -0.292 0.293 -0.768 0.293 -1.06 0.0 c -1.173 -1.172 -2.762 -1.83 -4.42 -1.831 c -1.657 0.0 -3.247 0.66 -4.419 1.831 c -0.292 0.293 -0.768 0.293 -1.061 0.0 c -0.293 -0.293 -0.293 -0.769 0.0 -1.061 c 1.453 -1.454 3.425 -2.27 5.48 -2.27 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 6.75 c 2.851 0.0 5.586 1.133 7.602 3.148 c 0.293 0.293 0.292 0.768 0.0 1.061 c -0.293 0.293 -0.768 0.293 -1.06 0.0 C 16.806 9.224 14.452 8.25 12.0 8.25 c -2.453 0.0 -4.806 0.974 -6.54 2.709 c -0.294 0.293 -0.768 0.293 -1.061 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 C 6.415 7.882 9.149 6.75 12.0 6.75 Z")
        )
    }.build()
}
