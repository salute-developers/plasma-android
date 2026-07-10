package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentPasteFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentPasteFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.25 2.0 c 0.854 0.0 1.617 0.39 2.121 1.0 H 24.0 c 2.1 0.0 3.15 0.0 3.952 0.41 c 0.706 0.359 1.28 0.932 1.639 1.638 C 30.0 5.85 30.0 6.9 30.0 9.0 v 18.0 c 0.0 2.1 0.0 3.15 -0.41 3.952 c -0.359 0.706 -0.932 1.28 -1.638 1.639 C 27.15 32.999 26.1 33.0 24.0 33.0 H 12.0 c -2.1 0.0 -3.15 0.0 -3.952 -0.41 c -0.706 -0.359 -1.28 -0.932 -1.639 -1.638 C 6.0 30.15 6.0 29.1 6.0 27.0 V 9.0 c 0.0 -2.1 0.0 -3.15 0.41 -3.952 c 0.359 -0.706 0.932 -1.28 1.638 -1.639 C 8.85 3.0 9.9 3.0 12.0 3.0 h 0.629 c 0.504 -0.61 1.267 -1.0 2.121 -1.0 h 6.5 Z M 12.0 14.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 6.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -6.0 Z m 0.0 -4.875 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 12.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 12.0 Z M 14.75 4.0 C 14.336 4.0 14.0 4.336 14.0 4.75 s 0.336 0.75 0.75 0.75 h 6.5 C 21.664 5.5 22.0 5.164 22.0 4.75 S 21.664 4.0 21.25 4.0 h -6.5 Z")
        )
    }.build()
}
