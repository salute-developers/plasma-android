package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationArrowFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationArrowFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.999 2.887 c 0.681 -0.254 1.346 0.41 1.092 1.092 l -3.92 10.556 c -0.294 0.792 -1.439 0.716 -1.625 -0.108 L 6.442 9.555 c -0.002 -0.01 -0.01 -0.017 -0.018 -0.019 L 1.55 8.432 c -0.823 -0.186 -0.9 -1.33 -0.108 -1.625 L 12.0 2.888 Z")
        )
    }.build()
}
