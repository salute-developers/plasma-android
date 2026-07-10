package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 9.239 2.0 7.0 4.239 7.0 7.0 v 6.0 c 0.0 2.42 1.72 4.44 4.005 4.901 C 11.002 17.933 11.0 17.967 11.0 18.0 v 2.0 h -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 4.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -1.0 v -2.0 c 0.0 -0.033 -0.002 -0.067 -0.005 -0.099 C 15.28 17.44 17.0 15.421 17.0 13.0 V 7.0 c 0.0 -2.761 -2.239 -5.0 -5.0 -5.0 Z M 8.535 6.5 c 0.243 -1.696 1.702 -3.0 3.465 -3.0 s 3.222 1.304 3.465 3.0 H 13.75 C 13.336 6.5 13.0 6.836 13.0 7.25 S 13.336 8.0 13.75 8.0 h 1.75 v 1.5 h -1.75 C 13.336 9.5 13.0 9.836 13.0 10.25 S 13.336 11.0 13.75 11.0 h 1.75 v 1.5 h -1.75 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 13.336 14.0 13.75 14.0 h 1.605 c -0.43 1.446 -1.77 2.5 -3.355 2.5 S 9.075 15.446 8.645 14.0 h 1.605 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.5 V 11.0 h 1.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 10.664 9.5 10.25 9.5 H 8.5 V 8.0 h 1.75 C 10.664 8.0 11.0 7.664 11.0 7.25 S 10.664 6.5 10.25 6.5 H 8.535 Z")
        )
    }.build()
}
