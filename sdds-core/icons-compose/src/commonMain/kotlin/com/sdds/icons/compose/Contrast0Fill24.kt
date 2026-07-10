package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast0Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast0Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.522 8.45 C 14.618 7.555 13.374 7.0 12.0 7.0 c -2.761 0.0 -5.0 2.239 -5.0 5.0 s 2.239 5.0 5.0 5.0 c 1.377 0.0 2.623 -0.556 3.527 -1.456 l 0.009 -0.008 l 0.008 -0.008 C 16.444 14.623 17.0 13.377 17.0 12.0 c 0.0 -1.374 -0.554 -2.618 -1.45 -3.522 l -0.014 -0.014 l -0.014 -0.013 Z M 12.0 15.5 v -7.0 c -1.933 0.0 -3.5 1.567 -3.5 3.5 s 1.567 3.5 3.5 3.5 Z")
        )
    }.build()
}
