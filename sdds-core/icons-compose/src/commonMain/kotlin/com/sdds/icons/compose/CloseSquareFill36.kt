package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseSquareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseSquareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.375 4.5 C 6.683 4.5 4.5 6.683 4.5 9.375 v 17.25 c 0.0 2.692 2.183 4.875 4.875 4.875 h 17.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 9.375 c 0.0 -2.692 -2.183 -4.875 -4.875 -4.875 H 9.375 Z m 15.785 6.341 c 0.439 0.44 0.439 1.152 0.0 1.591 l -5.569 5.569 l 5.569 5.568 c 0.439 0.44 0.439 1.152 0.0 1.591 c -0.44 0.44 -1.152 0.44 -1.591 0.0 L 18.0 19.591 l -5.569 5.569 c -0.439 0.44 -1.151 0.44 -1.59 0.0 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 l 5.568 -5.568 l -5.568 -5.569 c -0.44 -0.44 -0.44 -1.152 0.0 -1.59 c 0.439 -0.44 1.151 -0.44 1.59 0.0 L 18.0 16.41 l 5.569 -5.569 c 0.439 -0.44 1.151 -0.44 1.59 0.0 Z")
        )
    }.build()
}
