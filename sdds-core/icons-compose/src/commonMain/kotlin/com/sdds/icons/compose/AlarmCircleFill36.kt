package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.263 3.045 c 0.39 -0.392 1.023 -0.394 1.414 -0.004 l 5.278 5.242 c 0.392 0.39 0.394 1.023 0.005 1.414 c -0.39 0.392 -1.022 0.394 -1.414 0.005 L 26.268 4.46 c -0.392 -0.389 -0.394 -1.022 -0.005 -1.414 Z m -16.526 0.0 c 0.39 0.392 0.387 1.025 -0.004 1.414 L 4.455 9.702 C 4.063 10.092 3.43 10.09 3.04 9.697 C 2.65 9.306 2.653 8.672 3.045 8.283 l 5.278 -5.242 c 0.392 -0.39 1.025 -0.388 1.414 0.004 Z M 9.24 28.022 l -2.847 2.827 C 6.0 31.24 5.367 31.236 4.978 30.844 c -0.39 -0.391 -0.387 -1.025 0.005 -1.414 l 2.837 -2.818 c -2.028 -2.337 -3.254 -5.38 -3.254 -8.707 c 0.0 -7.37 6.016 -13.346 13.436 -13.346 s 13.435 5.975 13.435 13.346 c 0.0 3.704 -1.519 7.055 -3.972 9.473 l 2.066 2.052 c 0.392 0.39 0.394 1.023 0.005 1.414 c -0.39 0.392 -1.023 0.394 -1.415 0.005 l -2.186 -2.172 c -2.224 1.618 -4.966 2.573 -7.933 2.573 c -3.348 0.0 -6.41 -1.216 -8.763 -3.229 Z m 7.642 -17.544 c 0.621 0.0 1.125 0.503 1.125 1.125 v 6.289 h 4.1 c 0.621 0.0 1.125 0.503 1.125 1.125 c 0.0 0.621 -0.504 1.125 -1.125 1.125 h -4.85 c -0.829 0.0 -1.5 -0.672 -1.5 -1.5 v -7.04 c 0.0 -0.62 0.503 -1.124 1.125 -1.124 Z")
        )
    }.build()
}
