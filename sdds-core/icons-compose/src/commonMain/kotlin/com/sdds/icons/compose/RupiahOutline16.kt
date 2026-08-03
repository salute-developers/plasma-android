package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RupiahOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RupiahOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.05 8.0 c 0.0 -3.286 2.664 -5.95 5.95 -5.95 S 13.95 4.714 13.95 8.0 S 11.286 13.95 8.0 13.95 S 2.05 11.286 2.05 8.0 Z M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z M 6.075 4.5 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 1.4 c 0.405 0.0 0.701 0.177 0.907 0.424 c 0.073 0.088 0.133 0.182 0.18 0.276 H 6.425 C 6.135 6.25 5.9 6.485 5.9 6.775 C 5.9 7.065 6.135 7.3 6.425 7.3 h 2.137 C 8.515 7.395 8.455 7.49 8.382 7.576 C 8.176 7.823 7.88 8.0 7.475 8.0 h -1.4 c -0.07 0.0 -0.139 0.014 -0.2 0.04 c -0.062 0.026 -0.12 0.064 -0.17 0.114 c -0.051 0.05 -0.09 0.108 -0.115 0.17 c -0.025 0.062 -0.04 0.13 -0.04 0.201 c 0.0 0.071 0.015 0.14 0.04 0.201 c 0.026 0.062 0.064 0.12 0.114 0.17 l 2.8 2.8 c 0.205 0.205 0.538 0.205 0.743 0.0 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 L 7.343 9.05 h 0.132 c 0.756 0.0 1.335 -0.348 1.713 -0.8 C 9.426 7.963 9.592 7.63 9.68 7.3 h 0.596 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 9.68 c -0.063 -0.238 -0.166 -0.478 -0.308 -0.7 h 0.904 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 h -4.2 Z")
        )
    }.build()
}
