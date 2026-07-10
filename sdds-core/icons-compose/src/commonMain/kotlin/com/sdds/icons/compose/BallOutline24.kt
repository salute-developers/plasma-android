package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.886 4.089 C 5.732 5.33 3.5 8.405 3.5 12.0 c 0.0 0.703 0.652 1.58 2.272 2.324 c 0.43 0.197 0.907 0.374 1.426 0.529 C 7.068 13.946 7.0 12.988 7.0 12.0 c 0.0 -2.637 0.49 -5.061 1.313 -6.854 c 0.17 -0.37 0.362 -0.726 0.573 -1.057 Z M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z m 8.5 10.0 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 c -0.703 0.0 -1.58 0.652 -2.324 2.272 C 8.962 7.327 8.5 9.53 8.5 12.0 c 0.0 1.145 0.1 2.232 0.277 3.223 C 9.768 15.402 10.855 15.5 12.0 15.5 c 2.472 0.0 4.672 -0.462 6.228 -1.176 C 19.848 13.579 20.5 12.703 20.5 12.0 Z M 9.147 16.802 C 10.054 16.932 11.012 17.0 12.0 17.0 c 2.637 0.0 5.061 -0.49 6.854 -1.313 c 0.37 -0.17 0.726 -0.362 1.058 -0.573 C 18.669 18.268 15.595 20.5 12.0 20.5 c -0.703 0.0 -1.58 -0.652 -2.324 -2.272 c -0.197 -0.43 -0.374 -0.907 -0.529 -1.426 Z M 7.51 16.49 c -0.867 -0.21 -1.664 -0.482 -2.364 -0.803 c -0.37 -0.17 -0.726 -0.362 -1.057 -0.573 c 0.862 2.19 2.607 3.935 4.797 4.797 c -0.211 -0.33 -0.403 -0.687 -0.573 -1.057 c -0.321 -0.7 -0.592 -1.497 -0.803 -2.364 Z")
        )
    }.build()
}
