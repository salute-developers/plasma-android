package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatHumanOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatHumanOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.49 2.8 c -2.238 0.0 -4.05 1.813 -4.05 4.05 c 0.0 0.377 0.05 0.74 0.146 1.086 C 2.73 8.45 2.816 9.05 2.66 9.649 l -0.357 1.358 L 2.3 11.016 v 0.003 l 0.008 0.012 l 0.012 0.007 h 0.003 h 0.01 L 3.69 10.68 c 0.599 -0.158 1.2 -0.07 1.713 0.073 c 0.345 0.095 0.71 0.147 1.086 0.147 c 2.237 0.0 4.05 -1.813 4.05 -4.05 S 8.726 2.8 6.49 2.8 Z M 1.44 6.85 c 0.0 -2.79 2.26 -5.05 5.05 -5.05 c 2.788 0.0 5.05 2.26 5.05 5.05 c 0.0 2.789 -2.262 5.05 -5.05 5.05 c -0.47 0.0 -0.923 -0.064 -1.354 -0.184 c -0.436 -0.12 -0.838 -0.162 -1.192 -0.069 l -1.357 0.357 c -0.76 0.2 -1.452 -0.493 -1.252 -1.252 l 0.357 -1.357 c 0.093 -0.354 0.052 -0.756 -0.07 -1.192 C 1.503 7.772 1.44 7.318 1.44 6.85 Z m 6.754 5.885 c -0.51 0.148 -1.05 0.23 -1.606 0.24 C 7.436 13.618 8.493 14.0 9.64 14.0 c 0.468 0.0 0.922 -0.064 1.354 -0.183 c 0.436 -0.122 0.837 -0.163 1.19 -0.07 l 1.358 0.358 c 0.76 0.2 1.452 -0.493 1.252 -1.253 l -0.357 -1.357 c -0.093 -0.354 -0.052 -0.755 0.07 -1.191 c 0.12 -0.432 0.183 -0.886 0.183 -1.354 c 0.0 -1.862 -1.008 -3.488 -2.507 -4.364 c 0.197 0.496 0.332 1.025 0.394 1.575 c 0.69 0.726 1.113 1.708 1.113 2.79 c 0.0 0.376 -0.051 0.74 -0.147 1.085 c -0.143 0.514 -0.23 1.114 -0.073 1.714 l 0.357 1.357 l 0.002 0.009 v 0.004 L 13.82 13.13 c -0.005 0.005 -0.009 0.007 -0.011 0.007 h -0.002 h -0.002 h -0.01 l -1.357 -0.358 c -0.599 -0.157 -1.199 -0.07 -1.713 0.073 C 10.38 12.949 10.015 13.0 9.64 13.0 c -0.509 0.0 -0.996 -0.094 -1.445 -0.265 Z m -0.13 -7.11 C 8.064 6.495 7.36 7.2 6.49 7.2 S 4.914 6.495 4.914 5.625 S 5.62 4.05 6.49 4.05 s 1.575 0.705 1.575 1.575 Z m 1.07 2.938 C 8.571 9.428 7.596 10.0 6.488 10.0 S 4.406 9.428 3.845 8.563 C 4.632 8.14 5.533 7.9 6.489 7.9 c 0.957 0.0 1.857 0.24 2.644 0.663 Z")
        )
    }.build()
}
