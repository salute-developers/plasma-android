package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.213 3.388 c 4.639 0.0 8.4 3.761 8.4 8.4 c -0.001 4.639 -3.761 8.4 -8.4 8.4 c -0.998 0.0 -1.957 -0.175 -2.847 -0.496 c -0.512 -0.184 -1.005 -0.233 -1.431 -0.114 L 5.432 20.28 c -1.042 0.292 -2.003 -0.668 -1.711 -1.71 l 0.7 -2.503 c 0.12 -0.426 0.071 -0.919 -0.113 -1.431 c -0.32 -0.89 -0.495 -1.85 -0.496 -2.847 c 0.0 -4.64 3.762 -8.4 8.4 -8.4 Z M 12.2 7.55 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 2.75 H 8.7 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.75 v 2.75 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -2.75 h 2.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.75 V 8.3 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 Z")
        )
    }.build()
}
