package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CarFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CarFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.31 4.25 h 5.38 c 1.099 0.0 1.856 0.0 2.52 0.26 c 0.584 0.23 1.102 0.603 1.504 1.084 c 0.356 0.425 0.58 0.954 0.824 1.656 h 0.712 C 20.664 7.25 21.0 7.586 21.0 8.0 s -0.336 0.75 -0.75 0.75 h -0.21 l 0.41 1.23 c 0.93 0.572 1.55 1.599 1.55 2.77 v 6.0 c 0.0 0.967 -0.784 1.75 -1.75 1.75 s -1.75 -0.783 -1.75 -1.75 V 18.0 h -13.0 v 0.75 c 0.0 0.967 -0.784 1.75 -1.75 1.75 S 2.0 19.717 2.0 18.75 v -6.0 c 0.0 -1.171 0.62 -2.198 1.55 -2.77 l 0.41 -1.23 H 3.75 C 3.336 8.75 3.0 8.414 3.0 8.0 s 0.336 -0.75 0.75 -0.75 h 0.712 C 4.707 6.548 4.93 6.02 5.286 5.594 C 5.688 5.113 6.206 4.74 6.79 4.51 C 7.454 4.25 8.21 4.25 9.31 4.25 Z m 0.15 1.5 c -1.308 0.0 -1.756 0.013 -2.121 0.156 c -0.35 0.138 -0.661 0.362 -0.903 0.65 C 6.185 6.858 6.031 7.279 5.617 8.52 L 5.291 9.5 h 13.418 l -0.326 -0.98 c -0.414 -1.242 -0.568 -1.663 -0.82 -1.963 c -0.241 -0.29 -0.551 -0.513 -0.902 -0.65 c -0.365 -0.144 -0.813 -0.157 -2.12 -0.157 H 9.46 Z M 17.5 15.0 c 0.828 0.0 1.5 -0.671 1.5 -1.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 16.0 12.672 16.0 13.5 c 0.0 0.829 0.672 1.5 1.5 1.5 Z M 8.0 13.5 C 8.0 14.33 7.328 15.0 6.5 15.0 S 5.0 14.33 5.0 13.5 C 5.0 12.672 5.672 12.0 6.5 12.0 S 8.0 12.672 8.0 13.5 Z m 2.5 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -3.0 Z")
        )
    }.build()
}
