package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WifiMedium16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WifiMedium16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 10.477 c 0.966 0.0 1.75 0.783 1.75 1.75 c 0.0 0.966 -0.784 1.75 -1.75 1.75 c -0.967 0.0 -1.75 -0.784 -1.75 -1.75 c 0.0 -0.967 0.783 -1.75 1.75 -1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 6.925 c 1.431 0.0 2.805 0.57 3.818 1.582 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.825 -0.825 -1.945 -1.29 -3.112 -1.29 c -1.166 0.001 -2.286 0.465 -3.11 1.29 c -0.196 0.195 -0.513 0.195 -0.708 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 5.194 7.494 6.568 6.925 8.0 6.925 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 4.475 c 1.99 0.0 3.898 0.79 5.304 2.196 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 C 11.378 6.159 9.724 5.475 8.0 5.475 c -1.723 0.0 -3.377 0.684 -4.596 1.903 c -0.196 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 C 4.103 5.265 6.01 4.475 8.0 4.475 Z")
        )
    }.build()
}
