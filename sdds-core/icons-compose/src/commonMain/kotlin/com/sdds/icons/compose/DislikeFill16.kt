package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DislikeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DislikeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.297 14.967 c -0.427 0.124 -0.874 -0.115 -1.015 -0.54 l -0.718 -2.175 c -0.086 -0.261 -0.203 -0.51 -0.35 -0.743 L 5.723 9.217 c -0.11 -0.175 -0.235 -0.338 -0.374 -0.488 C 4.973 9.347 4.194 9.674 3.445 9.39 L 2.777 9.137 c -0.585 -0.221 -0.985 -0.77 -1.022 -1.399 l -0.252 -4.34 c -0.05 -0.838 0.554 -1.571 1.38 -1.675 l 0.7 -0.089 C 4.191 1.557 4.756 1.84 5.08 2.311 l 4.127 -0.907 c 1.277 -0.28 2.586 0.312 3.229 1.461 l 1.767 3.159 c 0.859 1.535 -0.24 3.436 -1.985 3.436 h -1.443 c -0.345 0.0 -0.597 0.331 -0.508 0.669 l 0.508 2.206 c 0.3 1.138 -0.357 2.31 -1.477 2.632 Z M 3.815 8.395 c 0.354 0.134 0.728 -0.141 0.71 -0.523 l -0.22 -4.681 c -0.015 -0.31 -0.287 -0.54 -0.591 -0.502 l -0.7 0.088 c -0.276 0.035 -0.477 0.28 -0.46 0.559 l 0.252 4.34 c 0.012 0.21 0.145 0.392 0.34 0.466 l 0.669 0.253 Z")
        )
    }.build()
}
