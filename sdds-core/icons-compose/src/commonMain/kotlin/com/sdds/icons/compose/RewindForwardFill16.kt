package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindForwardFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindForwardFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.47 7.088 c 0.707 0.403 0.707 1.42 0.0 1.824 L 8.868 12.11 c -0.7 0.4 -1.57 -0.105 -1.57 -0.912 V 4.801 c 0.0 -0.806 0.87 -1.311 1.57 -0.912 l 5.604 3.199 Z m -8.177 3.184 V 5.728 l -3.22 -1.839 c -0.7 -0.4 -1.571 0.106 -1.571 0.912 v 6.397 c 0.0 0.806 0.87 1.312 1.57 0.912 l 3.221 -1.838 Z")
        )
    }.build()
}
