package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.701 8.75 c 0.577 -1.0 2.02 -1.0 2.598 0.0 l 9.093 15.75 c 0.578 1.0 -0.144 2.25 -1.299 2.25 H 8.907 c -1.155 0.0 -1.877 -1.25 -1.3 -2.25 l 9.094 -15.75 Z M 10.206 24.5 L 18.0 11.0 l 7.794 13.5 H 10.206 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.752 7.625 c 1.444 -2.5 5.052 -2.5 6.496 0.0 l 9.093 15.75 C 31.784 25.875 29.98 29.0 27.093 29.0 H 8.907 c -2.887 0.0 -4.691 -3.125 -3.248 -5.625 l 9.093 -15.75 Z m 5.196 0.75 l 9.094 15.75 c 0.866 1.5 -0.217 3.375 -1.949 3.375 H 8.907 c -1.732 0.0 -2.815 -1.875 -1.949 -3.375 l 9.093 -15.75 c 0.867 -1.5 3.032 -1.5 3.898 0.0 Z")
        )
    }.build()
}
