package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EraserFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EraserFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.418 1.86 c -0.453 -0.147 -0.94 -0.147 -1.393 0.0 c -0.29 0.095 -0.534 0.261 -0.78 0.47 c -0.237 0.203 -0.507 0.474 -0.838 0.805 L 6.24 4.307 l 5.59 5.61 L 13.0 8.743 c 0.33 -0.332 0.6 -0.603 0.801 -0.84 c 0.209 -0.247 0.374 -0.493 0.468 -0.783 c 0.147 -0.454 0.147 -0.944 0.0 -1.398 c -0.094 -0.29 -0.26 -0.536 -0.468 -0.782 c -0.202 -0.238 -0.472 -0.51 -0.802 -0.84 l -0.962 -0.966 c -0.33 -0.331 -0.6 -0.602 -0.838 -0.805 c -0.246 -0.209 -0.49 -0.375 -0.78 -0.47 Z m 0.705 8.764 l -5.59 -5.608 L 2.63 7.927 C 2.3 8.26 2.03 8.53 1.83 8.767 C 1.619 9.015 1.454 9.26 1.36 9.55 c -0.147 0.454 -0.147 0.944 0.0 1.398 c 0.094 0.29 0.26 0.536 0.469 0.782 c 0.201 0.238 0.471 0.51 0.801 0.84 l 0.608 0.61 c 0.683 0.685 1.609 1.07 2.575 1.07 h 8.417 c 0.287 0.0 0.52 -0.234 0.52 -0.522 c 0.0 -0.288 -0.233 -0.522 -0.52 -0.522 H 8.55 l 2.573 -2.582 Z")
        )
    }.build()
}
