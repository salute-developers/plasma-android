package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClockCircleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClockCircleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 8.525 4.85 C 8.525 4.56 8.29 4.325 8.0 4.325 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 3.5 c 0.0 0.176 0.088 0.34 0.234 0.437 l 2.1 1.4 c 0.241 0.16 0.567 0.096 0.728 -0.146 c 0.16 -0.241 0.095 -0.567 -0.146 -0.728 L 8.525 8.07 V 4.85 Z")
        )
    }.build()
}
