package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AntennaFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AntennaFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 12.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 C 4.679 16.5 3.0 14.821 3.0 12.75 C 3.0 10.679 4.679 9.0 6.75 9.0 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m 5.625 10.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m 7.5 3.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z M 33.0 12.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 C 31.321 9.0 33.0 10.679 33.0 12.75 Z M 18.0 16.5 c 2.071 0.0 3.75 -1.679 3.75 -3.75 C 21.75 10.679 20.071 9.0 18.0 9.0 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z")
        )
    }.build()
}
