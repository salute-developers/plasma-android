package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.556 15.963 L 18.99 17.53 l -0.072 0.083 c -0.152 0.203 -0.195 0.463 -0.134 0.696 c 0.156 0.593 0.12 1.025 -0.117 1.42 c -1.29 -1.298 -2.382 -2.39 -3.454 -3.455 c 0.17 -0.102 0.338 -0.164 0.512 -0.192 c 0.25 -0.04 0.544 -0.02 0.906 0.076 l 0.104 0.02 c 0.207 0.027 0.423 -0.024 0.598 -0.158 l 0.085 -0.073 l 1.56 -1.561 l 1.578 1.577 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.463 5.5 5.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 c -3.037 0.0 -5.5 -2.462 -5.5 -5.5 s 2.463 -5.5 5.5 -5.5 Z m 2.186 1.679 c -0.365 -0.364 -0.942 -0.39 -1.335 -0.072 l -0.078 0.069 c -0.387 0.385 -1.017 1.013 -1.49 1.491 c -0.417 -0.1 -0.823 -0.136 -1.218 -0.072 c -0.38 0.061 -0.73 0.21 -1.054 0.445 l -0.139 0.107 c -0.386 0.314 -0.348 0.855 -0.046 1.156 l 1.555 1.549 l -1.418 1.418 c -0.195 0.195 -0.195 0.511 0.0 0.707 c 0.195 0.195 0.512 0.194 0.707 0.0 l 1.418 -1.418 c 0.49 0.49 1.003 1.005 1.553 1.558 c 0.28 0.283 0.774 0.335 1.095 0.02 l 0.062 -0.067 c 0.594 -0.732 0.687 -1.526 0.477 -2.41 c 0.472 -0.475 1.1 -1.103 1.488 -1.49 l 0.068 -0.075 c 0.322 -0.393 0.298 -0.973 -0.068 -1.34 l -1.577 -1.576 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.19 13.754 C 11.44 14.813 11.0 16.104 11.0 17.5 c 0.0 1.184 0.318 2.294 0.871 3.25 h -4.38 c -1.4 0.0 -2.1 0.0 -2.635 -0.273 c -0.47 -0.24 -0.854 -0.622 -1.093 -1.092 c -0.181 -0.356 -0.241 -0.784 -0.26 -1.443 c -0.018 -0.577 0.234 -1.133 0.692 -1.485 c 2.227 -1.708 4.913 -2.707 7.806 -2.707 c 0.063 0.0 0.126 0.003 0.189 0.004 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 3.25 c 2.347 0.0 4.25 1.903 4.25 4.25 s -1.903 4.25 -4.25 4.25 S 7.75 9.847 7.75 7.5 S 9.653 3.25 12.0 3.25 Z")
        )
    }.build()
}
