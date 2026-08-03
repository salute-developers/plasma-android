package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.363 4.722 c -0.24 -0.051 -0.486 -0.051 -0.726 0.0 c -0.242 0.051 -0.487 0.182 -1.257 0.624 l -6.9 3.968 l 6.848 4.108 c 0.793 0.476 1.046 0.616 1.297 0.672 c 0.247 0.054 0.503 0.054 0.75 0.0 c 0.251 -0.056 0.504 -0.196 1.297 -0.672 l 6.847 -4.108 l -6.899 -3.968 c -0.77 -0.442 -1.015 -0.573 -1.257 -0.624 Z M 2.75 10.624 v 4.626 C 2.75 15.664 2.414 16.0 2.0 16.0 s -0.75 -0.336 -0.75 -0.75 V 9.3 c 0.0 -0.269 0.143 -0.517 0.376 -0.65 l 8.006 -4.604 l 0.097 -0.055 c 0.632 -0.365 1.094 -0.63 1.598 -0.737 c 0.444 -0.094 0.902 -0.094 1.347 0.0 c 0.504 0.107 0.965 0.372 1.598 0.737 l 0.096 0.055 l 8.006 4.604 c 0.23 0.132 0.373 0.377 0.376 0.643 c 0.002 0.266 -0.136 0.513 -0.364 0.65 l -3.636 2.181 v 5.916 c 0.0 0.22 -0.096 0.428 -0.264 0.57 C 16.684 20.148 14.386 21.0 12.0 21.0 s -4.684 -0.853 -6.487 -2.39 c -0.167 -0.142 -0.263 -0.35 -0.263 -0.57 v -5.916 l -2.5 -1.5 Z m 4.0 2.4 v 4.66 C 8.24 18.855 10.086 19.5 12.0 19.5 c 1.914 0.0 3.76 -0.645 5.25 -1.815 v -4.66 l -2.806 1.683 l -0.1 0.06 c -0.65 0.391 -1.125 0.676 -1.647 0.79 c -0.46 0.101 -0.935 0.101 -1.394 0.0 c -0.522 -0.114 -0.996 -0.399 -1.647 -0.79 l -0.1 -0.06 l -2.806 -1.684 Z")
        )
    }.build()
}
