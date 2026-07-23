package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.5 1.6 C 8.5 1.269 8.231 1.0 7.9 1.0 C 7.569 1.0 7.3 1.269 7.3 1.6 v 1.008 C 4.838 2.884 2.884 4.838 2.608 7.3 H 1.6 C 1.269 7.3 1.0 7.569 1.0 7.9 c 0.0 0.331 0.269 0.6 0.6 0.6 h 1.008 c 0.276 2.461 2.23 4.416 4.692 4.692 V 14.2 c 0.0 0.331 0.269 0.6 0.6 0.6 c 0.331 0.0 0.6 -0.269 0.6 -0.6 v -1.008 c 2.461 -0.276 4.416 -2.23 4.692 -4.692 H 14.2 c 0.331 0.0 0.6 -0.269 0.6 -0.6 c 0.0 -0.331 -0.269 -0.6 -0.6 -0.6 h -1.008 c -0.276 -2.462 -2.23 -4.416 -4.692 -4.692 V 1.6 Z M 3.775 7.9 c 0.0 -2.278 1.847 -4.125 4.125 -4.125 s 4.125 1.847 4.125 4.125 s -1.847 4.125 -4.125 4.125 S 3.775 10.178 3.775 7.9 Z M 7.9 10.7 c 1.546 0.0 2.8 -1.254 2.8 -2.8 c 0.0 -1.546 -1.254 -2.8 -2.8 -2.8 c -1.546 0.0 -2.8 1.254 -2.8 2.8 c 0.0 1.546 1.254 2.8 2.8 2.8 Z")
        )
    }.build()
}
