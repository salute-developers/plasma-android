package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentForwardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentForwardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.354 3.775 C 4.0 4.47 4.0 5.38 4.0 7.2 v 9.6 c 0.0 1.82 0.0 2.73 0.354 3.425 c 0.312 0.612 0.809 1.11 1.42 1.42 C 6.47 22.0 7.38 22.0 9.2 22.0 h 3.61 C 11.689 20.832 11.0 19.247 11.0 17.5 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 c 0.886 0.0 1.73 0.177 2.5 0.498 V 7.2 c 0.0 -1.82 0.0 -2.73 -0.354 -3.425 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 C 17.53 2.0 16.62 2.0 14.8 2.0 H 9.2 C 7.38 2.0 6.47 2.0 5.775 2.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 Z M 8.0 6.0 C 7.586 6.0 7.25 6.336 7.25 6.75 S 7.586 7.5 8.0 7.5 h 8.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.414 6.0 16.0 6.0 H 8.0 Z m 0.0 3.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 7.586 10.75 8.0 10.75 h 4.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 12.414 9.25 12.0 9.25 H 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 17.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 20.538 12.0 17.5 s 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 Z m -5.354 -2.854 c 0.196 -0.195 0.512 -0.195 0.708 0.0 l 2.5 2.5 c 0.195 0.196 0.195 0.512 0.0 0.708 l -2.5 2.5 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 L 19.293 18.0 H 14.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 4.793 l -1.647 -1.646 c -0.195 -0.196 -0.195 -0.512 0.0 -0.708 Z")
        )
    }.build()
}
