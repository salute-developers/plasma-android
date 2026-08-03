package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.002 4.125 c -3.025 0.0 -5.476 2.452 -5.476 5.476 v 9.214 c 0.0 3.024 2.451 5.476 5.476 5.476 c 3.024 0.0 5.476 -2.452 5.476 -5.476 V 9.6 c 0.0 -3.024 -2.452 -5.476 -5.477 -5.476 Z m -3.476 5.476 c 0.0 -1.92 1.556 -3.476 3.476 -3.476 s 3.476 1.556 3.476 3.476 v 9.214 c 0.0 1.92 -1.557 3.476 -3.477 3.476 s -3.476 -1.557 -3.476 -3.476 V 9.6 Z m -4.41 10.205 c -0.07 -0.548 -0.572 -0.934 -1.12 -0.863 c -0.547 0.07 -0.934 0.572 -0.863 1.12 c 0.315 2.422 1.486 4.648 3.3 6.262 c 1.563 1.39 3.512 2.245 5.568 2.456 v 3.592 c 0.0 0.552 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -3.592 c 2.055 -0.21 4.004 -1.065 5.567 -2.456 c 1.814 -1.614 2.986 -3.84 3.3 -6.262 c 0.07 -0.548 -0.316 -1.05 -0.863 -1.12 c -0.548 -0.071 -1.05 0.315 -1.12 0.863 c -0.253 1.948 -1.195 3.733 -2.647 5.025 c -1.45 1.29 -3.312 2.0 -5.237 2.0 c -1.925 0.0 -3.787 -0.71 -5.238 -2.0 c -1.452 -1.292 -2.393 -3.077 -2.646 -5.025 Z")
        )
    }.build()
}
