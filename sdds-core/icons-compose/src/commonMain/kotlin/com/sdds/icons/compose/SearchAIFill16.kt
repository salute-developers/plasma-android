package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SearchAIFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SearchAIFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.62 8.414 c 0.233 -0.552 1.027 -0.552 1.26 0.0 L 4.9 8.472 l 0.403 1.222 c 0.156 0.475 0.529 0.846 1.003 1.002 L 7.53 11.1 c 0.628 0.206 0.628 1.094 0.0 1.3 l -1.223 0.404 C 5.832 12.96 5.46 13.33 5.303 13.806 l -0.402 1.222 c -0.207 0.629 -1.095 0.629 -1.302 0.0 l -0.402 -1.222 C 3.04 13.33 2.668 12.96 2.194 12.804 L 0.97 12.4 c -0.628 -0.206 -0.628 -1.094 0.0 -1.3 l 1.223 -0.404 C 2.668 10.54 3.04 10.17 3.197 9.694 l 0.402 -1.222 l 0.022 -0.058 Z M 7.0 2.0 c 2.762 0.0 5.0 2.239 5.0 5.0 c 0.0 1.2 -0.423 2.302 -1.128 3.164 l 3.532 3.532 c 0.195 0.195 0.194 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 l -3.532 -3.532 c -0.42 0.344 -0.9 0.62 -1.417 0.814 c -0.024 -0.551 -0.352 -1.09 -0.985 -1.298 L 6.541 9.984 C 6.293 9.903 6.098 9.708 6.016 9.46 L 5.614 8.236 L 5.61 8.224 L 5.605 8.212 L 5.583 8.154 L 5.572 8.123 l -0.05 -0.105 C 4.979 6.96 3.404 6.995 2.929 8.123 L 2.917 8.154 L 2.896 8.212 L 2.891 8.224 L 2.887 8.236 l -0.34 1.035 C 2.197 8.59 2.0 7.818 2.0 7.0 C 2.0 4.239 4.24 2.0 7.0 2.0 Z")
        )
    }.build()
}
