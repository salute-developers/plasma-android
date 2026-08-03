package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.17 10.651 c -0.288 2.173 -1.375 4.173 -3.072 5.58 l -4.392 3.66 c -0.433 0.36 -0.684 0.898 -0.684 1.465 v 8.025 c 0.0 0.507 -0.333 0.952 -0.814 1.092 l -3.861 1.483 c -0.338 0.098 -0.703 0.03 -0.984 -0.184 c -0.28 -0.215 -0.445 -0.55 -0.445 -0.907 v -5.962 L 29.17 10.651 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.13 4.0 c 0.573 0.0 1.045 0.437 1.111 1.0 l 0.508 -0.507 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.363 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 L 14.31 19.933 c -0.025 -0.024 -0.05 -0.049 -0.076 -0.07 l -4.33 -3.633 C 7.907 14.579 6.75 12.105 6.75 9.495 v -4.36 C 6.75 4.508 7.252 4.0 7.871 4.0 H 28.13 Z M 19.09 8.929 c -0.621 0.0 -1.125 0.504 -1.125 1.125 s 0.504 1.125 1.125 1.125 h 3.973 L 25.29 8.95 c -0.071 -0.014 -0.145 -0.021 -0.22 -0.021 h -5.98 Z")
        )
    }.build()
}
