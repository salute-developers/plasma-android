package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.448 2.216 c 0.336 -0.22 0.768 -0.22 1.104 0.0 c 0.39 0.256 1.598 1.025 3.087 1.727 C 17.15 4.655 18.85 5.25 20.25 5.25 C 20.664 5.25 21.0 5.586 21.0 6.0 c 0.0 7.014 -2.03 11.015 -4.214 13.272 c -2.17 2.244 -4.4 2.674 -4.652 2.716 h -0.001 h -0.004 l -0.02 0.004 C 12.089 21.995 12.049 22.0 12.0 22.0 c -0.05 0.0 -0.089 -0.005 -0.109 -0.008 l -0.02 -0.003 l -0.005 -0.001 c -0.252 -0.043 -2.482 -0.472 -4.652 -2.716 C 5.03 17.015 3.0 13.014 3.0 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 c 1.4 0.0 3.1 -0.595 4.61 -1.307 c 1.49 -0.702 2.698 -1.47 3.088 -1.727 Z M 12.0 3.646 c -0.572 0.363 -1.68 1.031 -3.0 1.653 c -1.333 0.629 -2.957 1.246 -4.493 1.41 c 0.043 2.046 0.271 3.788 0.621 5.27 l 6.628 -3.836 C 11.752 8.096 11.75 8.048 11.75 8.0 c 0.0 -0.967 0.784 -1.75 1.75 -1.75 S 15.25 7.033 15.25 8.0 c 0.0 0.966 -0.784 1.75 -1.75 1.75 c -0.369 0.0 -0.71 -0.114 -0.993 -0.309 l -6.96 4.03 c 0.73 2.215 1.748 3.727 2.745 4.758 c 1.626 1.682 3.264 2.154 3.708 2.256 c 0.444 -0.102 2.082 -0.574 3.708 -2.256 c 1.2 -1.24 2.43 -3.18 3.153 -6.203 l -6.617 3.83 c 0.004 0.048 0.006 0.096 0.006 0.144 c 0.0 0.966 -0.784 1.75 -1.75 1.75 S 8.75 16.966 8.75 16.0 c 0.0 -0.967 0.784 -1.75 1.75 -1.75 c 0.369 0.0 0.71 0.114 0.993 0.309 l 7.735 -4.479 c 0.146 -1.02 0.239 -2.141 0.265 -3.372 C 17.957 6.545 16.333 5.928 15.0 5.3 c -1.32 -0.622 -2.428 -1.29 -3.0 -1.654 Z")
        )
    }.build()
}
