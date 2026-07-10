package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMoveVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMoveVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.47 4.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 4.0 4.0 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 L 12.0 6.06 L 8.53 9.53 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 4.0 -4.0 Z m -4.0 10.0 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 12.0 17.94 l 3.47 -3.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -4.0 4.0 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -4.0 -4.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
