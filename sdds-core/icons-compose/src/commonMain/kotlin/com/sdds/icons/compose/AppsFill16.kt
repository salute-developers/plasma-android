package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppsFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppsFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.95 4.2 c 0.0 -1.242 1.008 -2.25 2.25 -2.25 c 1.243 0.0 2.25 1.008 2.25 2.25 c 0.0 1.243 -1.007 2.25 -2.25 2.25 c -1.242 0.0 -2.25 -1.007 -2.25 -2.25 Z M 4.2 0.95 c -1.794 0.0 -3.25 1.455 -3.25 3.25 S 2.407 7.45 4.2 7.45 c 1.796 0.0 3.25 -1.455 3.25 -3.25 S 5.997 0.95 4.2 0.95 Z m 7.55 6.55 C 13.545 7.5 15.0 6.045 15.0 4.25 S 13.545 1.0 11.75 1.0 S 8.5 2.455 8.5 4.25 S 9.955 7.5 11.75 7.5 Z M 15.0 11.75 c 0.0 1.795 -1.455 3.25 -3.25 3.25 S 8.5 13.545 8.5 11.75 S 9.955 8.5 11.75 8.5 S 15.0 9.955 15.0 11.75 Z M 4.25 15.0 c 1.795 0.0 3.25 -1.455 3.25 -3.25 S 6.045 8.5 4.25 8.5 S 1.0 9.955 1.0 11.75 S 2.455 15.0 4.25 15.0 Z")
        )
    }.build()
}
