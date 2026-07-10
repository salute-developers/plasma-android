package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHorizCircOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHorizCircOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.0 C 10.82 5.0 5.0 10.82 5.0 18.0 c 0.0 7.179 5.82 12.999 13.0 12.999 c 7.179 0.0 12.999 -5.82 12.999 -13.0 c 0.0 -7.179 -5.82 -12.999 -13.0 -12.999 Z M 3.0 18.0 C 3.0 9.714 9.715 3.0 18.0 3.0 c 8.283 0.0 14.999 6.715 14.999 15.0 c 0.0 8.283 -6.716 14.999 -15.0 14.999 c -8.284 0.0 -14.999 -6.716 -14.999 -15.0 Z m 10.789 -7.518 c 0.39 0.39 0.39 1.024 0.0 1.414 l -1.32 1.32 h 13.477 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 10.055 c -0.405 0.0 -0.77 -0.244 -0.924 -0.617 c -0.155 -0.374 -0.07 -0.804 0.217 -1.09 l 3.026 -3.027 c 0.391 -0.39 1.024 -0.39 1.415 0.0 Z m 8.422 13.62 c -0.39 0.391 -0.39 1.025 0.0 1.415 c 0.39 0.39 1.024 0.39 1.415 0.0 l 3.026 -3.027 c 0.286 -0.286 0.372 -0.716 0.217 -1.09 c -0.155 -0.373 -0.52 -0.617 -0.924 -0.617 h -15.89 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 H 23.53 l -1.32 1.32 Z")
        )
    }.build()
}
