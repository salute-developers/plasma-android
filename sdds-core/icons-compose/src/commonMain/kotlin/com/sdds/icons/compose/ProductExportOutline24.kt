package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProductExportOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProductExportOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 12.0 c 3.037 0.0 5.5 2.462 5.5 5.5 c 0.0 3.037 -2.462 5.5 -5.5 5.5 S 12.0 20.537 12.0 17.5 c 0.0 -3.038 2.463 -5.5 5.5 -5.5 Z m 0.854 2.646 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 c -0.171 0.17 -0.193 0.435 -0.065 0.629 l 0.064 0.078 L 19.293 17.0 H 14.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 4.793 l -1.646 1.646 c -0.196 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.511 0.195 0.707 0.0 l 2.5 -2.5 c 0.194 -0.195 0.195 -0.512 0.0 -0.707 l -2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.642 2.19 c 0.439 -0.252 0.979 -0.252 1.418 0.0 l 8.206 4.688 c 0.26 0.149 0.378 0.422 0.355 0.684 c 0.017 0.063 0.03 0.13 0.03 0.198 v 4.737 c -0.453 -0.376 -0.957 -0.689 -1.5 -0.932 v -2.81 l -4.302 2.457 c -1.89 0.494 -3.442 1.818 -4.248 3.558 v -1.987 L 8.814 11.19 v 2.736 c 0.0 0.415 -0.335 0.75 -0.75 0.75 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -3.593 L 4.5 8.725 v 7.819 l 7.1 3.927 V 20.23 c 0.344 0.741 0.823 1.407 1.406 1.965 c -0.505 0.203 -1.079 0.172 -1.562 -0.095 l -7.688 -4.25 C 3.29 17.59 3.0 17.098 3.0 16.565 V 7.73 c 0.0 -0.122 0.032 -0.237 0.084 -0.339 c 0.03 -0.204 0.147 -0.397 0.352 -0.513 l 8.206 -4.689 Z m 4.73 3.766 l -0.064 0.043 l -6.614 3.966 l 2.516 1.439 c 0.045 -0.009 0.093 -0.014 0.14 -0.014 c 0.049 0.0 0.096 0.005 0.142 0.014 l 6.836 -3.906 l -2.856 -1.633 c -0.03 0.033 -0.064 0.063 -0.1 0.09 Z M 5.373 7.498 L 8.23 9.13 l 0.084 -0.084 l 0.08 -0.048 l 6.614 -3.97 L 12.35 3.51 L 5.374 7.498 Z")
        )
    }.build()
}
