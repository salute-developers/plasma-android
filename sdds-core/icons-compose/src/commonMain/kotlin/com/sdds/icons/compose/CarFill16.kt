package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CarFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CarFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.125 2.25 h 3.75 c 0.771 0.0 1.303 0.0 1.77 0.183 c 0.41 0.162 0.772 0.424 1.054 0.763 c 0.25 0.302 0.407 0.677 0.58 1.179 h 0.496 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -0.149 l 0.287 0.871 C 14.565 6.696 15.0 7.416 15.0 8.236 v 4.289 c 0.0 0.676 -0.548 1.225 -1.225 1.225 s -1.225 -0.549 -1.225 -1.225 V 11.98 h -9.1 v 0.545 c 0.0 0.676 -0.548 1.225 -1.225 1.225 S 1.0 13.201 1.0 12.525 V 8.237 c 0.0 -0.821 0.435 -1.54 1.087 -1.94 l 0.287 -0.872 h -0.15 C 1.935 5.425 1.7 5.19 1.7 4.9 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 0.497 c 0.172 -0.502 0.328 -0.877 0.58 -1.18 c 0.281 -0.338 0.644 -0.6 1.054 -0.762 C 4.822 2.25 5.354 2.25 6.126 2.25 Z m 6.337 2.998 l 0.236 0.714 H 3.303 l 0.235 -0.714 c 0.288 -0.873 0.394 -1.169 0.57 -1.38 c 0.17 -0.204 0.387 -0.361 0.633 -0.458 c 0.256 -0.101 0.57 -0.11 1.49 -0.11 H 9.77 c 0.918 0.0 1.233 0.009 1.489 0.11 c 0.246 0.097 0.463 0.254 0.633 0.458 c 0.176 0.211 0.283 0.507 0.57 1.38 Z M 11.8 9.732 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z m -6.7 -1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z m 1.858 -0.647 c -0.391 0.0 -0.708 0.317 -0.708 0.708 c 0.0 0.39 0.317 0.708 0.708 0.708 h 2.084 c 0.391 0.0 0.708 -0.317 0.708 -0.708 c 0.0 -0.39 -0.317 -0.708 -0.708 -0.708 H 6.958 Z")
        )
    }.build()
}
