package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.81 2.608 C 14.93 2.703 15.0 2.848 15.0 3.0 v 8.966 c 0.0 0.232 -0.16 0.433 -0.385 0.486 l -4.392 1.035 c -0.077 0.018 -0.157 0.017 -0.234 -0.001 l -4.1 -1.006 l -4.274 1.007 c -0.15 0.035 -0.306 0.0 -0.425 -0.095 C 1.07 13.297 1.0 13.152 1.0 13.0 V 4.034 c 0.0 -0.231 0.16 -0.433 0.385 -0.486 l 4.392 -1.035 c 0.077 -0.018 0.157 -0.017 0.234 0.001 l 4.1 1.006 l 4.274 -1.007 c 0.15 -0.035 0.306 0.0 0.425 0.095 Z M 9.608 4.427 l -3.216 -0.79 v 7.936 l 3.216 0.79 V 4.427 Z m 1.0 7.941 L 14.0 11.57 V 3.63 l -3.392 0.8 v 7.937 Z M 5.392 11.57 V 3.63 L 2.0 4.431 v 7.937 l 3.392 -0.798 Z")
        )
    }.build()
}
