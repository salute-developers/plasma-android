package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileStackFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileStackFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.98 1.0 H 5.962 c -0.652 0.0 -1.2 0.446 -1.356 1.05 h 0.376 h 3.974 c 0.408 0.0 0.776 0.0 1.082 0.025 c 0.327 0.026 0.675 0.087 1.017 0.26 c 0.494 0.252 0.895 0.654 1.147 1.148 c 0.174 0.341 0.234 0.69 0.261 1.017 c 0.025 0.306 0.025 0.673 0.025 1.082 v 6.936 v 0.334 c 0.583 -0.16 1.012 -0.693 1.012 -1.327 V 3.52 c 0.0 -0.882 0.0 -1.323 -0.171 -1.66 c -0.152 -0.296 -0.392 -0.537 -0.689 -0.688 C 12.303 1.0 11.862 1.0 10.98 1.0 Z M 9.952 3.121 c 0.263 0.022 0.457 0.064 0.626 0.15 c 0.296 0.151 0.537 0.392 0.688 0.689 c 0.172 0.336 0.172 0.778 0.172 1.66 v 6.86 c 0.0 0.882 0.0 1.323 -0.172 1.66 c -0.15 0.296 -0.392 0.537 -0.688 0.688 C 10.241 15.0 9.8 15.0 8.918 15.0 H 5.02 c -0.882 0.0 -1.323 0.0 -1.66 -0.172 c -0.296 -0.151 -0.537 -0.392 -0.688 -0.688 C 2.5 13.803 2.5 13.362 2.5 12.48 V 5.62 c 0.0 -0.882 0.0 -1.324 0.172 -1.66 c 0.15 -0.297 0.392 -0.538 0.688 -0.689 c 0.3 -0.153 0.684 -0.17 1.39 -0.171 h 0.27 h 3.898 c 0.441 0.0 0.772 0.0 1.034 0.021 Z M 4.578 6.25 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 8.86 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.078 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 8.86 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.078 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 8.86 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.078 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
