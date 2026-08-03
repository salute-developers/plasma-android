package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.227 26.25 c 1.436 -2.145 2.273 -4.725 2.273 -7.5 c 0.0 -7.456 -6.044 -13.5 -13.5 -13.5 S 4.5 11.294 4.5 18.75 c 0.0 2.775 0.837 5.355 2.273 7.5 H 18.66 l -5.454 -5.454 c -0.022 -0.022 -0.042 -0.043 -0.06 -0.066 c -0.242 -0.206 -0.395 -0.513 -0.395 -0.855 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 3.0 c 0.866 0.0 1.501 -0.38 1.944 -0.909 c 0.156 -0.187 0.284 -0.388 0.385 -0.591 h -4.579 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 S 14.004 15.0 14.625 15.0 h 4.58 c -0.102 -0.203 -0.23 -0.404 -0.386 -0.591 c -0.443 -0.53 -1.078 -0.909 -1.944 -0.909 h -3.0 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 s 0.504 -1.125 1.125 -1.125 h 9.0 c 0.621 0.0 1.125 0.504 1.125 1.125 S 23.496 13.5 22.875 13.5 h -1.939 c 0.305 0.476 0.527 0.99 0.662 1.5 h 1.277 C 23.496 15.0 24.0 15.504 24.0 16.125 s -0.504 1.125 -1.125 1.125 h -1.277 c -0.187 0.708 -0.542 1.423 -1.053 2.034 c -0.811 0.97 -2.05 1.716 -3.67 1.716 h -0.284 l 4.08 4.08 c 0.316 0.316 0.405 0.774 0.265 1.17 h 8.29 Z M 4.125 28.5 C 3.504 28.5 3.0 29.004 3.0 29.625 s 0.504 1.125 1.125 1.125 h 27.75 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 32.496 28.5 31.875 28.5 H 4.125 Z")
        )
    }.build()
}
