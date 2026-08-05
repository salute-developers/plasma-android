package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageQuestionFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageQuestionFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.237 3.476 c -4.577 0.0 -8.287 3.71 -8.287 8.287 c 0.0 0.985 0.172 1.93 0.488 2.809 c 0.19 0.527 0.245 1.044 0.117 1.5 l -0.7 2.503 c -0.269 0.957 0.613 1.84 1.57 1.571 l 2.504 -0.7 c 0.455 -0.128 0.973 -0.073 1.5 0.116 c 0.878 0.317 1.824 0.489 2.808 0.489 c 4.577 0.0 8.288 -3.71 8.288 -8.288 c 0.0 -4.577 -3.71 -8.287 -8.288 -8.287 Z M 12.875 15.8 c 0.0 0.47 -0.381 0.85 -0.85 0.85 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 s 0.38 -0.85 0.85 -0.85 c 0.469 0.0 0.85 0.38 0.85 0.85 Z m -2.65 -5.95 c 0.0 -0.907 0.264 -1.291 0.507 -1.48 c 0.28 -0.219 0.713 -0.32 1.293 -0.32 c 0.579 0.0 1.011 0.101 1.292 0.32 c 0.243 0.189 0.508 0.573 0.508 1.48 c 0.0 0.67 -0.35 1.002 -0.975 1.472 l -0.133 0.098 c -0.56 0.41 -1.442 1.058 -1.442 2.255 c 0.0 0.414 0.335 0.75 0.75 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.403 0.24 -0.602 0.975 -1.153 c 0.649 -0.487 1.575 -1.217 1.575 -2.672 c 0.0 -1.218 -0.373 -2.11 -1.087 -2.664 c -0.675 -0.525 -1.518 -0.636 -2.213 -0.636 c -0.696 0.0 -1.539 0.11 -2.214 0.636 C 9.097 7.742 8.725 8.633 8.725 9.85 c 0.0 0.414 0.335 0.75 0.75 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 Z")
        )
    }.build()
}
