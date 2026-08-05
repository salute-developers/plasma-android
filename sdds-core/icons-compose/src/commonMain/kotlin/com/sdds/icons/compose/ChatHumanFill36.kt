package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChatHumanFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChatHumanFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.798 15.375 C 3.798 9.369 8.65 4.5 14.636 4.5 c 5.986 0.0 10.839 4.869 10.839 10.875 S 20.622 26.25 14.636 26.25 c -1.005 0.0 -1.98 -0.137 -2.905 -0.395 c -0.927 -0.259 -1.773 -0.345 -2.516 -0.148 l -2.9 0.765 c -1.66 0.439 -3.176 -1.082 -2.739 -2.748 l 0.763 -2.91 c 0.196 -0.745 0.11 -1.594 -0.147 -2.524 c -0.257 -0.93 -0.394 -1.907 -0.394 -2.915 Z m 10.69 0.9 c 2.065 0.0 3.738 -1.678 3.738 -3.75 c 0.0 -2.07 -1.673 -3.75 -3.737 -3.75 s -3.738 1.68 -3.738 3.75 c 0.0 2.072 1.674 3.75 3.738 3.75 Z m 0.002 7.5 c 2.82 0.0 5.3 -1.677 6.729 -4.212 c -2.003 -1.14 -4.294 -1.788 -6.729 -1.788 c -2.435 0.0 -4.726 0.647 -6.729 1.788 c 1.428 2.535 3.908 4.213 6.729 4.213 Z m 0.268 4.724 c 1.252 -0.011 2.462 -0.199 3.606 -0.54 c 0.934 0.35 1.945 0.541 3.0 0.541 c 0.796 0.0 1.565 -0.108 2.294 -0.31 c 1.108 -0.308 2.41 -0.5 3.71 -0.156 l 2.883 0.76 l -0.764 -2.912 c -0.34 -1.294 -0.15 -2.587 0.156 -3.689 c 0.204 -0.736 0.313 -1.513 0.313 -2.318 c 0.0 -2.276 -0.877 -4.344 -2.31 -5.885 c -0.13 -1.243 -0.433 -2.434 -0.884 -3.549 c 3.254 1.878 5.444 5.4 5.444 9.434 c 0.0 1.01 -0.137 1.989 -0.395 2.919 c -0.257 0.927 -0.343 1.773 -0.148 2.517 l 0.765 2.913 c 0.437 1.667 -1.085 3.186 -2.751 2.746 l -2.883 -0.76 c -0.748 -0.198 -1.6 -0.112 -2.534 0.147 c -0.923 0.256 -1.895 0.393 -2.896 0.393 c -2.487 0.0 -4.777 -0.84 -6.606 -2.25 Z")
        )
    }.build()
}
