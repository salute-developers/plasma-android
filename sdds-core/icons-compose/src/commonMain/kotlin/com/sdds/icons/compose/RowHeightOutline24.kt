package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightOutline24",
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
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.5 6.0 h -13.0 C 4.12 6.0 3.0 7.12 3.0 8.5 v 1.75 c 0.0 0.681 0.273 1.3 0.715 1.75 C 3.273 12.45 3.0 13.069 3.0 13.75 v 1.75 C 3.0 16.88 4.12 18.0 5.5 18.0 h 13.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 v -1.75 c 0.0 -0.681 -0.273 -1.3 -0.715 -1.75 C 20.727 11.55 21.0 10.931 21.0 10.25 V 8.5 C 21.0 7.12 19.88 6.0 18.5 6.0 Z m -13.0 5.25 h 13.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 8.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -13.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 1.75 c 0.0 0.552 0.448 1.0 1.0 1.0 Z m 0.0 1.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 1.75 c 0.0 0.552 0.448 1.0 1.0 1.0 h 13.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -1.75 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -13.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.75 19.5 C 4.336 19.5 4.0 19.836 4.0 20.25 S 4.336 21.0 4.75 21.0 h 14.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 4.75 Z")
        )
    }.build()
}
