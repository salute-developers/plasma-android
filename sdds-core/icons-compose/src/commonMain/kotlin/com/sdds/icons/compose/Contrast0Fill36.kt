package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast0Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast0Fill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 23.352 C 14.766 23.1 12.625 20.8 12.625 18.0 c 0.0 -2.8 2.14 -5.1 4.875 -5.352 v 10.704 Z M 18.0 10.625 c 4.073 0.0 7.375 3.302 7.375 7.375 S 22.073 25.375 18.0 25.375 S 10.625 22.073 10.625 18.0 s 3.302 -7.375 7.375 -7.375 Z")
        )
    }.build()
}
