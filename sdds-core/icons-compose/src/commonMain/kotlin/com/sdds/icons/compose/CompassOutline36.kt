package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CompassOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CompassOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 17.875 C 5.0 10.765 10.764 5.0 17.875 5.0 c 7.11 0.0 12.875 5.764 12.875 12.875 c 0.0 7.11 -5.764 12.875 -12.875 12.875 C 10.765 30.75 5.0 24.986 5.0 17.875 Z M 17.875 3.0 C 9.66 3.0 3.0 9.66 3.0 17.875 S 9.66 32.75 17.875 32.75 S 32.75 26.09 32.75 17.875 S 26.09 3.0 17.875 3.0 Z m 6.244 6.59 c 0.326 0.247 0.47 0.667 0.363 1.061 l -2.333 8.586 c -0.269 0.992 -0.91 1.841 -1.788 2.373 l -7.61 4.609 c -0.35 0.212 -0.793 0.19 -1.12 -0.057 c -0.327 -0.246 -0.47 -0.666 -0.363 -1.06 l 2.332 -8.587 c 0.27 -0.99 0.91 -1.84 1.788 -2.373 l 7.61 -4.608 c 0.35 -0.212 0.794 -0.19 1.12 0.056 Z m -8.589 7.45 c 0.068 -0.248 0.181 -0.478 0.333 -0.68 l 4.024 3.032 c -0.152 0.202 -0.342 0.374 -0.562 0.507 l -5.472 3.314 l 1.677 -6.173 Z")
        )
    }.build()
}
