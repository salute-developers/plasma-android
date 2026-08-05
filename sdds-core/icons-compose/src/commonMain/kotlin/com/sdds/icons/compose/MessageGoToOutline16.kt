package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageGoToOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageGoToOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.084 7.944 c 0.0 -2.738 2.253 -4.97 5.046 -4.97 c 2.253 0.0 4.157 1.454 4.807 3.454 c 0.086 0.262 0.368 0.406 0.63 0.32 c 0.263 -0.085 0.406 -0.367 0.321 -0.63 c -0.782 -2.406 -3.067 -4.143 -5.758 -4.143 c -3.332 0.0 -6.046 2.666 -6.046 5.97 c 0.0 0.712 0.127 1.397 0.36 2.032 c 0.134 0.365 0.17 0.72 0.082 1.028 l -0.514 1.813 c -0.202 0.71 0.45 1.367 1.162 1.17 l 1.874 -0.517 c 0.301 -0.083 0.647 -0.048 1.001 0.08 c 0.65 0.235 1.351 0.363 2.081 0.363 c 2.566 0.0 4.762 -1.579 5.64 -3.812 c 0.1 -0.257 -0.027 -0.547 -0.284 -0.648 c -0.257 -0.1 -0.547 0.026 -0.648 0.283 c -0.729 1.856 -2.56 3.177 -4.708 3.177 c -0.612 0.0 -1.198 -0.107 -1.74 -0.303 c -0.485 -0.176 -1.05 -0.258 -1.608 -0.104 L 3.0 13.0 l 0.488 -1.72 c 0.163 -0.573 0.076 -1.152 -0.105 -1.646 C 3.19 9.106 3.084 8.538 3.084 7.944 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.869 6.325 c 0.197 -0.194 0.199 -0.51 0.005 -0.707 C 9.68 5.422 9.364 5.42 9.167 5.613 L 7.01 7.74 C 6.915 7.834 6.861 7.963 6.861 8.096 c 0.0 0.134 0.054 0.262 0.149 0.356 l 2.157 2.127 c 0.196 0.194 0.513 0.192 0.707 -0.005 c 0.194 -0.196 0.192 -0.513 -0.005 -0.707 L 8.58 8.597 h 4.943 c 0.277 0.0 0.5 -0.225 0.5 -0.5 c 0.0 -0.277 -0.223 -0.5 -0.5 -0.5 H 8.58 L 9.87 6.324 Z")
        )
    }.build()
}
