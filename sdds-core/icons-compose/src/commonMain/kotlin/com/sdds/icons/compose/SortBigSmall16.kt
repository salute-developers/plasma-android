package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortBigSmall16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortBigSmall16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.5 4.5 C 1.5 4.224 1.724 4.0 2.0 4.0 h 12.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 14.276 5.0 14.0 5.0 H 2.0 C 1.724 5.0 1.5 4.776 1.5 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.5 8.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 8.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 10.276 8.5 10.0 8.5 H 2.0 C 1.724 8.5 1.5 8.276 1.5 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.5 11.5 C 1.5 11.224 1.724 11.0 2.0 11.0 h 4.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 6.276 12.0 6.0 12.0 H 2.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
