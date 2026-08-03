package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.17 5.085 L 5.69 2.001 h 4.62 L 9.833 5.085 c -0.093 0.594 0.057 1.2 0.414 1.684 l 1.464 1.977 c 0.097 0.132 0.003 0.32 -0.161 0.32 H 4.452 c -0.164 0.0 -0.258 -0.188 -0.16 -0.32 L 5.754 6.77 c 0.357 -0.484 0.507 -1.09 0.414 -1.684 Z M 5.514 1.001 c -0.521 0.0 -0.92 0.465 -0.84 0.98 l 0.506 3.257 c 0.051 0.33 -0.032 0.667 -0.23 0.936 L 3.487 8.152 c -0.586 0.792 -0.02 1.913 0.965 1.913 H 7.32 v 3.883 L 8.0 15.0 l 0.682 -1.052 v -3.883 h 2.867 c 0.985 0.0 1.55 -1.121 0.965 -1.913 L 11.05 6.174 c -0.199 -0.269 -0.281 -0.605 -0.23 -0.936 l 0.506 -3.257 c 0.08 -0.515 -0.319 -0.98 -0.84 -0.98 H 5.515 Z")
        )
    }.build()
}
