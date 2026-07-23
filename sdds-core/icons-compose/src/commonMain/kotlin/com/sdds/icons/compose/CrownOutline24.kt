package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CrownOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CrownOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 15.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.596 5.705 c 0.102 -0.134 0.187 -0.282 0.252 -0.44 c 0.168 -0.406 0.198 -0.857 0.084 -1.283 c -0.114 -0.425 -0.365 -0.8 -0.715 -1.069 C 12.868 2.645 12.44 2.5 12.0 2.5 c -0.44 0.0 -0.868 0.145 -1.217 0.413 c -0.35 0.268 -0.6 0.644 -0.715 1.07 c -0.114 0.425 -0.084 0.876 0.084 1.282 c 0.066 0.158 0.15 0.306 0.252 0.44 L 7.343 9.262 C 7.265 9.353 7.133 9.376 7.03 9.317 L 5.228 8.294 c 0.027 -0.183 0.03 -0.37 0.005 -0.555 c -0.058 -0.437 -0.257 -0.842 -0.569 -1.153 c -0.311 -0.312 -0.716 -0.511 -1.153 -0.569 c -0.436 -0.057 -0.88 0.03 -1.261 0.25 c -0.381 0.221 -0.68 0.56 -0.848 0.968 C 1.234 7.64 1.204 8.092 1.318 8.518 c 0.114 0.425 0.365 0.8 0.714 1.069 c 0.112 0.085 0.23 0.158 0.356 0.218 l 1.718 8.781 C 4.266 19.407 4.986 20.0 5.823 20.0 h 12.354 c 0.837 0.0 1.556 -0.593 1.717 -1.414 l 1.698 -8.675 c 0.224 -0.07 0.436 -0.18 0.626 -0.324 c 0.349 -0.268 0.6 -0.644 0.714 -1.07 c 0.114 -0.425 0.084 -0.876 -0.084 -1.282 C 22.679 6.828 22.38 6.488 22.0 6.268 c -0.381 -0.22 -0.825 -0.308 -1.261 -0.25 c -0.437 0.057 -0.842 0.256 -1.153 0.568 c -0.311 0.311 -0.511 0.716 -0.569 1.153 C 19.0 7.879 18.995 8.02 19.007 8.16 L 16.97 9.317 c -0.104 0.059 -0.235 0.036 -0.313 -0.055 l -3.06 -3.557 Z M 12.0 6.15 l -3.52 4.09 c -0.546 0.635 -1.463 0.794 -2.19 0.381 L 3.8 9.208 l 1.778 9.09 C 5.601 18.415 5.704 18.5 5.823 18.5 h 12.354 c 0.12 0.0 0.222 -0.085 0.245 -0.202 l 1.779 -9.09 l -2.49 1.413 c -0.728 0.413 -1.645 0.254 -2.19 -0.38 L 12.0 6.15 Z")
        )
    }.build()
}
