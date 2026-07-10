package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.51 4.23 h 2.266 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.5 v 1.132 h 2.276 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.5 v 1.131 h 2.276 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -2.22 C 4.82 10.967 6.01 12.12 7.5 12.333 L 7.5 12.368 V 14.0 H 6.6 c -0.277 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.223 0.5 0.5 0.5 h 1.377 L 8.0 15.0 h 0.023 H 9.4 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 8.5 v -1.632 l -0.001 -0.035 c 1.491 -0.213 2.68 -1.366 2.945 -2.84 h -2.22 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 H 11.5 V 7.362 H 9.225 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 s 0.223 -0.5 0.5 -0.5 H 11.5 V 5.23 H 9.225 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 s 0.223 -0.5 0.5 -0.5 h 2.265 C 11.352 2.423 9.842 1.0 8.0 1.0 C 6.158 1.0 4.648 2.423 4.51 4.23 Z")
        )
    }.build()
}
