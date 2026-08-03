package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.95 2.311 l -0.167 -0.13 c -0.322 -0.242 -0.773 -0.242 -1.095 0.0 l -0.332 0.263 l -0.195 0.161 c -0.2 0.167 -0.415 0.353 -0.642 0.556 C 9.658 3.932 8.797 4.8 7.991 5.75 c -2.34 2.762 -3.756 5.643 -3.756 8.535 c 0.0 1.334 0.352 2.589 0.97 3.684 L 3.22 19.955 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 16.97 -16.97 c 0.294 -0.293 0.294 -0.768 0.0 -1.06 c -0.292 -0.294 -0.767 -0.294 -1.06 0.0 l -3.284 3.284 c -0.139 -0.173 -0.281 -0.345 -0.427 -0.517 c -0.805 -0.95 -1.666 -1.82 -2.528 -2.591 c -0.226 -0.203 -0.441 -0.389 -0.641 -0.556 l -0.36 -0.294 Z m 2.888 5.026 c -0.161 -0.205 -0.329 -0.41 -0.503 -0.616 c -0.757 -0.893 -1.569 -1.713 -2.384 -2.443 c -0.212 -0.19 -0.412 -0.362 -0.596 -0.516 l -0.12 -0.098 l -0.116 0.096 c -0.186 0.154 -0.386 0.328 -0.599 0.518 c -0.815 0.73 -1.627 1.55 -2.384 2.443 c -2.222 2.623 -3.4 5.17 -3.4 7.565 c 0.0 0.911 0.207 1.783 0.582 2.57 l 9.52 -9.52 Z M 12.235 22.0 c -1.924 0.0 -3.69 -0.655 -5.07 -1.747 l 1.068 -1.07 c 1.097 0.823 2.481 1.317 4.002 1.317 c 3.642 0.0 6.5 -2.833 6.5 -6.214 c 0.0 -1.417 -0.412 -2.887 -1.21 -4.395 l 1.106 -1.104 c 1.027 1.81 1.604 3.652 1.604 5.499 c 0.0 4.26 -3.582 7.714 -8.0 7.714 Z")
        )
    }.build()
}
