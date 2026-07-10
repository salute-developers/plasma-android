package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 6.166 19.248 l -1.414 -1.414 l -2.121 2.121 l 2.121 0.707 l 1.414 -1.414 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.757 19.425 l 0.53 -0.53 c 1.71 -1.71 2.933 -2.333 3.663 -2.552 c 0.364 -0.11 0.61 -0.12 0.742 -0.113 c 0.066 0.003 0.107 0.01 0.121 0.014 h 0.002 c 0.27 0.094 0.572 0.026 0.776 -0.178 l 8.426 -8.426 c 0.258 -0.257 0.507 -0.677 0.437 -1.197 c -0.088 -0.66 -0.465 -1.777 -1.792 -3.105 c -1.327 -1.327 -2.444 -1.704 -3.104 -1.792 c -0.52 -0.07 -0.94 0.18 -1.198 0.437 l -8.426 8.426 c -0.204 0.204 -0.272 0.506 -0.178 0.776 v 0.002 c 0.004 0.015 0.011 0.055 0.015 0.122 c 0.006 0.132 -0.004 0.377 -0.113 0.741 c -0.22 0.73 -0.843 1.953 -2.552 3.663 l -0.53 0.53 l 3.181 3.182 Z m 13.2 -12.846 l -7.896 7.896 l -3.536 -3.535 l 7.896 -7.896 l 0.001 -0.002 c 0.343 0.06 1.131 0.308 2.18 1.357 c 1.048 1.048 1.296 1.836 1.356 2.179 l -0.001 0.001 Z m -9.551 8.362 l -2.347 -2.346 c -0.3 0.92 -0.97 2.131 -2.372 3.638 l 1.08 1.08 c 1.507 -1.4 2.719 -2.072 3.639 -2.372 Z")
        )
    }.build()
}
