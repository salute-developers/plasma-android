package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 0.0 -22.5 c 0.828 0.0 1.5 0.672 1.5 1.5 v 6.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 v -6.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 Z M 19.5 24.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z")
        )
    }.build()
}
