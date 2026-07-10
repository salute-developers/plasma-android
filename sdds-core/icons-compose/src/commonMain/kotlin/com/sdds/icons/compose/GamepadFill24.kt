package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GamepadFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GamepadFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.543 5.0 h 4.922 c 0.961 0.0 1.726 0.0 2.347 0.048 c 0.637 0.049 1.18 0.15 1.69 0.384 c 0.83 0.38 1.533 0.992 2.025 1.762 c 0.301 0.472 0.477 0.996 0.613 1.62 c 0.133 0.61 0.24 1.366 0.372 2.318 l 0.52 3.732 c 0.309 2.212 -1.41 4.186 -3.642 4.186 c -1.102 0.0 -2.146 -0.494 -2.845 -1.346 l -0.485 -0.592 c -0.4 -0.489 -0.529 -0.638 -0.671 -0.748 c -0.2 -0.154 -0.429 -0.262 -0.673 -0.319 C 13.54 16.005 13.343 16.0 12.71 16.0 h -1.414 c -0.632 0.0 -0.83 0.005 -1.005 0.045 c -0.244 0.057 -0.474 0.165 -0.673 0.319 c -0.142 0.11 -0.27 0.26 -0.671 0.748 l -0.485 0.592 C 7.764 18.556 6.72 19.05 5.618 19.05 c -2.233 0.0 -3.95 -1.974 -3.642 -4.186 l 0.52 -3.732 C 2.63 10.18 2.735 9.423 2.868 8.814 C 3.004 8.19 3.18 7.666 3.48 7.194 c 0.492 -0.77 1.195 -1.382 2.025 -1.762 c 0.51 -0.234 1.053 -0.335 1.69 -0.384 C 7.817 5.0 8.582 5.0 9.543 5.0 Z M 8.754 8.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 V 10.0 h -1.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 1.5 V 13.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -1.5 h 1.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 10.668 10.0 10.254 10.0 h -1.5 V 8.5 Z m 7.25 1.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z m -1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z m 3.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z m -2.0 2.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z")
        )
    }.build()
}
