package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ContrastMaxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ContrastMaxFill16",
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
            pathData = addPathNodes("M 8.002 1.0 c 0.29 0.0 0.525 0.235 0.525 0.525 V 3.01 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 1.525 C 7.477 1.235 7.712 1.0 8.002 1.0 Z M 3.298 2.556 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 c -0.205 0.205 -0.205 0.538 0.0 0.743 l 1.05 1.05 c 0.205 0.205 0.537 0.205 0.742 0.0 c 0.205 -0.205 0.205 -0.538 0.0 -0.743 l -1.05 -1.05 Z m 9.1 9.1 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 c -0.205 0.205 -0.205 0.537 0.0 0.742 l 1.05 1.05 c 0.205 0.205 0.537 0.205 0.742 0.0 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 l -1.05 -1.05 Z m 1.05 -9.1 c 0.206 0.205 0.206 0.538 0.0 0.743 l -1.05 1.05 c -0.204 0.205 -0.537 0.205 -0.742 0.0 c -0.205 -0.205 -0.205 -0.538 0.0 -0.743 l 1.05 -1.05 c 0.205 -0.205 0.537 -0.205 0.742 0.0 Z m -9.1 9.842 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 c -0.205 -0.205 -0.537 -0.205 -0.742 0.0 l -1.05 1.05 c -0.205 0.205 -0.205 0.537 0.0 0.742 c 0.205 0.205 0.537 0.205 0.742 0.0 l 1.05 -1.05 Z m 4.18 0.596 c 0.0 -0.29 -0.236 -0.525 -0.526 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 1.485 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.485 Z m 6.476 -4.992 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -1.485 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 1.485 c 0.29 0.0 0.525 0.235 0.525 0.525 Z M 3.01 8.527 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 C 1.235 7.477 1.0 7.712 1.0 8.002 c 0.0 0.29 0.235 0.525 0.525 0.525 H 3.01 Z")
        )
    }.build()
}
