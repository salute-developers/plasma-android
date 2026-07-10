package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDownloadFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDownloadFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 7.815 C 1.0 6.03 2.287 4.532 4.027 4.11 l 0.002 -0.007 C 4.057 4.1 4.085 4.096 4.113 4.088 C 4.839 3.891 5.603 3.895 6.327 4.1 c 0.724 0.205 1.38 0.602 1.9 1.15 c 0.191 0.201 0.507 0.21 0.708 0.02 c 0.2 -0.19 0.208 -0.507 0.018 -0.708 C 8.31 3.883 7.497 3.391 6.6 3.137 C 5.949 2.954 5.273 2.9 4.608 2.977 C 5.458 1.784 6.894 1.0 8.525 1.0 c 2.61 0.0 4.725 2.01 4.725 4.488 c 0.0 0.157 -0.008 0.312 -0.025 0.466 C 14.275 6.438 15.0 7.46 15.0 8.646 c 0.0 1.652 -1.41 2.992 -3.15 2.992 H 8.5 V 8.447 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 3.19 H 5.025 C 2.802 11.638 1.0 9.928 1.0 7.816 Z M 8.356 14.8 C 8.262 14.896 8.134 14.95 8.0 14.95 c -0.134 0.0 -0.262 -0.054 -0.356 -0.149 l -2.1 -2.127 C 5.35 12.477 5.352 12.16 5.55 11.967 c 0.196 -0.194 0.513 -0.192 0.707 0.004 l 1.244 1.26 v -1.588 h 1.0 v 1.589 l 1.244 -1.26 c 0.194 -0.197 0.51 -0.2 0.707 -0.005 c 0.197 0.194 0.199 0.51 0.005 0.707 l -2.1 2.127 Z")
        )
    }.build()
}
