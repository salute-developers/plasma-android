package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 11.0 C 4.224 11.0 4.0 11.224 4.0 11.5 v 0.007 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 11.5 C 5.0 11.224 4.776 11.0 4.5 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.1 1.2 c -0.504 0.0 -0.988 0.2 -1.344 0.557 C 1.4 2.113 1.2 2.597 1.2 3.1 V 11.5 c 0.0 0.875 0.347 1.715 0.966 2.334 S 3.625 14.8 4.5 14.8 h 8.4 c 0.503 0.0 0.987 -0.2 1.343 -0.556 c 0.356 -0.356 0.557 -0.84 0.557 -1.344 v -2.8 c 0.0 -0.503 -0.2 -0.987 -0.557 -1.343 C 13.887 8.4 13.403 8.2 12.9 8.2 h -0.428 l 0.542 -0.542 c 0.356 -0.356 0.556 -0.84 0.556 -1.344 c 0.0 -0.503 -0.2 -0.986 -0.556 -1.342 l -1.98 -1.98 c -0.356 -0.357 -0.84 -0.556 -1.344 -0.556 c -0.503 0.0 -0.986 0.2 -1.342 0.555 L 7.8 3.538 V 3.101 c 0.0 -0.504 -0.2 -0.988 -0.557 -1.344 C 6.887 1.4 6.403 1.2 5.9 1.2 H 3.1 Z m 9.8 8.0 c 0.238 0.0 0.467 0.095 0.636 0.264 C 13.705 9.633 13.8 9.862 13.8 10.1 v 2.8 c 0.0 0.238 -0.095 0.466 -0.264 0.635 c -0.169 0.169 -0.398 0.264 -0.637 0.264 H 6.871 l 4.6 -4.6 h 1.428 Z m -7.0 -7.0 c 0.238 0.0 0.467 0.095 0.636 0.264 C 6.705 2.633 6.8 2.862 6.8 3.1 V 11.5 c 0.0 0.61 -0.243 1.196 -0.674 1.627 C 5.695 13.557 5.11 13.8 4.5 13.8 c -0.61 0.0 -1.196 -0.242 -1.627 -0.673 C 2.442 12.696 2.2 12.11 2.2 11.5 V 3.1 c 0.0 -0.238 0.095 -0.467 0.264 -0.636 C 2.633 2.295 2.86 2.2 3.1 2.2 h 2.8 Z m 3.79 1.236 c 0.238 0.0 0.467 0.094 0.636 0.263 l 1.98 1.98 c 0.168 0.168 0.263 0.397 0.263 0.635 c 0.0 0.239 -0.095 0.468 -0.263 0.637 L 7.8 11.457 V 4.952 L 9.054 3.7 C 9.222 3.531 9.45 3.436 9.689 3.436 Z")
        )
    }.build()
}
