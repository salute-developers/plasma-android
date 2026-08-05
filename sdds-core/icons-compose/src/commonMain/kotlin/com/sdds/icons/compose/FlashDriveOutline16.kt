package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashDriveOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashDriveOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.4 1.002 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 2.32 C 4.414 4.597 3.8 5.259 3.8 6.065 v 7.384 c 0.0 0.856 0.694 1.55 1.55 1.55 h 5.25 c 0.856 0.0 1.55 -0.694 1.55 -1.55 V 6.065 c 0.0 -0.806 -0.614 -1.468 -1.4 -1.543 v -2.32 c 0.0 -0.663 -0.537 -1.2 -1.2 -1.2 H 6.4 Z m 3.35 3.513 V 2.202 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 H 6.4 c -0.11 0.0 -0.2 0.09 -0.2 0.2 v 2.313 h 3.55 Z m 1.4 8.934 c 0.0 0.303 -0.246 0.55 -0.55 0.55 H 5.35 c -0.304 0.0 -0.55 -0.247 -0.55 -0.55 V 6.065 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 5.25 c 0.304 0.0 0.55 0.246 0.55 0.55 v 7.384 Z")
        )
    }.build()
}
