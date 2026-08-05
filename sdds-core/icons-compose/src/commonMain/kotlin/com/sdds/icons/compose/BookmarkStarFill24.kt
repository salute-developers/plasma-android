package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkStarFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkStarFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.118 3.0 H 9.883 C 9.256 3.0 8.745 3.0 8.329 3.037 C 7.9 3.074 7.511 3.155 7.148 3.354 c -0.568 0.312 -1.03 0.809 -1.32 1.42 c -0.184 0.391 -0.259 0.81 -0.294 1.273 C 5.5 6.494 5.5 7.045 5.5 7.719 v 10.237 c 0.0 0.503 0.0 0.931 0.028 1.266 c 0.028 0.329 0.091 0.72 0.327 1.04 c 0.309 0.416 0.777 0.658 1.272 0.657 c 0.378 0.0 0.702 -0.192 0.957 -0.374 c 0.26 -0.185 0.571 -0.453 0.936 -0.767 l 1.095 -0.943 c 0.422 -0.364 0.71 -0.611 0.948 -0.787 c 0.231 -0.171 0.377 -0.245 0.504 -0.283 c 0.283 -0.085 0.583 -0.085 0.866 0.0 c 0.127 0.038 0.273 0.112 0.504 0.283 c 0.239 0.176 0.526 0.423 0.948 0.787 l 1.095 0.943 c 0.365 0.314 0.675 0.582 0.936 0.767 c 0.255 0.182 0.58 0.374 0.957 0.374 c 0.495 0.001 0.963 -0.241 1.272 -0.658 c 0.236 -0.318 0.299 -0.71 0.327 -1.039 c 0.028 -0.335 0.028 -0.763 0.028 -1.266 V 7.72 c 0.0 -0.674 0.0 -1.225 -0.034 -1.672 c -0.035 -0.463 -0.11 -0.882 -0.295 -1.272 c -0.29 -0.612 -0.75 -1.11 -1.319 -1.42 c -0.363 -0.2 -0.751 -0.28 -1.181 -0.318 C 15.255 3.0 14.744 3.0 14.118 3.0 Z m -1.785 4.024 c -0.105 -0.322 -0.561 -0.322 -0.666 0.0 l -0.711 2.19 c -0.047 0.143 -0.181 0.24 -0.333 0.24 H 8.322 c -0.34 0.0 -0.48 0.435 -0.206 0.634 l 1.862 1.353 c 0.123 0.089 0.174 0.247 0.127 0.391 l -0.711 2.189 c -0.105 0.322 0.264 0.59 0.539 0.39 l 1.861 -1.352 c 0.123 -0.089 0.29 -0.089 0.412 0.0 l 1.862 1.353 c 0.274 0.2 0.643 -0.069 0.538 -0.391 l -0.711 -2.189 c -0.047 -0.144 0.004 -0.302 0.127 -0.391 l 1.862 -1.353 c 0.274 -0.2 0.133 -0.633 -0.206 -0.633 h -2.301 c -0.152 0.0 -0.286 -0.098 -0.333 -0.242 l -0.711 -2.189 Z")
        )
    }.build()
}
