package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlurOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlurOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.943 4.19 c 0.254 0.254 0.254 0.666 0.0 0.92 L 5.11 19.943 c -0.254 0.254 -0.666 0.254 -0.92 0.0 c -0.253 -0.254 -0.253 -0.665 0.0 -0.919 L 19.024 4.19 c 0.254 -0.253 0.665 -0.253 0.92 0.0 Z m 4.698 1.237 c 0.39 0.39 0.39 1.023 0.0 1.414 l -17.8 17.8 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 17.8 -17.8 c 0.39 -0.391 1.024 -0.391 1.414 0.0 Z m 5.934 5.933 c 0.39 0.39 0.39 1.023 0.0 1.414 l -17.8 17.8 c -0.391 0.39 -1.025 0.39 -1.415 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 17.8 -17.8 c 0.39 -0.39 1.024 -0.39 1.415 0.0 Z m 1.236 5.617 c 0.253 -0.254 0.253 -0.666 0.0 -0.92 c -0.254 -0.253 -0.666 -0.253 -0.92 0.0 L 16.058 30.892 c -0.254 0.254 -0.254 0.666 0.0 0.92 c 0.253 0.253 0.665 0.253 0.919 0.0 L 31.81 16.977 Z m -3.462 -7.911 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.391 -1.023 -0.391 -1.414 0.0 L 7.651 26.935 c -0.39 0.39 -0.39 1.024 0.0 1.415 c 0.39 0.39 1.024 0.39 1.415 0.0 L 28.349 9.066 Z m 1.607 14.037 c 0.254 0.254 0.254 0.666 0.0 0.92 l -5.933 5.933 c -0.254 0.254 -0.666 0.254 -0.92 0.0 c -0.253 -0.254 -0.253 -0.665 0.0 -0.92 l 5.934 -5.933 c 0.254 -0.253 0.665 -0.253 0.92 0.0 Z M 12.897 6.963 c 0.254 -0.253 0.254 -0.665 0.0 -0.919 c -0.254 -0.253 -0.665 -0.253 -0.92 0.0 l -5.933 5.934 c -0.253 0.254 -0.253 0.665 0.0 0.92 c 0.254 0.253 0.666 0.253 0.92 0.0 l 5.933 -5.934 Z")
        )
    }.build()
}
