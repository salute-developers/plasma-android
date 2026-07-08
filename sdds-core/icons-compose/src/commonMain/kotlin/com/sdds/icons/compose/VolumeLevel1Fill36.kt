package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel1Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel1Fill36",
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
            pathData = addPathNodes("M 22.323 12.015 c 0.407 -0.373 1.04 -0.347 1.413 0.06 c 0.723 0.785 1.292 1.713 1.679 2.73 C 25.802 15.82 26.0 16.905 26.0 18.001 c 0.0 1.095 -0.198 2.181 -0.585 3.197 c -0.387 1.016 -0.956 1.944 -1.679 2.73 c -0.374 0.406 -1.006 0.433 -1.413 0.059 c -0.406 -0.374 -0.433 -1.007 -0.059 -1.413 c 0.546 -0.594 0.982 -1.302 1.282 -2.088 c 0.3 -0.786 0.454 -1.63 0.454 -2.485 s -0.155 -1.7 -0.454 -2.486 c -0.3 -0.785 -0.736 -1.494 -1.282 -2.088 c -0.374 -0.406 -0.347 -1.039 0.06 -1.413 Z")
        )
    }.build()
}
