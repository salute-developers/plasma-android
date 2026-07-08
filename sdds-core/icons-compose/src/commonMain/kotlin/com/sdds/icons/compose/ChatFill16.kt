package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.385 4.538 c 1.5 0.876 2.507 2.502 2.507 4.363 c 0.0 0.468 -0.064 0.923 -0.184 1.354 c -0.12 0.436 -0.162 0.837 -0.07 1.191 l 0.358 1.358 c 0.2 0.759 -0.493 1.451 -1.252 1.252 l -1.357 -0.357 c -0.354 -0.093 -0.756 -0.052 -1.192 0.069 c -0.43 0.12 -0.885 0.183 -1.353 0.183 c -1.147 0.0 -2.204 -0.382 -3.052 -1.025 c 0.557 -0.009 1.096 -0.092 1.607 -0.24 c 0.448 0.172 0.936 0.265 1.445 0.265 c 0.377 0.0 0.74 -0.05 1.086 -0.146 c 0.514 -0.143 1.115 -0.231 1.714 -0.074 l 1.357 0.358 l 0.009 0.002 l 0.003 -0.001 c 0.002 0.0 0.007 -0.003 0.012 -0.007 c 0.004 -0.004 0.007 -0.01 0.007 -0.012 v -0.004 v -0.008 L 13.671 11.7 c -0.158 -0.599 -0.07 -1.2 0.072 -1.714 c 0.096 -0.345 0.148 -0.709 0.148 -1.086 c 0.0 -1.08 -0.424 -2.063 -1.114 -2.789 c -0.061 -0.55 -0.196 -1.078 -0.393 -1.574 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.65 1.75 c 2.789 0.0 5.05 2.26 5.05 5.05 c 0.0 2.789 -2.261 5.05 -5.05 5.05 c -0.468 0.0 -0.923 -0.064 -1.354 -0.184 c -0.436 -0.12 -0.837 -0.162 -1.191 -0.068 l -1.358 0.356 c -0.759 0.2 -1.452 -0.493 -1.252 -1.252 l 0.358 -1.357 c 0.093 -0.354 0.051 -0.756 -0.07 -1.192 C 1.663 7.723 1.6 7.268 1.6 6.8 c 0.0 -2.789 2.26 -5.05 5.05 -5.05 Z")
        )
    }.build()
}
