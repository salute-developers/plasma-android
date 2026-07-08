package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.98 3.807 c -0.125 -0.574 0.312 -1.118 0.9 -1.118 c 0.68 0.0 1.306 0.376 1.625 0.978 l 3.43 6.456 L 18.987 10.0 c 1.095 -0.033 2.0 0.845 2.0 1.94 c 0.0 1.094 -0.905 1.972 -2.0 1.939 l -4.052 -0.123 l -3.43 6.456 c -0.319 0.602 -0.944 0.977 -1.625 0.977 c -0.588 0.0 -1.025 -0.543 -0.9 -1.117 l 1.413 -6.454 l -3.723 -0.112 l -0.848 0.848 c -0.375 0.375 -0.884 0.586 -1.414 0.586 H 3.141 c -0.186 0.0 -0.307 -0.196 -0.224 -0.362 l 1.32 -2.638 L 2.916 9.3 C 2.834 9.135 2.955 8.94 3.141 8.94 h 1.267 c 0.53 0.0 1.04 0.211 1.414 0.586 l 0.848 0.848 l 3.723 -0.112 L 8.98 3.807 Z")
        )
    }.build()
}
