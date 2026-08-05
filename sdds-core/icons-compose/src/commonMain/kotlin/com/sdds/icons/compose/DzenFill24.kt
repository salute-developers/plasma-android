package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DzenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DzenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.037 2.75 c 3.658 0.0 5.807 0.37 7.316 1.836 c 1.54 1.571 1.896 3.704 1.896 7.362 v 0.104 c 0.0 3.66 -0.355 5.806 -1.895 7.362 c -1.511 1.466 -3.644 1.836 -7.318 1.836 h -0.073 c -3.673 0.0 -5.821 -0.37 -7.317 -1.836 c -1.54 -1.57 -1.896 -3.704 -1.896 -7.362 v -0.104 c 0.0 -3.658 0.355 -5.806 1.896 -7.362 C 6.156 3.12 8.29 2.75 11.964 2.75 h 0.073 Z m -0.185 2.202 c -0.07 0.0 -0.129 0.058 -0.132 0.128 c -0.096 2.533 -0.418 4.074 -1.496 5.152 c -1.078 1.078 -2.616 1.4 -5.144 1.495 c -0.07 0.003 -0.128 0.06 -0.128 0.132 v 0.295 c 0.0 0.07 0.058 0.129 0.128 0.132 c 2.528 0.096 4.067 0.419 5.144 1.495 c 1.076 1.077 1.398 2.613 1.495 5.137 c 0.002 0.07 0.06 0.128 0.132 0.128 h 0.296 c 0.07 0.0 0.129 -0.058 0.132 -0.128 c 0.097 -2.524 0.419 -4.06 1.495 -5.137 c 1.078 -1.077 2.616 -1.4 5.144 -1.495 c 0.07 -0.002 0.128 -0.06 0.128 -0.132 V 11.86 c 0.0 -0.07 -0.057 -0.128 -0.127 -0.132 c -2.529 -0.095 -4.067 -0.418 -5.144 -1.495 c -1.078 -1.078 -1.4 -2.618 -1.496 -5.152 c -0.002 -0.07 -0.06 -0.128 -0.131 -0.128 h -0.296 Z")
        )
    }.build()
}
