package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneSquareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneSquareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.375 4.5 C 6.683 4.5 4.5 6.683 4.5 9.375 v 17.25 c 0.0 2.692 2.183 4.875 4.875 4.875 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 9.375 c 0.0 -2.692 -2.183 -4.875 -4.875 -4.875 H 9.375 Z m 17.582 9.332 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 15.0 22.96 l -3.793 -3.793 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 4.5 4.5 c 0.39 0.39 1.024 0.39 1.414 0.0 l 11.25 -11.25 Z")
        )
    }.build()
}
