package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FloorTypeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FloorTypeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.197 10.05 C 1.28 9.89 1.465 9.815 1.632 9.863 l 0.07 0.028 l 6.118 3.196 l 0.08 0.031 c 0.085 0.02 0.174 0.01 0.253 -0.031 L 14.27 9.89 c 0.183 -0.095 0.41 -0.025 0.506 0.159 c 0.096 0.183 0.025 0.41 -0.158 0.505 L 8.5 13.753 c -0.281 0.147 -0.61 0.166 -0.904 0.055 l -0.124 -0.055 l -6.117 -3.197 l -0.064 -0.04 c -0.135 -0.11 -0.178 -0.305 -0.094 -0.465 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.115 5.586 l 0.272 0.148 l -0.17 0.096 L 4.11 8.11 L 2.029 6.974 V 7.94 L 3.68 8.8 L 4.62 9.266 l 2.867 1.564 V 9.951 L 4.889 8.535 l 2.07 -1.15 L 8.47 8.214 l 1.599 0.873 L 8.487 9.95 v 0.877 l 2.862 -1.562 l 0.941 -0.465 l 1.654 -0.937 v -0.89 L 10.853 8.66 L 7.79 6.986 L 7.734 6.955 l 4.264 -2.37 l 2.572 1.403 c 0.05 0.028 0.087 0.066 0.118 0.108 c 0.152 0.085 0.256 0.246 0.256 0.433 v 1.679 c 0.0 0.164 -0.081 0.308 -0.203 0.4 c -0.032 0.058 -0.08 0.11 -0.146 0.146 L 14.05 9.05 l -5.712 3.116 l -0.085 0.04 c -0.172 0.067 -0.363 0.067 -0.535 0.0 l -0.084 -0.04 l -6.243 -3.404 C 1.327 8.727 1.279 8.677 1.247 8.62 C 1.116 8.531 1.03 8.38 1.03 8.208 V 6.524 c 0.0 -0.188 0.105 -0.35 0.26 -0.435 c 0.03 -0.04 0.066 -0.075 0.114 -0.1 l 3.73 -2.035 l 2.982 1.632 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.634 2.59 c 0.22 -0.12 0.485 -0.12 0.704 0.0 l 2.881 1.57 l -0.93 0.519 l -1.127 0.625 l -3.249 -1.777 L 7.634 2.59 Z")
        )
    }.build()
}
