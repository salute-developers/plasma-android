package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LikeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LikeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.994 3.643 c 0.409 -1.222 1.709 -1.903 2.946 -1.55 c 2.738 0.78 4.35 3.605 3.614 6.355 l -1.446 5.403 c -0.084 0.316 0.155 0.635 0.494 0.635 h 3.108 c 4.232 0.0 6.905 4.551 4.816 8.235 l -3.806 6.712 c -1.52 2.68 -4.613 4.06 -7.628 3.407 l -8.837 -1.915 c -0.66 0.998 -1.85 1.6 -3.132 1.44 l -1.511 -0.188 c -1.701 -0.212 -2.952 -1.702 -2.857 -3.415 l 0.556 -9.977 c 0.072 -1.292 0.904 -2.418 2.116 -2.87 l 1.443 -0.54 c 1.34 -0.5 2.725 -0.068 3.577 0.876 c 0.278 -0.295 0.528 -0.616 0.747 -0.96 l 3.566 -5.585 c 0.288 -0.45 0.519 -0.934 0.688 -1.44 l 1.546 -4.623 Z m -5.717 14.58 c 0.007 0.117 0.007 0.234 0.002 0.352 l -0.475 10.422 l 8.712 1.888 c 2.163 0.468 4.377 -0.522 5.464 -2.438 l 3.807 -6.713 c 1.327 -2.34 -0.366 -5.248 -3.077 -5.248 h -3.108 c -1.645 0.0 -2.852 -1.557 -2.426 -3.152 l 1.446 -5.403 c 0.452 -1.69 -0.537 -3.433 -2.23 -3.915 c -0.213 -0.06 -0.433 0.058 -0.501 0.262 L 18.345 8.9 c -0.221 0.662 -0.523 1.294 -0.899 1.883 l -3.566 5.585 c -0.445 0.696 -0.986 1.32 -1.604 1.856 Z m -2.041 -0.142 c -0.192 -0.68 -0.95 -1.1 -1.666 -0.832 l -1.443 0.539 c -0.471 0.176 -0.791 0.612 -0.819 1.109 l -0.556 9.976 c -0.037 0.658 0.444 1.237 1.107 1.32 L 8.37 30.38 c 0.628 0.079 1.2 -0.314 1.371 -0.886 c 0.029 -0.096 0.047 -0.198 0.052 -0.306 l 0.488 -10.704 c 0.007 -0.145 -0.01 -0.28 -0.045 -0.403 Z")
        )
    }.build()
}
