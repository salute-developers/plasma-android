package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookmarkDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookmarkDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.5 12.434 c 0.0 0.35 0.0 0.648 -0.02 0.881 c -0.019 0.23 -0.063 0.504 -0.226 0.726 c -0.213 0.29 -0.537 0.46 -0.88 0.459 c -0.261 0.0 -0.486 -0.134 -0.663 -0.26 c -0.18 -0.13 -0.395 -0.317 -0.647 -0.536 l -0.76 -0.658 c -0.291 -0.254 -0.49 -0.426 -0.655 -0.549 c -0.16 -0.12 -0.261 -0.171 -0.349 -0.197 c -0.196 -0.06 -0.403 -0.06 -0.6 0.0 c -0.087 0.026 -0.188 0.078 -0.348 0.197 c -0.165 0.123 -0.365 0.295 -0.657 0.549 l -0.758 0.658 C 5.685 13.923 5.47 14.11 5.289 14.24 C 5.112 14.366 4.888 14.5 4.626 14.5 c -0.246 0.0 -0.483 -0.086 -0.676 -0.243 l 8.55 -8.55 v 6.727 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.739 1.646 c 0.195 -0.195 0.511 -0.195 0.706 0.0 c 0.196 0.196 0.196 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.706 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 L 3.5 11.884 V 5.29 c 0.0 -0.47 0.0 -0.854 0.024 -1.166 C 3.548 3.802 3.6 3.511 3.728 3.238 c 0.2 -0.426 0.52 -0.774 0.913 -0.991 c 0.251 -0.139 0.52 -0.195 0.818 -0.222 C 5.747 2.0 6.101 2.0 6.533 2.0 h 2.934 c 0.433 0.0 0.787 0.0 1.074 0.025 c 0.298 0.027 0.567 0.083 0.819 0.222 c 0.366 0.203 0.667 0.52 0.869 0.907 l 1.51 -1.508 Z")
        )
    }.build()
}
