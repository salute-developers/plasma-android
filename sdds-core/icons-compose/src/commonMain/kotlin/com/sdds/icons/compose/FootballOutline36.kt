package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FootballOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FootballOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 Z M 13.918 5.917 c -2.478 0.837 -4.615 2.415 -6.147 4.47 l 0.694 3.337 l 2.197 0.717 l 6.205 -4.508 l 0.003 -2.329 l -2.952 -1.687 Z m -6.32 19.459 c -1.452 -2.045 -2.317 -4.538 -2.347 -7.23 l 2.513 -2.284 l 2.213 0.723 l 2.37 7.295 l -1.36 1.867 l -3.388 -0.371 Z m 6.603 4.798 c 1.2 0.374 2.476 0.576 3.799 0.576 s 2.6 -0.202 3.8 -0.576 l 1.4 -3.11 l -1.355 -1.871 h -7.67 l -1.371 1.881 l 1.396 3.1 Z m 16.548 -12.029 c -0.03 2.693 -0.895 5.186 -2.348 7.231 l -3.377 0.37 l -1.365 -1.885 l 2.37 -7.295 l 2.199 -0.711 l 2.521 2.29 Z m -2.52 -7.757 c -1.532 -2.056 -3.669 -3.634 -6.147 -4.47 L 19.12 7.61 l -0.003 2.31 l 6.205 4.51 l 2.216 -0.717 l 0.691 -3.325 Z m -16.04 5.724 l 2.22 6.83 h 7.182 l 2.22 -6.83 L 18.0 11.891 l -5.81 4.221 Z")
        )
    }.build()
}
