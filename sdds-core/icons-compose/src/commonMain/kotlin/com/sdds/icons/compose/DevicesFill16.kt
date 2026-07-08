package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DevicesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DevicesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.07 2.5 h 11.86 c 0.085 0.0 0.177 0.0 0.258 0.007 c 0.09 0.007 0.21 0.026 0.334 0.089 c 0.165 0.084 0.299 0.218 0.383 0.382 c 0.063 0.124 0.081 0.244 0.088 0.335 C 15.0 3.393 15.0 3.486 15.0 3.57 v 6.959 c 0.0 0.085 0.0 0.178 -0.007 0.258 c -0.007 0.091 -0.025 0.211 -0.088 0.335 c -0.084 0.164 -0.218 0.298 -0.383 0.382 c -0.123 0.063 -0.244 0.082 -0.334 0.089 c -0.074 0.006 -0.158 0.007 -0.238 0.007 V 7.75 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -3.5 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 3.85 H 2.07 c -0.085 0.0 -0.177 0.0 -0.258 -0.006 c -0.09 -0.007 -0.21 -0.026 -0.334 -0.089 c -0.165 -0.084 -0.299 -0.218 -0.383 -0.382 c -0.063 -0.124 -0.081 -0.244 -0.088 -0.335 C 1.0 10.708 1.0 10.615 1.0 10.53 V 3.57 c 0.0 -0.085 0.0 -0.178 0.007 -0.258 c 0.007 -0.091 0.025 -0.211 0.088 -0.335 C 1.18 2.814 1.313 2.68 1.478 2.596 c 0.124 -0.063 0.244 -0.082 0.334 -0.089 C 1.892 2.5 1.985 2.5 2.071 2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.65 13.35 V 12.3 H 2.4 v 1.05 h 5.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.7 8.52 c 0.0 -0.392 0.0 -0.588 0.076 -0.737 c 0.067 -0.132 0.174 -0.24 0.306 -0.306 C 9.232 7.4 9.428 7.4 9.82 7.4 h 1.96 c 0.392 0.0 0.588 0.0 0.738 0.077 c 0.131 0.067 0.239 0.174 0.306 0.306 C 12.9 7.933 12.9 8.128 12.9 8.52 v 4.76 c 0.0 0.393 0.0 0.588 -0.076 0.738 c -0.067 0.132 -0.175 0.24 -0.306 0.306 c -0.15 0.076 -0.346 0.076 -0.738 0.076 H 9.82 c -0.392 0.0 -0.588 0.0 -0.738 -0.076 c -0.132 -0.067 -0.239 -0.174 -0.306 -0.306 C 8.7 13.868 8.7 13.672 8.7 13.28 V 8.52 Z m 0.7 4.655 C 9.4 13.078 9.478 13.0 9.575 13.0 h 2.45 c 0.097 0.0 0.175 0.079 0.175 0.175 v 0.35 c 0.0 0.097 -0.078 0.175 -0.175 0.175 h -2.45 c -0.097 0.0 -0.175 -0.078 -0.175 -0.175 v -0.35 Z")
        )
    }.build()
}
