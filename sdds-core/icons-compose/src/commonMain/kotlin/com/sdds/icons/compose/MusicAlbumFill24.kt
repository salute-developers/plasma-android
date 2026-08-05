package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicAlbumFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicAlbumFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 1.747 -16.52 c -0.4 -0.107 -0.811 0.13 -0.918 0.53 c -0.108 0.4 0.13 0.812 0.53 0.919 c 0.89 0.238 1.702 0.707 2.353 1.359 c 0.652 0.651 1.12 1.463 1.36 2.353 c 0.106 0.4 0.518 0.638 0.918 0.53 c 0.4 -0.107 0.637 -0.518 0.53 -0.918 c -0.307 -1.145 -0.91 -2.188 -1.747 -3.026 c -0.838 -0.838 -1.881 -1.44 -3.026 -1.747 Z M 6.01 12.828 c 0.4 -0.107 0.812 0.13 0.919 0.53 c 0.238 0.891 0.707 1.703 1.359 2.354 c 0.651 0.652 1.463 1.12 2.353 1.36 c 0.4 0.106 0.638 0.518 0.53 0.918 c -0.107 0.4 -0.518 0.637 -0.918 0.53 c -1.145 -0.307 -2.188 -0.91 -3.026 -1.747 c -0.838 -0.838 -1.44 -1.881 -1.747 -3.026 c -0.107 -0.4 0.13 -0.811 0.53 -0.918 Z M 12.0 14.75 c 1.519 0.0 2.75 -1.231 2.75 -2.75 S 13.519 9.25 12.0 9.25 S 9.25 10.481 9.25 12.0 s 1.231 2.75 2.75 2.75 Z")
        )
    }.build()
}
