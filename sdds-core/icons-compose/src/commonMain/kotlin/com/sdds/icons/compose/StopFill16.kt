package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StopFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StopFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.25 5.05 c 0.0 -0.98 0.0 -1.47 0.19 -1.844 c 0.169 -0.33 0.436 -0.597 0.766 -0.765 C 3.58 2.25 4.07 2.25 5.05 2.25 h 5.9 c 0.98 0.0 1.47 0.0 1.845 0.19 c 0.329 0.169 0.597 0.436 0.764 0.766 C 13.75 3.58 13.75 4.07 13.75 5.05 v 5.9 c 0.0 0.98 0.0 1.47 -0.19 1.845 c -0.168 0.329 -0.436 0.597 -0.766 0.764 c -0.374 0.191 -0.864 0.191 -1.844 0.191 h -5.9 c -0.98 0.0 -1.47 0.0 -1.844 -0.19 c -0.33 -0.168 -0.597 -0.436 -0.765 -0.766 C 2.25 12.42 2.25 11.93 2.25 10.95 v -5.9 Z")
        )
    }.build()
}
