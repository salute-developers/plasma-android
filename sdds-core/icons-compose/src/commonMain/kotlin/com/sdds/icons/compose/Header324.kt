package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header324: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header324",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.658 12.705 v 4.545 h 1.407 V 6.75 h -1.407 v 4.218 H 6.895 V 6.75 H 5.5 v 10.5 h 1.395 v -4.545 h 3.763 Z m 2.406 -4.93 c 0.434 -0.498 1.406 -1.025 2.748 -1.025 c 1.853 0.015 2.85 0.996 2.85 2.607 c 0.0 1.215 -0.601 2.05 -1.521 2.43 c 1.188 0.25 1.853 1.055 1.853 2.446 c 0.0 1.699 -1.087 2.988 -3.272 3.017 c -1.367 0.0 -2.351 -0.6 -2.722 -1.04 v -1.947 c 0.562 0.746 1.52 1.259 2.697 1.244 c 1.188 -0.014 1.814 -0.57 1.814 -1.464 c 0.0 -0.967 -0.524 -1.45 -1.904 -1.45 h -1.01 v -1.318 h 0.742 c 1.175 0.0 1.827 -0.44 1.827 -1.42 c 0.0 -0.938 -0.524 -1.362 -1.572 -1.362 c -1.099 0.029 -1.942 0.454 -2.53 1.23 V 7.775 Z")
        )
    }.build()
}
