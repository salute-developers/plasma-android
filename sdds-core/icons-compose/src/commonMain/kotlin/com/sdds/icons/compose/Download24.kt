package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Download24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Download24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 3.75 C 12.75 3.336 12.414 3.0 12.0 3.0 s -0.75 0.336 -0.75 0.75 v 11.69 l -2.47 -2.47 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 3.75 3.75 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.75 -3.75 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -2.47 2.47 V 3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 10.75 C 4.5 10.336 4.164 10.0 3.75 10.0 S 3.0 10.336 3.0 10.75 v 5.531 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 6.494 21.0 7.045 21.0 7.718 21.0 h 8.563 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 21.0 17.506 21.0 16.955 21.0 16.281 V 10.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 5.5 c 0.0 0.712 0.0 1.202 -0.032 1.58 c -0.03 0.371 -0.085 0.57 -0.159 0.715 c -0.168 0.329 -0.435 0.596 -0.765 0.764 c -0.144 0.074 -0.343 0.13 -0.713 0.16 c -0.38 0.03 -0.869 0.031 -1.581 0.031 h -8.5 c -0.712 0.0 -1.202 0.0 -1.58 -0.032 c -0.371 -0.03 -0.57 -0.085 -0.714 -0.159 c -0.33 -0.168 -0.597 -0.435 -0.765 -0.765 c -0.074 -0.144 -0.13 -0.343 -0.16 -0.713 C 4.502 17.45 4.5 16.962 4.5 16.25 v -5.5 Z")
        )
    }.build()
}
