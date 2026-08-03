package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.096 8.28 c -0.494 -0.318 -0.57 -1.01 -0.154 -1.426 c 0.482 -0.482 1.19 -0.658 1.84 -0.459 l 6.991 2.14 l 2.779 -2.952 c 0.75 -0.797 2.01 -0.816 2.784 -0.042 c 0.774 0.774 0.755 2.035 -0.042 2.785 l -2.952 2.778 l 2.14 6.99 c 0.2 0.652 0.023 1.36 -0.458 1.841 c -0.416 0.416 -1.109 0.34 -1.426 -0.154 l -3.565 -5.562 l -2.712 2.553 v 1.199 c 0.0 0.53 -0.21 1.039 -0.586 1.414 l -0.896 0.896 c -0.131 0.131 -0.355 0.079 -0.414 -0.098 l -0.933 -2.798 l -2.798 -0.933 c -0.176 -0.059 -0.229 -0.282 -0.098 -0.414 l 0.896 -0.896 c 0.375 -0.375 0.884 -0.585 1.415 -0.585 h 1.199 l 2.552 -2.712 l -5.562 -3.566 Z")
        )
    }.build()
}
