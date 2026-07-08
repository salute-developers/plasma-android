package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SendFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SendFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.704 8.466 C 14.884 8.378 15.0 8.198 15.0 8.0 s -0.115 -0.378 -0.296 -0.466 L 1.767 1.304 c -0.201 -0.097 -0.442 -0.06 -0.604 0.09 C 1.002 1.547 0.955 1.78 1.046 1.98 l 2.0 4.397 l 3.74 1.46 c 0.148 0.059 0.148 0.269 0.0 0.327 l -3.74 1.46 l -2.0 4.396 c -0.091 0.2 -0.044 0.434 0.117 0.585 c 0.162 0.152 0.403 0.188 0.604 0.091 l 12.937 -6.23 Z")
        )
    }.build()
}
