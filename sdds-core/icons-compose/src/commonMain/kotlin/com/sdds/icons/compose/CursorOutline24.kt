package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.CursorOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CursorOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 7.003 4.028 c -0.955 -0.467 -2.02 0.396 -1.762 1.427 l 3.924 15.64 c 0.302 1.205 1.987 1.278 2.393 0.104 l 2.364 -6.825 l 7.168 -0.893 c 1.233 -0.154 1.51 -1.817 0.395 -2.363 L 7.003 4.028 Z M 6.827 5.612 l 13.245 6.484 l -6.49 0.809 c -0.472 0.059 -0.87 0.381 -1.026 0.831 l -2.14 6.18 l -3.59 -14.304 Z")
            )
        }
    }.build()
}
