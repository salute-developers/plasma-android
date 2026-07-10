package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportDoneOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportDoneOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.68 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.07 1.679 -3.75 3.75 -3.75 Z m 2.293 2.48 c -0.137 -0.136 -0.358 -0.136 -0.495 0.0 l -2.48 2.48 l -1.117 -1.116 c -0.136 -0.136 -0.357 -0.136 -0.494 0.0 c -0.136 0.137 -0.136 0.359 0.0 0.495 l 1.363 1.364 c 0.066 0.065 0.155 0.102 0.247 0.102 c 0.093 0.0 0.183 -0.037 0.248 -0.102 l 2.728 -2.728 c 0.136 -0.137 0.136 -0.358 0.0 -0.494 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.25 10.15 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.75 c 0.0 0.883 0.716 1.6 1.6 1.6 h 4.618 c 0.18 0.364 0.41 0.7 0.678 1.0 H 3.35 c -1.436 0.0 -2.6 -1.165 -2.6 -2.6 v -1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.58 1.995 c 0.234 -0.234 0.614 -0.234 0.849 0.0 l 2.818 2.819 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 8.536 3.518 v 5.61 c -0.534 0.643 -0.891 1.438 -1.0 2.31 V 3.454 L 5.47 5.521 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 7.58 1.995 Z")
        )
    }.build()
}
