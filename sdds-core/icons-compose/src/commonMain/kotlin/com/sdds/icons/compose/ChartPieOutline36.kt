package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.5 6.742 C 13.476 5.6 15.718 5.0 18.0 5.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 c -2.633 0.0 -5.22 0.693 -7.5 2.01 c -0.479 0.276 -0.642 0.887 -0.366 1.366 c 0.276 0.478 0.887 0.642 1.366 0.366 Z m -5.124 3.392 C 6.854 10.41 7.018 11.02 6.742 11.5 C 5.6 13.476 5.0 15.718 5.0 18.0 c 0.0 2.281 0.6 4.523 1.742 6.5 c 0.276 0.477 0.112 1.089 -0.366 1.365 c -0.479 0.276 -1.09 0.113 -1.366 -0.366 C 3.693 23.22 3.0 20.632 3.0 18.0 c 0.0 -2.632 0.693 -5.22 2.01 -7.5 c 0.276 -0.478 0.887 -0.641 1.366 -0.365 Z m 25.623 6.865 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 2.633 -0.693 5.22 -2.01 7.5 c -1.316 2.28 -3.21 4.174 -5.49 5.49 C 23.22 32.306 20.632 33.0 18.0 33.0 c -2.632 0.0 -5.22 -0.693 -7.5 -2.01 c -0.478 -0.276 -0.641 -0.887 -0.365 -1.366 c 0.276 -0.478 0.887 -0.642 1.366 -0.366 C 13.476 30.398 15.718 31.0 18.0 31.0 c 2.281 0.0 4.523 -0.6 6.5 -1.742 c 1.975 -1.14 3.616 -2.782 4.757 -4.758 C 30.398 22.523 31.0 20.281 31.0 18.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z M 24.133 5.376 C 24.41 4.897 25.021 4.733 25.5 5.01 c 2.28 1.316 4.174 3.21 5.49 5.49 c 0.276 0.478 0.113 1.09 -0.366 1.366 c -0.478 0.276 -1.09 0.112 -1.366 -0.366 c -1.14 -1.976 -2.782 -3.617 -4.758 -4.758 c -0.478 -0.277 -0.642 -0.888 -0.366 -1.366 Z M 11.433 18.0 c 0.0 -3.627 2.94 -6.567 6.567 -6.567 c 3.627 0.0 6.567 2.94 6.567 6.567 c 0.0 3.627 -2.94 6.567 -6.567 6.567 c -3.627 0.0 -6.567 -2.94 -6.567 -6.567 Z M 18.0 9.433 c -4.732 0.0 -8.567 3.835 -8.567 8.567 s 3.835 8.567 8.567 8.567 s 8.567 -3.835 8.567 -8.567 S 22.732 9.433 18.0 9.433 Z")
        )
    }.build()
}
