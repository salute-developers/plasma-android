package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DashboardFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DashboardFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 11.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 8.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -6.0 C 2.672 22.0 2.0 21.328 2.0 20.5 v -8.0 C 2.0 11.672 2.672 11.0 3.5 11.0 h 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.5 15.0 c 0.828 0.0 1.5 0.672 1.5 1.5 v 4.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -6.0 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -4.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 h 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.5 2.0 C 21.328 2.0 22.0 2.672 22.0 3.5 v 8.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -6.0 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -8.0 C 13.0 2.672 13.672 2.0 14.5 2.0 h 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 2.0 C 10.328 2.0 11.0 2.672 11.0 3.5 v 4.0 C 11.0 8.328 10.328 9.0 9.5 9.0 h -6.0 C 2.672 9.0 2.0 8.328 2.0 7.5 v -4.0 C 2.0 2.672 2.672 2.0 3.5 2.0 h 6.0 Z")
        )
    }.build()
}
