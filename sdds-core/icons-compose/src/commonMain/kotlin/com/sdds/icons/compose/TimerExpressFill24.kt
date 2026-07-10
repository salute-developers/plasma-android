package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 3.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 15.164 4.0 14.75 4.0 h -5.5 C 8.836 4.0 8.5 3.664 8.5 3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 c 0.0 -2.205 -0.84 -4.213 -2.216 -5.724 L 19.03 7.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -0.79 0.79 C 15.746 5.656 13.95 5.0 12.0 5.0 c -4.694 0.0 -8.5 3.806 -8.5 8.5 S 7.306 22.0 12.0 22.0 Z m 1.73 -13.006 c 0.057 -0.169 -0.013 -0.353 -0.165 -0.443 c -0.153 -0.09 -0.348 -0.06 -0.467 0.072 l -5.0 5.5 c -0.1 0.11 -0.126 0.268 -0.066 0.404 s 0.195 0.223 0.343 0.223 h 2.98 l -1.086 3.256 c -0.056 0.169 0.014 0.353 0.166 0.443 c 0.153 0.09 0.348 0.06 0.467 -0.072 l 5.0 -5.5 c 0.1 -0.11 0.126 -0.268 0.066 -0.404 c -0.06 -0.135 -0.195 -0.223 -0.343 -0.223 h -2.98 l 1.086 -3.256 Z")
        )
    }.build()
}
