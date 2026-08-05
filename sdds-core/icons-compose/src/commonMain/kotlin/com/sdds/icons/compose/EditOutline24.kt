package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EditOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EditOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.98 3.019 c -1.397 -1.398 -3.663 -1.398 -5.06 0.0 L 4.07 14.869 c -0.49 0.49 -0.836 1.107 -0.996 1.782 L 2.02 21.075 c -0.06 0.254 0.016 0.52 0.2 0.704 c 0.184 0.185 0.45 0.26 0.704 0.2 l 4.424 -1.054 c 0.675 -0.16 1.292 -0.505 1.783 -0.996 L 20.98 8.08 c 1.397 -1.397 1.397 -3.663 0.0 -5.06 Z m -4.0 1.06 c 0.812 -0.811 2.128 -0.811 2.94 0.0 c 0.811 0.812 0.811 2.128 0.0 2.94 l -0.66 0.659 c -0.285 -0.646 -0.688 -1.238 -1.194 -1.744 s -1.099 -0.91 -1.745 -1.195 l 0.66 -0.66 Z m 0.025 2.915 c 0.517 0.517 0.89 1.156 1.086 1.854 L 8.07 18.868 C 7.775 19.163 7.404 19.37 7.0 19.466 l -0.279 0.066 c -0.405 -1.029 -1.226 -1.85 -2.255 -2.255 l 0.066 -0.278 c 0.096 -0.405 0.303 -0.775 0.598 -1.07 l 10.02 -10.02 c 0.698 0.196 1.337 0.568 1.854 1.085 Z")
        )
    }.build()
}
