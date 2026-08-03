package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherSuper60Fill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherSuper60Fill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.09 8.41 C 13.09 5.7 15.289 3.5 18.0 3.5 c 2.71 0.0 4.908 2.199 4.908 4.91 h 7.577 c 0.627 0.0 1.136 0.509 1.136 1.136 c 0.0 0.627 -0.509 1.135 -1.136 1.135 h -1.891 v 10.267 c 0.0 1.02 0.0 1.854 -0.056 2.531 c -0.057 0.701 -0.18 1.335 -0.48 1.927 c -0.472 0.925 -1.224 1.678 -2.15 2.15 c -0.591 0.301 -1.225 0.424 -1.926 0.48 c -0.677 0.056 -1.51 0.056 -2.53 0.056 h -6.905 c -1.02 0.0 -1.853 0.0 -2.53 -0.055 c -0.701 -0.057 -1.335 -0.18 -1.926 -0.481 c -0.926 -0.472 -1.678 -1.225 -2.15 -2.15 c -0.3 -0.592 -0.423 -1.226 -0.48 -1.927 c -0.056 -0.677 -0.056 -1.511 -0.056 -2.53 V 10.68 H 5.513 c -0.626 0.0 -1.135 -0.508 -1.135 -1.135 S 4.887 8.41 5.513 8.41 h 7.578 Z m 2.25 0.0 c 0.0 -1.47 1.192 -2.66 2.66 -2.66 c 1.467 0.0 2.658 1.19 2.658 2.66 h -5.317 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.999 22.172 c 0.552 0.0 1.0 0.447 1.0 1.0 v 0.005 v 0.14 c -0.038 5.055 -4.127 9.144 -9.182 9.181 h -0.14 h -11.355 h -0.14 C 7.127 32.461 3.037 28.372 3.0 23.316 v -0.14 v -0.004 h 2.0 v 0.13 c 0.03 3.962 3.234 7.167 7.197 7.196 h 0.13 h 11.345 h 0.067 h 0.063 c 3.963 -0.029 7.168 -3.234 7.197 -7.196 v -0.025 v -0.105 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
