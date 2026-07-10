package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NewsPaperFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NewsPaperFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.125 6.0 C 4.847 6.0 3.0 7.847 3.0 10.125 v 15.75 C 3.0 28.153 4.847 30.0 7.125 30.0 h 21.75 C 31.153 30.0 33.0 28.153 33.0 25.875 v -15.75 C 33.0 7.847 31.153 6.0 28.875 6.0 H 7.125 Z m 1.5 17.25 c -0.621 0.0 -1.125 0.504 -1.125 1.125 S 8.004 25.5 8.625 25.5 h 18.75 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 H 8.625 Z M 7.5 19.875 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 18.75 c 0.621 0.0 1.125 0.504 1.125 1.125 S 27.996 21.0 27.375 21.0 H 8.625 C 8.004 21.0 7.5 20.496 7.5 19.875 Z m 0.123 -8.76 C 7.5 11.354 7.5 11.67 7.5 12.3 v 2.4 c 0.0 0.63 0.0 0.945 0.123 1.186 c 0.107 0.211 0.28 0.384 0.491 0.491 C 8.354 16.5 8.67 16.5 9.3 16.5 h 6.9 c 0.63 0.0 0.945 0.0 1.186 -0.123 c 0.211 -0.107 0.384 -0.28 0.491 -0.491 C 18.0 15.646 18.0 15.33 18.0 14.7 v -2.4 c 0.0 -0.63 0.0 -0.945 -0.123 -1.186 c -0.107 -0.211 -0.28 -0.384 -0.491 -0.491 C 17.146 10.5 16.83 10.5 16.2 10.5 H 9.3 c -0.63 0.0 -0.945 0.0 -1.186 0.123 c -0.211 0.107 -0.384 0.28 -0.491 0.491 Z")
        )
    }.build()
}
