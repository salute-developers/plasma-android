package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WavesCross36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WavesCross36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.815 5.456 c 0.439 -0.336 1.066 -0.252 1.402 0.186 c 2.716 3.545 4.188 7.889 4.188 12.357 c 0.0 4.469 -1.472 8.812 -4.188 12.358 c -0.336 0.438 -0.963 0.521 -1.402 0.186 c -0.438 -0.336 -0.521 -0.964 -0.186 -1.402 c 2.449 -3.196 3.776 -7.113 3.776 -11.142 c 0.0 -4.029 -1.328 -7.945 -3.776 -11.14 c -0.335 -0.44 -0.252 -1.067 0.186 -1.403 Z m 9.074 7.295 c -0.39 -0.39 -1.023 -0.391 -1.414 0.0 c -0.39 0.39 -0.391 1.022 -0.001 1.413 L 25.302 18.0 l -3.828 3.835 c -0.39 0.39 -0.39 1.024 0.001 1.414 c 0.391 0.39 1.024 0.39 1.414 -0.001 l 3.826 -3.832 l 3.826 3.832 c 0.39 0.39 1.023 0.391 1.414 0.001 c 0.39 -0.39 0.391 -1.023 0.001 -1.414 l -3.828 -3.835 l 3.828 -3.835 c 0.39 -0.39 0.39 -1.024 -0.001 -1.414 c -0.391 -0.39 -1.024 -0.39 -1.414 0.001 l -3.826 3.833 l -3.826 -3.833 Z M 5.616 14.472 C 5.34 13.994 4.73 13.83 4.251 14.105 c -0.479 0.276 -0.643 0.887 -0.368 1.366 c 0.443 0.768 0.677 1.64 0.677 2.528 c 0.0 0.888 -0.234 1.76 -0.677 2.528 c -0.275 0.479 -0.111 1.09 0.368 1.366 c 0.478 0.276 1.09 0.111 1.365 -0.367 c 0.618 -1.072 0.944 -2.289 0.944 -3.527 s -0.326 -2.454 -0.944 -3.527 Z M 10.2 9.788 C 9.864 9.35 9.236 9.267 8.798 9.603 c -0.438 0.335 -0.522 0.963 -0.186 1.402 c 1.537 2.006 2.37 4.464 2.37 6.994 c 0.0 2.53 -0.833 4.988 -2.37 6.994 c -0.336 0.439 -0.252 1.067 0.186 1.402 c 0.438 0.336 1.066 0.253 1.402 -0.185 c 1.804 -2.356 2.782 -5.242 2.782 -8.211 c 0.0 -2.969 -0.978 -5.855 -2.782 -8.21 Z")
        )
    }.build()
}
