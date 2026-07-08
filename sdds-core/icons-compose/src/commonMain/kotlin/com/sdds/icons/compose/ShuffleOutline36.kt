package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShuffleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShuffleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.923 6.294 c -0.39 -0.391 -1.023 -0.392 -1.414 -0.002 s -0.392 1.023 -0.002 1.414 l 2.082 2.087 h -4.022 c -2.458 0.0 -4.367 1.116 -5.956 2.651 c -1.13 1.09 -2.142 2.438 -3.104 3.804 c -2.47 -3.505 -5.493 -7.214 -10.615 -7.214 H 4.0 c -0.553 0.0 -1.001 0.448 -1.001 1.0 s 0.448 1.0 1.0 1.0 h 1.892 c 4.251 0.0 6.763 3.18 9.398 6.965 c -2.635 3.786 -5.147 6.965 -9.398 6.965 H 4.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 1.892 c 5.122 0.0 8.145 -3.708 10.615 -7.214 c 0.962 1.367 1.974 2.713 3.104 3.804 c 1.59 1.536 3.498 2.651 5.956 2.651 h 4.022 l -2.082 2.087 c -0.39 0.39 -0.389 1.024 0.002 1.414 c 0.391 0.39 1.024 0.39 1.414 -0.002 l 3.784 -3.792 c 0.39 -0.39 0.39 -1.022 0.0 -1.413 l -3.784 -3.793 c -0.39 -0.39 -1.023 -0.391 -1.414 -0.001 s -0.392 1.023 -0.002 1.414 l 2.082 2.086 h -4.022 c -1.774 0.0 -3.211 -0.78 -4.567 -2.09 C 19.845 21.0 18.812 19.566 17.724 18.0 c 1.088 -1.566 2.121 -3.0 3.276 -4.116 c 1.356 -1.31 2.793 -2.09 4.567 -2.09 h 4.022 l -2.082 2.086 c -0.39 0.391 -0.389 1.024 0.002 1.415 c 0.391 0.39 1.024 0.389 1.414 -0.002 l 3.784 -3.793 c 0.39 -0.39 0.39 -1.022 0.0 -1.413 l -3.784 -3.792 Z")
        )
    }.build()
}
