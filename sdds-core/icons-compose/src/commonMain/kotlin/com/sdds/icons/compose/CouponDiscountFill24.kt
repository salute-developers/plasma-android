package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CouponDiscountFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CouponDiscountFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 13.75 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.75 9.25 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.0 5.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 1.729 c 0.0 0.484 -0.234 0.938 -0.628 1.22 l -0.594 0.423 c -1.116 0.798 -1.116 2.458 0.0 3.256 l 0.594 0.424 C 21.766 14.333 22.0 14.787 22.0 15.272 V 17.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 H 4.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -1.729 c 0.0 -0.484 0.234 -0.938 0.628 -1.22 l 0.594 -0.423 c 1.116 -0.798 1.116 -2.458 0.0 -3.256 L 2.628 9.948 C 2.234 9.667 2.0 9.213 2.0 8.728 V 7.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 16.0 Z m -5.75 7.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 S 13.284 16.0 14.25 16.0 S 16.0 15.216 16.0 14.25 s -0.784 -1.75 -1.75 -1.75 Z m 0.911 -3.75 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 L 8.75 14.1 c -0.293 0.293 -0.293 0.768 0.0 1.061 c 0.293 0.293 0.768 0.293 1.06 0.0 l 5.35 -5.35 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 Z M 9.75 8.0 C 8.784 8.0 8.0 8.784 8.0 9.75 s 0.784 1.75 1.75 1.75 s 1.75 -0.784 1.75 -1.75 S 10.716 8.0 9.75 8.0 Z")
        )
    }.build()
}
