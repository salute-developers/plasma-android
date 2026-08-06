package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenSharePinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenSharePinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.556 15.963 L 18.99 17.53 l -0.072 0.083 c -0.153 0.203 -0.195 0.463 -0.134 0.696 c 0.156 0.593 0.12 1.025 -0.117 1.42 c -1.29 -1.298 -2.382 -2.39 -3.454 -3.455 c 0.17 -0.102 0.337 -0.164 0.512 -0.192 c 0.25 -0.04 0.544 -0.02 0.906 0.076 l 0.103 0.02 c 0.207 0.027 0.424 -0.024 0.599 -0.158 l 0.085 -0.073 l 1.56 -1.561 l 1.578 1.577 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.462 5.5 5.5 S 20.538 23.0 17.5 23.0 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 Z m 2.186 1.679 c -0.365 -0.364 -0.942 -0.39 -1.335 -0.072 l -0.078 0.069 c -0.387 0.385 -1.017 1.013 -1.49 1.491 c -0.417 -0.1 -0.823 -0.136 -1.219 -0.072 c -0.38 0.061 -0.728 0.21 -1.053 0.445 l -0.139 0.107 c -0.386 0.314 -0.348 0.855 -0.046 1.156 l 1.555 1.549 l -1.418 1.418 c -0.195 0.195 -0.195 0.511 0.0 0.707 c 0.195 0.195 0.512 0.194 0.707 0.0 l 1.418 -1.418 c 0.49 0.49 1.003 1.005 1.553 1.558 c 0.28 0.283 0.774 0.335 1.094 0.02 l 0.063 -0.067 c 0.594 -0.732 0.687 -1.526 0.476 -2.41 c 0.473 -0.475 1.101 -1.103 1.489 -1.49 l 0.068 -0.075 c 0.322 -0.393 0.298 -0.973 -0.068 -1.34 l -1.578 -1.576 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.25 4.0 C 20.769 4.0 22.0 5.231 22.0 6.75 v 6.062 C 20.832 11.69 19.247 11.0 17.5 11.0 c -3.59 0.0 -6.5 2.91 -6.5 6.5 c 0.0 0.886 0.178 1.73 0.499 2.5 H 4.75 C 3.231 20.0 2.0 18.769 2.0 17.25 V 6.75 C 2.0 5.231 3.231 4.0 4.75 4.0 h 14.5 Z")
        )
    }.build()
}
