package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeMinimize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeMinimize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.89 1.75 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 4.861 c 0.0 0.276 0.224 0.5 0.5 0.5 h 4.863 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 h -3.655 l 4.009 -4.007 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 L 9.89 5.404 V 1.75 Z M 1.75 8.89 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 3.655 l -4.008 4.007 c -0.196 0.195 -0.196 0.512 0.0 0.707 c 0.195 0.196 0.511 0.196 0.706 0.0 l 4.01 -4.007 v 3.654 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 9.39 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 1.75 Z")
        )
    }.build()
}
