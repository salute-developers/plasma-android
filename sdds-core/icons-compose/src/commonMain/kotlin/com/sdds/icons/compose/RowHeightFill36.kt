package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 6.0 5.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 22.0 c 0.553 0.0 1.0 0.448 1.0 1.0 s -0.447 1.0 -1.0 1.0 H 7.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 6.75 8.5 c -1.242 0.0 -2.25 1.007 -2.25 2.25 v 4.5 c 0.0 1.243 1.008 2.25 2.25 2.25 h 22.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 v -4.5 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 H 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 6.75 19.0 c -1.242 0.0 -2.25 1.007 -2.25 2.25 v 4.5 C 4.5 26.993 5.508 28.0 6.75 28.0 h 22.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 v -4.5 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 H 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 7.0 29.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 22.0 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 H 7.0 Z")
        )
    }.build()
}
