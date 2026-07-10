package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 4.0 C 6.448 4.0 6.0 4.448 6.0 5.0 v 4.493 c 0.0 2.538 1.134 4.943 3.092 6.557 l 4.525 3.732 c 0.46 0.38 0.727 0.946 0.727 1.543 V 31.0 c 0.0 0.314 0.148 0.61 0.4 0.799 c 0.25 0.189 0.575 0.249 0.877 0.162 l 5.31 -1.53 c 0.429 -0.123 0.724 -0.515 0.724 -0.96 v -8.145 c 0.0 -0.597 0.267 -1.163 0.727 -1.543 l 4.525 -3.732 C 28.865 14.436 30.0 12.03 30.0 9.493 V 5.0 c 0.0 -0.552 -0.447 -1.0 -1.0 -1.0 H 7.0 Z m 1.0 5.493 V 6.0 h 20.0 v 3.493 c 0.0 1.94 -0.868 3.78 -2.365 5.014 L 21.11 18.24 c -0.922 0.76 -1.455 1.892 -1.455 3.086 v 7.392 l -3.31 0.953 v -8.345 c 0.0 -1.194 -0.534 -2.326 -1.455 -3.085 l -4.526 -3.733 C 8.867 13.273 8.0 11.434 8.0 9.493 Z M 19.137 8.97 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 5.31 c 0.553 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.447 -1.0 -1.0 -1.0 h -5.31 Z")
        )
    }.build()
}
