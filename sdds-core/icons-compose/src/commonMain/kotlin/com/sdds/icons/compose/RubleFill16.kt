package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RubleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RubleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 7.125 4.525 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 2.65 h -0.55 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 0.55 v 0.75 h -0.55 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 0.55 V 11.5 h 1.0 v -1.075 h 1.25 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -1.25 v -0.75 H 8.7 c 1.146 0.0 2.075 -0.929 2.075 -2.075 c 0.0 -1.146 -0.929 -2.075 -2.075 -2.075 H 7.125 Z M 8.7 7.675 H 7.625 v -2.15 H 8.7 c 0.594 0.0 1.075 0.481 1.075 1.075 S 9.294 7.675 8.7 7.675 Z")
        )
    }.build()
}
