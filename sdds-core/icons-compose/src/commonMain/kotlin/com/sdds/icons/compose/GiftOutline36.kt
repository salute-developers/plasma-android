package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.06 4.034 c -1.44 -1.379 -3.711 -1.379 -5.152 0.0 c -1.531 1.467 -1.531 3.914 0.0 5.38 l 1.268 1.214 H 5.75 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 5.29 c 0.0 0.908 0.691 1.654 1.576 1.742 v 8.838 c 0.0 2.623 2.126 4.75 4.75 4.75 h 15.348 c 2.623 0.0 4.75 -2.127 4.75 -4.75 V 19.41 C 31.308 19.322 32.0 18.576 32.0 17.668 v -5.29 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 h -5.427 l 1.267 -1.213 c 1.532 -1.467 1.532 -3.914 0.0 -5.38 c -1.44 -1.38 -3.711 -1.38 -5.152 0.0 L 18.0 6.848 L 15.06 4.034 Z m 7.265 8.594 h 0.015 H 30.0 v 4.79 H 19.0 v -4.79 h 3.325 Z m -0.394 -2.0 l 2.776 -2.658 c 0.71 -0.679 0.71 -1.812 0.0 -2.491 c -0.667 -0.639 -1.718 -0.639 -2.385 0.0 L 18.999 8.66 v 1.968 h 2.932 Z m -4.932 0.0 V 8.66 L 13.677 5.48 c -0.667 -0.639 -1.718 -0.639 -2.386 0.0 c -0.709 0.679 -0.709 1.812 0.0 2.491 l 2.777 2.658 h 2.931 Z m -3.34 2.0 h 0.015 H 17.0 v 4.79 H 6.0 v -4.79 h 7.658 Z m -6.083 6.79 H 17.0 v 11.58 h -6.674 c -1.52 0.0 -2.75 -1.231 -2.75 -2.75 v -8.83 Z m 11.424 0.0 v 11.58 h 6.674 c 1.519 0.0 2.75 -1.231 2.75 -2.75 v -8.83 H 19.0 Z")
        )
    }.build()
}
