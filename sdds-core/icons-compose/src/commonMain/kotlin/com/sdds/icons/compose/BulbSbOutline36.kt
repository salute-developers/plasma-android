package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.1 14.875 C 6.1 8.317 11.417 3.0 17.975 3.0 S 29.85 8.317 29.85 14.875 S 24.533 26.75 17.975 26.75 S 6.1 21.433 6.1 14.875 Z M 17.975 5.0 C 12.521 5.0 8.1 9.421 8.1 14.875 s 4.421 9.875 9.875 9.875 s 9.875 -4.421 9.875 -9.875 c 0.0 -0.59 -0.052 -1.17 -0.151 -1.732 l -5.866 4.324 l -5.234 -3.281 v -3.948 l 5.234 3.281 l 4.745 -3.496 C 24.881 7.024 21.665 5.0 17.974 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.725 29.126 c 0.0 -0.503 0.522 -0.794 1.003 -0.644 c 1.341 0.419 2.768 0.644 4.247 0.644 c 1.48 0.0 2.906 -0.226 4.247 -0.644 c 0.48 -0.15 1.003 0.14 1.003 0.644 c 0.0 2.9 -2.35 5.25 -5.25 5.25 s -5.25 -2.35 -5.25 -5.25 Z")
        )
    }.build()
}
