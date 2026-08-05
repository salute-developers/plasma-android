package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.312 11.788 c 0.0 -3.811 3.09 -6.9 6.9 -6.9 c 3.612 0.0 6.575 2.774 6.875 6.307 c 0.538 0.136 1.05 0.338 1.525 0.598 v -0.005 c 0.0 -4.64 -3.76 -8.4 -8.4 -8.4 c -4.639 0.0 -8.4 3.76 -8.4 8.4 c 0.0 0.998 0.175 1.956 0.495 2.846 c 0.185 0.513 0.234 1.006 0.115 1.432 L 3.72 18.569 c -0.292 1.042 0.668 2.002 1.71 1.71 l 2.503 -0.7 c 0.426 -0.12 0.919 -0.07 1.432 0.114 c 0.697 0.25 1.436 0.412 2.203 0.47 c -0.222 -0.492 -0.384 -1.017 -0.477 -1.566 c -0.42 -0.068 -0.827 -0.175 -1.218 -0.315 c -0.702 -0.253 -1.527 -0.377 -2.344 -0.148 l -2.31 0.647 l 0.646 -2.31 c 0.229 -0.818 0.105 -1.643 -0.148 -2.345 c -0.262 -0.73 -0.406 -1.516 -0.406 -2.338 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 23.0 c 3.037 0.0 5.5 -2.462 5.5 -5.5 c 0.0 -3.037 -2.463 -5.5 -5.5 -5.5 c -3.038 0.0 -5.5 2.463 -5.5 5.5 c 0.0 3.038 2.462 5.5 5.5 5.5 Z m 2.25 -7.75 c 0.0 1.243 -1.008 2.25 -2.25 2.25 c -1.243 0.0 -2.25 -1.007 -2.25 -2.25 c 0.0 -1.242 1.007 -2.25 2.25 -2.25 c 1.242 0.0 2.25 1.008 2.25 2.25 Z m 1.527 4.697 C 20.476 21.183 19.084 22.0 17.5 22.0 c -1.583 0.0 -2.976 -0.817 -3.778 -2.053 C 14.847 19.343 16.134 19.0 17.5 19.0 s 2.652 0.343 3.777 0.947 Z")
        )
    }.build()
}
