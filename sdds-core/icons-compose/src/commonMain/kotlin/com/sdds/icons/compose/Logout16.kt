package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Logout16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Logout16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.71 1.75 h 1.9 c 0.967 0.0 1.75 0.784 1.75 1.75 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 5.73 c -0.498 0.0 -0.842 0.0 -1.109 0.022 c -0.26 0.022 -0.403 0.06 -0.508 0.114 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 3.513 3.537 3.474 3.68 3.452 3.94 C 3.431 4.208 3.43 4.551 3.43 5.05 v 5.903 c 0.0 0.498 0.0 0.842 0.022 1.109 c 0.022 0.26 0.061 0.404 0.114 0.508 c 0.12 0.236 0.311 0.427 0.547 0.547 C 4.218 13.17 4.36 13.21 4.62 13.23 c 0.267 0.022 0.61 0.022 1.11 0.022 h 1.876 c 0.416 0.0 0.753 -0.337 0.753 -0.753 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 c 0.0 0.968 -0.785 1.753 -1.753 1.753 H 5.71 c -0.472 0.0 -0.857 0.0 -1.169 -0.026 c -0.323 -0.026 -0.612 -0.082 -0.881 -0.22 c -0.424 -0.215 -0.768 -0.56 -0.984 -0.982 c -0.137 -0.27 -0.193 -0.56 -0.22 -0.882 c -0.025 -0.312 -0.025 -0.697 -0.025 -1.169 V 5.03 c 0.0 -0.472 0.0 -0.857 0.026 -1.17 c 0.026 -0.322 0.082 -0.611 0.22 -0.88 c 0.215 -0.424 0.56 -0.768 0.983 -0.984 c 0.27 -0.137 0.558 -0.193 0.881 -0.22 C 4.852 1.75 5.237 1.75 5.71 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.5 8.002 c 0.0 -0.133 -0.053 -0.26 -0.147 -0.354 l -2.118 -2.107 c -0.195 -0.195 -0.512 -0.194 -0.707 0.001 c -0.195 0.196 -0.194 0.513 0.002 0.707 l 1.259 1.253 H 7.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 4.789 l -1.26 1.254 c -0.195 0.194 -0.196 0.511 0.0 0.707 c 0.194 0.195 0.51 0.196 0.706 0.001 l 2.118 -2.107 C 13.447 8.263 13.5 8.135 13.5 8.002 Z")
        )
    }.build()
}
