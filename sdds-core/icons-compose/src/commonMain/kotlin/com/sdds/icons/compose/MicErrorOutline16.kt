package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicErrorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicErrorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.234 1.535 C 8.157 1.53 8.078 1.525 8.0 1.525 c -1.453 0.0 -2.63 1.178 -2.63 2.63 v 4.04 c 0.0 1.453 1.177 2.631 2.63 2.631 c 1.422 0.0 2.58 -1.129 2.629 -2.539 c -0.354 -0.113 -0.689 -0.269 -0.999 -0.461 v 0.37 c 0.0 0.9 -0.73 1.63 -1.63 1.63 c -0.9 0.0 -1.63 -0.73 -1.63 -1.63 v -4.04 c 0.0 -0.813 0.594 -1.487 1.371 -1.61 c 0.123 -0.36 0.29 -0.699 0.494 -1.01 Z m 3.586 6.961 c -0.048 0.066 -0.08 0.143 -0.092 0.229 c -0.118 0.874 -0.56 1.68 -1.244 2.265 c -0.686 0.586 -1.569 0.91 -2.485 0.91 c -0.916 0.0 -1.799 -0.324 -2.484 -0.91 C 4.83 10.405 4.389 9.6 4.27 8.725 C 4.233 8.45 3.982 8.259 3.708 8.296 C 3.434 8.333 3.242 8.585 3.279 8.86 c 0.152 1.122 0.717 2.149 1.586 2.892 c 0.742 0.634 1.664 1.024 2.634 1.124 v 1.6 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 v -1.6 c 0.97 -0.1 1.892 -0.49 2.634 -1.124 c 0.87 -0.743 1.434 -1.77 1.586 -2.892 c 0.02 -0.15 -0.028 -0.293 -0.12 -0.398 c -0.197 0.026 -0.396 0.039 -0.6 0.039 c -0.06 0.0 -0.12 -0.001 -0.18 -0.004 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.358 -0.137 -0.494 0.0 c -0.137 0.137 -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.137 0.137 0.359 0.137 0.496 0.0 l 1.198 -1.199 l 1.2 1.199 c 0.136 0.137 0.358 0.137 0.494 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.198 -1.199 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 c -0.136 -0.137 -0.358 -0.137 -0.495 0.0 L 12.0 3.505 l -1.198 -1.199 Z")
        )
    }.build()
}
