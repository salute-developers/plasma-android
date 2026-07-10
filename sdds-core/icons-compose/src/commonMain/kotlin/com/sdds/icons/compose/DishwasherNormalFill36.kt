package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherNormalFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherNormalFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.668 9.625 c 0.0 -2.697 2.195 -4.875 4.892 -4.875 c 2.696 0.0 4.891 2.178 4.891 4.875 h 7.538 c 0.624 0.0 1.13 0.504 1.13 1.125 s -0.506 1.125 -1.13 1.125 h -1.883 v 10.172 c 0.0 1.01 0.0 1.836 -0.055 2.508 l -0.006 0.07 H 16.793 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 1.5 c -0.867 0.0 -1.59 -0.006 -2.19 -0.055 c -0.697 -0.057 -1.328 -0.178 -1.916 -0.476 c -0.922 -0.468 -1.67 -1.213 -2.14 -2.13 c -0.3 -0.587 -0.422 -1.214 -0.479 -1.91 c -0.055 -0.67 -0.055 -1.497 -0.055 -2.507 V 11.875 H 5.13 C 4.506 11.875 4.0 11.371 4.0 10.75 s 0.506 -1.125 1.13 -1.125 h 7.538 Z m 2.25 0.0 C 14.918 8.18 16.096 7.0 17.56 7.0 C 19.023 7.0 20.2 8.18 20.2 9.625 h -5.283 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.183 27.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.676 c 0.422 1.306 1.648 2.25 3.094 2.25 h 0.773 c 1.446 0.0 2.671 -0.944 3.093 -2.25 h 3.677 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 17.183 Z m 6.77 2.25 c -0.282 0.0 -0.541 -0.093 -0.75 -0.25 h 2.273 c -0.209 0.157 -0.469 0.25 -0.75 0.25 h -0.773 Z")
        )
    }.build()
}
