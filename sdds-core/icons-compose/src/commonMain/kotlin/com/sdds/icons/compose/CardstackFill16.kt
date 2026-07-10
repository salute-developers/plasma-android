package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CardstackFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CardstackFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.502 2.27 c 0.0 -0.287 0.235 -0.52 0.525 -0.52 h 5.946 c 0.29 0.0 0.525 0.233 0.525 0.52 c 0.0 0.288 -0.235 0.522 -0.525 0.522 H 5.027 c -0.29 0.0 -0.525 -0.234 -0.525 -0.521 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.324 7.306 h 9.352 c 0.416 0.0 0.761 0.0 1.04 0.023 c 0.29 0.025 0.563 0.078 0.814 0.216 c 0.382 0.21 0.681 0.544 0.847 0.946 c 0.109 0.263 0.13 0.538 0.121 0.827 c -0.009 0.278 -0.05 0.619 -0.098 1.029 l -0.178 1.5 c -0.039 0.33 -0.072 0.608 -0.117 0.834 c -0.047 0.237 -0.114 0.457 -0.241 0.663 c -0.198 0.317 -0.484 0.57 -0.825 0.727 c -0.22 0.102 -0.448 0.143 -0.69 0.161 c -0.232 0.018 -0.514 0.018 -0.849 0.018 h -9.0 c -0.335 0.0 -0.617 0.0 -0.848 -0.018 c -0.243 -0.018 -0.471 -0.059 -0.691 -0.16 c -0.34 -0.158 -0.627 -0.411 -0.825 -0.728 c -0.127 -0.206 -0.194 -0.426 -0.241 -0.663 c -0.045 -0.226 -0.078 -0.503 -0.117 -0.834 l -0.178 -1.5 c -0.049 -0.41 -0.09 -0.75 -0.098 -1.03 c -0.01 -0.288 0.012 -0.563 0.121 -0.826 c 0.166 -0.402 0.465 -0.735 0.847 -0.946 C 1.72 7.407 1.993 7.354 2.283 7.33 c 0.28 -0.023 0.625 -0.023 1.041 -0.023 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.51 3.833 c 0.342 0.0 0.626 0.0 0.858 0.017 c 0.24 0.017 0.468 0.054 0.685 0.15 c 0.475 0.213 0.843 0.606 1.02 1.092 c 0.081 0.221 0.102 0.449 0.101 0.689 c 0.0 0.145 -0.011 0.302 -0.025 0.483 H 1.85 C 1.837 6.083 1.826 5.926 1.826 5.78 c 0.0 -0.24 0.02 -0.468 0.1 -0.69 c 0.178 -0.485 0.546 -0.878 1.021 -1.09 c 0.217 -0.097 0.444 -0.134 0.685 -0.151 c 0.232 -0.017 0.516 -0.017 0.857 -0.017 h 7.022 Z")
        )
    }.build()
}
