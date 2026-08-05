package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.998 3.0 C 13.857 3.0 10.5 6.357 10.5 10.498 v 9.249 c 0.0 3.81 2.842 6.956 6.52 7.434 c -0.014 0.07 -0.022 0.14 -0.022 0.214 v 3.602 h -2.059 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 3.05 h 0.009 h 0.01 h 3.047 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.057 v -3.602 c 0.0 -0.073 -0.008 -0.145 -0.023 -0.214 c 3.68 -0.479 6.52 -3.625 6.52 -7.434 v -9.25 C 25.495 6.358 22.14 3.0 17.998 3.0 Z m -5.466 6.903 C 12.828 7.147 15.162 5.0 17.998 5.0 c 2.835 0.0 5.17 2.147 5.466 4.903 h -2.79 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 2.822 v 2.603 h -2.822 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 2.822 v 2.602 h -2.822 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 2.652 c -0.606 2.378 -2.762 4.136 -5.328 4.136 c -2.567 0.0 -4.723 -1.758 -5.328 -4.136 h 2.653 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 12.5 v -2.602 h 2.823 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 12.5 v -2.603 h 2.823 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -2.791 Z")
        )
    }.build()
}
