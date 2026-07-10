package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CouponDiscountFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CouponDiscountFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.245 20.22 c 0.566 0.0 1.025 0.46 1.025 1.025 c 0.0 0.566 -0.459 1.025 -1.025 1.025 c -0.566 0.0 -1.025 -0.459 -1.025 -1.025 c 0.0 -0.566 0.459 -1.025 1.025 -1.025 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.745 13.72 c 0.566 0.0 1.026 0.46 1.026 1.025 c 0.0 0.566 -0.46 1.025 -1.026 1.026 c -0.566 0.0 -1.025 -0.46 -1.025 -1.026 c 0.0 -0.566 0.459 -1.025 1.025 -1.025 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.0 7.5 c 1.657 0.0 3.0 1.343 3.0 3.0 v 2.592 c 0.0 0.726 -0.351 1.409 -0.942 1.83 l -0.89 0.637 c -1.675 1.196 -1.675 3.686 0.0 4.882 l 0.89 0.636 C 32.648 21.5 33.0 22.182 33.0 22.908 V 25.5 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 6.0 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 v -2.592 c 0.0 -0.726 0.351 -1.409 0.942 -1.83 l 0.89 -0.637 c 1.675 -1.196 1.675 -3.686 0.0 -4.882 l -0.89 -0.636 C 3.352 14.5 3.0 13.818 3.0 13.092 V 10.5 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 24.0 Z m -8.755 11.12 c -1.45 0.0 -2.625 1.175 -2.625 2.625 s 1.175 2.625 2.625 2.625 s 2.625 -1.175 2.625 -2.625 s -1.175 -2.625 -2.625 -2.625 Z m 1.528 -5.463 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -8.202 8.202 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 l 8.202 -8.202 c 0.391 -0.39 0.391 -1.023 0.0 -1.414 Z m -8.028 -1.037 c -1.45 0.0 -2.625 1.175 -2.625 2.625 s 1.175 2.625 2.625 2.625 s 2.625 -1.175 2.625 -2.625 s -1.175 -2.625 -2.625 -2.625 Z")
        )
    }.build()
}
