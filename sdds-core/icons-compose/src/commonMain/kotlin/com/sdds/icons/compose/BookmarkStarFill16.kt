package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkStarFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkStarFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.467 1.75 H 6.533 c -0.433 0.0 -0.787 0.0 -1.074 0.026 C 5.16 1.802 4.892 1.858 4.64 1.997 c -0.393 0.217 -0.713 0.564 -0.913 0.99 C 3.6 3.26 3.548 3.553 3.523 3.876 C 3.5 4.188 3.5 4.572 3.5 5.041 v 7.142 c 0.0 0.35 0.0 0.65 0.02 0.883 c 0.019 0.23 0.062 0.503 0.226 0.725 c 0.213 0.29 0.538 0.46 0.88 0.459 c 0.262 0.0 0.486 -0.134 0.663 -0.261 c 0.18 -0.13 0.395 -0.316 0.648 -0.535 l 0.758 -0.658 c 0.292 -0.254 0.491 -0.426 0.656 -0.55 c 0.16 -0.119 0.262 -0.17 0.349 -0.197 c 0.196 -0.058 0.404 -0.058 0.6 0.0 c 0.087 0.027 0.189 0.079 0.349 0.198 c 0.165 0.123 0.364 0.295 0.656 0.549 l 0.758 0.658 c 0.253 0.219 0.467 0.405 0.648 0.535 c 0.177 0.127 0.401 0.26 0.663 0.261 c 0.342 0.0 0.666 -0.169 0.88 -0.46 c 0.164 -0.221 0.207 -0.495 0.226 -0.724 c 0.02 -0.234 0.02 -0.532 0.02 -0.883 V 5.042 c 0.0 -0.47 0.0 -0.854 -0.024 -1.167 c -0.024 -0.323 -0.076 -0.615 -0.204 -0.887 c -0.2 -0.427 -0.52 -0.774 -0.913 -0.99 c -0.251 -0.14 -0.52 -0.196 -0.818 -0.222 C 10.254 1.75 9.9 1.75 9.467 1.75 Z M 8.233 4.566 c -0.073 -0.227 -0.394 -0.227 -0.467 0.0 L 7.277 6.083 c -0.032 0.101 -0.127 0.17 -0.233 0.17 H 5.457 c -0.237 0.0 -0.336 0.303 -0.145 0.443 L 6.6 7.638 C 6.685 7.7 6.72 7.81 6.688 7.91 L 6.197 9.433 C 6.124 9.659 6.383 9.846 6.575 9.706 l 1.28 -0.937 c 0.086 -0.063 0.203 -0.063 0.29 0.0 l 1.28 0.937 c 0.191 0.14 0.45 -0.047 0.377 -0.273 l -0.49 -1.522 C 9.278 7.81 9.314 7.7 9.4 7.638 l 1.287 -0.942 c 0.191 -0.14 0.092 -0.443 -0.145 -0.443 H 8.955 c -0.106 0.0 -0.2 -0.069 -0.233 -0.17 l -0.49 -1.517 Z")
        )
    }.build()
}
