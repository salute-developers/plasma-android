package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel0Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel0Fill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 19.785 v -3.567 c 0.0 -1.5 1.216 -2.716 2.716 -2.716 c 1.137 0.0 2.223 -0.476 2.994 -1.311 l 3.623 -3.925 c 1.297 -1.405 1.945 -2.108 2.506 -2.168 c 0.487 -0.052 0.967 0.136 1.29 0.504 C 17.5 7.027 17.5 7.982 17.5 9.895 v 16.213 c 0.0 1.912 0.0 2.868 -0.371 3.293 c -0.323 0.368 -0.803 0.556 -1.29 0.504 c -0.56 -0.06 -1.209 -0.763 -2.506 -2.167 L 9.71 23.812 c -0.771 -0.835 -1.857 -1.31 -2.994 -1.31 c -1.5 0.0 -2.716 -1.216 -2.716 -2.717 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.293 12.794 c 0.39 -0.39 1.024 -0.39 1.414 0.0 l 3.793 3.793 l 3.793 -3.793 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.391 0.39 1.024 0.0 1.415 l -3.793 3.793 l 3.793 3.793 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.024 0.39 -1.414 0.0 L 26.5 19.416 l -3.793 3.793 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 l 3.793 -3.792 l -3.793 -3.793 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 Z")
        )
    }.build()
}
