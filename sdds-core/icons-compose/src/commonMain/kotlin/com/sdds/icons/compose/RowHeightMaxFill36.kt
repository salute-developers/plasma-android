package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMaxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMaxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 6.0 5.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 22.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 7.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.5 12.25 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 h 19.5 c 2.071 0.0 3.75 1.679 3.75 3.75 v 11.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 H 8.25 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 v -11.5 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 7.0 29.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 22.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 7.0 Z")
        )
    }.build()
}
