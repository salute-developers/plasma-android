package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCw24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCw24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 s 3.806 8.5 8.5 8.5 c 3.52 0.0 6.543 -2.14 7.834 -5.195 c 0.16 -0.381 0.6 -0.56 0.982 -0.399 c 0.382 0.162 0.56 0.602 0.4 0.983 C 19.698 19.48 16.144 22.0 12.0 22.0 C 6.477 22.0 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 c 3.59 0.0 6.736 1.891 8.5 4.73 V 4.806 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 S 22.0 4.39 22.0 4.806 v 3.597 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -3.597 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 1.653 C 17.822 5.165 15.105 3.5 12.0 3.5 Z")
        )
    }.build()
}
