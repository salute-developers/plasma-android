package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.SyncError16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SyncError16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 2.09 6.958 C 2.666 3.694 5.778 1.515 9.041 2.09 c 2.175 0.383 3.87 1.894 4.586 3.827 l -1.19 -0.21 c -0.272 -0.048 -0.532 0.133 -0.58 0.405 c -0.047 0.272 0.134 0.532 0.406 0.58 L 14.24 7.04 l 0.023 0.004 l 0.49 0.086 c 0.272 0.048 0.532 -0.133 0.58 -0.405 l 0.439 -2.49 c 0.048 -0.271 -0.134 -0.53 -0.406 -0.579 c -0.272 -0.048 -0.531 0.134 -0.58 0.406 l -0.25 1.426 c -0.854 -2.214 -2.812 -3.94 -5.32 -4.383 c -3.808 -0.671 -7.438 1.87 -8.11 5.678 c -0.048 0.272 0.134 0.531 0.406 0.58 c 0.272 0.047 0.531 -0.134 0.58 -0.406 Z m 6.532 8.016 C 8.364 14.68 8.144 14.354 7.968 14.0 c -0.333 -0.002 -0.671 -0.033 -1.01 -0.092 c -2.176 -0.384 -3.87 -1.895 -4.587 -3.827 l 1.19 0.21 c 0.272 0.048 0.532 -0.134 0.58 -0.406 c 0.048 -0.272 -0.134 -0.531 -0.406 -0.58 L 1.76 8.959 L 1.736 8.954 l -0.49 -0.086 C 0.974 8.82 0.714 9.002 0.666 9.274 l -0.438 2.489 c -0.048 0.272 0.133 0.531 0.405 0.58 c 0.272 0.047 0.531 -0.134 0.58 -0.406 l 0.25 -1.427 c 0.854 2.215 2.812 3.941 5.32 4.383 c 0.622 0.11 1.24 0.134 1.84 0.08 Z")
            )
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.136 -0.357 -0.136 -0.494 0.0 c -0.137 0.137 -0.137 0.359 0.0 0.495 L 11.505 12.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.136 0.36 0.136 0.496 0.0 L 12.0 12.495 l 1.198 1.199 c 0.137 0.136 0.359 0.136 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 12.0 l 1.199 -1.199 c 0.136 -0.136 0.136 -0.358 0.0 -0.495 c -0.137 -0.136 -0.359 -0.136 -0.496 0.0 L 12.0 11.505 l -1.2 -1.199 Z")
            )
        }
    }.build()
}
