package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.515 10.013 h 4.86 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 H 10.5 v 2.58 h 4.875 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.551 -0.448 1.0 -1.0 1.0 H 10.5 v 2.578 h 4.875 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -4.771 c 0.54 3.224 3.139 5.75 6.398 6.184 L 17.0 27.42 v 3.578 h -2.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 2.986 H 18.0 h 0.014 H 21.0 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.0 v -3.578 c 0.0 -0.023 0.0 -0.044 -0.002 -0.066 c 3.217 -0.428 5.79 -2.895 6.376 -6.06 h -4.749 c -0.621 0.0 -1.125 -0.503 -1.125 -1.124 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 H 25.5 v -2.454 h -4.875 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 H 25.5 v -2.579 h -4.875 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.86 C 25.233 6.098 21.979 3.0 18.0 3.0 c -3.979 0.0 -7.234 3.098 -7.485 7.013 Z")
        )
    }.build()
}
