package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextUnderline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextUnderline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.04 8.932 l 0.98 2.618 h 1.385 l -3.794 -9.8 H 7.337 L 3.6 11.55 h 1.288 l 0.966 -2.618 h 4.186 Z m -3.767 -1.12 L 7.94 3.318 l 1.68 4.494 H 6.273 Z M 3.0 13.254 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 10.001 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 3.0 Z")
        )
    }.build()
}
