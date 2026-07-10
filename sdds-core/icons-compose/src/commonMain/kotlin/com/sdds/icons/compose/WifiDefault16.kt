package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiDefault16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiDefault16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 10.477 c 0.967 0.0 1.75 0.783 1.75 1.75 c 0.0 0.966 -0.783 1.75 -1.75 1.75 c -0.966 0.0 -1.75 -0.784 -1.75 -1.75 c 0.0 -0.967 0.784 -1.75 1.75 -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 6.925 c 1.432 0.0 2.806 0.57 3.819 1.582 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 C 10.287 8.389 9.167 7.925 8.0 7.924 c -1.167 0.0 -2.287 0.465 -3.112 1.29 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 5.195 7.494 6.57 6.925 8.001 6.925 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 4.475 c 1.99 0.0 3.898 0.79 5.304 2.196 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -1.219 -1.219 -2.873 -1.903 -4.596 -1.903 c -1.724 0.0 -3.378 0.684 -4.597 1.903 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 4.103 5.265 6.012 4.475 8.0 4.475 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 2.025 c 2.546 0.0 4.988 1.012 6.789 2.812 c 0.194 0.195 0.194 0.512 0.0 0.707 c -0.195 0.195 -0.513 0.195 -0.708 0.0 C 12.468 3.93 10.28 3.025 8.0 3.025 c -2.28 0.0 -4.469 0.906 -6.081 2.519 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 c 1.8 -1.8 4.242 -2.811 6.788 -2.812 Z")
        )
    }.build()
}
