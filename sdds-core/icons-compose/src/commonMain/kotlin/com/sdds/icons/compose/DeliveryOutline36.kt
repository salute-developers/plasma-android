package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeliveryOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeliveryOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.621 5.072 c -0.513 -0.205 -1.095 0.044 -1.3 0.557 c -0.205 0.513 0.045 1.095 0.558 1.3 L 8.986 8.17 C 9.129 8.228 9.238 8.349 9.28 8.498 l 3.15 11.018 c 0.815 2.851 3.744 4.543 6.621 3.824 l 10.94 -2.733 c 0.536 -0.134 0.862 -0.677 0.728 -1.213 s -0.677 -0.861 -1.213 -0.727 L 18.567 21.4 c -1.83 0.457 -3.694 -0.62 -4.213 -2.434 l -3.15 -11.018 C 10.99 7.204 10.446 6.6 9.728 6.314 L 6.621 5.072 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.273 10.072 c -1.6 0.43 -2.55 2.074 -2.12 3.674 l 1.113 4.152 c 0.429 1.6 2.074 2.55 3.675 2.122 l 6.224 -1.667 c 1.6 -0.428 2.55 -2.073 2.12 -3.673 l -1.113 -4.152 c -0.429 -1.6 -2.074 -2.55 -3.675 -2.122 l -6.224 1.666 Z m 6.742 0.266 l -6.224 1.666 c -0.533 0.143 -0.85 0.691 -0.707 1.225 l 1.114 4.152 c 0.143 0.534 0.691 0.85 1.225 0.707 l 6.224 -1.666 c 0.533 -0.143 0.85 -0.692 0.707 -1.225 l -1.114 -4.152 c -0.143 -0.534 -0.691 -0.85 -1.224 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.072 31.0 c 2.094 0.0 3.79 -1.696 3.79 -3.788 c 0.0 -2.092 -1.696 -3.788 -3.79 -3.788 c -2.093 0.0 -3.79 1.696 -3.79 3.788 c 0.0 2.092 1.697 3.788 3.79 3.788 Z m 0.0 -2.0 c 0.99 0.0 1.79 -0.802 1.79 -1.788 s -0.8 -1.788 -1.79 -1.788 s -1.79 0.802 -1.79 1.788 s 0.8 1.788 1.79 1.788 Z")
        )
    }.build()
}
