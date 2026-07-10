package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Bluetooth36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Bluetooth36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.565 3.6 c 0.346 -0.167 0.756 -0.122 1.057 0.117 l 8.5 6.75 c 0.239 0.19 0.378 0.478 0.378 0.783 c 0.0 0.305 -0.14 0.593 -0.378 0.783 L 19.608 18.0 l 7.514 5.967 c 0.239 0.19 0.378 0.478 0.378 0.783 c 0.0 0.305 -0.14 0.593 -0.378 0.783 l -8.5 6.75 c -0.3 0.239 -0.711 0.284 -1.057 0.117 C 17.22 32.235 17.0 31.885 17.0 31.5 V 20.071 l -6.878 5.462 c -0.433 0.344 -1.062 0.271 -1.405 -0.161 c -0.344 -0.433 -0.271 -1.062 0.161 -1.405 L 16.392 18.0 l -7.514 -5.967 c -0.432 -0.343 -0.505 -0.972 -0.161 -1.405 c 0.343 -0.432 0.972 -0.505 1.405 -0.161 L 17.0 15.929 V 4.5 c 0.0 -0.384 0.22 -0.734 0.565 -0.9 Z M 19.0 20.07 l 5.892 4.679 L 19.0 29.429 V 20.07 Z m 0.0 -4.142 V 6.57 l 5.892 4.679 L 19.0 15.929 Z")
        )
    }.build()
}
