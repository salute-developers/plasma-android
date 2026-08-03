package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextUnderline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextUnderline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.933 13.26 h 5.98 l 1.4 3.74 h 1.98 l -5.42 -14.0 h -1.82 l -5.34 14.0 h 1.84 l 1.38 -3.74 Z m 5.38 -1.6 h -4.78 l 2.38 -6.42 l 2.4 6.42 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 4.75 20.0 C 4.336 20.0 4.0 20.336 4.0 20.75 s 0.336 0.75 0.75 0.75 h 14.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 19.664 20.0 19.25 20.0 H 4.75 Z")
        )
    }.build()
}
