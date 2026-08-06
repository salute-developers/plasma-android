package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathData = addPathNodes("M 20.556 15.963 l -1.565 1.567 l -0.073 0.083 c -0.152 0.203 -0.194 0.463 -0.133 0.696 c 0.155 0.593 0.12 1.025 -0.118 1.42 c -1.29 -1.298 -2.382 -2.39 -3.454 -3.455 c 0.17 -0.102 0.338 -0.164 0.512 -0.192 c 0.25 -0.04 0.544 -0.02 0.906 0.076 l 0.104 0.02 c 0.207 0.027 0.424 -0.024 0.598 -0.158 l 0.085 -0.073 l 1.56 -1.561 l 1.578 1.577 Z")
            )
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 17.5 12.0 c 3.038 0.0 5.5 2.463 5.5 5.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 c -3.037 0.0 -5.5 -2.462 -5.5 -5.5 s 2.463 -5.5 5.5 -5.5 Z m 2.186 1.679 c -0.364 -0.364 -0.942 -0.39 -1.335 -0.072 l -0.077 0.069 c -0.387 0.385 -1.018 1.013 -1.492 1.491 c -0.416 -0.1 -0.821 -0.136 -1.217 -0.072 c -0.38 0.061 -0.729 0.21 -1.054 0.445 l -0.139 0.107 c -0.386 0.314 -0.348 0.855 -0.046 1.156 l 1.555 1.549 l -1.418 1.418 c -0.195 0.195 -0.195 0.511 0.0 0.707 c 0.195 0.194 0.512 0.194 0.707 0.0 l 1.418 -1.418 c 0.49 0.49 1.003 1.005 1.553 1.558 c 0.281 0.283 0.775 0.335 1.095 0.02 l 0.062 -0.067 c 0.594 -0.731 0.687 -1.526 0.477 -2.41 c 0.472 -0.475 1.1 -1.103 1.488 -1.49 l 0.068 -0.075 c 0.322 -0.393 0.298 -0.973 -0.068 -1.34 l -1.577 -1.576 Z")
            )
            addPath(
                fill = SolidColor(Color.White),
                pathData = addPathNodes("M 12.373 13.506 c -0.356 0.457 -0.653 0.961 -0.878 1.504 c -2.403 0.094 -4.634 0.852 -6.516 2.096 c -0.308 0.204 -0.468 0.546 -0.433 0.867 c 0.032 0.282 0.082 0.448 0.145 0.57 c 0.167 0.33 0.435 0.599 0.764 0.767 C 5.6 19.383 5.8 19.439 6.17 19.469 c 0.38 0.03 0.869 0.031 1.58 0.031 h 3.566 c 0.172 0.534 0.413 1.037 0.71 1.5 H 7.749 c -0.687 0.0 -1.248 0.0 -1.702 -0.036 c -0.463 -0.038 -0.882 -0.12 -1.272 -0.319 c -0.612 -0.311 -1.11 -0.808 -1.421 -1.42 c -0.173 -0.338 -0.255 -0.697 -0.298 -1.086 c -0.103 -0.926 0.357 -1.795 1.095 -2.284 C 6.4 14.367 9.1 13.5 11.999 13.5 c 0.125 0.0 0.25 0.003 0.374 0.006 Z")
            )
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 12.0 2.0 c 2.762 0.0 5.0 2.239 5.0 5.0 s -2.238 5.0 -5.0 5.0 C 9.24 12.0 7.0 9.761 7.0 7.0 s 2.239 -5.0 5.0 -5.0 Z m 0.0 1.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z")
            )
        }
    }.build()
}
