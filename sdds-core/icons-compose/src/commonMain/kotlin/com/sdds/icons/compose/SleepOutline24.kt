package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.201 3.458 l 0.027 0.017 C 20.09 5.232 22.002 8.393 22.002 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 c -3.607 0.0 -6.768 -1.91 -8.526 -4.772 l -0.017 -0.027 c -0.154 -0.251 -0.296 -0.482 -0.39 -0.674 c -0.087 -0.174 -0.228 -0.487 -0.16 -0.845 c 0.079 -0.414 0.355 -0.756 0.744 -0.919 c 0.2 -0.084 0.392 -0.085 0.526 -0.074 c 0.137 0.011 0.274 0.042 0.397 0.076 c 0.237 0.064 0.539 0.171 0.888 0.295 l 0.028 0.01 c 0.784 0.279 1.629 0.43 2.51 0.43 c 4.142 0.0 7.5 -3.357 7.5 -7.5 c 0.0 -0.881 -0.152 -1.726 -0.43 -2.51 l -0.01 -0.028 c -0.124 -0.35 -0.231 -0.651 -0.296 -0.888 c -0.033 -0.123 -0.064 -0.26 -0.076 -0.397 c -0.011 -0.134 -0.01 -0.326 0.075 -0.526 c 0.163 -0.389 0.505 -0.666 0.918 -0.744 c 0.358 -0.068 0.672 0.073 0.846 0.16 c 0.192 0.094 0.422 0.236 0.673 0.39 Z M 16.39 4.719 c 0.029 0.082 0.06 0.172 0.096 0.27 C 16.819 5.932 17.0 6.946 17.0 8.001 c 0.0 4.971 -4.03 9.0 -9.0 9.0 c -1.055 0.0 -2.069 -0.181 -3.012 -0.516 L 4.72 16.39 c 0.012 0.017 0.023 0.035 0.034 0.054 C 6.25 18.88 8.936 20.5 12.001 20.5 c 4.695 0.0 8.5 -3.805 8.5 -8.5 c 0.0 -3.065 -1.622 -5.752 -4.058 -7.248 L 16.39 4.719 Z")
        )
    }.build()
}
