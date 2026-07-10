package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideDownFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideDownFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.554 2.75 c 0.966 0.0 1.75 0.784 1.75 1.75 v 8.588 H 18.5 c 0.302 0.0 0.574 0.18 0.691 0.459 c 0.117 0.278 0.056 0.598 -0.154 0.814 l -6.5 6.662 C 12.396 21.168 12.202 21.25 12.0 21.25 s -0.396 -0.082 -0.537 -0.227 l -6.5 -6.662 c -0.21 -0.216 -0.271 -0.536 -0.155 -0.814 c 0.118 -0.278 0.39 -0.46 0.692 -0.46 h 3.196 V 4.5 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 3.108 Z")
        )
    }.build()
}
