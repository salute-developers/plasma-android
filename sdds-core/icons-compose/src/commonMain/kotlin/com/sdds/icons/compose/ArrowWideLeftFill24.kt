package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.639 4.963 c 0.215 -0.21 0.536 -0.271 0.814 -0.154 c 0.278 0.117 0.46 0.39 0.46 0.691 v 3.196 H 19.5 c 0.966 0.0 1.75 0.784 1.75 1.75 v 3.108 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -8.588 V 18.5 c 0.0 0.302 -0.18 0.574 -0.459 0.692 c -0.278 0.116 -0.598 0.056 -0.814 -0.155 l -6.662 -6.5 C 2.832 12.396 2.75 12.202 2.75 12.0 s 0.082 -0.396 0.227 -0.537 l 6.662 -6.5 Z")
        )
    }.build()
}
