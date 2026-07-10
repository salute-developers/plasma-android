package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashDriveFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashDriveFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.625 3.0 C 13.175 3.0 12.0 4.175 12.0 5.625 v 4.896 c -1.688 0.186 -3.0 1.617 -3.0 3.354 v 15.75 C 9.0 31.489 10.511 33.0 12.375 33.0 h 11.25 C 25.489 33.0 27.0 31.489 27.0 29.625 v -15.75 c 0.0 -1.737 -1.313 -3.168 -3.0 -3.354 V 5.625 C 24.0 4.175 22.825 3.0 21.375 3.0 h -6.75 Z m 7.125 7.5 V 5.625 c 0.0 -0.207 -0.168 -0.375 -0.375 -0.375 h -6.75 c -0.207 0.0 -0.375 0.168 -0.375 0.375 V 10.5 h 7.5 Z")
        )
    }.build()
}
