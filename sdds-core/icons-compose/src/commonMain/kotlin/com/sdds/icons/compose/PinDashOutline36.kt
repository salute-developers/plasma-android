package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.749 18.326 c 1.236 1.648 0.06 4.0 -2.0 4.0 h -6.266 v 8.414 L 18.002 33.0 l -1.483 -2.259 v -7.842 l 2.572 -2.572 h 6.658 c 0.412 0.0 0.646 -0.47 0.4 -0.8 l -2.682 -3.577 l 1.428 -1.428 l 2.854 3.805 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.424 3.004 c 1.075 0.0 1.896 0.96 1.728 2.022 L 24.328 9.5 l -2.252 2.252 l 1.056 -6.748 H 12.87 l 1.055 6.693 c 0.2 1.268 -0.123 2.563 -0.893 3.59 l -3.179 4.24 c -0.247 0.329 -0.012 0.799 0.4 0.8 h 3.249 L 29.749 4.08 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.95 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 7.21 -7.21 h -1.25 c -2.059 0.0 -3.235 -2.352 -2.0 -4.0 l 3.18 -4.24 c 0.446 -0.594 0.632 -1.344 0.516 -2.077 l -1.098 -6.983 c -0.168 -1.062 0.653 -2.022 1.728 -2.022 h 10.845 Z")
        )
    }.build()
}
