package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherSuper60Fill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherSuper60Fill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.742 3.51 c 0.0 -1.246 1.01 -2.26 2.256 -2.26 c 1.247 0.0 2.256 1.013 2.256 2.26 h 3.54 c 0.29 0.0 0.527 0.237 0.527 0.529 c 0.0 0.292 -0.236 0.528 -0.527 0.528 h -0.878 v 4.775 c 0.0 0.475 0.0 0.862 -0.026 1.178 c -0.027 0.326 -0.083 0.62 -0.223 0.896 c -0.219 0.43 -0.568 0.78 -0.998 1.0 c -0.274 0.14 -0.568 0.197 -0.894 0.223 c -0.314 0.026 -0.701 0.026 -1.174 0.026 H 6.395 c -0.473 0.0 -0.86 0.0 -1.174 -0.026 c -0.325 -0.026 -0.62 -0.083 -0.894 -0.223 c -0.43 -0.22 -0.779 -0.57 -0.998 -1.0 c -0.14 -0.276 -0.196 -0.57 -0.223 -0.896 c -0.025 -0.316 -0.025 -0.703 -0.025 -1.178 V 4.567 H 2.203 c -0.291 0.0 -0.527 -0.236 -0.527 -0.528 c 0.0 -0.292 0.236 -0.528 0.527 -0.528 h 3.539 Z m 1.0 0.0 c 0.0 -0.697 0.563 -1.26 1.256 -1.26 c 0.693 0.0 1.256 0.563 1.256 1.26 H 6.742 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.496 9.877 c 0.277 0.0 0.5 0.224 0.5 0.5 v 0.043 c -0.01 2.387 -1.943 4.319 -4.33 4.33 h -0.043 h -5.25 H 5.33 C 2.943 14.739 1.01 12.807 1.0 10.42 v -0.043 h 1.0 v 0.039 c 0.009 1.838 1.496 3.325 3.334 3.334 h 5.328 c 1.838 -0.009 3.326 -1.496 3.334 -3.334 v -0.04 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
