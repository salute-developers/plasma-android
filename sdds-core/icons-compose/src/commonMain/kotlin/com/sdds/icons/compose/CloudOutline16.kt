package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.03 5.633 C 2.28 6.087 1.0 7.713 1.0 9.63 c 0.0 2.262 1.783 4.121 4.014 4.121 h 6.85 c 1.746 0.0 3.136 -1.454 3.136 -3.216 c 0.0 -1.274 -0.725 -2.383 -1.785 -2.903 c 0.018 -0.176 0.028 -0.355 0.028 -0.536 c 0.0 -2.662 -2.097 -4.845 -4.716 -4.845 c -2.118 0.0 -3.897 1.43 -4.498 3.383 Z m 1.11 -0.122 c 2.171 0.068 3.887 1.9 3.887 4.118 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 c 0.0 -1.737 -1.363 -3.12 -3.013 -3.12 c -0.17 0.0 -0.336 0.014 -0.498 0.042 C 3.1 6.794 2.0 8.07 2.0 9.629 c 0.0 1.738 1.363 3.121 3.014 3.121 h 6.85 c 1.166 0.0 2.136 -0.978 2.136 -2.216 c 0.0 -0.998 -0.635 -1.833 -1.493 -2.113 c -0.24 -0.078 -0.383 -0.323 -0.335 -0.57 c 0.046 -0.244 0.071 -0.497 0.071 -0.756 c 0.0 -2.138 -1.678 -3.845 -3.716 -3.845 c -1.499 0.0 -2.802 0.922 -3.387 2.26 Z")
        )
    }.build()
}
