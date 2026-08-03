package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.75 4.293 c 0.39 -0.39 1.023 -0.39 1.413 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 L 9.64 24.4 c -3.049 -3.212 -5.39 -6.865 -5.39 -10.665 c 0.0 -3.26 2.806 -7.236 7.378 -7.236 c 2.554 0.0 4.735 2.024 6.372 3.947 C 19.637 8.524 21.82 6.5 24.372 6.5 c 0.975 0.0 1.869 0.181 2.672 0.497 l 2.705 -2.704 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.211 9.419 c 0.997 1.311 1.54 2.883 1.54 4.317 c 0.0 5.786 -5.428 11.231 -10.52 15.301 c -1.08 0.864 -1.621 1.297 -2.307 1.486 c -0.566 0.157 -1.282 0.157 -1.848 0.0 c -0.686 -0.19 -1.227 -0.622 -2.308 -1.486 c -0.757 -0.605 -1.521 -1.24 -2.274 -1.902 L 30.212 9.419 Z")
        )
    }.build()
}
