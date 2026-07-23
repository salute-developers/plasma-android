package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LogoutFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LogoutFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.7 19.748 C 14.0 19.16 14.0 18.39 14.0 16.85 v -4.1 H 9.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 8.586 11.25 9.0 11.25 h 5.0 v -4.1 c 0.0 -1.54 0.0 -2.31 -0.3 -2.898 c -0.264 -0.518 -0.684 -0.939 -1.202 -1.202 c -0.588 -0.3 -1.358 -0.3 -2.898 -0.3 H 8.4 c -1.54 0.0 -2.31 0.0 -2.899 0.3 C 4.984 3.313 4.563 3.734 4.3 4.252 C 4.0 4.84 4.0 5.61 4.0 7.15 v 9.7 c 0.0 1.54 0.0 2.31 0.3 2.898 c 0.264 0.518 0.685 0.939 1.202 1.202 c 0.589 0.3 1.359 0.3 2.899 0.3 h 1.2 c 1.54 0.0 2.31 0.0 2.898 -0.3 c 0.518 -0.263 0.938 -0.684 1.202 -1.201 Z M 14.0 11.25 h 3.69 l -1.72 -1.72 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.292 -0.293 0.767 -0.293 1.06 0.0 l 3.0 3.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -3.0 3.0 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.72 -1.72 H 14.0 v -1.5 Z")
        )
    }.build()
}
