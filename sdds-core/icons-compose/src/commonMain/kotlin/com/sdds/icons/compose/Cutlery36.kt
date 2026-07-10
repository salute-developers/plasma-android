package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Cutlery36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Cutlery36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.125 4.5 c 0.621 0.0 1.125 0.504 1.125 1.125 v 10.44 c 0.164 -0.003 0.309 -0.009 0.44 -0.018 c 0.36 -0.025 0.537 -0.069 0.652 -0.117 c 0.46 -0.19 0.825 -0.555 1.015 -1.015 c 0.048 -0.115 0.092 -0.291 0.117 -0.652 c 0.025 -0.371 0.026 -0.85 0.026 -1.565 V 5.625 c 0.0 -0.621 0.503 -1.125 1.125 -1.125 c 0.621 0.0 1.125 0.504 1.125 1.125 v 7.11 c 0.0 0.667 0.0 1.224 -0.031 1.68 c -0.033 0.477 -0.103 0.926 -0.283 1.361 c -0.419 1.011 -1.222 1.814 -2.233 2.233 c -0.435 0.18 -0.884 0.25 -1.36 0.283 c -0.182 0.012 -0.38 0.02 -0.593 0.024 v 12.058 c 0.0 0.621 -0.504 1.125 -1.125 1.125 c -0.622 0.0 -1.125 -0.504 -1.125 -1.125 V 18.316 c -0.214 -0.004 -0.411 -0.012 -0.593 -0.024 c -0.476 -0.033 -0.925 -0.103 -1.36 -0.283 c -1.011 -0.419 -1.814 -1.222 -2.233 -2.232 c -0.18 -0.436 -0.25 -0.885 -0.283 -1.361 C 7.5 13.959 7.5 13.402 7.5 12.736 V 5.625 C 7.5 5.004 8.004 4.5 8.625 4.5 S 9.75 5.004 9.75 5.625 v 7.073 c 0.0 0.714 0.0 1.194 0.026 1.565 c 0.025 0.36 0.069 0.537 0.117 0.652 c 0.19 0.46 0.555 0.825 1.014 1.015 c 0.116 0.048 0.292 0.092 0.653 0.117 c 0.131 0.009 0.276 0.015 0.44 0.019 V 5.625 C 12.0 5.004 12.504 4.5 13.125 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.372 4.5 h -0.744 c -2.278 0.0 -4.125 1.847 -4.125 4.125 v 11.968 c 0.0 2.153 1.647 3.916 3.743 4.108 v 5.673 c 0.0 0.622 0.504 1.125 1.125 1.125 c 0.622 0.0 1.125 -0.503 1.125 -1.125 V 5.625 c 0.0 -0.298 -0.118 -0.584 -0.329 -0.795 c -0.211 -0.211 -0.497 -0.33 -0.796 -0.33 Z")
        )
    }.build()
}
