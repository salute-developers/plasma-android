package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundClockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundClockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.162 1.944 C 5.292 1.391 5.786 1.0 6.354 1.0 h 3.092 c 0.568 0.0 1.062 0.391 1.192 0.944 l 0.573 2.436 l -0.007 0.001 c 0.734 0.671 1.263 1.562 1.483 2.569 h 0.638 c 0.097 0.0 0.175 0.078 0.175 0.175 v 1.75 c 0.0 0.097 -0.078 0.175 -0.175 0.175 h -0.638 c -0.22 1.007 -0.749 1.898 -1.483 2.569 l 0.007 0.001 l -0.573 2.436 C 10.508 14.609 10.014 15.0 9.446 15.0 H 6.354 c -0.568 0.0 -1.062 -0.391 -1.192 -0.944 L 4.589 11.62 l 0.007 -0.001 C 3.616 10.723 3.0 9.433 3.0 8.0 c 0.0 -1.433 0.615 -2.723 1.596 -3.619 L 4.589 4.38 l 0.573 -2.436 Z M 4.05 8.0 c 0.0 -2.126 1.724 -3.85 3.85 -3.85 c 2.126 0.0 3.85 1.724 3.85 3.85 c 0.0 2.126 -1.724 3.85 -3.85 3.85 c -2.126 0.0 -3.85 -1.724 -3.85 -3.85 Z M 8.4 5.55 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 2.8 c 0.0 0.167 0.084 0.323 0.223 0.416 l 1.575 1.05 c 0.23 0.153 0.54 0.09 0.693 -0.139 c 0.154 -0.23 0.091 -0.54 -0.138 -0.693 L 8.4 8.082 V 5.55 Z")
        )
    }.build()
}
