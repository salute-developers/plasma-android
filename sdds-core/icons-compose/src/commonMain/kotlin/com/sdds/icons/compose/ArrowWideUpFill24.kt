package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideUpFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideUpFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.75 c 0.202 0.0 0.396 0.082 0.537 0.227 l 6.5 6.662 c 0.21 0.216 0.271 0.536 0.154 0.814 c -0.117 0.278 -0.39 0.46 -0.691 0.46 h -3.196 V 19.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -3.108 c -0.966 0.0 -1.75 -0.784 -1.75 -1.75 v -8.588 H 5.5 c -0.302 0.0 -0.574 -0.18 -0.692 -0.459 c -0.116 -0.278 -0.056 -0.599 0.155 -0.814 l 6.5 -6.662 C 11.603 2.832 11.798 2.75 12.0 2.75 Z")
        )
    }.build()
}
