package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DashboardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DashboardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.25 7.3 c 0.58 0.0 1.05 0.47 1.05 1.05 v 5.6 C 7.3 14.53 6.83 15.0 6.25 15.0 h -4.2 C 1.47 15.0 1.0 14.53 1.0 13.95 v -5.6 C 1.0 7.77 1.47 7.3 2.05 7.3 h 4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.95 10.1 c 0.58 0.0 1.05 0.47 1.05 1.05 v 2.8 c 0.0 0.58 -0.47 1.05 -1.05 1.05 h -4.2 c -0.58 0.0 -1.05 -0.47 -1.05 -1.05 v -2.8 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.95 1.0 C 14.53 1.0 15.0 1.47 15.0 2.05 v 5.6 c 0.0 0.58 -0.47 1.05 -1.05 1.05 h -4.2 C 9.17 8.7 8.7 8.23 8.7 7.65 v -5.6 C 8.7 1.47 9.17 1.0 9.75 1.0 h 4.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.25 1.0 C 6.83 1.0 7.3 1.47 7.3 2.05 v 2.8 c 0.0 0.58 -0.47 1.05 -1.05 1.05 h -4.2 C 1.47 5.9 1.0 5.43 1.0 4.85 v -2.8 C 1.0 1.47 1.47 1.0 2.05 1.0 h 4.2 Z")
        )
    }.build()
}
