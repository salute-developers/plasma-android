package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.78 13.988 C 19.875 18.002 16.287 21.0 12.0 21.0 c -4.287 0.0 -7.875 -2.998 -8.78 -7.012 C 3.148 13.996 3.074 14.0 3.0 14.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 c 0.074 0.0 0.148 0.004 0.22 0.012 C 4.125 5.998 7.713 3.0 12.0 3.0 c 4.287 0.0 7.875 2.998 8.78 7.012 C 20.852 10.004 20.925 10.0 21.0 10.0 c 1.105 0.0 2.0 0.895 2.0 2.0 s -0.895 2.0 -2.0 2.0 c -0.075 0.0 -0.148 -0.004 -0.22 -0.012 Z M 6.5 11.0 C 7.328 11.0 8.0 10.328 8.0 9.5 S 7.328 8.0 6.5 8.0 S 5.0 8.672 5.0 9.5 S 5.672 11.0 6.5 11.0 Z M 19.0 9.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 S 16.0 10.328 16.0 9.5 S 16.672 8.0 17.5 8.0 S 19.0 8.672 19.0 9.5 Z m -4.879 1.278 c -0.284 0.285 -0.623 0.51 -0.997 0.66 c -0.373 0.151 -0.773 0.225 -1.176 0.218 c -0.402 -0.007 -0.8 -0.094 -1.167 -0.258 c -0.368 -0.164 -0.7 -0.4 -0.974 -0.694 l -1.462 1.364 c 0.458 0.491 1.01 0.885 1.623 1.157 c 0.613 0.273 1.275 0.42 1.946 0.431 c 0.67 0.012 1.337 -0.112 1.96 -0.363 c 0.622 -0.252 1.187 -0.626 1.662 -1.1 l -1.415 -1.415 Z")
        )
    }.build()
}
