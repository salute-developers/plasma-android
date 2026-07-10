package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortSmallBig16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortSmallBig16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 5.0 C 1.724 5.0 1.5 4.776 1.5 4.5 S 1.724 4.0 2.0 4.0 h 4.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 6.276 5.0 6.0 5.0 H 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 8.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 10.276 7.5 10.0 7.5 H 2.0 C 1.724 7.5 1.5 7.724 1.5 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.5 11.5 C 1.5 11.776 1.724 12.0 2.0 12.0 h 12.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 14.276 11.0 14.0 11.0 H 2.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 Z")
        )
    }.build()
}
