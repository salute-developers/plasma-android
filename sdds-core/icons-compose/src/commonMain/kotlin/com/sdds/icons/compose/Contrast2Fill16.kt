package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Contrast2Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Contrast2Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 5.55 v 4.9 c -1.353 0.0 -2.45 -1.097 -2.45 -2.45 c 0.0 -1.353 1.097 -2.45 2.45 -2.45 Z m 0.0 5.95 c -1.933 0.0 -3.5 -1.567 -3.5 -3.5 S 6.067 4.5 8.0 4.5 s 3.5 1.567 3.5 3.5 s -1.567 3.5 -3.5 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.002 1.7 c 0.29 0.0 0.525 0.235 0.525 0.525 V 3.01 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 2.225 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 3.998 3.256 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 c -0.205 0.205 -0.205 0.537 0.0 0.742 l 0.35 0.35 c 0.205 0.205 0.537 0.205 0.742 0.0 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 l -0.35 -0.35 Z m 8.4 8.4 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 c -0.205 0.205 -0.205 0.537 0.0 0.742 l 0.35 0.35 c 0.205 0.205 0.537 0.205 0.742 0.0 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 l -0.35 -0.35 Z m 0.35 -8.4 c 0.205 0.205 0.205 0.537 0.0 0.742 l -0.35 0.35 c -0.205 0.205 -0.537 0.205 -0.742 0.0 c -0.205 -0.205 -0.205 -0.537 0.0 -0.742 l 0.35 -0.35 c 0.205 -0.205 0.537 -0.205 0.742 0.0 Z m -8.4 9.142 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 l -0.35 0.35 c -0.205 0.205 -0.205 0.537 0.0 0.742 c 0.205 0.205 0.537 0.205 0.742 0.0 l 0.35 -0.35 Z m 4.18 0.596 c 0.0 -0.29 -0.236 -0.525 -0.526 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 0.785 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -0.785 Z m 5.776 -4.992 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -0.785 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 0.785 c 0.29 0.0 0.525 0.235 0.525 0.525 Z M 3.01 8.527 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 2.225 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 H 3.01 Z")
        )
    }.build()
}
