package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.193 4.325 c -1.641 0.0 -2.638 1.406 -2.638 2.577 c 0.0 1.047 0.524 2.007 1.187 2.821 c 0.669 0.82 1.528 1.551 2.305 2.147 l 0.043 0.033 c 0.179 0.138 0.372 0.287 0.61 0.35 c 0.203 0.055 0.432 0.055 0.634 0.0 c 0.24 -0.063 0.432 -0.212 0.61 -0.35 l 0.044 -0.033 c 0.777 -0.596 1.636 -1.327 2.305 -2.147 c 0.663 -0.814 1.187 -1.774 1.187 -2.821 c 0.0 -1.171 -0.997 -2.577 -2.638 -2.577 c -0.507 0.0 -0.949 0.2 -1.31 0.448 C 8.348 4.902 8.175 5.05 8.018 5.201 C 7.86 5.05 7.688 4.901 7.502 4.773 C 7.142 4.524 6.7 4.325 6.192 4.325 Z M 4.605 6.902 c 0.0 -0.678 0.61 -1.527 1.588 -1.527 c 0.224 0.0 0.46 0.088 0.712 0.262 c 0.253 0.175 0.492 0.416 0.714 0.674 c 0.1 0.116 0.245 0.183 0.398 0.183 c 0.153 0.0 0.299 -0.067 0.399 -0.183 c 0.221 -0.258 0.46 -0.5 0.714 -0.674 c 0.252 -0.174 0.488 -0.262 0.712 -0.262 c 0.978 0.0 1.588 0.849 1.588 1.527 c 0.0 0.696 -0.354 1.425 -0.951 2.158 c -0.592 0.726 -1.376 1.399 -2.13 1.976 c -0.118 0.09 -0.183 0.14 -0.236 0.175 c -0.023 0.015 -0.036 0.022 -0.043 0.025 L 8.064 11.24 H 8.063 c -0.025 0.007 -0.066 0.007 -0.09 0.0 H 7.97 l -0.006 -0.003 c -0.007 -0.003 -0.02 -0.01 -0.044 -0.025 c -0.052 -0.034 -0.117 -0.084 -0.235 -0.175 c -0.754 -0.577 -1.538 -1.25 -2.13 -1.976 C 4.96 8.327 4.605 7.598 4.605 6.902 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z M 2.05 8.0 c 0.0 -3.286 2.664 -5.95 5.95 -5.95 S 13.95 4.714 13.95 8.0 S 11.286 13.95 8.0 13.95 S 2.05 11.286 2.05 8.0 Z")
        )
    }.build()
}
