package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HelpCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HelpCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -2.403 -21.518 c -0.49 0.381 -0.972 1.126 -0.972 2.768 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 c 0.0 -2.108 0.644 -3.613 1.84 -4.544 c 1.14 -0.887 2.573 -1.081 3.785 -1.081 c 1.212 0.0 2.645 0.194 3.784 1.08 c 1.197 0.932 1.841 2.437 1.841 4.545 c 0.0 2.465 -1.557 3.7 -2.7 4.556 c -1.27 0.953 -1.8 1.364 -1.8 2.194 c 0.0 0.621 -0.504 1.125 -1.125 1.125 S 16.875 21.621 16.875 21.0 c 0.0 -2.007 1.472 -3.09 2.468 -3.822 l 0.232 -0.172 c 1.107 -0.83 1.8 -1.47 1.8 -2.756 c 0.0 -1.642 -0.481 -2.387 -0.972 -2.768 c -0.548 -0.426 -1.365 -0.607 -2.403 -0.607 s -1.855 0.18 -2.403 0.607 Z M 19.5 24.75 c 0.0 0.828 -0.672 1.5 -1.5 1.5 s -1.5 -0.672 -1.5 -1.5 s 0.672 -1.5 1.5 -1.5 s 1.5 0.672 1.5 1.5 Z")
        )
    }.build()
}
