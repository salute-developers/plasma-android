package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Link16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Link16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.11 12.695 c -1.075 -1.074 -1.075 -2.816 0.0 -3.89 L 4.56 7.353 c 0.196 -0.196 0.196 -0.512 0.0 -0.707 c -0.195 -0.196 -0.511 -0.196 -0.707 0.0 L 2.402 8.097 c -1.465 1.465 -1.465 3.84 0.0 5.306 c 1.465 1.465 3.84 1.464 5.306 0.0 L 9.16 11.95 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.708 0.0 L 7.0 12.695 c -1.074 1.075 -2.816 1.075 -3.89 0.0 Z m 3.495 -8.8 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 L 8.764 3.15 c 1.075 -1.074 2.817 -1.074 3.891 0.0 c 1.075 1.074 1.075 2.816 0.0 3.89 l -1.452 1.453 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 1.452 -1.452 c 1.465 -1.465 1.465 -3.84 0.0 -5.305 c -1.465 -1.465 -3.84 -1.465 -5.305 0.0 L 6.605 3.895 Z M 4.78 10.319 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.196 0.512 0.196 0.707 0.0 l 5.502 -5.501 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.196 -0.196 -0.512 -0.196 -0.707 0.0 l -5.502 5.501 Z")
        )
    }.build()
}
