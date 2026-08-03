package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PassportFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PassportFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.366 5.9 c 0.0 -0.782 -0.62 -1.4 -1.366 -1.4 c -0.745 0.0 -1.366 0.618 -1.366 1.4 c 0.0 0.782 0.62 1.4 1.366 1.4 c 0.745 0.0 1.366 -0.618 1.366 -1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.672 1.86 C 2.5 2.197 2.5 2.638 2.5 3.52 v 8.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 3.697 15.0 4.138 15.0 5.02 15.0 h 5.96 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 c 0.172 -0.337 0.172 -0.778 0.172 -1.66 V 3.52 c 0.0 -0.882 0.0 -1.323 -0.172 -1.66 c -0.15 -0.296 -0.392 -0.537 -0.688 -0.688 C 12.303 1.0 11.862 1.0 10.98 1.0 H 5.02 C 4.138 1.0 3.697 1.0 3.36 1.172 C 3.064 1.322 2.823 1.564 2.672 1.86 Z m 2.75 7.89 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 5.156 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 5.422 Z M 8.0 3.45 c 1.343 0.0 2.416 1.106 2.416 2.45 S 9.343 8.35 8.0 8.35 S 5.584 7.244 5.584 5.9 S 6.657 3.45 8.0 3.45 Z m -1.203 8.4 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 2.406 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 6.797 Z")
        )
    }.build()
}
