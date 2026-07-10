package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PaletteFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PaletteFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 2.5 c 6.0 -0.667 10.54 4.545 10.04 8.545 c 0.0 0.5 -0.5 2.75 -2.0 3.5 c -2.0 1.0 -3.875 0.0 -5.0 1.5 c -1.124 1.5 1.144 3.404 -0.5 4.5 c -3.0 2.0 -10.498 -1.046 -11.04 -7.546 C 2.042 7.5 6.03 3.052 11.0 2.5 Z M 9.75 15.75 c -0.828 0.0 -1.5 0.671 -1.5 1.5 c 0.0 0.828 0.672 1.5 1.5 1.5 c 0.829 0.0 1.5 -0.672 1.5 -1.5 c 0.0 -0.829 -0.671 -1.5 -1.5 -1.5 Z M 6.5 12.0 C 5.672 12.0 5.0 12.67 5.0 13.5 C 5.0 14.327 5.672 15.0 6.5 15.0 C 7.33 15.0 8.0 14.327 8.0 13.5 C 8.0 12.67 7.328 12.0 6.5 12.0 Z M 17.0 8.0 c -0.828 0.0 -1.5 0.671 -1.5 1.5 c 0.0 0.828 0.672 1.5 1.5 1.5 c 0.829 0.0 1.5 -0.672 1.5 -1.5 C 18.5 8.67 17.828 8.0 17.0 8.0 Z M 7.5 7.0 C 6.672 7.0 6.0 7.67 6.0 8.5 C 6.0 9.327 6.672 10.0 7.5 10.0 C 8.33 10.0 9.0 9.327 9.0 8.5 C 9.0 7.67 8.328 7.0 7.5 7.0 Z m 5.0 -2.0 C 11.672 5.0 11.0 5.67 11.0 6.5 C 11.0 7.327 11.672 8.0 12.5 8.0 C 13.33 8.0 14.0 7.327 14.0 6.5 C 14.0 5.67 13.33 5.0 12.5 5.0 Z")
        )
    }.build()
}
