package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileFrontFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileFrontFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.078 14.14 c 0.172 -0.337 0.172 -0.778 0.172 -1.66 V 3.52 c 0.0 -0.882 0.0 -1.323 -0.172 -1.66 c -0.15 -0.296 -0.392 -0.537 -0.688 -0.688 C 11.053 1.0 10.612 1.0 9.73 1.0 H 6.27 C 5.388 1.0 4.947 1.0 4.61 1.172 C 4.314 1.322 4.073 1.564 3.922 1.86 C 3.75 2.197 3.75 2.638 3.75 3.52 v 8.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 4.947 15.0 5.388 15.0 6.27 15.0 h 3.46 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 Z M 7.113 2.775 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 1.771 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -1.77 Z")
        )
    }.build()
}
