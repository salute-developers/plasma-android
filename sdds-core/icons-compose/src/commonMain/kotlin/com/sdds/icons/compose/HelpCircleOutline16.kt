package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelpCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelpCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z M 6.856 4.925 C 6.618 5.11 6.391 5.468 6.391 6.242 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -0.981 0.3 -1.677 0.851 -2.107 c 0.527 -0.41 1.19 -0.5 1.756 -0.5 c 0.566 0.0 1.23 0.09 1.756 0.5 c 0.552 0.43 0.852 1.126 0.852 2.107 c 0.0 1.14 -0.72 1.712 -1.254 2.113 C 8.76 8.798 8.498 8.999 8.498 9.404 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -0.926 0.678 -1.425 1.146 -1.77 l 0.108 -0.08 c 0.52 -0.389 0.854 -0.696 0.854 -1.312 c 0.0 -0.774 -0.228 -1.132 -0.466 -1.317 c -0.263 -0.205 -0.654 -0.29 -1.142 -0.29 c -0.488 0.0 -0.878 0.085 -1.142 0.29 Z m 1.845 6.235 c 0.0 0.388 -0.314 0.703 -0.702 0.703 c -0.388 0.0 -0.703 -0.315 -0.703 -0.703 c 0.0 -0.388 0.315 -0.703 0.703 -0.703 c 0.388 0.0 0.702 0.315 0.702 0.703 Z")
        )
    }.build()
}
