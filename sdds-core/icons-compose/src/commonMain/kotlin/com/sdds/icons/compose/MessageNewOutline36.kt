package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.322 7.102 c -5.843 0.0 -10.579 4.736 -10.579 10.578 c 0.0 1.265 0.222 2.475 0.627 3.597 c 0.375 1.038 0.554 2.247 0.22 3.44 L 7.542 28.46 l 3.742 -1.047 c 1.193 -0.335 2.402 -0.156 3.44 0.22 c 1.122 0.405 2.333 0.626 3.598 0.626 c 5.842 0.0 10.578 -4.736 10.578 -10.578 c 0.0 -0.2 -0.006 -0.399 -0.017 -0.596 c 0.704 -0.174 1.356 -0.477 1.93 -0.883 c 0.058 0.485 0.087 0.979 0.087 1.479 c 0.0 6.947 -5.632 12.578 -12.578 12.578 c -1.5 0.0 -2.94 -0.263 -4.277 -0.746 c -0.784 -0.283 -1.55 -0.363 -2.222 -0.174 l -3.816 1.068 c -1.47 0.412 -2.823 -0.942 -2.412 -2.411 l 1.069 -3.816 c 0.188 -0.672 0.108 -1.439 -0.175 -2.223 c -0.483 -1.336 -0.746 -2.776 -0.746 -4.276 c 0.0 -6.947 5.632 -12.578 12.579 -12.578 c 2.202 0.0 4.272 0.565 6.072 1.56 c -0.6 0.386 -1.124 0.88 -1.543 1.455 c -1.373 -0.651 -2.909 -1.015 -4.53 -1.015 Z m 9.178 8.15 c 2.071 0.0 3.75 -1.68 3.75 -3.75 c 0.0 -2.072 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.678 -3.75 3.75 c 0.0 2.07 1.679 3.75 3.75 3.75 Z")
        )
    }.build()
}
