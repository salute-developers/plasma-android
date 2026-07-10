package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Click24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Click24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.263 10.707 c -1.465 0.196 -2.57 1.43 -2.602 2.909 l -0.08 3.718 H 8.724 c -0.781 0.0 -1.551 0.188 -2.245 0.548 c -0.82 0.425 -0.644 1.645 0.262 1.823 l 2.564 0.502 c 1.807 0.354 3.572 0.899 5.264 1.626 l 0.676 0.29 c 3.1 1.332 6.356 -1.537 5.424 -4.78 l -1.634 -5.685 c -0.274 -0.952 -1.205 -1.56 -2.188 -1.43 l -3.584 0.48 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.521 6.845 C 6.883 7.11 6.581 7.841 6.845 8.48 l 4.251 10.25 c 0.265 0.637 0.996 0.94 1.634 0.675 c 0.637 -0.264 0.94 -0.995 0.676 -1.633 L 9.155 7.521 C 8.89 6.883 8.159 6.581 7.52 6.845 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            fillAlpha = 0.6f,
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 3.5 C 5.515 3.5 3.5 5.515 3.5 8.0 c 0.0 1.815 1.075 3.38 2.625 4.092 c 0.251 0.115 0.361 0.412 0.246 0.663 c -0.115 0.251 -0.412 0.361 -0.663 0.246 C 3.816 12.133 2.5 10.221 2.5 8.0 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 c 0.0 0.154 -0.006 0.307 -0.019 0.458 c -0.022 0.275 -0.264 0.48 -0.54 0.457 c -0.274 -0.023 -0.48 -0.264 -0.456 -0.54 C 12.495 8.253 12.5 8.128 12.5 8.0 c 0.0 -2.485 -2.015 -4.5 -4.5 -4.5 Z")
        )
    }.build()
}
