package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.504 2.25 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.44 c 0.0 0.275 0.224 0.5 0.5 0.5 s 0.5 -0.225 0.5 -0.5 V 2.25 Z m 4.854 2.013 c 0.194 -0.197 0.194 -0.515 0.0 -0.711 c -0.195 -0.196 -0.51 -0.196 -0.704 0.0 l -1.22 1.233 c -0.195 0.197 -0.195 0.515 0.0 0.711 c 0.194 0.196 0.509 0.196 0.703 0.0 l 1.22 -1.233 Z M 2.646 3.56 c 0.195 -0.197 0.51 -0.197 0.704 0.0 l 1.22 1.233 c 0.195 0.196 0.195 0.515 0.0 0.71 c -0.194 0.197 -0.509 0.197 -0.703 0.0 l -1.22 -1.233 c -0.195 -0.196 -0.195 -0.514 0.0 -0.71 Z m 8.895 8.953 L 11.345 8.77 c -0.062 -1.196 -1.05 -2.133 -2.247 -2.133 h -2.2 c -1.197 0.0 -2.184 0.937 -2.246 2.133 l -0.196 3.744 h 7.085 Z m 0.842 0.744 c -0.022 0.004 -0.044 0.006 -0.067 0.006 H 3.688 c -0.023 0.0 -0.046 -0.002 -0.068 -0.006 c -0.244 0.033 -0.432 0.242 -0.432 0.495 c 0.0 0.276 0.223 0.5 0.5 0.5 h 8.628 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.253 -0.188 -0.462 -0.433 -0.495 Z")
        )
    }.build()
}
