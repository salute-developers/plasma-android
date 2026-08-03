package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RialOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RialOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.998 2.0 C 4.685 2.0 2.0 4.685 2.0 7.998 s 2.685 5.998 5.998 5.998 s 5.998 -2.685 5.998 -5.998 S 11.311 2.0 7.998 2.0 Z M 1.0 7.998 C 1.0 4.133 4.133 1.0 7.998 1.0 s 6.998 3.133 6.998 6.998 s -3.133 6.998 -6.998 6.998 S 1.0 11.863 1.0 7.998 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.97 5.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.575 c 1.146 0.0 2.075 0.929 2.075 2.075 c 0.0 0.873 -0.54 1.62 -1.303 1.927 l 1.239 2.203 c 0.135 0.24 0.05 0.545 -0.19 0.68 c -0.242 0.136 -0.546 0.05 -0.682 -0.19 L 8.753 8.65 H 7.97 v 2.3 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 5.0 Z m 2.065 2.65 H 7.97 h 1.065 Z m 0.017 0.0 c 0.59 -0.004 1.068 -0.484 1.068 -1.075 c 0.0 -0.594 -0.481 -1.075 -1.075 -1.075 H 7.97 v 2.15")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.37 4.5 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.95 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 5.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
