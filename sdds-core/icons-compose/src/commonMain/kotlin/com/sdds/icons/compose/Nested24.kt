package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Nested24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Nested24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 3.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.0 c 0.0 1.413 0.0 2.427 0.066 3.223 c 0.064 0.787 0.188 1.295 0.397 1.707 c 0.408 0.8 1.058 1.45 1.858 1.857 c 0.411 0.21 0.919 0.333 1.706 0.397 c 0.796 0.065 1.81 0.066 3.223 0.066 h 6.19 l -3.493 -3.493 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 4.773 4.773 c 0.293 0.293 0.293 0.767 0.0 1.06 l -4.773 4.773 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 3.492 -3.493 h -6.223 c -1.371 0.0 -2.447 0.0 -3.311 -0.07 c -0.88 -0.072 -1.607 -0.221 -2.265 -0.557 c -1.082 -0.551 -1.962 -1.43 -2.513 -2.513 c -0.336 -0.658 -0.484 -1.385 -0.556 -2.265 C 3.25 8.481 3.25 7.405 3.25 6.034 V 4.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
