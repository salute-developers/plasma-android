package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortAlphabetAsc36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortAlphabetAsc36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.093 17.402 H 6.789 l 5.069 -14.55 h 2.353 l 5.0 14.55 H 17.01 l -1.216 -3.583 h -5.469 l -1.232 3.583 Z m 5.932 -5.878 l -1.949 -5.756 l -1.963 5.756 h 3.912 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.304 20.912 c -0.396 0.385 -0.406 1.018 -0.022 1.414 l 3.75 3.871 c 0.188 0.195 0.447 0.305 0.718 0.305 c 0.27 0.0 0.53 -0.11 0.718 -0.305 l 3.75 -3.87 c 0.384 -0.397 0.375 -1.03 -0.022 -1.415 c -0.397 -0.384 -1.03 -0.374 -1.414 0.023 l -2.032 2.097 v -12.53 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 12.53 l -2.032 -2.097 c -0.384 -0.397 -1.017 -0.407 -1.414 -0.023 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.388 33.152 l 2.803 -4.69 c 0.144 0.018 0.287 0.028 0.43 0.028 h 2.789 v 4.662 h 2.24 v -14.55 h -4.484 c -1.822 0.0 -3.235 0.411 -4.215 1.258 c -0.985 0.85 -1.466 2.112 -1.466 3.757 c 0.0 1.111 0.215 2.042 0.655 2.784 c 0.414 0.696 1.02 1.216 1.813 1.562 L 6.73 33.152 h 2.658 Z m 3.742 -6.937 c -1.198 0.0 -2.042 -0.196 -2.56 -0.561 c -0.491 -0.369 -0.754 -1.0 -0.754 -1.935 c 0.0 -1.062 0.283 -1.774 0.811 -2.181 c 0.556 -0.42 1.383 -0.641 2.502 -0.641 h 2.28 v 5.318 h -2.28 Z")
        )
    }.build()
}
