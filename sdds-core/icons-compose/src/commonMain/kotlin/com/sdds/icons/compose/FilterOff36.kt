package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterOff36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.163 5.707 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 L 25.542 8.5 H 5.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 18.042 l -6.0 6.0 H 9.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 6.042 L 4.293 29.749 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.163 5.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.13 16.5 l -2.0 2.0 h 5.37 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -3.37 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.13 24.5 l -2.0 2.0 H 23.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -7.87 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.997 8.632 L 29.129 10.5 H 30.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.372 -0.202 -0.696 -0.503 -0.868 Z")
        )
    }.build()
}
