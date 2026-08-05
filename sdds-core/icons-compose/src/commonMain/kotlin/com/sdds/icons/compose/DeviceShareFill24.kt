package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeviceShareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeviceShareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.281 4.0 H 6.72 C 6.045 4.0 5.495 4.0 5.047 4.037 C 4.584 4.074 4.165 4.155 3.775 4.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 2.0 7.494 2.0 8.045 2.0 8.719 v 6.562 c 0.0 0.674 0.0 1.225 0.037 1.672 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 5.494 20.0 6.045 20.0 6.718 20.0 h 10.563 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 22.0 16.506 22.0 15.955 22.0 15.281 V 8.72 c 0.0 -0.674 0.0 -1.225 -0.037 -1.672 c -0.037 -0.463 -0.118 -0.882 -0.317 -1.272 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 c -0.391 -0.2 -0.81 -0.28 -1.273 -0.318 C 18.506 4.0 17.955 4.0 17.281 4.0 Z M 9.25 15.12 c -0.382 0.269 -0.909 0.24 -1.243 -0.095 c -0.412 -0.411 -0.383 -1.1 0.086 -1.435 c 1.1 -0.794 2.449 -1.263 3.913 -1.263 s 2.813 0.469 3.913 1.263 c 0.46 0.344 0.497 1.024 0.086 1.435 c -0.335 0.335 -0.861 0.354 -1.244 0.086 c -0.775 -0.545 -1.732 -0.87 -2.755 -0.87 c -1.024 0.0 -1.98 0.325 -2.756 0.88 Z m -3.894 -4.257 C 7.164 9.39 9.48 8.5 12.005 8.5 c 2.526 0.0 4.84 0.89 6.64 2.373 c 0.44 0.363 0.478 1.023 0.076 1.425 c -0.344 0.345 -0.89 0.373 -1.263 0.067 c -1.473 -1.215 -3.377 -1.951 -5.453 -1.951 c -2.076 0.0 -3.98 0.736 -5.463 1.942 c -0.373 0.306 -0.919 0.277 -1.263 -0.067 c -0.402 -0.402 -0.364 -1.062 0.076 -1.426 Z")
        )
    }.build()
}
