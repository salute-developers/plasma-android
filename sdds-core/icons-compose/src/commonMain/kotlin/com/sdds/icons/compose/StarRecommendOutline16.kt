package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.89 2.433 c -0.238 -0.577 -1.056 -0.577 -1.294 0.0 L 5.22 5.76 L 1.647 6.048 c -0.62 0.05 -0.872 0.823 -0.4 1.229 L 3.97 9.625 l -0.832 3.51 c -0.144 0.606 0.517 1.084 1.048 0.758 l 3.318 -2.039 c 0.235 -0.144 0.308 -0.452 0.164 -0.687 c -0.145 -0.236 -0.453 -0.31 -0.688 -0.165 l -2.703 1.66 l 0.708 -2.984 c 0.06 -0.254 -0.026 -0.521 -0.224 -0.692 l -2.32 -1.999 l 3.04 -0.245 c 0.263 -0.021 0.491 -0.187 0.592 -0.43 l 1.169 -2.828 l 1.216 2.94 C 8.564 6.68 8.857 6.802 9.112 6.697 C 9.367 6.59 9.489 6.298 9.383 6.043 L 7.89 2.433 Z m 3.488 3.723 c -0.191 -0.59 -1.027 -0.59 -1.219 0.0 l -0.704 2.18 h -2.28 c -0.62 0.0 -0.878 0.792 -0.378 1.158 l 1.848 1.35 l -0.706 2.185 c -0.19 0.59 0.486 1.08 0.987 0.713 l 1.842 -1.346 l 1.843 1.346 c 0.5 0.366 1.177 -0.123 0.987 -0.713 l -0.706 -2.185 l 1.848 -1.35 c 0.5 -0.366 0.241 -1.157 -0.378 -1.157 h -2.28 l -0.704 -2.18 Z m -1.052 2.738 l 0.442 -1.37 l 0.443 1.37 c 0.085 0.264 0.331 0.443 0.609 0.443 h 1.44 l -1.168 0.853 c -0.223 0.163 -0.317 0.45 -0.232 0.714 l 0.445 1.376 l -1.159 -0.847 c -0.225 -0.164 -0.53 -0.164 -0.755 0.0 L 9.232 12.28 l 0.445 -1.376 c 0.085 -0.263 -0.009 -0.55 -0.232 -0.714 L 8.278 9.337 h 1.44 c 0.277 0.0 0.523 -0.18 0.608 -0.443 Z")
        )
    }.build()
}
