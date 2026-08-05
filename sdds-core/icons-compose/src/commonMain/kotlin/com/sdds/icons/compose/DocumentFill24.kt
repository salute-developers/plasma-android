package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.354 3.775 C 4.0 4.47 4.0 5.38 4.0 7.2 v 9.6 c 0.0 1.82 0.0 2.73 0.354 3.425 c 0.312 0.612 0.809 1.11 1.42 1.42 C 6.47 22.0 7.38 22.0 9.2 22.0 h 5.6 c 1.82 0.0 2.73 0.0 3.425 -0.354 c 0.612 -0.312 1.11 -0.809 1.42 -1.42 C 20.0 19.53 20.0 18.62 20.0 16.8 V 7.2 c 0.0 -1.82 0.0 -2.73 -0.354 -3.425 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 C 17.53 2.0 16.62 2.0 14.8 2.0 H 9.2 C 7.38 2.0 6.47 2.0 5.775 2.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 Z M 8.0 6.0 C 7.586 6.0 7.25 6.336 7.25 6.75 S 7.586 7.5 8.0 7.5 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.414 6.0 16.0 6.0 H 8.0 Z m 0.0 3.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 10.75 8.0 10.75 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.414 9.25 16.0 9.25 H 8.0 Z m 0.0 3.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 13.75 8.0 13.75 h 4.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 8.0 Z")
        )
    }.build()
}
