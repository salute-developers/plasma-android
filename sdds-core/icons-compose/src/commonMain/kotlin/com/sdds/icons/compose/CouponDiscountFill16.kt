package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CouponDiscountFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CouponDiscountFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.574 9.15 C 9.81 9.15 10.0 9.34 10.0 9.575 C 10.0 9.809 9.809 10.0 9.574 10.0 C 9.34 10.0 9.15 9.809 9.15 9.575 C 9.15 9.34 9.34 9.15 9.574 9.15 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.425 6.0 C 6.659 6.0 6.85 6.19 6.85 6.424 c 0.0 0.235 -0.192 0.426 -0.426 0.426 C 6.19 6.85 6.0 6.66 6.0 6.424 C 6.0 6.19 6.19 6.0 6.425 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.6 3.1 c 0.773 0.0 1.4 0.627 1.4 1.4 v 1.21 c 0.0 0.338 -0.164 0.657 -0.44 0.854 l -0.415 0.297 c -0.782 0.558 -0.782 1.72 0.0 2.278 l 0.415 0.297 C 14.836 9.633 15.0 9.951 15.0 10.29 v 1.21 c 0.0 0.774 -0.627 1.4 -1.4 1.4 H 2.4 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 v -1.21 c 0.0 -0.338 0.164 -0.657 0.44 -0.854 l 0.415 -0.297 c 0.782 -0.558 0.782 -1.72 0.0 -2.278 L 1.44 6.564 C 1.164 6.367 1.0 6.048 1.0 5.709 V 4.5 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 h 11.2 Z M 9.574 8.35 C 8.898 8.35 8.35 8.9 8.35 9.575 c 0.0 0.634 0.482 1.155 1.1 1.219 L 9.573 10.8 c 0.634 0.0 1.156 -0.482 1.219 -1.1 L 10.8 9.576 c 0.0 -0.677 -0.55 -1.225 -1.226 -1.225 Z m 0.621 -2.642 c -0.195 -0.196 -0.511 -0.196 -0.707 0.0 l -3.78 3.78 c -0.195 0.196 -0.195 0.513 0.0 0.708 c 0.195 0.195 0.512 0.195 0.707 0.0 l 3.78 -3.781 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 Z M 6.425 5.2 C 5.749 5.2 5.2 5.748 5.2 6.424 c 0.0 0.635 0.482 1.156 1.1 1.22 L 6.425 7.65 c 0.634 0.0 1.156 -0.482 1.219 -1.1 L 7.65 6.424 C 7.65 5.748 7.101 5.2 6.425 5.2 Z")
        )
    }.build()
}
