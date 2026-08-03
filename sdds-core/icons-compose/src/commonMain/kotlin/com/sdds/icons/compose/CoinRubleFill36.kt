package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.33 26.353 c 1.448 -2.155 2.293 -4.748 2.293 -7.537 c 0.0 -7.492 -6.098 -13.566 -13.621 -13.566 c -7.523 0.0 -13.621 6.074 -13.621 13.567 c 0.0 2.788 0.845 5.38 2.294 7.536 h 8.435 v -2.391 h -1.27 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 1.27 v -1.769 h -1.27 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 1.27 V 12.41 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.419 c 2.425 0.0 4.392 1.966 4.392 4.392 c 0.0 2.425 -1.967 4.391 -4.392 4.391 H 17.11 v 1.769 h 2.784 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 17.11 v 2.391 h 12.22 Z m -12.22 -8.16 h 2.419 c 1.32 0.0 2.392 -1.07 2.392 -2.391 s -1.071 -2.392 -2.392 -2.392 H 17.11 v 4.783 Z M 4.0 28.745 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
    }.build()
}
