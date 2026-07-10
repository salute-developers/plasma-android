package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.624 1.127 c 0.221 -0.17 0.531 -0.17 0.752 0.0 l 0.115 0.09 l 0.247 0.207 C 8.876 1.54 9.024 1.67 9.18 1.813 c 0.592 0.54 1.184 1.148 1.738 1.813 C 12.527 5.559 13.5 7.576 13.5 9.6 c 0.0 2.982 -2.463 5.4 -5.5 5.4 s -5.5 -2.418 -5.5 -5.4 c 0.0 -2.024 0.974 -4.041 2.582 -5.974 c 0.554 -0.665 1.146 -1.273 1.738 -1.813 c 0.156 -0.143 0.304 -0.272 0.442 -0.39 l 0.134 -0.112 l 0.228 -0.184 Z")
        )
    }.build()
}
