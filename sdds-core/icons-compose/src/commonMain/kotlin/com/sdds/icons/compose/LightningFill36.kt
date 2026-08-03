package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.694 3.154 c 0.458 0.269 0.666 0.822 0.498 1.327 l -3.256 9.769 h 8.939 c 0.445 0.0 0.849 0.263 1.029 0.67 c 0.18 0.407 0.103 0.882 -0.197 1.212 l -15.0 16.5 c -0.357 0.393 -0.942 0.483 -1.4 0.214 c -0.46 -0.269 -0.667 -0.822 -0.5 -1.327 l 3.257 -9.769 H 7.125 c -0.445 0.0 -0.849 -0.263 -1.029 -0.67 c -0.18 -0.407 -0.103 -0.882 0.197 -1.212 l 15.0 -16.5 c 0.357 -0.393 0.942 -0.482 1.4 -0.214 Z")
        )
    }.build()
}
