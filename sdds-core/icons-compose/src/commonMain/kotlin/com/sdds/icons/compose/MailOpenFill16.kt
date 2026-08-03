package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailOpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailOpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.517 1.052 c -0.341 -0.07 -0.693 -0.07 -1.034 0.0 C 7.096 1.132 6.74 1.33 6.222 1.615 l -3.26 1.799 c -0.568 0.313 -0.96 0.529 -1.253 0.848 C 1.451 4.544 1.255 4.88 1.135 5.245 C 1.0 5.66 1.0 6.115 1.0 6.773 v 4.284 c 0.0 0.58 0.0 1.049 0.03 1.428 c 0.032 0.391 0.098 0.734 0.256 1.052 c 0.252 0.504 0.653 0.914 1.147 1.17 c 0.311 0.163 0.647 0.23 1.03 0.262 C 3.835 15.0 4.293 15.0 4.863 15.0 h 6.274 c 0.57 0.0 1.028 0.0 1.4 -0.031 c 0.383 -0.032 0.719 -0.1 1.03 -0.261 c 0.494 -0.257 0.895 -0.667 1.147 -1.171 c 0.158 -0.318 0.224 -0.66 0.256 -1.052 C 15.0 12.107 15.0 11.637 15.0 11.058 V 6.773 c 0.0 -0.658 0.0 -1.113 -0.135 -1.528 c -0.12 -0.366 -0.316 -0.701 -0.574 -0.983 c -0.293 -0.319 -0.685 -0.535 -1.252 -0.848 l -3.26 -1.799 C 9.26 1.329 8.904 1.132 8.517 1.052 Z M 3.715 6.358 c -0.234 -0.147 -0.542 -0.076 -0.69 0.158 C 2.88 6.75 2.95 7.058 3.184 7.205 l 3.433 2.157 c 0.846 0.531 1.92 0.531 2.766 0.0 l 3.433 -2.157 c 0.234 -0.147 0.305 -0.455 0.158 -0.69 c -0.147 -0.233 -0.456 -0.304 -0.69 -0.157 L 8.85 8.515 c -0.52 0.327 -1.182 0.327 -1.702 0.0 L 3.715 6.358 Z")
        )
    }.build()
}
