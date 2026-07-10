package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.092 3.0 c -1.16 0.0 -2.169 0.799 -2.434 1.93 l -1.237 5.274 l 0.044 0.01 C 8.338 12.13 7.0 14.91 7.0 18.0 c 0.0 3.09 1.337 5.87 3.464 7.785 l -0.043 0.01 l 1.237 5.275 C 11.923 32.2 12.931 33.0 14.092 33.0 h 6.675 c 1.16 0.0 2.169 -0.8 2.434 -1.93 l 1.237 -5.275 l -0.043 -0.01 c 1.59 -1.432 2.74 -3.348 3.218 -5.515 h 1.51 c 0.208 0.0 0.376 -0.168 0.376 -0.375 v -3.79 c 0.0 -0.208 -0.168 -0.376 -0.375 -0.376 h -1.511 c -0.479 -2.167 -1.628 -4.083 -3.219 -5.515 l 0.044 -0.01 l -1.237 -5.275 C 22.936 3.8 21.928 3.0 20.767 3.0 h -6.675 Z m 3.338 4.541 c -1.643 0.0 -3.197 0.38 -4.579 1.059 l 0.754 -3.214 C 13.658 5.16 13.86 5.0 14.092 5.0 h 6.675 c 0.232 0.0 0.434 0.16 0.487 0.386 L 22.008 8.6 C 20.626 7.922 19.072 7.54 17.43 7.54 Z m -3.825 23.072 l -0.753 -3.212 c 1.382 0.677 2.935 1.058 4.578 1.058 c 1.642 0.0 3.196 -0.38 4.577 -1.058 l -0.753 3.212 C 21.2 30.84 20.999 31.0 20.767 31.0 h -6.675 c -0.232 0.0 -0.434 -0.16 -0.487 -0.386 Z M 17.43 9.541 c -4.653 0.0 -8.43 3.784 -8.43 8.46 c 0.0 4.674 3.777 8.458 8.43 8.458 c 4.652 0.0 8.43 -3.784 8.43 -8.459 s -3.778 -8.459 -8.43 -8.459 Z")
        )
    }.build()
}
