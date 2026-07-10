package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DislikeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DislikeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.971 14.463 c 0.2 0.59 0.83 0.91 1.422 0.743 c 1.303 -0.366 2.08 -1.698 1.725 -3.002 l -0.681 -2.516 c -0.032 -0.116 0.056 -0.25 0.206 -0.25 h 1.466 c 2.007 0.0 3.299 -2.14 2.295 -3.888 l -1.796 -3.125 c -0.725 -1.26 -2.196 -1.906 -3.626 -1.6 L 4.83 1.713 C 4.51 1.248 3.943 0.971 3.338 1.046 L 2.626 1.133 c -0.812 0.1 -1.42 0.805 -1.374 1.627 l 0.263 4.644 C 1.55 8.023 1.953 8.557 2.533 8.771 l 0.68 0.251 c 0.63 0.233 1.285 0.04 1.696 -0.395 C 5.031 8.757 5.142 8.9 5.24 9.05 l 1.682 2.6 c 0.134 0.208 0.242 0.43 0.32 0.663 l 0.73 2.152 Z M 5.33 7.646 c 0.002 -0.049 0.002 -0.098 0.0 -0.148 L 5.107 2.677 L 9.19 1.803 c 1.013 -0.216 2.045 0.242 2.55 1.12 l 1.796 3.125 c 0.607 1.057 -0.161 2.39 -1.428 2.39 h -1.466 c -0.787 0.0 -1.381 0.738 -1.172 1.512 l 0.682 2.515 c 0.207 0.762 -0.243 1.557 -1.03 1.778 c -0.093 0.026 -0.18 -0.026 -0.205 -0.1 l -0.73 -2.152 c -0.105 -0.311 -0.248 -0.608 -0.427 -0.885 l -1.682 -2.6 c -0.209 -0.322 -0.461 -0.611 -0.75 -0.86 Z M 4.31 7.718 C 4.228 8.013 3.889 8.205 3.56 8.084 L 2.88 7.833 C 2.664 7.754 2.524 7.561 2.512 7.348 L 2.251 2.703 c -0.016 -0.282 0.193 -0.54 0.497 -0.577 L 3.46 2.038 c 0.288 -0.035 0.542 0.143 0.618 0.39 C 4.09 2.47 4.098 2.514 4.1 2.561 l 0.23 4.983 c 0.004 0.063 -0.004 0.121 -0.02 0.174 Z")
        )
    }.build()
}
