package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.375 3.0 C 6.683 3.0 4.5 5.183 4.5 7.875 V 12.0 h 27.0 V 7.875 C 31.5 5.183 29.317 3.0 26.625 3.0 H 9.375 Z M 12.0 9.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 S 9.0 9.828 9.0 9.0 s 0.672 -1.5 1.5 -1.5 S 12.0 8.172 12.0 9.0 Z m 7.125 -1.125 C 18.504 7.875 18.0 8.379 18.0 9.0 s 0.504 1.125 1.125 1.125 h 6.75 C 26.496 10.125 27.0 9.621 27.0 9.0 s -0.504 -1.125 -1.125 -1.125 h -6.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.5 28.125 V 14.25 h -27.0 v 13.875 C 4.5 30.817 6.683 33.0 9.375 33.0 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 Z")
        )
    }.build()
}
