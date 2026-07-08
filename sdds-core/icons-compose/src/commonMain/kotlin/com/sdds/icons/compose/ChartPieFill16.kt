package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.086 1.06 C 6.175 1.18 5.296 1.478 4.5 1.938 l 1.75 3.03 C 6.765 4.671 7.362 4.5 8.0 4.5 c 0.313 0.0 0.617 0.041 0.906 0.118 l 0.906 -3.38 C 8.924 1.002 7.998 0.94 7.086 1.06 Z m -1.56 4.465 L 3.05 3.05 C 2.4 3.7 1.885 4.472 1.533 5.321 C 1.18 6.171 1.0 7.081 1.0 8.001 c 0.0 0.918 0.181 1.829 0.533 2.678 c 0.352 0.85 0.867 1.62 1.517 2.27 l 2.475 -2.474 C 4.892 9.842 4.5 8.967 4.5 8.0 c 0.0 -0.966 0.392 -1.841 1.025 -2.475 Z m 0.724 5.507 l -1.75 3.03 C 5.564 14.677 6.771 15.0 8.0 15.0 s 2.436 -0.323 3.5 -0.938 c 1.064 -0.614 1.948 -1.498 2.562 -2.562 C 14.677 10.436 15.0 9.23 15.0 8.0 h -3.5 c 0.0 1.933 -1.567 3.5 -3.5 3.5 c -0.638 0.0 -1.235 -0.17 -1.75 -0.468 Z m 5.132 -3.938 l 3.38 -0.906 c -0.481 -1.793 -1.654 -3.322 -3.262 -4.25 l -1.75 3.03 c 0.793 0.46 1.39 1.22 1.632 2.126 Z M 8.0 10.975 c 1.643 0.0 2.975 -1.331 2.975 -2.974 c 0.0 -1.644 -1.332 -2.976 -2.975 -2.976 S 5.025 6.357 5.025 8.001 c 0.0 1.643 1.332 2.975 2.975 2.975 Z")
        )
    }.build()
}
