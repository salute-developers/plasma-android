package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 10.0 c 0.0 -4.418 3.582 -8.0 8.0 -8.0 s 8.0 3.582 8.0 8.0 c 0.0 2.732 -1.37 5.144 -3.458 6.586 c -0.402 0.278 -0.659 0.64 -0.724 1.013 l -0.288 1.629 c -0.191 1.084 -1.002 1.926 -2.03 2.188 v 0.334 c 0.0 0.69 -0.56 1.25 -1.25 1.25 h -0.5 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -0.334 c -1.028 -0.262 -1.839 -1.104 -2.03 -2.188 l -0.288 -1.629 c -0.066 -0.373 -0.322 -0.735 -0.724 -1.013 C 5.37 15.144 4.0 12.732 4.0 10.0 Z m 8.0 -6.5 c -3.59 0.0 -6.5 2.91 -6.5 6.5 c 0.0 2.158 1.051 4.07 2.672 5.254 c 0.026 -0.003 0.052 -0.004 0.078 -0.004 h 7.5 c 0.026 0.0 0.052 0.001 0.078 0.004 C 17.449 14.071 18.5 12.158 18.5 10.0 c 0.0 -3.59 -2.91 -6.5 -6.5 -6.5 Z M 9.66 17.339 c -0.037 -0.208 -0.097 -0.404 -0.175 -0.589 h 5.03 c -0.078 0.185 -0.138 0.381 -0.175 0.589 l -0.287 1.628 C 13.948 19.565 13.429 20.0 12.822 20.0 h -1.644 c -0.607 0.0 -1.126 -0.435 -1.231 -1.033 L 9.66 17.34 Z")
        )
    }.build()
}
