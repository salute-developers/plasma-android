package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Scene3DFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Scene3DFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.395 1.862 L 1.383 1.858 C 1.31 1.832 1.233 1.804 1.167 1.785 c -0.055 -0.016 -0.203 -0.058 -0.37 -0.02 c -0.182 0.042 -0.332 0.146 -0.433 0.3 c -0.092 0.14 -0.104 0.288 -0.109 0.347 C 0.25 2.479 0.25 2.559 0.25 2.63 v 7.875 c 0.0 0.06 0.0 0.133 0.005 0.196 c 0.006 0.065 0.02 0.197 0.104 0.328 c 0.097 0.151 0.243 0.258 0.418 0.303 c 0.153 0.04 0.287 0.012 0.35 -0.003 c 0.062 -0.014 0.133 -0.037 0.192 -0.056 l 0.012 -0.003 c 0.307 -0.098 0.806 -0.24 1.483 -0.383 c -0.046 -0.278 -0.07 -0.564 -0.07 -0.855 c 0.0 -2.884 2.357 -5.216 5.256 -5.216 s 5.255 2.332 5.255 5.216 c 0.0 0.291 -0.024 0.577 -0.07 0.855 c 0.678 0.143 1.177 0.285 1.484 0.383 l 0.011 0.003 c 0.06 0.02 0.131 0.042 0.194 0.056 c 0.062 0.015 0.196 0.042 0.349 0.003 c 0.175 -0.045 0.321 -0.152 0.418 -0.303 c 0.083 -0.13 0.098 -0.263 0.104 -0.328 c 0.005 -0.063 0.005 -0.136 0.005 -0.196 V 2.63 c 0.0 -0.071 0.0 -0.15 -0.005 -0.218 c -0.005 -0.06 -0.017 -0.206 -0.109 -0.346 c -0.101 -0.155 -0.251 -0.259 -0.433 -0.3 c -0.167 -0.039 -0.315 0.003 -0.37 0.019 c -0.066 0.019 -0.144 0.047 -0.216 0.073 l -0.012 0.004 C 13.843 2.138 11.83 2.696 8.0 2.696 c -3.83 0.0 -5.843 -0.558 -6.605 -0.834 Z m 2.35 8.17 c 0.0 -2.324 1.9 -4.216 4.255 -4.216 c 2.354 0.0 4.255 1.892 4.255 4.216 c 0.0 2.325 -1.9 4.216 -4.255 4.216 c -2.354 0.0 -4.256 -1.891 -4.256 -4.216 Z")
        )
    }.build()
}
