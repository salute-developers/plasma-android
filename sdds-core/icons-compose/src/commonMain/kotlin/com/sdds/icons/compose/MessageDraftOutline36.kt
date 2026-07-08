package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageDraftOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageDraftOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.995 4.545 c 2.06 -2.06 5.4 -2.06 7.46 0.0 c 2.059 2.06 2.059 5.399 0.0 7.459 L 13.547 29.91 c -0.724 0.724 -1.635 1.233 -2.631 1.47 l -6.685 1.592 c -0.338 0.08 -0.694 -0.02 -0.94 -0.266 c -0.245 -0.245 -0.345 -0.6 -0.265 -0.939 l 1.592 -6.685 c 0.237 -0.996 0.746 -1.907 1.47 -2.63 L 23.995 4.544 Z m 6.045 1.414 c -1.279 -1.279 -3.352 -1.279 -4.63 0.0 l -1.136 1.136 C 25.305 7.522 26.25 8.15 27.05 8.95 c 0.8 0.799 1.427 1.744 1.854 2.775 l 1.136 -1.136 c 1.279 -1.278 1.279 -3.351 0.0 -4.63 Z m -2.709 7.339 c -0.297 -1.105 -0.88 -2.118 -1.695 -2.934 c -0.816 -0.817 -1.83 -1.4 -2.935 -1.696 L 7.503 23.865 c -0.462 0.463 -0.787 1.044 -0.938 1.68 L 6.469 25.95 c 1.655 0.61 2.97 1.926 3.58 3.582 l 0.405 -0.096 c 0.636 -0.152 1.217 -0.477 1.68 -0.94 L 27.33 13.299 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.87 32.0 l 3.0 -3.0 H 31.0 c 0.828 0.0 1.5 0.672 1.5 1.5 S 31.828 32.0 31.0 32.0 H 13.87 Z")
        )
    }.build()
}
