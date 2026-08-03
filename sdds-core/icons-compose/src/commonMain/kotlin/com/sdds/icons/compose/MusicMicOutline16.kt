package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicMicOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicMicOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.723 2.5 c -1.535 0.0 -2.78 1.244 -2.78 2.78 c 0.0 1.534 1.245 2.778 2.78 2.778 c 1.536 0.0 2.78 -1.244 2.78 -2.779 S 12.259 2.5 10.723 2.5 Z m -3.78 2.78 c 0.0 -2.088 1.693 -3.78 3.78 -3.78 c 2.088 0.0 3.78 1.692 3.78 3.78 c 0.0 2.086 -1.692 3.778 -3.78 3.778 c -0.22 0.0 -0.436 -0.018 -0.645 -0.055 L 4.733 13.56 c -0.337 0.287 -0.839 0.267 -1.152 -0.046 l -0.193 -0.193 l -1.033 1.034 c -0.196 0.195 -0.512 0.195 -0.708 0.0 c -0.195 -0.196 -0.195 -0.512 0.0 -0.707 l 1.034 -1.034 l -0.195 -0.195 c -0.314 -0.313 -0.334 -0.815 -0.046 -1.152 l 4.558 -5.344 c -0.036 -0.21 -0.055 -0.425 -0.055 -0.644 Z m 0.428 1.746 C 7.728 7.711 8.29 8.272 8.974 8.63 L 4.19 12.71 l -0.9 -0.899 l 4.08 -4.784 Z")
        )
    }.build()
}
