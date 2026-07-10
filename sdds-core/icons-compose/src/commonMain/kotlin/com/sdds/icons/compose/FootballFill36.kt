package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FootballFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FootballFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 Z M 13.918 5.917 c -2.478 0.837 -4.615 2.415 -6.147 4.47 l 0.694 3.337 l 2.749 0.897 l -0.026 0.078 l 5.782 -4.2 h -0.104 l 0.004 -2.895 l -2.952 -1.687 Z m -6.32 19.459 c -1.452 -2.045 -2.317 -4.538 -2.347 -7.23 l 2.513 -2.284 l 2.751 0.898 l 0.032 -0.098 l 2.209 6.796 l -0.066 -0.048 l -1.704 2.337 L 7.6 25.376 Z m 6.603 4.798 c 1.2 0.374 2.476 0.576 3.799 0.576 s 2.6 -0.202 3.8 -0.576 l 1.4 -3.11 l -1.695 -2.342 l 0.066 -0.048 h -7.147 l 0.084 0.061 l -1.704 2.34 l 1.396 3.1 Z m 16.548 -12.029 c -0.03 2.693 -0.895 5.186 -2.348 7.231 l -3.377 0.37 l -1.697 -2.343 l -0.084 0.06 l 2.208 -6.796 l 0.025 0.077 l 2.752 -0.89 l 2.521 2.291 Z m -2.52 -7.757 c -1.532 -2.056 -3.669 -3.634 -6.147 -4.47 L 19.12 7.61 l -0.004 2.892 h -0.082 l 5.782 4.2 l -0.032 -0.099 l 2.754 -0.89 l 0.691 -3.325 Z")
        )
    }.build()
}
