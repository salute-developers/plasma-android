package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchAIOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchAIOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.62 8.414 c 0.233 -0.552 1.028 -0.552 1.26 0.0 l 0.021 0.058 l 0.403 1.222 c 0.156 0.474 0.528 0.846 1.002 1.002 L 7.53 11.1 l 0.111 0.046 c 0.515 0.268 0.478 1.06 -0.111 1.254 l -1.223 0.404 l -0.173 0.068 c -0.39 0.182 -0.692 0.519 -0.829 0.934 l -0.403 1.222 c -0.207 0.629 -1.094 0.628 -1.3 0.0 l -0.404 -1.222 c -0.137 -0.415 -0.439 -0.752 -0.83 -0.934 l -0.172 -0.068 L 0.972 12.4 c -0.628 -0.206 -0.628 -1.094 0.0 -1.3 l 1.223 -0.404 c 0.415 -0.136 0.751 -0.438 0.933 -0.829 l 0.069 -0.173 L 3.6 8.472 l 0.02 -0.058 Z M 7.0 2.0 c 2.762 0.0 5.0 2.239 5.0 5.0 c 0.0 1.2 -0.423 2.302 -1.128 3.164 l 3.532 3.532 c 0.195 0.196 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 l -3.532 -3.532 c -0.42 0.344 -0.9 0.62 -1.417 0.814 c -0.015 -0.337 -0.142 -0.67 -0.384 -0.924 C 9.9 10.203 11.0 8.73 11.0 7.0 c 0.0 -2.209 -1.791 -4.0 -4.0 -4.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 c 0.0 0.287 0.03 0.567 0.087 0.837 c -0.06 0.086 -0.115 0.181 -0.159 0.286 L 2.918 8.154 L 2.896 8.212 L 2.891 8.224 L 2.887 8.236 l -0.34 1.036 C 2.197 8.59 2.0 7.818 2.0 7.0 c 0.0 -2.761 2.238 -5.0 5.0 -5.0 Z m -2.853 8.007 c -0.255 0.776 -0.864 1.384 -1.64 1.64 L 2.192 11.75 l 0.315 0.104 c 0.776 0.255 1.385 0.864 1.64 1.64 l 0.104 0.314 l 0.103 -0.315 c 0.255 -0.776 0.864 -1.384 1.64 -1.64 l 0.314 -0.103 l -0.314 -0.104 c -0.776 -0.255 -1.385 -0.863 -1.64 -1.64 L 4.251 9.692 l -0.104 0.316 Z")
        )
    }.build()
}
