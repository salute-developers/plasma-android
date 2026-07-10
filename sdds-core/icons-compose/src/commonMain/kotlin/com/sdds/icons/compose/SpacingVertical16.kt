package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 13.85 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 10.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.998 3.673 c 0.137 0.0 0.268 0.056 0.362 0.154 l 2.293 2.388 c 0.191 0.199 0.184 0.516 -0.014 0.707 c -0.2 0.19 -0.516 0.185 -0.707 -0.014 L 8.475 5.391 v 5.23 L 9.94 9.18 c 0.197 -0.192 0.514 -0.19 0.707 0.007 c 0.194 0.196 0.191 0.513 -0.005 0.707 l -2.292 2.25 c -0.196 0.191 -0.51 0.19 -0.704 -0.002 L 5.39 9.893 C 5.193 9.698 5.193 9.38 5.388 9.186 C 5.582 8.99 5.899 8.989 6.095 9.184 l 1.38 1.374 V 5.456 l -1.37 1.45 c -0.19 0.2 -0.506 0.208 -0.707 0.019 c -0.2 -0.19 -0.209 -0.507 -0.02 -0.707 l 2.259 -2.389 C 7.73 3.73 7.86 3.673 7.998 3.673 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 1.25 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 10.5 Z")
        )
    }.build()
}
