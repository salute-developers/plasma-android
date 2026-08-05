package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NewsPaperFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NewsPaperFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 4.0 C 3.231 4.0 2.0 5.231 2.0 6.75 v 10.5 C 2.0 18.769 3.231 20.0 4.75 20.0 h 14.5 c 1.519 0.0 2.75 -1.231 2.75 -2.75 V 6.75 C 22.0 5.231 20.769 4.0 19.25 4.0 H 4.75 Z m 1.0 11.5 C 5.336 15.5 5.0 15.836 5.0 16.25 S 5.336 17.0 5.75 17.0 h 12.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 5.75 Z M 5.0 13.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 12.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 18.664 14.0 18.25 14.0 H 5.75 C 5.336 14.0 5.0 13.664 5.0 13.25 Z m 0.082 -5.84 C 5.0 7.57 5.0 7.78 5.0 8.2 v 1.6 c 0.0 0.42 0.0 0.63 0.082 0.79 c 0.072 0.142 0.186 0.256 0.328 0.328 C 5.57 11.0 5.78 11.0 6.2 11.0 h 4.6 c 0.42 0.0 0.63 0.0 0.79 -0.082 c 0.142 -0.072 0.256 -0.186 0.328 -0.327 C 12.0 10.43 12.0 10.22 12.0 9.8 V 8.2 c 0.0 -0.42 0.0 -0.63 -0.082 -0.79 c -0.072 -0.142 -0.186 -0.256 -0.327 -0.328 C 11.43 7.0 11.22 7.0 10.8 7.0 H 6.2 C 5.78 7.0 5.57 7.0 5.41 7.082 C 5.268 7.154 5.154 7.268 5.082 7.41 Z")
        )
    }.build()
}
