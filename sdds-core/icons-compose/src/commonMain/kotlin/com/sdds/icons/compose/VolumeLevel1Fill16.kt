package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel1Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel1Fill16",
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
            pathData = addPathNodes("M 10.153 5.14 c 0.198 -0.191 0.515 -0.186 0.707 0.013 c 0.362 0.375 0.649 0.82 0.844 1.308 C 11.9 6.95 12.0 7.472 12.0 8.0 s -0.1 1.05 -0.296 1.539 c -0.195 0.488 -0.482 0.933 -0.844 1.308 c -0.192 0.199 -0.509 0.205 -0.707 0.013 c -0.199 -0.192 -0.204 -0.509 -0.013 -0.707 c 0.272 -0.281 0.488 -0.616 0.636 -0.986 C 10.924 8.797 11.0 8.401 11.0 8.0 s -0.076 -0.798 -0.224 -1.167 c -0.148 -0.37 -0.364 -0.705 -0.636 -0.986 C 9.95 5.65 9.954 5.332 10.153 5.14 Z")
        )
    }.build()
}
