package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PeopleGroupOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PeopleGroupOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 4.0 C 6.79 4.0 5.0 5.79 5.0 8.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z M 6.5 8.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 s -1.12 2.5 -2.5 2.5 S 6.5 9.38 6.5 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 13.5 c -2.19 0.0 -4.23 0.656 -5.93 1.782 C 2.352 15.758 2.0 16.565 2.0 17.354 C 2.0 18.815 3.185 20.0 4.646 20.0 h 8.708 C 14.815 20.0 16.0 18.815 16.0 17.354 c 0.0 -0.789 -0.351 -1.596 -1.07 -2.072 C 13.23 14.156 11.19 13.5 9.0 13.5 Z m -5.1 3.032 C 5.36 15.564 7.113 15.0 9.0 15.0 c 1.886 0.0 3.639 0.564 5.1 1.532 c 0.24 0.159 0.4 0.459 0.4 0.822 c 0.0 0.633 -0.513 1.146 -1.146 1.146 H 4.646 c -0.633 0.0 -1.146 -0.513 -1.146 -1.146 c 0.0 -0.363 0.16 -0.663 0.4 -0.822 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.167 10.333 c 0.0 -1.61 1.306 -2.916 2.916 -2.916 c 1.611 0.0 2.917 1.306 2.917 2.916 c 0.0 1.611 -1.306 2.917 -2.917 2.917 c -1.61 0.0 -2.916 -1.306 -2.916 -2.917 Z m 2.916 -1.416 c -0.782 0.0 -1.416 0.634 -1.416 1.416 c 0.0 0.783 0.634 1.417 1.416 1.417 c 0.783 0.0 1.417 -0.634 1.417 -1.417 c 0.0 -0.782 -0.634 -1.416 -1.417 -1.416 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 17.5 c 0.0 0.375 -0.052 0.739 -0.148 1.083 h 3.134 c 1.112 0.0 2.014 -0.901 2.014 -2.014 c 0.0 -0.596 -0.266 -1.219 -0.826 -1.59 c -1.173 -0.777 -2.58 -1.229 -4.09 -1.229 c -0.719 0.0 -1.413 0.102 -2.07 0.293 c 0.532 0.31 0.986 0.74 1.325 1.253 c 0.244 -0.03 0.492 -0.046 0.744 -0.046 c 1.208 0.0 2.328 0.36 3.263 0.98 c 0.08 0.053 0.154 0.168 0.154 0.34 c 0.0 0.283 -0.23 0.513 -0.514 0.513 h -3.007 C 16.993 17.22 17.0 17.36 17.0 17.5 Z")
        )
    }.build()
}
