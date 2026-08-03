package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.397 12.686 c -0.511 0.148 -1.05 0.231 -1.606 0.24 c 0.847 0.644 1.905 1.026 3.051 1.026 c 0.468 0.0 0.922 -0.064 1.354 -0.184 c 0.436 -0.121 0.837 -0.162 1.191 -0.07 l 1.357 0.358 c 0.76 0.2 1.452 -0.493 1.253 -1.252 l -0.358 -1.357 c -0.093 -0.355 -0.051 -0.756 0.07 -1.192 c 0.12 -0.431 0.183 -0.885 0.183 -1.353 c 0.0 -1.862 -1.007 -3.489 -2.507 -4.364 c 0.198 0.496 0.332 1.024 0.394 1.575 c 0.69 0.726 1.113 1.708 1.113 2.789 c 0.0 0.377 -0.051 0.74 -0.147 1.086 c -0.143 0.514 -0.23 1.114 -0.073 1.713 l 0.357 1.357 l 0.002 0.01 v 0.003 l -0.008 0.011 c -0.005 0.005 -0.009 0.007 -0.011 0.008 h -0.004 l -0.009 -0.001 l -1.357 -0.357 c -0.6 -0.158 -1.2 -0.07 -1.714 0.073 c -0.345 0.095 -0.709 0.147 -1.086 0.147 c -0.509 0.0 -0.996 -0.094 -1.445 -0.266 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.65 2.75 C 4.413 2.75 2.6 4.563 2.6 6.8 c 0.0 0.377 0.052 0.741 0.147 1.086 C 2.89 8.4 2.977 9.0 2.82 9.6 l -0.357 1.358 l -0.002 0.009 l 0.001 0.004 c 0.0 0.002 0.003 0.006 0.007 0.01 c 0.005 0.005 0.01 0.008 0.012 0.008 h 0.003 h 0.01 L 3.85 10.63 c 0.599 -0.158 1.2 -0.07 1.713 0.073 c 0.345 0.096 0.71 0.147 1.086 0.147 c 2.237 0.0 4.05 -1.813 4.05 -4.05 S 8.887 2.75 6.65 2.75 Z M 1.6 6.8 c 0.0 -2.789 2.261 -5.05 5.05 -5.05 c 2.79 0.0 5.05 2.261 5.05 5.05 c 0.0 2.789 -2.26 5.05 -5.05 5.05 c -0.468 0.0 -0.922 -0.064 -1.353 -0.184 c -0.436 -0.12 -0.838 -0.162 -1.192 -0.069 l -1.357 0.357 c -0.76 0.2 -1.452 -0.493 -1.252 -1.252 l 0.357 -1.357 C 1.946 8.99 1.905 8.59 1.783 8.154 C 1.665 7.722 1.6 7.268 1.6 6.8 Z")
        )
    }.build()
}
