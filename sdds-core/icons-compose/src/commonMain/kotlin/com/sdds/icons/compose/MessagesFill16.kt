package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagesFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagesFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.898 8.688 l 0.23 -1.146 c 0.013 -0.068 0.046 -0.13 0.095 -0.179 l 5.573 -5.57 c 0.39 -0.39 1.022 -0.39 1.411 0.0 c 0.39 0.39 0.39 1.021 0.0 1.411 l -5.572 5.57 c -0.05 0.05 -0.111 0.083 -0.18 0.097 L 7.31 9.1 C 7.065 9.149 6.849 8.933 6.898 8.688 Z m 2.486 0.836 C 9.187 9.722 8.936 9.856 8.663 9.91 L 7.522 10.14 c -0.988 0.197 -1.86 -0.674 -1.662 -1.661 l 0.228 -1.14 c 0.055 -0.274 0.19 -0.525 0.387 -0.722 l 4.823 -4.822 H 4.831 c -0.475 0.0 -0.864 0.0 -1.18 0.026 c -0.327 0.027 -0.622 0.084 -0.898 0.224 C 2.32 2.264 1.97 2.614 1.75 3.046 C 1.61 3.322 1.553 3.617 1.526 3.944 C 1.5 4.26 1.5 4.65 1.5 5.124 v 6.043 c 0.0 0.475 0.0 0.864 0.026 1.18 c 0.027 0.327 0.084 0.622 0.224 0.898 c 0.22 0.431 0.571 0.782 1.003 1.002 c 0.276 0.14 0.571 0.198 0.898 0.224 c 0.316 0.026 0.705 0.026 1.18 0.026 h 6.045 c 0.476 0.0 0.864 0.0 1.18 -0.026 c 0.327 -0.026 0.623 -0.083 0.899 -0.224 c 0.431 -0.22 0.782 -0.57 1.002 -1.002 c 0.14 -0.276 0.198 -0.571 0.224 -0.898 c 0.026 -0.316 0.026 -0.705 0.026 -1.18 V 4.703 L 9.384 9.524 Z")
        )
    }.build()
}
