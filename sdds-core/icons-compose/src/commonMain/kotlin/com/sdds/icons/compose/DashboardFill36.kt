package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DashboardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DashboardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 16.5 c 1.243 0.0 2.25 1.007 2.25 2.25 v 12.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -9.0 C 4.007 33.0 3.0 31.993 3.0 30.75 v -12.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.75 22.5 c 1.243 0.0 2.25 1.007 2.25 2.25 v 6.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -9.0 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 v -6.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 h 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.75 3.0 C 31.993 3.0 33.0 4.007 33.0 5.25 v 12.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -9.0 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 v -12.0 C 19.5 4.007 20.507 3.0 21.75 3.0 h 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 3.0 c 1.243 0.0 2.25 1.007 2.25 2.25 v 6.0 c 0.0 1.243 -1.007 2.25 -2.25 2.25 h -9.0 C 4.007 13.5 3.0 12.493 3.0 11.25 v -6.0 C 3.0 4.007 4.007 3.0 5.25 3.0 h 9.0 Z")
        )
    }.build()
}
