package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileCheckFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileCheckFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 7.2 c 0.0 -1.82 0.0 -2.73 0.354 -3.425 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 C 6.47 2.0 7.38 2.0 9.2 2.0 h 5.6 c 1.82 0.0 2.73 0.0 3.425 0.354 c 0.612 0.312 1.11 0.809 1.42 1.42 C 20.0 4.47 20.0 5.38 20.0 7.2 v 9.6 c 0.0 1.82 0.0 2.73 -0.354 3.425 c -0.312 0.612 -0.809 1.11 -1.42 1.42 C 17.53 22.0 16.62 22.0 14.8 22.0 H 9.2 c -1.82 0.0 -2.73 0.0 -3.425 -0.354 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 C 4.0 19.53 4.0 18.62 4.0 16.8 V 7.2 Z M 7.25 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 8.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 16.414 6.75 16.0 6.75 H 8.0 C 7.586 6.75 7.25 6.414 7.25 6.0 Z m 0.0 3.75 C 7.25 9.336 7.586 9.0 8.0 9.0 h 8.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 16.414 10.5 16.0 10.5 H 8.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z m 0.0 3.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 8.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z m 9.78 2.53 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -2.47 2.47 l -0.97 -0.97 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 1.5 1.5 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.0 -3.0 Z")
        )
    }.build()
}
