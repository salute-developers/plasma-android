package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PaletteFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PaletteFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.475 1.54 c 4.2 -0.466 7.378 3.183 7.028 5.983 c 0.0 0.35 -0.35 1.925 -1.4 2.45 c -1.4 0.7 -2.712 0.0 -3.5 1.05 c -0.787 1.05 0.8 2.382 -0.35 3.15 c -2.1 1.4 -7.349 -0.732 -7.728 -5.282 c -0.321 -3.85 2.47 -6.964 5.95 -7.35 Z M 6.6 10.816 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 Z M 4.325 8.19 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 Z m 7.35 -2.8 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 Z m -6.65 -0.7 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 Z m 3.5 -1.4 c -0.58 0.0 -1.05 0.47 -1.05 1.05 c 0.0 0.58 0.47 1.05 1.05 1.05 c 0.58 0.0 1.05 -0.471 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 Z")
        )
    }.build()
}
