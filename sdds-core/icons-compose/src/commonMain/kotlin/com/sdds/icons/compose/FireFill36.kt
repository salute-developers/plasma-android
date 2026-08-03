package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FireFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FireFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.946 15.75 c -3.074 5.154 -3.707 11.753 3.327 15.54 c 0.127 0.07 0.267 -0.064 0.204 -0.194 c -1.929 -3.962 -2.013 -5.497 -1.405 -7.498 c 0.04 -0.128 0.215 -0.141 0.277 -0.023 c 0.629 1.202 1.281 2.083 2.216 3.11 c 0.096 0.104 0.27 0.027 0.26 -0.115 c -0.314 -4.876 1.087 -7.726 3.187 -8.898 c 0.075 -0.042 0.17 -0.006 0.206 0.072 c 1.49 3.274 3.664 3.892 3.664 7.756 c 0.0 3.748 -0.681 3.758 -1.616 5.714 c -0.054 0.114 0.054 0.236 0.175 0.2 c 8.04 -2.418 6.27 -13.3 3.367 -19.262 c -0.04 -0.081 -0.142 -0.106 -0.215 -0.052 c -0.91 0.673 -1.516 1.68 -2.199 2.573 c -0.085 0.112 -0.262 0.05 -0.27 -0.09 c -0.211 -4.22 -3.573 -8.356 -6.027 -9.935 c -0.1 -0.065 -0.23 0.016 -0.226 0.136 c 0.188 5.05 -2.728 7.285 -4.925 10.966 Z")
        )
    }.build()
}
