package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatHumanFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatHumanFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.44 6.875 C 1.44 4.072 3.71 1.8 6.513 1.8 s 5.075 2.272 5.075 5.075 c 0.0 2.803 -2.272 5.075 -5.075 5.075 c -0.47 0.0 -0.927 -0.064 -1.36 -0.185 c -0.434 -0.12 -0.83 -0.16 -1.178 -0.069 l -1.358 0.357 c -0.778 0.205 -1.487 -0.505 -1.283 -1.282 l 0.358 -1.358 c 0.091 -0.348 0.051 -0.744 -0.07 -1.178 c -0.12 -0.433 -0.184 -0.89 -0.184 -1.36 Z m 5.005 0.42 c 0.966 0.0 1.75 -0.783 1.75 -1.75 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 c -0.967 0.0 -1.75 0.784 -1.75 1.75 c 0.0 0.967 0.783 1.75 1.75 1.75 Z m 0.0 3.5 c 1.322 0.0 2.483 -0.782 3.152 -1.965 c -0.938 -0.533 -2.011 -0.834 -3.151 -0.834 c -1.14 0.0 -2.213 0.301 -3.151 0.834 c 0.669 1.183 1.83 1.966 3.15 1.966 Z M 6.614 13.0 c 0.557 -0.01 1.096 -0.092 1.607 -0.24 c 0.448 0.171 0.935 0.265 1.444 0.265 c 0.377 0.0 0.741 -0.051 1.087 -0.147 c 0.513 -0.143 1.114 -0.23 1.713 -0.073 l 1.357 0.357 l 0.01 0.002 h 0.003 c 0.002 -0.001 0.007 -0.003 0.011 -0.008 c 0.005 -0.005 0.007 -0.009 0.008 -0.011 V 13.14 l -0.001 -0.01 l -0.357 -1.357 c -0.158 -0.599 -0.07 -1.199 0.072 -1.713 c 0.096 -0.345 0.147 -0.709 0.147 -1.086 c 0.0 -1.08 -0.423 -2.063 -1.113 -2.789 c -0.062 -0.55 -0.196 -1.079 -0.394 -1.575 c 1.5 0.876 2.507 2.502 2.507 4.364 c 0.0 0.468 -0.063 0.922 -0.183 1.354 c -0.121 0.436 -0.163 0.837 -0.07 1.191 l 0.358 1.357 c 0.2 0.76 -0.493 1.452 -1.252 1.253 l -1.358 -0.358 c -0.354 -0.093 -0.755 -0.052 -1.191 0.07 c -0.431 0.12 -0.885 0.183 -1.354 0.183 c -1.146 0.0 -2.203 -0.382 -3.05 -1.025 Z")
        )
    }.build()
}
