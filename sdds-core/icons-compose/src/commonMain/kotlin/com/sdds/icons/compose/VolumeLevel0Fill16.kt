package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel0Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel0Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 8.726 V 7.274 c 0.0 -0.732 0.594 -1.327 1.327 -1.327 c 0.537 0.0 1.051 -0.216 1.426 -0.601 l 1.823 -1.872 C 6.678 2.857 6.98 2.548 7.238 2.525 c 0.225 -0.02 0.445 0.07 0.592 0.24 C 8.0 2.964 8.0 3.396 8.0 4.258 v 7.486 c 0.0 0.863 0.0 1.294 -0.17 1.491 c -0.147 0.171 -0.367 0.26 -0.592 0.241 c -0.259 -0.023 -0.56 -0.332 -1.162 -0.95 l -1.823 -1.871 c -0.375 -0.384 -0.89 -0.601 -1.426 -0.601 c -0.733 0.0 -1.327 -0.594 -1.327 -1.327 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.146 5.646 c 0.196 -0.195 0.512 -0.195 0.708 0.0 L 12.5 7.293 l 1.646 -1.647 c 0.196 -0.195 0.512 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 L 13.207 8.0 l 1.647 1.646 c 0.195 0.196 0.195 0.512 0.0 0.708 c -0.196 0.195 -0.512 0.195 -0.708 0.0 L 12.5 8.707 l -1.646 1.647 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 L 11.793 8.0 l -1.647 -1.646 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 Z")
        )
    }.build()
}
