package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.292 7.258 c -0.41 0.41 -0.41 1.075 0.0 1.485 l 1.733 1.732 c 0.41 0.41 1.075 0.41 1.485 0.0 l 1.732 -1.732 c 0.41 -0.41 0.41 -1.075 0.0 -1.485 L 4.51 5.525 c -0.41 -0.41 -1.075 -0.41 -1.485 0.0 L 1.292 7.258 Z M 5.5 11.465 c -0.41 0.41 -0.41 1.075 0.0 1.485 l 1.732 1.732 c 0.41 0.41 1.075 0.41 1.485 0.0 l 1.732 -1.732 c 0.41 -0.41 0.41 -1.075 0.0 -1.485 L 8.717 9.732 c -0.41 -0.41 -1.075 -0.41 -1.485 0.0 L 5.5 11.465 Z m 0.0 -6.93 c -0.41 -0.41 -0.41 -1.074 0.0 -1.484 l 1.732 -1.733 c 0.41 -0.41 1.075 -0.41 1.485 0.0 l 1.732 1.733 c 0.41 0.41 0.41 1.074 0.0 1.485 L 8.717 6.268 c -0.41 0.41 -1.075 0.41 -1.485 0.0 L 5.5 4.536 Z m 4.206 2.723 c -0.41 0.41 -0.41 1.075 0.0 1.485 l 1.733 1.732 c 0.41 0.41 1.075 0.41 1.485 0.0 l 1.732 -1.732 c 0.41 -0.41 0.41 -1.075 0.0 -1.485 l -1.732 -1.733 c -0.41 -0.41 -1.075 -0.41 -1.485 0.0 L 9.706 7.258 Z")
        )
    }.build()
}
