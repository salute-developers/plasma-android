package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X1LFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X1LFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.172 3.36 C 1.0 3.697 1.0 4.138 1.0 5.02 v 5.96 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.15 0.296 0.392 0.537 0.688 0.688 C 2.197 13.5 2.638 13.5 3.52 13.5 h 1.96 c 0.882 0.0 1.323 0.0 1.66 -0.172 c 0.296 -0.15 0.537 -0.392 0.688 -0.688 C 8.0 12.303 8.0 11.862 8.0 10.98 V 5.02 c 0.0 -0.882 0.0 -1.323 -0.172 -1.66 c -0.15 -0.296 -0.392 -0.537 -0.688 -0.688 C 6.803 2.5 6.362 2.5 5.48 2.5 H 3.52 c -0.882 0.0 -1.323 0.0 -1.66 0.172 c -0.296 0.15 -0.537 0.392 -0.688 0.688 Z m 8.4 1.375 C 9.4 5.072 9.4 5.513 9.4 6.395 v 3.21 c 0.0 0.882 0.0 1.323 0.172 1.66 c 0.151 0.296 0.392 0.537 0.688 0.688 c 0.337 0.172 0.778 0.172 1.66 0.172 h 0.56 c 0.883 0.0 1.323 0.0 1.66 -0.172 c 0.297 -0.15 0.538 -0.392 0.689 -0.688 C 15.0 10.928 15.0 10.487 15.0 9.605 v -3.21 c 0.0 -0.882 0.0 -1.323 -0.171 -1.66 c -0.151 -0.296 -0.392 -0.537 -0.689 -0.688 c -0.337 -0.172 -0.777 -0.172 -1.66 -0.172 h -0.56 c -0.882 0.0 -1.323 0.0 -1.66 0.172 c -0.296 0.15 -0.537 0.392 -0.688 0.688 Z")
        )
    }.build()
}
