package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 15.25 v -4.626 l 7.578 4.548 c 0.793 0.476 1.046 0.616 1.297 0.671 c 0.247 0.055 0.503 0.055 0.75 0.0 c 0.251 -0.055 0.504 -0.195 1.297 -0.671 l 8.714 -5.23 c 0.228 -0.136 0.366 -0.383 0.364 -0.65 c -0.003 -0.265 -0.146 -0.51 -0.376 -0.642 l -8.102 -4.66 c -0.633 -0.364 -1.094 -0.63 -1.598 -0.736 c -0.445 -0.094 -0.903 -0.094 -1.347 0.0 c -0.505 0.107 -0.966 0.372 -1.598 0.737 L 1.626 8.65 C 1.393 8.783 1.25 9.03 1.25 9.3 v 5.95 C 1.25 15.664 1.586 16.0 2.0 16.0 s 0.75 -0.336 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.75 13.874 l -4.406 2.644 c -0.65 0.391 -1.125 0.676 -1.647 0.79 c -0.46 0.102 -0.935 0.102 -1.394 0.0 c -0.522 -0.114 -0.996 -0.399 -1.647 -0.79 L 5.25 13.874 v 4.166 c 0.0 0.22 0.096 0.428 0.263 0.57 C 7.316 20.148 9.614 21.0 12.0 21.0 s 4.684 -0.853 6.486 -2.39 c 0.168 -0.142 0.264 -0.35 0.264 -0.57 v -4.166 Z")
        )
    }.build()
}
