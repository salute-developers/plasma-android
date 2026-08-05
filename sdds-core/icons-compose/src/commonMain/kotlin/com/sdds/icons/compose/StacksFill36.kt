package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StacksFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StacksFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.817 7.095 C 3.0 8.7 3.0 10.8 3.0 15.0 v 6.0 c 0.0 4.2 0.0 6.3 0.817 7.905 c 0.72 1.411 1.867 2.558 3.278 3.277 c 0.674 0.344 1.436 0.543 2.405 0.659 v -7.986 c 0.0 -2.482 0.0 -4.406 0.126 -5.948 c 0.128 -1.562 0.39 -2.82 0.964 -3.947 c 0.959 -1.882 2.489 -3.411 4.37 -4.37 c 1.127 -0.574 2.385 -0.836 3.947 -0.964 C 20.45 9.5 22.373 9.5 24.855 9.5 h 7.986 c -0.116 -0.969 -0.315 -1.73 -0.659 -2.405 c -0.719 -1.411 -1.866 -2.558 -3.277 -3.278 C 27.3 3.0 25.2 3.0 21.0 3.0 h -6.0 c -4.2 0.0 -6.3 0.0 -7.905 0.817 c -1.411 0.72 -2.558 1.867 -3.278 3.278 Z M 32.971 11.5 H 24.9 c -2.537 0.0 -4.38 0.0 -5.83 0.12 c -1.439 0.117 -2.404 0.345 -3.202 0.752 c -1.505 0.767 -2.73 1.99 -3.496 3.496 c -0.407 0.798 -0.635 1.763 -0.753 3.202 c -0.118 1.45 -0.119 3.293 -0.119 5.83 v 8.072 C 12.48 33.0 13.628 33.0 15.0 33.0 h 2.0 v -7.843 c 0.0 -1.224 0.0 -2.203 0.065 -2.994 c 0.066 -0.812 0.205 -1.514 0.534 -2.16 c 0.528 -1.035 1.37 -1.876 2.404 -2.404 c 0.646 -0.329 1.348 -0.468 2.16 -0.534 C 22.954 17.0 23.933 17.0 25.157 17.0 H 33.0 v -2.0 c 0.0 -1.372 0.0 -2.52 -0.029 -3.5 Z M 33.0 19.0 h -7.8 c -1.277 0.0 -2.174 0.0 -2.874 0.058 c -0.689 0.056 -1.098 0.162 -1.415 0.323 c -0.659 0.336 -1.194 0.872 -1.53 1.53 c -0.161 0.317 -0.267 0.726 -0.323 1.415 C 19.001 23.026 19.0 23.923 19.0 25.2 V 33.0 h 2.0 c 4.2 0.0 6.3 0.0 7.905 -0.818 c 1.411 -0.719 2.558 -1.866 3.277 -3.277 C 33.0 27.3 33.0 25.2 33.0 21.0 v -2.0 Z")
        )
    }.build()
}
