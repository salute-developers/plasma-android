package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothDisabled36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothDisabled36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.122 23.967 c 0.239 0.19 0.378 0.478 0.378 0.783 c 0.0 0.305 -0.14 0.593 -0.378 0.783 l -8.5 6.75 c -0.3 0.239 -0.711 0.284 -1.057 0.117 C 17.22 32.234 17.0 31.884 17.0 31.5 V 20.304 l 2.791 -2.16 l 7.331 5.823 Z M 19.0 29.429 l 5.893 -4.679 L 19.0 20.071 v 9.358 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.565 3.6 c 0.346 -0.167 0.756 -0.122 1.057 0.117 l 6.605 5.246 l 4.854 -3.754 c 0.437 -0.338 1.065 -0.258 1.403 0.179 c 0.338 0.436 0.257 1.065 -0.18 1.403 L 4.613 27.444 c -0.436 0.338 -1.065 0.257 -1.403 -0.18 c -0.338 -0.436 -0.258 -1.064 0.179 -1.402 l 11.601 -8.976 l -6.111 -4.853 c -0.432 -0.343 -0.505 -0.973 -0.161 -1.405 c 0.343 -0.433 0.973 -0.505 1.405 -0.161 l 6.496 5.158 L 17.0 15.33 V 4.5 c 0.0 -0.384 0.22 -0.734 0.565 -0.9 Z M 19.0 13.782 l 4.6 -3.56 l -4.6 -3.65 v 7.21 Z")
        )
    }.build()
}
