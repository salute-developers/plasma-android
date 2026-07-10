package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicErrorOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicErrorOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.999 7.5 c 0.0 3.038 -2.463 5.5 -5.5 5.5 c -3.038 0.0 -5.5 -2.462 -5.5 -5.5 S 14.46 2.0 17.499 2.0 c 3.037 0.0 5.5 2.462 5.5 5.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 1.768 1.768 l 1.768 -1.768 c 0.195 -0.195 0.511 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 18.206 7.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.196 0.195 -0.512 0.195 -0.707 0.0 l -1.768 -1.768 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 16.792 7.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.999 2.25 c 0.475 0.0 0.929 0.088 1.347 0.25 c -0.44 0.365 -0.832 0.789 -1.162 1.257 c -0.061 -0.004 -0.123 -0.007 -0.185 -0.007 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 6.0 c 0.0 1.243 1.007 2.25 2.25 2.25 c 0.887 0.0 1.654 -0.513 2.02 -1.259 c 0.42 0.267 0.873 0.487 1.351 0.653 C 14.761 14.89 13.48 15.75 12.0 15.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 V 6.0 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.46 15.947 c 0.621 -0.544 1.1 -1.223 1.405 -1.977 c 0.209 0.02 0.42 0.03 0.634 0.03 c 0.329 0.0 0.652 -0.024 0.969 -0.072 c -0.361 1.211 -1.058 2.304 -2.019 3.147 c -1.042 0.914 -2.335 1.48 -3.7 1.633 V 21.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -2.292 c -1.366 -0.152 -2.659 -0.72 -3.7 -1.633 c -1.232 -1.08 -2.029 -2.57 -2.242 -4.194 c -0.055 -0.41 0.235 -0.787 0.645 -0.841 c 0.41 -0.054 0.788 0.235 0.842 0.645 c 0.166 1.263 0.786 2.422 1.743 3.262 c 0.958 0.84 2.188 1.303 3.462 1.303 s 2.504 -0.463 3.461 -1.303 Z")
        )
    }.build()
}
