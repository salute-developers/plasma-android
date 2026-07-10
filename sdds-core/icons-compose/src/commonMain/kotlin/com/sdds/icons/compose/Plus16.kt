package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Plus16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Plus16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.0 h 5.0 C 13.776 7.5 14.0 7.724 14.0 8.0 s -0.224 0.5 -0.5 0.5 h -5.0 v 5.0 C 8.5 13.776 8.276 14.0 8.0 14.0 s -0.5 -0.224 -0.5 -0.5 v -5.0 h -5.0 C 2.224 8.5 2.0 8.276 2.0 8.0 s 0.224 -0.5 0.5 -0.5 h 5.0 v -5.0 C 7.5 2.224 7.724 2.0 8.0 2.0 Z")
        )
    }.build()
}
