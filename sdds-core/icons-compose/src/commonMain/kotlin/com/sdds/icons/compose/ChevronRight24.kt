package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.97 19.53 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 L 14.44 12.0 L 7.97 5.53 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 7.0 7.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -7.0 7.0 c -0.293 0.293 -0.767 0.293 -1.06 0.0 Z")
        )
    }.build()
}
