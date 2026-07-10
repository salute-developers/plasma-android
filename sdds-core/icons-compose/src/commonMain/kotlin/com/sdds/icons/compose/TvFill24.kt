package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.136 4.683 C 2.0 4.95 2.0 5.3 2.0 6.0 v 9.0 c 0.0 0.7 0.0 1.05 0.136 1.317 c 0.12 0.236 0.311 0.427 0.547 0.547 C 2.95 17.0 3.3 17.0 4.0 17.0 h 16.0 c 0.7 0.0 1.05 0.0 1.317 -0.136 c 0.236 -0.12 0.427 -0.311 0.547 -0.547 C 22.0 16.05 22.0 15.7 22.0 15.0 V 6.0 c 0.0 -0.7 0.0 -1.05 -0.136 -1.317 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 C 21.05 4.0 20.7 4.0 20.0 4.0 H 4.0 C 3.3 4.0 2.95 4.0 2.683 4.136 c -0.236 0.12 -0.427 0.311 -0.547 0.547 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 18.0 H 4.0 v 1.5 h 16.0 V 18.0 Z")
        )
    }.build()
}
