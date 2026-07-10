package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ViewPersonFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ViewPersonFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.922 6.0 H 10.078 C 9.068 6.0 8.242 6.0 7.57 6.055 C 6.876 6.112 6.248 6.233 5.662 6.53 C 4.745 7.0 3.999 7.745 3.532 8.661 c -0.3 0.587 -0.42 1.215 -0.477 1.91 C 3.0 11.24 3.0 12.067 3.0 13.077 v 9.844 c 0.0 1.01 0.0 1.836 0.055 2.508 c 0.057 0.695 0.178 1.322 0.476 1.908 c 0.468 0.918 1.214 1.663 2.13 2.13 c 0.587 0.3 1.215 0.42 1.91 0.477 C 8.24 30.0 9.067 30.0 10.077 30.0 h 15.844 c 1.01 0.0 1.836 0.0 2.508 -0.055 c 0.695 -0.057 1.322 -0.178 1.908 -0.476 c 0.918 -0.468 1.663 -1.213 2.13 -2.13 c 0.3 -0.587 0.42 -1.214 0.477 -1.91 C 33.0 24.76 33.0 23.933 33.0 22.923 v -9.844 c 0.0 -1.01 0.0 -1.836 -0.055 -2.508 c -0.057 -0.694 -0.178 -1.322 -0.476 -1.908 c -0.468 -0.917 -1.213 -1.663 -2.13 -2.13 c -0.587 -0.3 -1.214 -0.42 -1.91 -0.477 C 27.76 6.0 26.933 6.0 25.923 6.0 Z m -4.172 8.25 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.07 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.68 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z m 3.044 7.482 c 0.478 0.346 0.761 0.95 0.697 1.574 c -0.035 0.336 -0.096 0.598 -0.203 0.829 c -0.22 0.47 -0.569 0.853 -0.998 1.092 C 23.8 25.5 23.162 25.5 21.883 25.5 h -7.765 c -1.28 0.0 -1.919 0.0 -2.407 -0.273 c -0.43 -0.24 -0.78 -0.622 -0.998 -1.092 c -0.108 -0.231 -0.17 -0.493 -0.204 -0.829 c -0.064 -0.623 0.219 -1.228 0.697 -1.574 C 13.154 20.322 15.49 19.5 18.0 19.5 s 4.846 0.821 6.794 2.232 Z")
        )
    }.build()
}
