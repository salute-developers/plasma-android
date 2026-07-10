package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent236: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent236",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 17.85 c 0.0 -8.285 6.716 -15.0 15.0 -15.0 c 2.796 0.0 5.413 0.764 7.654 2.096 L 24.75 5.85 c -2.0 2.0 -0.75 5.25 1.5 5.25 h 5.15 c 1.023 2.029 1.6 4.322 1.6 6.75 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 Z m 13.5 -6.0 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 c 0.829 0.0 1.5 0.671 1.5 1.5 v 6.633 l 3.147 1.818 c 0.718 0.414 0.964 1.331 0.55 2.049 c -0.415 0.717 -1.332 0.963 -2.05 0.549 l -3.87 -2.235 c -0.06 -0.033 -0.12 -0.071 -0.175 -0.113 c -0.339 -0.253 -0.567 -0.647 -0.598 -1.096 c -0.003 -0.042 -0.005 -0.086 -0.004 -0.129 V 11.85 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.2 1.75 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 6.817 c 1.37 0.0 2.0 1.704 0.96 2.595 L 29.379 7.25 h 4.046 c 0.69 0.0 1.25 0.56 1.25 1.25 s -0.56 1.25 -1.25 1.25 h -6.817 c -1.37 0.0 -2.0 -1.704 -0.96 -2.595 L 30.496 3.0 H 26.45 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 Z")
        )
    }.build()
}
