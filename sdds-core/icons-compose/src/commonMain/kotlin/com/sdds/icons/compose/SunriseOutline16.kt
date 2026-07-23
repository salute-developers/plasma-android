package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SunriseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SunriseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.366 2.16 C 8.275 2.06 8.145 2.0 8.0 2.0 C 7.886 2.0 7.782 2.038 7.698 2.102 c -0.022 0.016 -0.042 0.034 -0.06 0.054 l -2.084 2.19 c -0.19 0.201 -0.182 0.518 0.018 0.708 c 0.2 0.19 0.517 0.182 0.707 -0.018 L 7.5 3.752 v 3.13 c 0.0 0.277 0.224 0.5 0.5 0.5 s 0.5 -0.223 0.5 -0.5 v -3.13 l 1.22 1.284 c 0.191 0.2 0.508 0.208 0.708 0.018 c 0.2 -0.19 0.208 -0.507 0.018 -0.707 L 8.366 2.16 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.662 7.25 C 3.862 7.06 4.18 7.07 4.37 7.27 l 0.695 0.73 c 0.19 0.2 0.182 0.517 -0.018 0.707 c -0.2 0.19 -0.517 0.182 -0.707 -0.018 l -0.694 -0.73 c -0.19 -0.2 -0.183 -0.517 0.017 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.162 10.261 C 5.898 9.387 6.916 8.875 8.0 8.875 s 2.102 0.512 2.838 1.386 c 0.631 0.75 1.016 1.718 1.111 2.739 h 2.301 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 1.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 S 1.474 13.0 1.75 13.0 h 2.301 c 0.095 -1.021 0.48 -1.989 1.111 -2.739 Z m 4.91 0.644 c 0.472 0.56 0.78 1.297 0.872 2.095 H 5.056 c 0.092 -0.798 0.4 -1.534 0.871 -2.095 c 0.567 -0.673 1.315 -1.03 2.073 -1.03 s 1.506 0.357 2.073 1.03 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.75 10.809 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.389 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.361 11.309 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.389 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.389 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.355 7.958 c 0.19 -0.2 0.183 -0.517 -0.018 -0.707 c -0.2 -0.19 -0.516 -0.182 -0.706 0.018 l -0.695 0.73 c -0.19 0.2 -0.182 0.517 0.018 0.707 c 0.2 0.19 0.517 0.182 0.707 -0.018 l 0.694 -0.73 Z")
        )
    }.build()
}
