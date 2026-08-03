package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.922 6.0 H 10.078 C 9.068 6.0 8.242 6.0 7.57 6.055 C 6.876 6.112 6.248 6.233 5.662 6.53 C 4.745 7.0 3.999 7.745 3.532 8.661 c -0.3 0.587 -0.42 1.215 -0.477 1.91 C 3.0 11.24 3.0 12.067 3.0 13.077 v 9.844 c 0.0 1.01 0.0 1.836 0.055 2.508 c 0.057 0.695 0.178 1.322 0.476 1.908 c 0.128 0.251 0.277 0.489 0.444 0.712 c 0.444 0.592 1.02 1.08 1.687 1.419 c 0.586 0.298 1.214 0.42 1.908 0.476 C 8.242 30.0 9.068 30.0 10.078 30.0 h 15.844 c 1.01 0.0 1.836 0.0 2.508 -0.055 c 0.695 -0.057 1.322 -0.178 1.908 -0.476 c 0.918 -0.468 1.663 -1.213 2.13 -2.13 c 0.428 -0.84 0.502 -1.797 0.524 -2.95 C 33.0 23.946 33.0 23.445 33.0 22.883 v -9.806 c 0.0 -1.01 0.0 -1.836 -0.055 -2.508 c -0.057 -0.694 -0.178 -1.322 -0.476 -1.908 c -0.468 -0.917 -1.213 -1.663 -2.13 -2.13 c -0.587 -0.3 -1.214 -0.42 -1.91 -0.477 C 27.76 6.0 26.933 6.0 25.923 6.0 Z m -0.596 13.417 l 5.402 5.402 c -0.036 0.829 -0.12 1.216 -0.264 1.498 c -0.252 0.494 -0.653 0.895 -1.147 1.147 c -0.216 0.11 -0.515 0.193 -1.07 0.239 c -0.57 0.046 -1.303 0.047 -2.372 0.047 H 14.341 l 8.333 -8.333 c 0.732 -0.732 1.92 -0.732 2.652 0.0 Z m -10.792 4.958 l -3.375 3.375 h -1.034 c -1.069 0.0 -1.803 0.0 -2.371 -0.047 c -0.556 -0.046 -0.855 -0.129 -1.07 -0.24 c -0.068 -0.033 -0.133 -0.07 -0.196 -0.11 l 4.186 -4.186 c 0.732 -0.732 1.92 -0.732 2.652 0.0 l 1.208 1.208 Z M 11.25 16.5 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 12.493 12.0 11.25 12.0 S 9.0 13.007 9.0 14.25 s 1.007 2.25 2.25 2.25 Z")
        )
    }.build()
}
