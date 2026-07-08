package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicWithLightFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicWithLightFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.704 3.563 c -0.087 -0.282 -0.485 -0.282 -0.573 0.0 l -0.304 0.982 c -0.294 0.948 -1.037 1.689 -1.986 1.98 l -0.988 0.303 c -0.283 0.087 -0.283 0.487 0.0 0.574 l 0.988 0.303 c 0.949 0.29 1.692 1.032 1.986 1.98 l 0.304 0.982 c 0.088 0.281 0.486 0.281 0.573 0.0 l 0.305 -0.983 c 0.294 -0.947 1.037 -1.688 1.986 -1.98 l 0.988 -0.302 c 0.283 -0.087 0.283 -0.487 0.0 -0.574 l -0.988 -0.303 c -0.949 -0.291 -1.692 -1.032 -1.986 -1.98 l -0.305 -0.982 Z M 8.563 11.176 c 0.113 -0.343 0.599 -0.343 0.712 0.0 l 0.415 1.256 c 0.45 1.357 1.516 2.42 2.874 2.865 l 1.265 0.414 c 0.345 0.112 0.345 0.6 0.0 0.713 l -1.265 0.414 c -1.358 0.444 -2.425 1.507 -2.874 2.864 l -0.415 1.257 c -0.113 0.343 -0.599 0.343 -0.712 0.0 l -0.416 -1.257 c -0.448 -1.357 -1.515 -2.42 -2.873 -2.864 l -1.266 -0.414 c -0.344 -0.113 -0.344 -0.6 0.0 -0.713 l 1.266 -0.414 c 1.358 -0.445 2.425 -1.508 2.873 -2.865 l 0.416 -1.256 Z m 20.794 0.812 c 1.424 -0.366 2.812 0.704 2.812 2.167 v 13.55 c 0.05 0.216 0.076 0.44 0.076 0.672 c 0.0 1.648 -1.343 2.984 -3.0 2.984 s -3.0 -1.336 -3.0 -2.985 c 0.0 -1.648 1.343 -2.984 3.0 -2.984 c 0.232 0.0 0.457 0.026 0.674 0.076 V 18.63 l -9.375 2.406 v 8.459 H 20.52 c 0.015 0.122 0.023 0.246 0.023 0.372 c 0.0 1.648 -1.343 2.984 -3.0 2.984 s -3.0 -1.336 -3.0 -2.984 s 1.343 -2.984 3.0 -2.984 c 0.259 0.0 0.51 0.033 0.75 0.094 V 16.561 c 0.0 -1.02 0.694 -1.912 1.688 -2.167 l 9.375 -2.406 Z")
        )
    }.build()
}
