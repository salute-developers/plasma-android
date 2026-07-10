package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.0 3.75 C 4.0 3.336 4.336 3.0 4.75 3.0 h 14.5 C 19.664 3.0 20.0 3.336 20.0 3.75 S 19.664 4.5 19.25 4.5 H 4.75 C 4.336 4.5 4.0 4.164 4.0 3.75 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 3.0 7.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 16.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.333 c 0.0 0.553 -0.448 1.0 -1.0 1.0 H 4.0 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 V 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 3.0 11.333 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 16.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.334 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -1.334 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.0 14.667 c -0.552 0.0 -1.0 0.447 -1.0 1.0 V 17.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 16.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -1.333 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.75 19.5 C 4.336 19.5 4.0 19.836 4.0 20.25 S 4.336 21.0 4.75 21.0 h 14.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 4.75 Z")
        )
    }.build()
}
