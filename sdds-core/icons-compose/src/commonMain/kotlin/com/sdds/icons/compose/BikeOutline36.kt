package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.125 10.5 c 1.45 0.0 2.625 -1.175 2.625 -2.625 S 23.575 5.25 22.125 5.25 S 19.5 6.425 19.5 7.875 s 1.175 2.625 2.625 2.625 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.227 13.797 c 1.51 1.54 3.697 3.078 6.648 3.078 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 c -2.522 0.0 -4.388 -1.566 -5.746 -3.183 c -0.066 -0.078 -0.13 -0.156 -0.193 -0.233 c -0.967 -1.195 -2.816 -1.42 -3.984 -0.252 L 13.1 13.809 c -1.081 1.081 -1.013 2.854 0.148 3.85 l 3.496 2.996 c 0.083 0.071 0.131 0.175 0.131 0.285 v 5.31 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 v -5.31 c 0.0 -0.766 -0.335 -1.494 -0.917 -1.993 l -2.224 -1.907 l 3.243 -3.243 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 18.75 c -3.314 0.0 -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 Z m -3.75 6.0 C 5.25 22.679 6.929 21.0 9.0 21.0 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.0 18.75 c -3.314 0.0 -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 Z m -3.75 6.0 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 Z")
        )
    }.build()
}
