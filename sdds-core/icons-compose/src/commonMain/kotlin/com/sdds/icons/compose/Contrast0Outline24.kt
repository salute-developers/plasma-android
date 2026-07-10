package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast0Outline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast0Outline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.478 15.55 C 9.382 16.445 10.626 17.0 12.0 17.0 c 2.761 0.0 5.0 -2.239 5.0 -5.0 s -2.239 -5.0 -5.0 -5.0 c -1.377 0.0 -2.623 0.556 -3.527 1.456 L 8.464 8.464 L 8.456 8.473 C 7.556 9.377 7.0 10.623 7.0 12.0 c 0.0 1.374 0.554 2.618 1.45 3.522 l 0.014 0.014 l 0.014 0.013 Z M 12.0 8.5 v 7.0 c 1.933 0.0 3.5 -1.567 3.5 -3.5 S 13.933 8.5 12.0 8.5 Z")
        )
    }.build()
}
