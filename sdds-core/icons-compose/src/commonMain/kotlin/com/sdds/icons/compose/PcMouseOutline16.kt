package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PcMouseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PcMouseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 4.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 7.5 3.724 7.5 4.0 v 2.55 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.1 5.9 C 3.1 3.194 5.293 1.0 8.0 1.0 c 2.706 0.0 4.9 2.194 4.9 4.9 v 4.2 c 0.0 2.706 -2.194 4.9 -4.9 4.9 c -2.707 0.0 -4.9 -2.194 -4.9 -4.9 V 5.9 Z m 8.8 0.0 v 4.2 c 0.0 2.154 -1.747 3.9 -3.9 3.9 c -2.154 0.0 -3.9 -1.746 -3.9 -3.9 V 5.9 C 4.1 3.746 5.846 2.0 8.0 2.0 c 2.153 0.0 3.9 1.746 3.9 3.9 Z")
        )
    }.build()
}
