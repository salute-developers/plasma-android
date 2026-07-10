package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePlusOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePlusOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.663 11.186 c 0.0 -3.017 2.405 -5.436 5.34 -5.436 c 2.934 0.0 5.339 2.42 5.339 5.436 s -2.405 5.435 -5.34 5.435 c -2.934 0.0 -5.339 -2.419 -5.339 -5.435 Z m 5.34 -7.436 c -4.068 0.0 -7.34 3.343 -7.34 7.436 c 0.0 4.092 3.272 7.435 7.34 7.435 c 4.067 0.0 7.339 -3.343 7.339 -7.435 c 0.0 -4.093 -3.272 -7.436 -7.34 -7.436 Z m -0.941 19.437 c -3.542 0.174 -6.83 1.325 -9.61 3.195 c -0.49 0.33 -0.75 0.88 -0.694 1.412 c 0.048 0.464 0.128 0.742 0.236 0.954 c 0.264 0.517 0.685 0.938 1.202 1.202 c 0.237 0.12 0.554 0.206 1.117 0.252 c 0.575 0.047 1.315 0.047 2.382 0.047 h 5.532 c 0.287 0.711 0.654 1.382 1.09 2.0 h -6.665 c -1.014 0.0 -1.836 0.0 -2.502 -0.054 c -0.687 -0.056 -1.296 -0.175 -1.862 -0.463 c -0.894 -0.456 -1.62 -1.182 -2.076 -2.076 c -0.259 -0.509 -0.38 -1.051 -0.444 -1.654 c -0.138 -1.32 0.51 -2.567 1.567 -3.28 C 9.678 22.475 13.69 21.165 18.0 21.165 h 0.041 c -0.398 0.63 -0.728 1.308 -0.98 2.023 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 18.0 26.5 18.0 S 18.0 21.806 18.0 26.5 s 3.806 8.5 8.5 8.5 Z m 0.75 -13.136 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 v 3.886 h -3.886 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 3.886 v 3.886 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 V 27.25 h 3.887 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 27.25 v -3.886 Z")
        )
    }.build()
}
