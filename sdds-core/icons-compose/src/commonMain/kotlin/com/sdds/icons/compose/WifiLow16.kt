package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiLow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiLow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 10.477 c 0.966 0.0 1.75 0.783 1.75 1.75 c 0.0 0.966 -0.784 1.75 -1.75 1.75 c -0.967 0.0 -1.75 -0.784 -1.75 -1.75 c 0.0 -0.967 0.783 -1.75 1.75 -1.75 Z m 0.0 -3.552 c 1.431 0.0 2.805 0.57 3.818 1.582 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.825 -0.825 -1.945 -1.29 -3.112 -1.29 c -1.166 0.001 -2.286 0.465 -3.111 1.29 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 c 1.012 -1.013 2.386 -1.582 3.818 -1.582 Z")
        )
    }.build()
}
