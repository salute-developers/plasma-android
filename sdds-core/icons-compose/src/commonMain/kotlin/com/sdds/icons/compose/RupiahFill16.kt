package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RupiahFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RupiahFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 6.075 4.5 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 1.4 c 0.404 0.0 0.7 0.177 0.907 0.424 c 0.073 0.087 0.133 0.181 0.18 0.276 H 6.425 C 6.135 6.25 5.9 6.485 5.9 6.775 C 5.9 7.065 6.135 7.3 6.425 7.3 h 2.137 c -0.047 0.095 -0.107 0.189 -0.18 0.276 C 8.176 7.823 7.88 8.0 7.475 8.0 h -1.4 c -0.071 0.0 -0.14 0.014 -0.201 0.04 c -0.062 0.025 -0.12 0.063 -0.17 0.114 c -0.05 0.05 -0.089 0.108 -0.114 0.17 c -0.026 0.062 -0.04 0.13 -0.04 0.201 c 0.0 0.071 0.014 0.14 0.04 0.201 c 0.025 0.062 0.063 0.12 0.114 0.17 l 2.8 2.8 c 0.205 0.205 0.537 0.205 0.742 0.0 c 0.205 -0.205 0.205 -0.537 0.0 -0.742 L 7.342 9.05 h 0.133 c 0.756 0.0 1.334 -0.348 1.713 -0.8 c 0.238 -0.286 0.404 -0.62 0.49 -0.95 h 0.597 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 9.679 C 9.616 6.012 9.512 5.772 9.37 5.55 h 0.905 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 h -4.2 Z")
        )
    }.build()
}
