package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressSpeedFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressSpeedFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 3.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 12.586 4.75 13.0 4.75 h 1.25 v 1.29 C 10.737 6.414 8.0 9.387 8.0 13.0 c 0.0 3.866 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 c 0.0 -3.613 -2.737 -6.586 -6.25 -6.96 V 4.75 H 17.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 17.414 3.25 17.0 3.25 h -4.0 Z m 3.298 6.145 c 0.042 -0.135 -0.01 -0.282 -0.125 -0.354 c -0.114 -0.072 -0.26 -0.048 -0.35 0.057 l -3.75 4.4 c -0.075 0.088 -0.094 0.215 -0.049 0.323 C 12.069 13.93 12.17 14.0 12.281 14.0 h 2.235 l -0.814 2.605 c -0.042 0.135 0.01 0.282 0.125 0.354 c 0.114 0.072 0.26 0.048 0.35 -0.057 l 3.75 -4.4 c 0.075 -0.088 0.094 -0.215 0.049 -0.323 C 17.931 12.07 17.83 12.0 17.719 12.0 h -2.235 l 0.814 -2.605 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 7.25 C 3.586 7.25 3.25 7.586 3.25 8.0 S 3.586 8.75 4.0 8.75 h 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 7.914 7.25 7.5 7.25 H 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 11.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 1.586 12.75 2.0 12.75 h 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.25 16.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
    }.build()
}
