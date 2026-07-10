package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundClockOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundClockOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.658 4.93 C 11.923 3.798 12.931 3.0 14.092 3.0 h 6.675 c 1.16 0.0 2.169 0.799 2.434 1.93 l 1.237 5.274 l -0.044 0.01 c 1.591 1.432 2.74 3.348 3.219 5.515 h 1.51 c 0.208 0.0 0.376 0.168 0.376 0.376 v 3.79 c 0.0 0.207 -0.168 0.375 -0.375 0.375 h -1.51 c -0.48 2.167 -1.628 4.083 -3.22 5.515 l 0.044 0.01 l -1.237 5.275 C 22.936 32.2 21.928 33.0 20.767 33.0 h -6.675 c -1.16 0.0 -2.169 -0.8 -2.434 -1.93 l -1.237 -5.275 l 0.043 -0.01 C 8.337 23.87 7.0 21.091 7.0 18.0 s 1.338 -5.87 3.465 -7.786 l -0.044 -0.01 l 1.237 -5.275 Z m 1.194 3.67 c 1.381 -0.678 2.935 -1.059 4.578 -1.059 c 1.642 0.0 3.196 0.38 4.578 1.059 l -0.754 -3.214 C 21.2 5.16 20.999 5.0 20.767 5.0 h -6.675 c -0.232 0.0 -0.434 0.16 -0.487 0.386 L 12.851 8.6 Z m 0.0 18.8 l 0.753 3.213 C 13.658 30.84 13.86 31.0 14.092 31.0 h 6.675 c 0.232 0.0 0.434 -0.16 0.487 -0.386 l 0.753 -3.212 c -1.381 0.678 -2.935 1.058 -4.577 1.058 c -1.643 0.0 -3.196 -0.38 -4.578 -1.058 Z M 9.0 18.0 c 0.0 -4.675 3.777 -8.459 8.43 -8.459 c 4.652 0.0 8.43 3.784 8.43 8.46 c 0.0 4.674 -3.778 8.458 -8.43 8.458 C 12.777 26.46 9.0 22.675 9.0 18.0 Z m 9.43 -5.298 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 6.054 c 0.0 0.334 0.166 0.646 0.444 0.831 l 3.394 2.27 c 0.459 0.307 1.08 0.184 1.387 -0.275 c 0.307 -0.459 0.184 -1.08 -0.276 -1.387 l -2.95 -1.973 v -5.52 Z")
        )
    }.build()
}
