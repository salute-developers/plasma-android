package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCcw24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCcw24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.5 6.73 C 5.264 3.89 8.41 2.0 12.0 2.0 c 5.523 0.0 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 c -4.145 0.0 -7.699 -2.521 -9.215 -6.11 c -0.162 -0.382 0.017 -0.822 0.399 -0.984 c 0.381 -0.16 0.821 0.018 0.982 0.4 C 5.456 18.358 8.48 20.5 12.0 20.5 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 16.694 3.5 12.0 3.5 c -3.105 0.0 -5.822 1.665 -7.306 4.153 h 1.653 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.492 H 3.458 H 2.75 C 2.336 9.153 2.0 8.817 2.0 8.403 V 4.806 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 S 3.5 4.39 3.5 4.806 V 6.73 Z")
        )
    }.build()
}
