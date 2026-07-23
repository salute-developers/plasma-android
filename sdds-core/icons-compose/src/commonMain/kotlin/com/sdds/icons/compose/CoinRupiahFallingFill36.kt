package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRupiahFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRupiahFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.125 5.625 C 25.125 5.004 24.621 4.5 24.0 4.5 s -1.125 0.504 -1.125 1.125 v 3.75 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 v -3.75 Z m -6.0 -1.5 C 19.125 3.504 18.621 3.0 18.0 3.0 s -1.125 0.504 -1.125 1.125 v 3.75 C 16.875 8.496 17.379 9.0 18.0 9.0 s 1.125 -0.504 1.125 -1.125 v -3.75 Z M 12.0 4.5 c 0.621 0.0 1.125 0.504 1.125 1.125 v 3.75 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -3.75 C 10.875 5.004 11.379 4.5 12.0 4.5 Z m 17.25 17.25 C 29.25 27.963 24.213 33.0 18.0 33.0 S 6.75 27.963 6.75 21.75 S 11.787 10.5 18.0 10.5 s 11.25 5.037 11.25 11.25 Z m -15.0 -6.0 c -0.414 0.0 -0.75 0.316 -0.75 0.705 c 0.0 0.39 0.336 0.706 0.75 0.706 h 2.786 c 0.914 0.0 1.585 0.367 2.04 0.86 c 0.255 0.275 0.436 0.583 0.549 0.879 h -4.678 c -0.414 0.0 -0.75 0.316 -0.75 0.705 c 0.0 0.39 0.336 0.705 0.75 0.705 h 4.678 c -0.113 0.296 -0.294 0.605 -0.549 0.88 c -0.451 0.489 -1.115 0.854 -2.018 0.86 h -0.022 h -2.414 c -0.81 0.0 -1.208 0.928 -0.624 1.456 l 5.304 4.797 c 0.298 0.27 0.773 0.261 1.06 -0.02 c 0.287 -0.28 0.278 -0.727 -0.02 -0.997 l -4.23 -3.826 h 0.924 c 1.393 0.0 2.464 -0.577 3.173 -1.345 c 0.498 -0.54 0.829 -1.183 0.974 -1.805 h 1.425 c 0.414 0.0 0.75 -0.315 0.75 -0.705 c 0.0 -0.39 -0.336 -0.705 -0.75 -0.705 h -1.425 c -0.14 -0.597 -0.45 -1.214 -0.915 -1.74 h 2.34 c 0.413 0.0 0.75 -0.315 0.75 -0.705 c 0.0 -0.39 -0.337 -0.705 -0.75 -0.705 H 14.25 Z")
        )
    }.build()
}
