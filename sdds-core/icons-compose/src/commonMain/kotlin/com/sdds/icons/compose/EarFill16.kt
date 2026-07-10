package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.629 11.52 c -0.74 0.41 -1.327 1.095 -1.765 1.818 C 8.258 14.335 7.174 15.0 5.937 15.0 C 4.04 15.0 2.5 13.433 2.5 11.5 c 0.0 -0.315 0.04 -0.62 0.118 -0.91 c 0.212 -0.807 0.299 -1.69 0.08 -2.495 C 2.57 7.619 2.5 7.118 2.5 6.6 C 2.5 3.507 4.962 1.0 8.0 1.0 s 5.5 2.507 5.5 5.6 c 0.0 2.123 -1.16 3.97 -2.871 4.92 Z M 9.517 3.485 C 8.943 3.197 8.3 3.078 7.664 3.142 C 7.026 3.206 6.42 3.45 5.914 3.846 C 5.406 4.242 5.02 4.773 4.795 5.379 C 4.572 5.985 4.52 6.642 4.644 7.276 c 0.124 0.635 0.42 1.222 0.855 1.696 c 0.22 0.24 0.397 0.53 0.48 0.813 c 0.082 0.28 0.064 0.515 -0.041 0.7 l -0.435 0.768 C 5.366 11.493 5.45 11.8 5.69 11.935 s 0.545 0.052 0.681 -0.188 l 0.436 -0.768 c 0.275 -0.485 0.266 -1.016 0.13 -1.476 c -0.134 -0.456 -0.4 -0.879 -0.703 -1.208 c -0.31 -0.337 -0.521 -0.756 -0.61 -1.21 c -0.089 -0.455 -0.05 -0.926 0.11 -1.36 c 0.16 -0.433 0.435 -0.81 0.794 -1.091 c 0.359 -0.28 0.786 -0.452 1.234 -0.497 c 0.449 -0.045 0.9 0.038 1.305 0.242 c 0.405 0.203 0.747 0.518 0.987 0.91 c 0.189 0.31 0.308 0.658 0.35 1.019 c 0.032 0.274 0.28 0.47 0.554 0.439 c 0.275 -0.032 0.471 -0.28 0.44 -0.555 c -0.06 -0.503 -0.226 -0.99 -0.491 -1.424 c -0.336 -0.55 -0.818 -0.995 -1.391 -1.283 Z")
        )
    }.build()
}
