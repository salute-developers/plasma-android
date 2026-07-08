package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvModeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvModeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.42 25.153 H 31.4 H 4.58 c -0.086 0.0 -0.203 0.0 -0.308 -0.009 c -0.124 -0.01 -0.317 -0.037 -0.521 -0.141 c -0.259 -0.132 -0.47 -0.343 -0.601 -0.601 c -0.104 -0.205 -0.131 -0.397 -0.142 -0.522 C 3.0 23.776 3.0 23.66 3.0 23.572 V 7.58 c 0.0 -0.087 0.0 -0.204 0.008 -0.309 c 0.01 -0.124 0.038 -0.317 0.142 -0.521 c 0.132 -0.259 0.342 -0.47 0.6 -0.601 c 0.205 -0.104 0.398 -0.131 0.522 -0.142 C 4.377 6.0 4.494 6.0 4.581 6.0 H 31.4 h 0.02 c 0.086 0.0 0.203 0.0 0.308 0.008 c 0.124 0.01 0.317 0.038 0.521 0.142 c 0.259 0.132 0.47 0.342 0.601 0.6 c 0.104 0.205 0.131 0.398 0.142 0.522 C 33.0 7.377 33.0 7.494 33.0 7.581 V 7.6 v 15.953 v 0.019 c 0.0 0.087 0.0 0.204 -0.008 0.308 c -0.01 0.125 -0.038 0.317 -0.142 0.522 c -0.132 0.258 -0.342 0.469 -0.6 0.6 c -0.205 0.105 -0.398 0.132 -0.522 0.142 c -0.105 0.009 -0.222 0.009 -0.309 0.009 Z m -0.42 -2.0 H 5.0 V 8.0 h 26.0 v 15.153 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.893 27.0 h 24.216 v 2.002 H 5.893 V 27.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.835 11.0 H 9.25 v 1.929 h 2.712 V 20.0 h 2.046 V 12.93 h 2.827 V 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.156 20.0 l 3.594 -9.0 h -2.06 l -2.519 6.467 L 19.69 11.0 h -2.162 l 3.633 9.0 h 1.995 Z")
        )
    }.build()
}
