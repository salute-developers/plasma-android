package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CrownOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CrownOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.04 3.77 c 0.079 -0.1 0.144 -0.211 0.193 -0.33 c 0.118 -0.286 0.139 -0.602 0.059 -0.9 C 9.212 2.24 9.036 1.978 8.79 1.79 C 8.546 1.602 8.246 1.5 7.937 1.5 c -0.308 0.0 -0.609 0.102 -0.853 0.29 C 6.839 1.978 6.663 2.24 6.583 2.54 c -0.08 0.298 -0.06 0.614 0.059 0.9 c 0.049 0.119 0.114 0.23 0.192 0.33 L 4.691 6.26 c -0.062 0.073 -0.167 0.09 -0.25 0.044 L 3.185 5.592 C 3.208 5.455 3.21 5.314 3.192 5.175 c -0.04 -0.306 -0.18 -0.59 -0.398 -0.809 C 2.575 4.148 2.29 4.008 1.985 3.967 C 1.68 3.927 1.368 3.99 1.101 4.143 C 0.834 4.298 0.625 4.536 0.507 4.821 c -0.118 0.286 -0.14 0.602 -0.06 0.9 c 0.08 0.298 0.257 0.562 0.502 0.75 c 0.086 0.066 0.18 0.122 0.278 0.166 l 1.2 6.142 c 0.111 0.564 0.605 0.97 1.179 0.97 h 8.663 c 0.574 0.0 1.067 -0.406 1.178 -0.97 l 1.187 -6.072 c 0.168 -0.049 0.327 -0.128 0.467 -0.236 c 0.245 -0.188 0.421 -0.452 0.501 -0.75 c 0.08 -0.298 0.06 -0.614 -0.059 -0.9 c -0.118 -0.285 -0.327 -0.523 -0.594 -0.678 c -0.267 -0.154 -0.578 -0.216 -0.884 -0.176 c -0.306 0.04 -0.59 0.18 -0.809 0.4 c -0.218 0.217 -0.358 0.502 -0.399 0.808 c -0.014 0.108 -0.015 0.217 -0.004 0.324 l -1.419 0.806 c -0.083 0.047 -0.188 0.029 -0.25 -0.044 L 9.04 3.77 Z M 7.937 4.02 L 5.45 6.913 C 5.075 7.348 4.446 7.457 3.947 7.174 L 2.15 6.154 l 1.258 6.433 c 0.019 0.094 0.101 0.162 0.197 0.162 h 8.663 c 0.096 0.0 0.178 -0.068 0.196 -0.162 l 1.258 -6.432 l -1.795 1.02 c -0.499 0.282 -1.129 0.173 -1.503 -0.262 L 7.938 4.02 Z m 1.403 6.248 c 0.0 0.775 -0.628 1.403 -1.403 1.403 c -0.774 0.0 -1.402 -0.628 -1.402 -1.403 s 0.628 -1.403 1.402 -1.403 c 0.775 0.0 1.403 0.628 1.403 1.403 Z")
        )
    }.build()
}
