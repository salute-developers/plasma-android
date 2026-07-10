package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Curve16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Curve16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.882 3.22 c 0.216 0.172 0.25 0.486 0.078 0.702 l -3.803 4.746 C 10.532 9.447 9.41 9.61 8.59 9.04 L 6.98 7.923 C 6.593 7.653 6.061 7.731 5.766 8.1 l -3.803 4.746 c -0.173 0.215 -0.487 0.25 -0.703 0.077 c -0.215 -0.172 -0.25 -0.487 -0.077 -0.703 l 3.802 -4.745 c 0.625 -0.78 1.746 -0.943 2.567 -0.373 L 9.16 8.219 c 0.388 0.27 0.92 0.192 1.215 -0.177 l 3.803 -4.745 c 0.173 -0.216 0.488 -0.25 0.703 -0.078 Z")
        )
    }.build()
}
