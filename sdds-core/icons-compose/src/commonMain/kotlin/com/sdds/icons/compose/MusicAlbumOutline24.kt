package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.747 5.48 c -0.4 -0.107 -0.811 0.13 -0.918 0.53 c -0.108 0.4 0.13 0.812 0.53 0.919 c 0.89 0.238 1.702 0.707 2.353 1.359 c 0.652 0.651 1.12 1.463 1.36 2.353 c 0.106 0.4 0.518 0.638 0.918 0.53 c 0.4 -0.107 0.637 -0.518 0.53 -0.918 c -0.307 -1.145 -0.91 -2.188 -1.747 -3.026 c -0.838 -0.838 -1.881 -1.44 -3.026 -1.747 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.01 12.829 c 0.4 -0.108 0.812 0.13 0.919 0.53 c 0.238 0.89 0.707 1.702 1.359 2.353 c 0.651 0.652 1.463 1.12 2.353 1.36 c 0.4 0.106 0.638 0.518 0.53 0.918 c -0.107 0.4 -0.518 0.637 -0.918 0.53 c -1.145 -0.307 -2.188 -0.91 -3.026 -1.747 c -0.838 -0.838 -1.44 -1.881 -1.747 -3.026 c -0.107 -0.4 0.13 -0.811 0.53 -0.918 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.5 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 s 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 Z M 10.0 12.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 s -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
