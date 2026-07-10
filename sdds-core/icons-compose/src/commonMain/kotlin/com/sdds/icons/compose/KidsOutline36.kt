package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.75 c -6.646 0.0 -12.224 4.56 -13.792 10.722 C 2.648 14.886 1.5 16.309 1.5 18.0 c 0.0 1.69 1.148 3.113 2.708 3.527 C 5.776 27.69 11.354 32.25 17.999 32.25 c 6.646 0.0 12.224 -4.56 13.792 -10.722 c 1.56 -0.414 2.708 -1.837 2.708 -3.527 c 0.0 -1.69 -1.148 -3.114 -2.708 -3.528 C 30.223 8.309 24.645 3.75 18.0 3.75 Z M 6.012 15.55 C 7.145 9.959 12.083 5.75 18.0 5.75 c 5.916 0.0 10.854 4.208 11.987 9.8 l 0.155 0.768 l 0.782 0.033 C 31.8 16.388 32.5 17.111 32.5 18.0 c 0.0 0.888 -0.7 1.61 -1.575 1.648 l -0.782 0.033 l -0.155 0.767 c -1.133 5.593 -6.071 9.8 -11.987 9.8 c -5.917 0.0 -10.855 -4.207 -11.988 -9.8 l -0.155 -0.767 l -0.782 -0.033 C 4.2 19.61 3.5 18.888 3.5 18.0 c 0.0 -0.889 0.7 -1.612 1.575 -1.649 l 0.782 -0.033 l 0.155 -0.768 Z m 4.427 0.935 c 0.835 0.0 1.512 -0.678 1.512 -1.514 s -0.677 -1.514 -1.512 -1.514 s -1.512 0.678 -1.512 1.514 s 0.677 1.514 1.512 1.514 Z m 16.634 -1.514 c 0.0 0.836 -0.677 1.514 -1.512 1.514 c -0.836 0.0 -1.513 -0.678 -1.513 -1.514 s 0.677 -1.514 1.513 -1.514 c 0.835 0.0 1.512 0.678 1.512 1.514 Z m -5.503 1.542 c -0.48 0.48 -1.05 0.858 -1.678 1.113 c -0.629 0.254 -1.302 0.379 -1.98 0.367 c -0.677 -0.011 -1.345 -0.16 -1.965 -0.435 c -0.619 -0.276 -1.176 -0.674 -1.639 -1.17 l -1.46 1.365 c 0.645 0.693 1.423 1.248 2.287 1.633 c 0.864 0.385 1.797 0.592 2.743 0.608 c 0.946 0.017 1.885 -0.158 2.762 -0.513 s 1.674 -0.883 2.343 -1.553 l -1.413 -1.415 Z")
        )
    }.build()
}
