package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScreenShareUnpinFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScreenShareUnpinFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 3.806 8.5 8.5 S 31.194 35.0 26.5 35.0 S 18.0 31.194 18.0 26.5 s 3.806 -8.5 8.5 -8.5 Z m 3.809 4.691 c -0.293 -0.292 -0.768 -0.292 -1.061 0.0 l -2.747 2.748 l -2.749 -2.748 c -0.293 -0.292 -0.768 -0.292 -1.06 0.0 c -0.293 0.293 -0.293 0.768 0.0 1.061 L 25.44 26.5 l -2.749 2.748 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 2.749 -2.747 l 2.747 2.748 c 0.293 0.292 0.768 0.292 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 L 27.562 26.5 l 2.748 -2.748 c 0.292 -0.293 0.292 -0.768 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.325 6.0 c 0.822 0.0 1.505 0.0 2.062 0.045 c 0.57 0.046 1.105 0.146 1.611 0.404 c 0.776 0.396 1.407 1.027 1.803 1.803 c 0.258 0.506 0.357 1.041 0.404 1.611 c 0.046 0.557 0.045 1.24 0.045 2.062 v 7.212 c -1.764 -1.562 -4.083 -2.512 -6.625 -2.512 c -5.523 0.0 -10.0 4.477 -10.0 10.0 c 0.0 1.279 0.243 2.5 0.68 3.625 h -8.38 c -0.822 0.0 -1.505 0.0 -2.062 -0.045 c -0.57 -0.046 -1.105 -0.146 -1.611 -0.404 c -0.776 -0.396 -1.407 -1.027 -1.803 -1.803 c -0.258 -0.506 -0.358 -1.042 -0.404 -1.611 C 2.999 25.83 3.0 25.147 3.0 24.325 v -12.4 c 0.0 -0.822 0.0 -1.505 0.045 -2.062 c 0.046 -0.57 0.146 -1.105 0.404 -1.611 c 0.396 -0.776 1.027 -1.407 1.803 -1.803 c 0.506 -0.258 1.041 -0.358 1.611 -0.404 C 7.42 5.999 8.103 6.0 8.925 6.0 h 18.4 Z")
        )
    }.build()
}
