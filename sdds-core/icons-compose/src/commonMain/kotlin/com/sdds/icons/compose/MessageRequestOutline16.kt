package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageRequestOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageRequestOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.36 6.426 C 4.0 4.423 5.87 2.975 8.074 2.975 c 2.731 0.0 4.949 2.224 4.949 4.97 c 0.0 2.748 -2.218 4.972 -4.95 4.972 c -0.592 0.0 -1.16 -0.104 -1.685 -0.296 c -0.49 -0.178 -1.064 -0.264 -1.632 -0.104 l -1.714 0.482 l 0.513 -1.84 c 0.138 -0.493 0.066 -0.992 -0.098 -1.417 c -0.1 -0.258 -0.389 -0.386 -0.646 -0.287 c -0.258 0.1 -0.386 0.389 -0.287 0.646 c 0.108 0.28 0.134 0.554 0.068 0.79 l -0.539 1.931 c -0.198 0.711 0.458 1.365 1.168 1.165 l 1.806 -0.507 c 0.306 -0.086 0.658 -0.05 1.02 0.081 c 0.633 0.23 1.316 0.356 2.027 0.356 c 3.287 0.0 5.949 -2.675 5.949 -5.971 c 0.0 -3.296 -2.662 -5.971 -5.95 -5.971 c -2.653 0.0 -4.898 1.743 -5.666 4.147 C 2.323 6.385 2.47 6.667 2.732 6.751 C 2.995 6.834 3.276 6.689 3.36 6.426 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.056 6.323 C 5.86 6.127 5.862 5.811 6.057 5.616 C 6.253 5.42 6.57 5.422 6.764 5.617 l 2.12 2.128 c 0.194 0.195 0.194 0.51 0.0 0.706 l -2.12 2.127 c -0.195 0.196 -0.511 0.197 -0.707 0.002 c -0.195 -0.195 -0.196 -0.512 -0.001 -0.707 l 1.27 -1.275 H 2.474 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 s 0.223 -0.5 0.5 -0.5 h 4.85 l -1.27 -1.275 Z")
        )
    }.build()
}
