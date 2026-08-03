package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaskFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaskFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.675 2.785 C 3.855 2.514 2.99 3.135 3.0 4.01 c 0.096 7.847 1.679 12.23 3.62 14.66 c 1.967 2.467 4.224 2.831 5.375 2.831 c 1.152 0.0 3.409 -0.364 5.377 -2.83 c 1.94 -2.432 3.523 -6.814 3.619 -14.661 c 0.01 -0.874 -0.855 -1.495 -1.675 -1.224 C 18.067 3.2 15.225 4.0 11.996 4.0 C 8.765 4.0 5.923 3.2 4.675 2.785 Z M 10.495 10.0 c 0.0 0.579 -0.673 0.766 -1.174 0.476 l -0.192 -0.11 c -0.392 -0.226 -0.875 -0.226 -1.267 0.0 l -0.192 0.11 c -0.5 0.29 -1.175 0.102 -1.175 -0.476 c 0.0 -0.35 0.093 -0.696 0.268 -1.0 C 6.94 8.696 7.191 8.444 7.495 8.268 C 7.8 8.093 8.145 8.0 8.495 8.0 c 0.352 0.0 0.696 0.093 1.0 0.268 C 9.8 8.444 10.052 8.696 10.227 9.0 c 0.176 0.304 0.268 0.65 0.268 1.0 Z m 4.175 0.476 c -0.5 0.29 -1.175 0.102 -1.175 -0.476 c 0.0 -0.35 0.093 -0.696 0.268 -1.0 c 0.176 -0.304 0.428 -0.556 0.732 -0.732 C 14.8 8.093 15.146 8.0 15.495 8.0 c 0.352 0.0 0.696 0.093 1.0 0.268 C 16.8 8.444 17.052 8.696 17.227 9.0 c 0.176 0.304 0.268 0.65 0.268 1.0 c 0.0 0.579 -0.674 0.766 -1.174 0.476 l -0.192 -0.11 c -0.392 -0.226 -0.875 -0.226 -1.268 0.0 l -0.19 0.11 Z m -6.598 4.457 c -0.2 -0.883 0.744 -1.428 1.625 -1.222 l 1.524 0.358 c 0.51 0.119 1.04 0.119 1.549 0.0 l 1.524 -0.358 c 0.88 -0.206 1.825 0.34 1.625 1.222 c -0.12 0.527 -0.377 1.022 -0.75 1.448 c -0.374 0.426 -0.854 0.77 -1.404 1.008 c -0.55 0.238 -1.156 0.361 -1.77 0.361 c -0.613 0.0 -1.218 -0.123 -1.769 -0.36 c -0.55 -0.238 -1.03 -0.583 -1.404 -1.01 c -0.373 -0.425 -0.63 -0.92 -0.75 -1.447 Z")
        )
    }.build()
}
