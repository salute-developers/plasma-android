package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Typography36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Typography36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 28.0 h -2.979 l -1.848 -5.28 H 7.647 L 5.824 28.0 H 3.0 l 7.344 -21.0 h 3.21 L 21.0 28.0 Z M 8.65 19.78 h 6.495 l -3.26 -9.39 l -3.236 9.39 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.028 13.0 c 0.963 0.0 1.811 0.097 2.547 0.29 c 0.755 0.174 1.387 0.463 1.897 0.868 c 0.51 0.406 0.886 0.947 1.131 1.622 C 32.868 16.436 33.0 17.247 33.0 18.212 v 9.557 h -2.66 v -2.52 c -0.359 0.81 -0.953 1.477 -1.783 1.998 C 27.727 27.75 26.745 28.0 25.613 28.0 c -1.415 0.0 -2.538 -0.386 -3.368 -1.158 C 21.415 26.07 21.0 24.959 21.0 23.512 c 0.0 -0.811 0.132 -1.477 0.396 -1.998 c 0.284 -0.54 0.68 -0.966 1.189 -1.275 c 0.51 -0.328 1.123 -0.56 1.84 -0.695 c 0.735 -0.135 1.556 -0.202 2.462 -0.202 h 3.283 v -0.898 c 0.0 -1.12 -0.284 -1.882 -0.85 -2.288 c -0.547 -0.424 -1.31 -0.636 -2.292 -0.636 c -1.207 0.0 -2.217 0.24 -3.028 0.723 c -0.793 0.483 -1.434 1.13 -1.925 1.94 v -3.822 c 0.472 -0.367 1.123 -0.686 1.953 -0.956 c 0.83 -0.27 1.83 -0.405 3.0 -0.405 Z m 0.114 8.398 c -1.132 0.0 -1.962 0.135 -2.49 0.405 c -0.529 0.25 -0.794 0.744 -0.794 1.477 c 0.0 0.618 0.218 1.12 0.652 1.506 c 0.434 0.386 1.075 0.58 1.924 0.58 c 0.641 0.0 1.188 -0.088 1.641 -0.261 c 0.453 -0.174 0.831 -0.387 1.133 -0.638 c 0.302 -0.27 0.528 -0.55 0.679 -0.84 c 0.15 -0.309 0.245 -0.588 0.283 -0.839 v -1.39 h -3.028 Z")
        )
    }.build()
}
