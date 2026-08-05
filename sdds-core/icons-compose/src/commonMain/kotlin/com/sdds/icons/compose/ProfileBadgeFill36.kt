package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.375 11.273 c 0.0 3.521 -2.855 6.375 -6.375 6.375 c -3.521 0.0 -6.375 -2.854 -6.375 -6.375 c 0.0 -3.52 2.854 -6.375 6.375 -6.375 c 3.52 0.0 6.375 2.855 6.375 6.375 Z m 5.334 13.433 c 0.688 0.527 1.066 1.362 1.04 2.228 c -0.03 0.99 -0.122 1.633 -0.394 2.167 c -0.36 0.706 -0.933 1.28 -1.639 1.639 c -0.802 0.408 -1.852 0.408 -3.952 0.408 H 11.236 c -2.1 0.0 -3.15 0.0 -3.953 -0.408 c -0.705 -0.36 -1.279 -0.933 -1.638 -1.64 c -0.272 -0.532 -0.363 -1.175 -0.394 -2.164 c -0.026 -0.865 0.352 -1.7 1.04 -2.227 c 3.34 -2.563 7.37 -4.06 11.71 -4.06 c 4.34 0.0 8.369 1.496 11.708 4.057 Z M 21.5 26.373 c -0.621 0.0 -1.125 0.504 -1.125 1.125 c 0.0 0.622 0.504 1.125 1.125 1.125 h 4.475 c 0.62 0.0 1.125 -0.503 1.125 -1.125 c 0.0 -0.62 -0.504 -1.125 -1.125 -1.125 H 21.5 Z")
        )
    }.build()
}
