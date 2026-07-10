package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileSquareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileSquareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.223 4.5 H 12.777 c -1.22 0.0 -2.203 0.0 -3.0 0.065 c -0.82 0.067 -1.54 0.209 -2.206 0.548 c -1.058 0.54 -1.919 1.4 -2.458 2.458 c -0.34 0.667 -0.481 1.387 -0.548 2.207 C 4.5 10.574 4.5 11.558 4.5 12.777 v 10.446 c 0.0 1.22 0.0 2.203 0.065 3.0 c 0.067 0.82 0.209 1.54 0.548 2.206 c 0.54 1.058 1.4 1.919 2.458 2.458 c 0.667 0.34 1.387 0.481 2.207 0.548 c 0.796 0.065 1.78 0.065 2.999 0.065 h 10.446 c 1.22 0.0 2.203 0.0 3.0 -0.065 c 0.82 -0.067 1.54 -0.209 2.206 -0.548 c 1.058 -0.54 1.919 -1.4 2.458 -2.458 c 0.34 -0.667 0.481 -1.387 0.548 -2.207 c 0.065 -0.796 0.065 -1.78 0.065 -2.999 V 12.777 c 0.0 -1.22 0.0 -2.203 -0.065 -3.0 c -0.067 -0.82 -0.209 -1.54 -0.548 -2.206 c -0.54 -1.058 -1.4 -1.919 -2.458 -2.458 c -0.667 -0.34 -1.387 -0.481 -2.207 -0.548 C 25.426 4.5 24.442 4.5 23.223 4.5 Z M 23.25 15.0 c 0.0 2.9 -2.35 5.25 -5.25 5.25 S 12.75 17.9 12.75 15.0 S 15.1 9.75 18.0 9.75 s 5.25 2.35 5.25 5.25 Z m 5.219 13.034 c -0.291 0.35 -0.652 0.64 -1.062 0.848 c -0.722 0.368 -1.667 0.368 -3.557 0.368 h -11.7 c -1.89 0.0 -2.835 0.0 -3.557 -0.368 c -0.41 -0.209 -0.77 -0.498 -1.062 -0.848 C 7.947 24.938 12.475 22.5 18.0 22.5 c 5.525 0.0 10.053 2.438 10.469 5.534 Z")
        )
    }.build()
}
