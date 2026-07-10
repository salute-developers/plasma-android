package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightningOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightningOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.146 1.067 c 0.205 0.118 0.3 0.363 0.226 0.588 L 8.862 6.27 H 13.0 c 0.197 0.0 0.376 0.116 0.456 0.296 c 0.08 0.18 0.048 0.39 -0.083 0.537 l -6.896 7.73 c -0.158 0.176 -0.418 0.218 -0.623 0.1 c -0.205 -0.118 -0.3 -0.364 -0.226 -0.588 l 1.51 -4.615 H 3.0 c -0.197 0.0 -0.376 -0.116 -0.456 -0.296 c -0.08 -0.18 -0.048 -0.39 0.083 -0.537 l 6.896 -7.73 c 0.158 -0.176 0.418 -0.218 0.623 -0.1 Z M 4.116 8.73 h 3.712 c 0.16 0.0 0.31 0.077 0.404 0.206 c 0.094 0.13 0.12 0.297 0.07 0.45 l -0.98 2.997 l 4.562 -5.113 H 8.172 c -0.16 0.0 -0.31 -0.077 -0.404 -0.206 c -0.094 -0.13 -0.12 -0.297 -0.07 -0.45 l 0.98 -2.997 L 4.116 8.73 Z")
        )
    }.build()
}
