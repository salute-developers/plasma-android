package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorRClosedFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorRClosedFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.828 1.86 C 13.0 2.197 13.0 2.638 13.0 3.52 v 8.96 c 0.0 0.882 0.0 1.323 -0.172 1.66 c -0.15 0.296 -0.392 0.537 -0.688 0.688 C 11.803 15.0 11.362 15.0 10.48 15.0 H 5.52 c -0.882 0.0 -1.323 0.0 -1.66 -0.172 c -0.296 -0.15 -0.537 -0.392 -0.688 -0.688 C 3.0 13.803 3.0 13.362 3.0 12.48 V 3.52 c 0.0 -0.882 0.0 -1.323 0.172 -1.66 c 0.15 -0.296 0.392 -0.537 0.688 -0.688 C 4.197 1.0 4.638 1.0 5.52 1.0 h 4.96 c 0.882 0.0 1.323 0.0 1.66 0.172 c 0.296 0.15 0.537 0.392 0.688 0.688 Z M 6.214 9.4 c -0.591 0.0 -1.071 -0.47 -1.071 -1.05 c 0.0 -0.58 0.48 -1.05 1.071 -1.05 c 0.592 0.0 1.072 0.47 1.072 1.05 c 0.0 0.58 -0.48 1.05 -1.072 1.05 Z")
        )
    }.build()
}
