package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Snow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Snow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.965 1.433 C 6.79 1.22 6.475 1.188 6.262 1.363 c -0.214 0.175 -0.246 0.49 -0.07 0.704 l 1.306 1.598 v 3.48 L 4.408 5.4 L 3.643 3.488 C 3.542 3.234 3.25 3.111 2.99 3.213 C 2.73 3.316 2.603 3.605 2.705 3.86 L 3.3 5.349 l -1.617 0.24 C 1.407 5.632 1.216 5.885 1.255 6.155 c 0.039 0.271 0.294 0.457 0.57 0.416 l 2.074 -0.309 l 3.082 1.74 L 3.9 9.744 l -2.074 -0.31 C 1.549 9.394 1.294 9.58 1.255 9.85 c -0.04 0.27 0.152 0.523 0.428 0.564 L 3.3 10.655 l -0.595 1.49 C 2.603 12.4 2.73 12.688 2.99 12.79 c 0.26 0.103 0.552 -0.02 0.654 -0.274 l 0.763 -1.912 l 3.091 -1.746 v 3.48 l -1.307 1.598 c -0.175 0.214 -0.143 0.53 0.07 0.704 c 0.214 0.175 0.53 0.143 0.704 -0.07 l 1.033 -1.264 l 1.034 1.264 c 0.175 0.213 0.49 0.245 0.703 0.07 c 0.214 -0.175 0.246 -0.49 0.07 -0.704 l -1.307 -1.598 v -3.48 l 3.095 1.747 l 0.764 1.912 c 0.101 0.254 0.394 0.377 0.653 0.275 c 0.26 -0.102 0.387 -0.391 0.286 -0.645 l -0.595 -1.49 l 1.616 -0.241 c 0.276 -0.041 0.468 -0.294 0.429 -0.565 c -0.04 -0.27 -0.295 -0.457 -0.57 -0.416 l -2.074 0.31 L 9.016 8.0 L 12.1 6.26 l 2.074 0.309 c 0.276 0.04 0.531 -0.145 0.57 -0.416 c 0.04 -0.27 -0.152 -0.524 -0.428 -0.565 L 12.7 5.347 l 0.595 -1.49 c 0.102 -0.255 -0.026 -0.544 -0.285 -0.646 c -0.26 -0.102 -0.552 0.02 -0.653 0.275 l -0.764 1.912 l -3.095 1.747 v -3.48 l 1.308 -1.598 c 0.175 -0.214 0.143 -0.53 -0.07 -0.704 c -0.214 -0.175 -0.53 -0.143 -0.704 0.07 L 7.998 2.697 L 6.965 1.433 Z")
        )
    }.build()
}
