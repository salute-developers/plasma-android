package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FileGlassFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FileGlassFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 7.2 c 0.0 -1.82 0.0 -2.73 0.354 -3.425 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 C 6.47 2.0 7.38 2.0 9.2 2.0 h 5.6 c 1.82 0.0 2.73 0.0 3.425 0.354 c 0.612 0.312 1.11 0.809 1.42 1.42 C 20.0 4.47 20.0 5.38 20.0 7.2 v 9.6 c 0.0 1.82 0.0 2.73 -0.354 3.425 c -0.312 0.612 -0.809 1.11 -1.42 1.42 C 17.53 22.0 16.62 22.0 14.8 22.0 H 9.2 c -1.82 0.0 -2.73 0.0 -3.425 -0.354 c -0.08 -0.04 -0.156 -0.084 -0.23 -0.13 l 1.568 -1.568 C 7.657 20.298 8.305 20.5 9.0 20.5 c 1.933 0.0 3.5 -1.567 3.5 -3.5 s -1.567 -3.5 -3.5 -3.5 s -3.5 1.567 -3.5 3.5 c 0.0 0.695 0.203 1.343 0.552 1.887 l -1.568 1.569 c -0.046 -0.075 -0.09 -0.152 -0.13 -0.23 C 4.0 19.53 4.0 18.62 4.0 16.8 V 7.2 Z M 7.25 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 8.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 16.414 6.75 16.0 6.75 H 8.0 C 7.586 6.75 7.25 6.414 7.25 6.0 Z m 0.0 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 8.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 8.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z m 6.0 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 2.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -2.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z m 1.0 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -1.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 15.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 s 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 Z")
        )
    }.build()
}
