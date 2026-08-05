package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageVideoOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageVideoOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.625 10.275 c 0.0 -0.595 0.0 -0.893 0.116 -1.12 c 0.101 -0.2 0.264 -0.363 0.464 -0.464 c 0.227 -0.116 0.525 -0.116 1.12 -0.116 h 2.125 c 0.595 0.0 0.892 0.0 1.12 0.116 c 0.2 0.101 0.362 0.264 0.464 0.464 c 0.116 0.227 0.116 0.525 0.116 1.12 v 0.416 l 1.433 -1.158 c 0.277 -0.225 0.692 -0.027 0.692 0.33 v 3.373 c 0.0 0.358 -0.414 0.555 -0.692 0.33 L 14.15 12.41 v 0.416 c 0.0 0.595 0.0 0.892 -0.116 1.12 c -0.102 0.2 -0.264 0.362 -0.464 0.464 c -0.228 0.116 -0.525 0.116 -1.12 0.116 h -2.125 c -0.595 0.0 -0.893 0.0 -1.12 -0.116 c -0.2 -0.102 -0.363 -0.264 -0.464 -0.464 c -0.116 -0.228 -0.116 -0.525 -0.116 -1.12 v -2.55 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.237 3.362 c -4.639 0.0 -8.4 3.761 -8.4 8.4 c 0.0 0.998 0.175 1.957 0.495 2.847 c 0.185 0.513 0.234 1.005 0.115 1.432 l -0.701 2.503 c -0.292 1.042 0.668 2.002 1.71 1.71 l 2.503 -0.7 c 0.426 -0.12 0.919 -0.071 1.432 0.114 c 0.89 0.32 1.848 0.494 2.846 0.494 c 4.64 0.0 8.4 -3.76 8.4 -8.4 c 0.0 -4.639 -3.76 -8.4 -8.4 -8.4 Z m -6.9 8.4 c 0.0 -3.81 3.09 -6.9 6.9 -6.9 c 3.811 0.0 6.9 3.09 6.9 6.9 c 0.0 3.811 -3.089 6.9 -6.9 6.9 c -0.822 0.0 -1.609 -0.143 -2.338 -0.406 c -0.703 -0.253 -1.527 -0.376 -2.344 -0.147 l -2.311 0.647 l 0.647 -2.311 c 0.229 -0.818 0.105 -1.642 -0.148 -2.344 c -0.262 -0.73 -0.406 -1.517 -0.406 -2.339 Z")
        )
    }.build()
}
