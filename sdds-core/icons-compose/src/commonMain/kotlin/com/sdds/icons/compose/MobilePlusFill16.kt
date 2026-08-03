package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobilePlusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobilePlusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.646 1.0 H 6.27 C 5.388 1.0 4.947 1.0 4.61 1.172 C 4.314 1.322 4.073 1.564 3.922 1.86 C 3.75 2.197 3.75 2.638 3.75 3.52 v 8.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 4.947 15.0 5.388 15.0 6.27 15.0 h 3.46 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 c 0.172 -0.337 0.172 -0.778 0.172 -1.66 V 8.493 C 12.167 8.498 12.084 8.5 12.0 8.5 C 9.515 8.5 7.5 6.485 7.5 4.0 c 0.0 -0.075 0.002 -0.15 0.006 -0.225 H 7.113 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 7.67 C 7.857 2.108 8.196 1.503 8.646 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 0.35 -5.795 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.696 H 9.955 c -0.194 0.0 -0.35 0.156 -0.35 0.35 c 0.0 0.193 0.156 0.35 0.35 0.35 h 1.695 v 1.695 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.193 0.0 0.35 -0.157 0.35 -0.35 V 4.351 h 1.696 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 H 12.35 V 1.955 Z")
        )
    }.build()
}
