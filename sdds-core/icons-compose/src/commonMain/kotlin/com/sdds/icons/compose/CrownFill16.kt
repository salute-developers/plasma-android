package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CrownFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CrownFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.056 3.744 c 0.072 -0.095 0.131 -0.198 0.177 -0.308 c 0.118 -0.285 0.139 -0.6 0.059 -0.898 C 9.212 2.24 9.036 1.977 8.79 1.789 C 8.546 1.602 8.246 1.5 7.937 1.5 c -0.308 0.0 -0.609 0.102 -0.853 0.29 c -0.245 0.187 -0.421 0.45 -0.501 0.748 c -0.08 0.297 -0.06 0.613 0.059 0.898 c 0.045 0.11 0.105 0.213 0.176 0.308 l -2.146 2.49 c -0.055 0.063 -0.147 0.08 -0.22 0.038 L 3.19 5.556 c 0.02 -0.128 0.02 -0.259 0.003 -0.389 c -0.04 -0.305 -0.18 -0.589 -0.398 -0.807 C 2.575 4.142 2.29 4.002 1.985 3.962 C 1.68 3.922 1.368 3.983 1.101 4.138 C 0.834 4.292 0.625 4.529 0.507 4.814 c -0.118 0.285 -0.14 0.6 -0.06 0.898 c 0.08 0.298 0.257 0.561 0.502 0.749 c 0.077 0.06 0.161 0.11 0.249 0.152 l 1.204 6.147 c 0.113 0.575 0.618 0.99 1.204 0.99 h 8.662 c 0.587 0.0 1.091 -0.415 1.204 -0.99 l 1.19 -6.072 c 0.158 -0.05 0.307 -0.126 0.44 -0.227 c 0.244 -0.188 0.42 -0.45 0.5 -0.748 c 0.08 -0.298 0.06 -0.614 -0.059 -0.899 c -0.118 -0.284 -0.327 -0.522 -0.594 -0.676 c -0.268 -0.154 -0.578 -0.216 -0.884 -0.176 c -0.306 0.04 -0.59 0.18 -0.809 0.398 c -0.218 0.218 -0.358 0.502 -0.399 0.807 c -0.013 0.099 -0.015 0.198 -0.007 0.296 l -1.428 0.809 c -0.073 0.041 -0.165 0.025 -0.22 -0.038 l -2.146 -2.49 Z M 7.937 11.65 c 0.775 0.0 1.403 -0.627 1.403 -1.4 c 0.0 -0.773 -0.628 -1.4 -1.403 -1.4 c -0.774 0.0 -1.402 0.627 -1.402 1.4 c 0.0 0.773 0.628 1.4 1.402 1.4 Z")
        )
    }.build()
}
