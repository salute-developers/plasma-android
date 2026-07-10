package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MailTrayFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MailTrayFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.482 4.0 H 7.518 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 2.0 8.05 2.0 8.706 2.0 9.519 v 3.732 h 5.986 c 0.635 0.0 1.154 0.343 1.48 0.75 c 0.161 0.2 0.348 0.384 0.556 0.543 c 0.567 0.436 1.262 0.672 1.978 0.672 c 0.715 0.0 1.41 -0.236 1.978 -0.672 c 0.208 -0.16 0.394 -0.342 0.556 -0.544 c 0.326 -0.406 0.845 -0.749 1.48 -0.749 H 22.0 V 9.518 c 0.0 -0.813 0.0 -1.469 -0.043 -2.0 c -0.045 -0.546 -0.14 -1.026 -0.366 -1.47 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.64 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 C 17.95 4.0 17.294 4.0 16.482 4.0 Z M 5.0 10.75 C 5.0 10.336 5.336 10.0 5.75 10.0 h 12.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 5.75 C 5.336 11.5 5.0 11.164 5.0 10.75 Z M 5.75 7.0 C 5.336 7.0 5.0 7.336 5.0 7.75 S 5.336 8.5 5.75 8.5 h 12.5 C 18.664 8.5 19.0 8.164 19.0 7.75 S 18.664 7.0 18.25 7.0 H 5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 14.75 h -5.986 c -0.072 0.0 -0.193 0.043 -0.31 0.188 c -0.237 0.295 -0.509 0.562 -0.812 0.795 c -0.83 0.637 -1.846 0.982 -2.892 0.982 c -1.046 0.0 -2.062 -0.345 -2.892 -0.982 c -0.303 -0.233 -0.576 -0.5 -0.812 -0.795 c -0.117 -0.145 -0.238 -0.188 -0.31 -0.188 H 2.0 c 0.0 0.69 0.005 1.26 0.043 1.732 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 6.05 20.0 6.706 20.0 7.519 20.0 h 8.964 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 21.995 16.01 22.0 15.44 22.0 14.75 Z")
        )
    }.build()
}
