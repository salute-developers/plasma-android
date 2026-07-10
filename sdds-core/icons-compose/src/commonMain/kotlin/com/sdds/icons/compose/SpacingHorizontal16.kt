package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.7 2.3 c 0.276 0.0 0.5 0.224 0.5 0.5 v 10.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.3 2.3 c 0.276 0.0 0.5 0.224 0.5 0.5 v 10.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 2.8 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.138 5.401 c 0.197 -0.193 0.513 -0.19 0.707 0.006 l 2.25 2.292 c 0.192 0.196 0.19 0.51 -0.002 0.703 l -2.25 2.26 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.195 -0.197 -0.511 -0.002 -0.707 l 1.375 -1.38 H 5.406 l 1.45 1.37 c 0.2 0.189 0.209 0.506 0.019 0.706 c -0.19 0.2 -0.506 0.21 -0.707 0.02 L 3.779 8.413 C 3.68 8.32 3.624 8.188 3.623 8.052 c 0.0 -0.137 0.056 -0.268 0.154 -0.363 l 2.388 -2.293 c 0.2 -0.19 0.516 -0.184 0.707 0.015 c 0.191 0.2 0.185 0.516 -0.014 0.707 L 5.341 7.575 h 5.23 L 9.13 6.108 C 8.94 5.911 8.942 5.595 9.139 5.401 Z")
        )
    }.build()
}
