package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideForwardBack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideForwardBack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.754 2.643 C 9.61 2.503 9.396 2.461 9.21 2.54 C 9.025 2.617 8.904 2.799 8.904 3.0 v 3.449 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 4.192 L 13.784 8.0 l -3.88 3.809 v -1.568 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 4.486 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 4.418 v 2.26 c 0.0 0.2 0.12 0.382 0.306 0.46 c 0.186 0.078 0.4 0.037 0.544 -0.104 l 5.093 -5.0 c 0.096 -0.095 0.15 -0.223 0.15 -0.357 c 0.0 -0.135 -0.054 -0.263 -0.15 -0.357 l -5.093 -5.0 Z m -6.321 2.61 c 0.197 -0.193 0.2 -0.51 0.006 -0.707 c -0.193 -0.197 -0.51 -0.2 -0.707 -0.006 l -1.58 1.552 c -0.096 0.094 -0.15 0.222 -0.15 0.356 c 0.0 0.135 0.054 0.263 0.15 0.357 l 1.58 1.552 C 2.93 8.551 3.246 8.547 3.44 8.351 c 0.194 -0.197 0.19 -0.514 -0.006 -0.707 L 2.725 6.948 h 4.573 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 2.725 l 0.708 -0.695 Z")
        )
    }.build()
}
