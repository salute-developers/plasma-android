package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvPlayFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvPlayFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 6.0 c 0.0 -0.7 0.0 -1.05 0.136 -1.317 c 0.12 -0.236 0.311 -0.427 0.547 -0.547 C 2.95 4.0 3.3 4.0 4.0 4.0 h 16.0 c 0.7 0.0 1.05 0.0 1.317 0.136 c 0.236 0.12 0.427 0.311 0.547 0.547 C 22.0 4.95 22.0 5.3 22.0 6.0 v 9.0 c 0.0 0.7 0.0 1.05 -0.136 1.317 c -0.12 0.236 -0.311 0.427 -0.547 0.547 C 21.05 17.0 20.7 17.0 20.0 17.0 H 4.0 c -0.7 0.0 -1.05 0.0 -1.317 -0.136 c -0.236 -0.12 -0.427 -0.311 -0.547 -0.547 C 2.0 16.05 2.0 15.7 2.0 15.0 V 6.0 Z m 13.25 4.067 c 0.333 0.192 0.333 0.674 0.0 0.866 l -4.5 2.598 C 10.417 13.723 10.0 13.483 10.0 13.098 V 7.902 c 0.0 -0.385 0.417 -0.626 0.75 -0.433 l 4.5 2.598 Z M 20.0 18.0 H 4.0 v 1.5 h 16.0 V 18.0 Z")
        )
    }.build()
}
