package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.254 29.625 l -4.812 -4.824 l 0.802 -0.804 c 2.585 -2.593 3.528 -4.446 3.86 -5.554 c 0.164 -0.55 0.18 -0.924 0.17 -1.124 l -0.001 -0.018 l 7.462 7.48 h -0.019 c -0.2 -0.01 -0.571 0.005 -1.121 0.17 c -1.104 0.333 -2.953 1.278 -5.54 3.87 l -0.801 0.804 Z m 9.617 -5.889 l -8.556 -8.576 l 11.95 -11.98 c 0.389 -0.39 1.024 -0.767 1.81 -0.662 c 1.0 0.133 2.688 0.705 4.695 2.717 c 2.007 2.013 2.578 3.705 2.71 4.707 c 0.105 0.788 -0.271 1.425 -0.66 1.815 l -11.95 11.98 Z m -12.024 5.62 l -2.139 -2.144 L 3.5 30.428 L 6.708 31.5 l 2.139 -2.144 Z")
        )
    }.build()
}
