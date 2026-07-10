package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaskOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaskOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.495 10.0 c 0.0 0.579 -0.673 0.766 -1.174 0.476 l -0.191 -0.11 c -0.393 -0.226 -0.876 -0.226 -1.268 0.0 l -0.192 0.11 c -0.5 0.29 -1.174 0.102 -1.174 -0.476 c 0.0 -0.35 0.092 -0.696 0.267 -1.0 C 6.94 8.696 7.191 8.444 7.496 8.268 C 7.8 8.093 8.144 8.0 8.496 8.0 c 0.35 0.0 0.695 0.093 1.0 0.268 C 9.8 8.444 10.052 8.696 10.228 9.0 c 0.175 0.304 0.268 0.65 0.268 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.67 10.476 c -0.5 0.29 -1.175 0.102 -1.175 -0.476 c 0.0 -0.35 0.093 -0.696 0.269 -1.0 c 0.175 -0.304 0.428 -0.556 0.732 -0.732 C 14.8 8.093 15.143 8.0 15.495 8.0 c 0.35 0.0 0.696 0.093 1.0 0.268 C 16.8 8.444 17.052 8.696 17.227 9.0 c 0.175 0.304 0.267 0.65 0.267 1.0 c 0.0 0.579 -0.674 0.766 -1.174 0.476 l -0.192 -0.11 c -0.392 -0.226 -0.875 -0.226 -1.268 0.0 l -0.19 0.11 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.072 14.933 c -0.2 -0.883 0.744 -1.428 1.625 -1.222 l 1.524 0.358 c 0.51 0.119 1.04 0.119 1.549 0.0 l 1.524 -0.358 c 0.88 -0.206 1.825 0.34 1.625 1.222 c -0.12 0.527 -0.377 1.022 -0.75 1.448 c -0.374 0.426 -0.854 0.77 -1.404 1.008 c -0.55 0.238 -1.156 0.361 -1.77 0.361 c -0.613 0.0 -1.218 -0.123 -1.769 -0.36 c -0.55 -0.238 -1.03 -0.583 -1.404 -1.01 c -0.373 -0.425 -0.63 -0.92 -0.75 -1.447 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.675 2.785 C 3.855 2.514 2.99 3.135 3.0 4.01 c 0.096 7.847 1.679 12.23 3.62 14.66 c 1.967 2.467 4.224 2.831 5.375 2.831 c 1.152 0.0 3.409 -0.364 5.377 -2.83 c 1.94 -2.432 3.523 -6.814 3.619 -14.661 c 0.01 -0.874 -0.855 -1.495 -1.675 -1.224 C 18.067 3.2 15.225 4.0 11.996 4.0 C 8.765 4.0 5.923 3.2 4.675 2.785 Z m 3.117 14.95 c -1.62 -2.031 -3.155 -5.943 -3.287 -13.429 C 5.949 4.762 8.782 5.5 11.995 5.5 c 3.214 0.0 6.047 -0.738 7.491 -1.194 c -0.132 7.486 -1.666 11.398 -3.287 13.428 C 14.584 19.76 12.812 20.0 11.995 20.0 c -0.816 0.0 -2.588 -0.241 -4.203 -2.266 Z")
        )
    }.build()
}
