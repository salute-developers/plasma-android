package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageQuestionOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageQuestionOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.732 8.37 c -0.243 0.189 -0.507 0.573 -0.507 1.48 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -1.218 0.373 -2.11 1.086 -2.664 c 0.676 -0.525 1.518 -0.636 2.214 -0.636 c 0.695 0.0 1.538 0.11 2.213 0.636 c 0.714 0.555 1.087 1.446 1.087 2.664 c 0.0 1.455 -0.926 2.185 -1.575 2.672 c -0.735 0.55 -0.975 0.75 -0.975 1.153 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 c 0.0 -1.198 0.882 -1.844 1.442 -2.256 l 0.133 -0.097 c 0.626 -0.47 0.975 -0.803 0.975 -1.472 c 0.0 -0.907 -0.265 -1.291 -0.507 -1.48 c -0.281 -0.218 -0.714 -0.32 -1.293 -0.32 c -0.58 0.0 -1.012 0.102 -1.293 0.32 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.875 15.8 c 0.0 0.47 -0.38 0.85 -0.85 0.85 s -0.85 -0.38 -0.85 -0.85 s 0.38 -0.85 0.85 -0.85 s 0.85 0.38 0.85 0.85 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.237 3.362 c -4.639 0.0 -8.4 3.761 -8.4 8.4 c 0.0 0.998 0.175 1.957 0.495 2.847 c 0.185 0.513 0.234 1.005 0.115 1.432 l -0.701 2.503 c -0.292 1.042 0.668 2.002 1.71 1.71 l 2.503 -0.7 c 0.426 -0.12 0.919 -0.071 1.432 0.114 c 0.89 0.32 1.848 0.494 2.846 0.494 c 4.64 0.0 8.4 -3.76 8.4 -8.4 c 0.0 -4.639 -3.76 -8.4 -8.4 -8.4 Z m -6.9 8.4 c 0.0 -3.81 3.09 -6.9 6.9 -6.9 c 3.811 0.0 6.9 3.09 6.9 6.9 c 0.0 3.811 -3.089 6.9 -6.9 6.9 c -0.822 0.0 -1.609 -0.143 -2.338 -0.406 c -0.703 -0.253 -1.527 -0.376 -2.344 -0.147 l -2.311 0.647 l 0.647 -2.311 c 0.229 -0.818 0.105 -1.642 -0.148 -2.344 c -0.262 -0.73 -0.406 -1.517 -0.406 -2.339 Z")
        )
    }.build()
}
