package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.679 3.138 c 0.407 0.239 0.592 0.73 0.442 1.179 l -3.353 10.034 H 29.0 c 0.396 0.0 0.755 0.234 0.915 0.596 c 0.16 0.363 0.09 0.785 -0.176 1.078 L 14.567 32.674 c -0.319 0.349 -0.838 0.428 -1.246 0.188 c -0.407 -0.239 -0.592 -0.73 -0.442 -1.179 l 3.353 -10.034 H 7.0 c -0.396 0.0 -0.755 -0.234 -0.915 -0.596 c -0.16 -0.363 -0.09 -0.785 0.176 -1.078 L 21.433 3.326 c 0.319 -0.349 0.838 -0.428 1.246 -0.188 Z M 9.264 19.648 h 8.357 c 0.321 0.0 0.623 0.155 0.811 0.416 c 0.188 0.261 0.24 0.597 0.137 0.902 l -2.293 6.863 l 10.46 -11.478 h -8.357 c -0.321 0.0 -0.623 -0.154 -0.811 -0.415 c -0.188 -0.261 -0.239 -0.597 -0.137 -0.902 l 2.293 -6.863 l -10.46 11.478 Z")
        )
    }.build()
}
