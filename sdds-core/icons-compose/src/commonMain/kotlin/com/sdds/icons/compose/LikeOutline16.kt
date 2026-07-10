package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LikeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LikeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.971 1.537 c 0.2 -0.59 0.83 -0.91 1.422 -0.743 c 1.303 0.366 2.08 1.698 1.725 3.002 l -0.681 2.516 c -0.032 0.116 0.056 0.25 0.206 0.25 h 1.466 c 2.007 0.0 3.299 2.14 2.295 3.888 l -1.796 3.125 c -0.725 1.26 -2.196 1.906 -3.626 1.6 L 4.83 14.287 c -0.32 0.465 -0.887 0.742 -1.492 0.667 l -0.712 -0.087 c -0.812 -0.1 -1.42 -0.805 -1.374 -1.627 l 0.263 -4.644 C 1.55 7.977 1.953 7.443 2.533 7.229 l 0.68 -0.251 c 0.63 -0.232 1.285 -0.04 1.696 0.395 C 5.031 7.243 5.142 7.1 5.24 6.95 l 1.682 -2.6 c 0.134 -0.208 0.242 -0.43 0.32 -0.663 l 0.73 -2.151 Z M 5.33 8.354 c 0.002 0.049 0.002 0.098 0.0 0.148 l -0.223 4.821 l 4.084 0.874 c 1.013 0.216 2.045 -0.242 2.55 -1.12 l 1.796 -3.125 c 0.607 -1.057 -0.161 -2.39 -1.428 -2.39 h -1.466 c -0.787 0.0 -1.381 -0.738 -1.172 -1.512 l 0.682 -2.515 c 0.207 -0.762 -0.243 -1.557 -1.03 -1.778 c -0.093 -0.026 -0.18 0.026 -0.205 0.1 L 8.188 4.01 C 8.084 4.32 7.94 4.618 7.762 4.894 l -1.682 2.6 c -0.209 0.322 -0.461 0.611 -0.75 0.86 Z M 4.31 8.282 C 4.228 7.987 3.889 7.795 3.56 7.916 L 2.88 8.167 C 2.664 8.246 2.524 8.439 2.512 8.652 l -0.262 4.645 c -0.016 0.282 0.193 0.54 0.497 0.577 l 0.712 0.088 c 0.288 0.035 0.542 -0.143 0.618 -0.39 c 0.012 -0.042 0.02 -0.086 0.022 -0.133 l 0.23 -4.983 c 0.004 -0.063 -0.004 -0.121 -0.02 -0.174 Z")
        )
    }.build()
}
