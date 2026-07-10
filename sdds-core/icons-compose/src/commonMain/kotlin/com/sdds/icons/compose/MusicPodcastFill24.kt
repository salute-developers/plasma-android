package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.025 6.5 h 3.225 C 10.664 6.5 11.0 6.836 11.0 7.25 S 10.664 8.0 10.25 8.0 H 7.0 v 1.5 h 3.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 10.664 11.0 10.25 11.0 H 7.0 v 1.5 h 3.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 10.664 14.0 10.25 14.0 H 7.1 c 0.398 1.96 1.943 3.505 3.905 3.901 C 11.002 17.933 11.0 17.967 11.0 18.0 v 2.0 h -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 4.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -1.0 v -2.0 c 0.0 -0.033 -0.002 -0.067 -0.005 -0.099 c 1.962 -0.396 3.507 -1.94 3.905 -3.901 h -3.15 C 13.336 14.0 13.0 13.664 13.0 13.25 s 0.336 -0.75 0.75 -0.75 H 17.0 V 11.0 h -3.25 C 13.336 11.0 13.0 10.664 13.0 10.25 s 0.336 -0.75 0.75 -0.75 H 17.0 V 8.0 h -3.25 C 13.336 8.0 13.0 7.664 13.0 7.25 s 0.336 -0.75 0.75 -0.75 h 3.225 C 16.725 3.973 14.593 2.0 12.0 2.0 C 9.407 2.0 7.276 3.973 7.025 6.5 Z")
        )
    }.build()
}
