package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeDiagonal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeDiagonal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.55 8.775 c 0.069 0.0 0.137 0.014 0.201 0.04 c 0.064 0.027 0.122 0.065 0.17 0.114 c 0.05 0.048 0.088 0.107 0.114 0.17 c 0.027 0.064 0.04 0.133 0.04 0.202 s -0.014 0.136 -0.04 0.2 c -0.026 0.064 -0.064 0.122 -0.113 0.17 l -5.25 5.25 c -0.049 0.05 -0.107 0.089 -0.171 0.115 c -0.064 0.026 -0.132 0.04 -0.201 0.04 s -0.137 -0.014 -0.2 -0.04 c -0.064 -0.026 -0.123 -0.065 -0.171 -0.114 c -0.049 -0.049 -0.087 -0.107 -0.114 -0.171 c -0.026 -0.064 -0.04 -0.131 -0.04 -0.2 c 0.0 -0.07 0.014 -0.138 0.04 -0.201 c 0.027 -0.064 0.065 -0.123 0.114 -0.171 l 5.25 -5.25 c 0.048 -0.049 0.107 -0.087 0.17 -0.114 c 0.064 -0.026 0.132 -0.04 0.2 -0.04 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.5 3.0 c 0.069 0.0 0.137 0.014 0.201 0.04 c 0.064 0.026 0.122 0.065 0.171 0.114 c 0.049 0.049 0.087 0.107 0.113 0.17 c 0.027 0.064 0.04 0.132 0.04 0.201 c 0.0 0.07 -0.013 0.138 -0.04 0.202 c -0.026 0.063 -0.064 0.12 -0.113 0.17 l -9.976 9.975 c -0.098 0.098 -0.231 0.153 -0.37 0.153 c -0.14 0.0 -0.273 -0.055 -0.372 -0.153 C 3.056 13.774 3.0 13.64 3.0 13.5 c 0.0 -0.14 0.056 -0.273 0.154 -0.371 l 9.975 -9.975 c 0.049 -0.048 0.106 -0.088 0.17 -0.114 C 13.363 3.014 13.43 3.0 13.5 3.0 Z")
        )
    }.build()
}
