package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeMaximize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeMaximize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.023 2.25 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.227 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.227 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -4.02 L 3.457 13.25 h 4.02 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 8.523 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 4.02 l 9.793 -9.793 h -4.02 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
