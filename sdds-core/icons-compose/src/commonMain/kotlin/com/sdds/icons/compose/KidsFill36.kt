package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.17 20.982 C 29.811 27.003 24.43 31.5 18.0 31.5 S 6.188 27.003 4.83 20.982 C 4.722 20.994 4.612 21.0 4.5 21.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 s 1.343 -3.0 3.0 -3.0 c 0.112 0.0 0.222 0.006 0.33 0.018 C 6.188 8.997 11.57 4.5 18.0 4.5 s 11.812 4.497 13.17 10.518 C 31.277 15.006 31.387 15.0 31.5 15.0 c 1.657 0.0 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 c -0.112 0.0 -0.222 -0.006 -0.33 -0.018 Z M 10.0 16.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 s -0.895 -2.0 -2.0 -2.0 s -2.0 0.895 -2.0 2.0 s 0.895 2.0 2.0 2.0 Z m 18.0 -2.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 Z m -6.465 2.52 c -0.474 0.475 -1.04 0.85 -1.661 1.101 c -0.623 0.252 -1.29 0.375 -1.96 0.364 c -0.671 -0.012 -1.333 -0.159 -1.946 -0.431 c -0.613 -0.273 -1.165 -0.666 -1.623 -1.157 l -1.462 1.365 c 0.64 0.686 1.414 1.237 2.272 1.62 c 0.859 0.38 1.785 0.586 2.724 0.602 c 0.94 0.016 1.873 -0.157 2.744 -0.509 c 0.871 -0.352 1.662 -0.876 2.327 -1.54 l -1.415 -1.414 Z")
        )
    }.build()
}
