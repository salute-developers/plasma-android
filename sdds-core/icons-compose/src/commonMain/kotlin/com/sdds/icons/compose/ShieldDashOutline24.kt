package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.055 4.884 c -0.81 -0.24 -1.638 -0.575 -2.416 -0.941 c -1.489 -0.702 -2.697 -1.47 -3.087 -1.727 c -0.336 -0.22 -0.768 -0.22 -1.104 0.0 c -0.39 0.256 -1.598 1.025 -3.087 1.727 C 6.85 4.655 5.15 5.25 3.75 5.25 C 3.336 5.25 3.0 5.586 3.0 6.0 c 0.0 5.293 1.157 8.87 2.662 11.277 l -2.678 2.678 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 16.97 -16.97 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.294 -0.767 -0.294 -1.06 0.0 l -1.9 1.899 Z M 12.0 3.645 C 11.428 4.01 10.32 4.677 9.0 5.3 C 7.667 5.928 6.043 6.545 4.507 6.71 c 0.093 4.436 1.056 7.441 2.248 9.476 l 10.11 -10.111 C 16.21 5.842 15.577 5.572 15.0 5.299 c -1.32 -0.622 -2.428 -1.29 -3.0 -1.654 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.564 19.618 l 1.06 -1.061 c 1.512 1.416 2.963 1.833 3.376 1.928 c 0.444 -0.102 2.082 -0.574 3.708 -2.256 c 1.693 -1.75 3.447 -4.89 3.747 -10.502 L 21.0 6.182 c -0.035 6.902 -2.05 10.852 -4.214 13.09 c -2.17 2.244 -4.4 2.674 -4.652 2.716 h -0.001 h -0.004 l -0.02 0.004 C 12.089 21.995 12.049 22.0 12.0 22.0 c -0.05 0.0 -0.089 -0.005 -0.109 -0.008 l -0.01 -0.002 l -0.01 -0.001 l -0.005 -0.001 c -0.238 -0.04 -2.249 -0.427 -4.302 -2.37 Z")
        )
    }.build()
}
