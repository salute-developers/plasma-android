package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.354 1.0 C 5.786 1.0 5.292 1.391 5.162 1.944 L 4.589 4.38 L 4.596 4.38 C 3.616 5.277 3.0 6.567 3.0 8.0 c 0.0 1.433 0.615 2.723 1.596 3.619 L 4.589 11.62 l 0.573 2.436 C 5.292 14.609 5.786 15.0 6.354 15.0 h 3.092 c 0.568 0.0 1.062 -0.391 1.192 -0.944 l 0.573 -2.436 l -0.007 -0.001 c 0.734 -0.671 1.263 -1.562 1.483 -2.569 h 0.638 c 0.097 0.0 0.175 -0.078 0.175 -0.175 v -1.75 c 0.0 -0.097 -0.078 -0.175 -0.175 -0.175 h -0.638 c -0.22 -1.007 -0.749 -1.898 -1.483 -2.569 l 0.007 -0.001 l -0.573 -2.436 C 10.508 1.391 10.014 1.0 9.446 1.0 H 6.354 Z M 7.9 4.15 C 5.774 4.15 4.05 5.874 4.05 8.0 c 0.0 2.126 1.724 3.85 3.85 3.85 c 2.126 0.0 3.85 -1.724 3.85 -3.85 c 0.0 -2.126 -1.724 -3.85 -3.85 -3.85 Z")
        )
    }.build()
}
