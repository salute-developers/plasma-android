package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookWavesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookWavesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.527 3.5 H 4.08 c -0.588 0.0 -0.882 0.0 -1.107 0.114 c -0.197 0.101 -0.358 0.262 -0.459 0.46 C 2.4 4.297 2.4 4.591 2.4 5.18 v 4.38 c 0.0 0.589 0.0 0.883 0.114 1.107 c 0.101 0.198 0.262 0.359 0.46 0.46 c 0.224 0.114 0.518 0.114 1.106 0.114 h 7.84 c 0.588 0.0 0.882 0.0 1.107 -0.115 c 0.197 -0.1 0.358 -0.261 0.459 -0.459 C 13.6 10.443 13.6 10.15 13.6 9.561 V 8.207 C 13.103 8.397 12.563 8.5 12.0 8.5 C 9.515 8.5 7.5 6.485 7.5 4.0 c 0.0 -0.169 0.01 -0.336 0.027 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.0 12.473 c 0.0 -0.292 0.236 -0.528 0.528 -0.528 h 12.944 c 0.292 0.0 0.528 0.236 0.528 0.528 C 15.0 12.764 14.764 13.0 14.472 13.0 H 1.528 C 1.236 13.0 1.0 12.764 1.0 12.473 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 4.0 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m -5.44 -0.044 c 0.05 -0.187 0.242 -0.298 0.429 -0.248 c 0.364 0.098 0.686 0.313 0.916 0.612 c 0.23 0.3 0.354 0.666 0.354 1.044 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.223 -0.074 -0.44 -0.21 -0.617 c -0.135 -0.177 -0.326 -0.305 -0.541 -0.362 c -0.187 -0.05 -0.298 -0.242 -0.248 -0.43 Z m 0.958 -2.189 c -0.187 -0.05 -0.378 0.061 -0.428 0.248 c -0.05 0.187 0.06 0.378 0.247 0.428 c 0.65 0.175 1.225 0.559 1.635 1.093 c 0.41 0.534 0.632 1.189 0.632 1.862 c 0.0 0.194 0.157 0.35 0.35 0.35 c 0.194 0.0 0.35 -0.156 0.35 -0.35 c 0.0 -0.827 -0.273 -1.632 -0.776 -2.288 c -0.504 -0.657 -1.21 -1.128 -2.01 -1.343 Z")
        )
    }.build()
}
