package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindForwardOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindForwardOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.307 8.743 c -2.188 -1.36 -4.978 0.239 -4.978 2.794 v 2.553 L 7.728 8.743 C 5.54 7.383 2.75 8.982 2.75 11.537 v 12.924 c 0.0 2.555 2.79 4.155 4.978 2.794 l 8.601 -5.346 v 2.552 c 0.0 2.555 2.79 4.155 4.978 2.794 l 10.395 -6.461 c 2.064 -1.284 2.064 -4.306 0.0 -5.59 L 21.306 8.743 Z m -4.978 10.81 l -9.657 6.004 C 5.844 26.07 4.75 25.48 4.75 24.46 V 11.537 c 0.0 -1.02 1.094 -1.61 1.922 -1.096 l 9.657 6.004 v 3.109 Z m 2.0 -8.016 c 0.0 -1.02 1.094 -1.61 1.922 -1.096 l 10.395 6.462 c 0.805 0.501 0.805 1.691 0.0 2.192 L 20.25 25.557 c -0.828 0.514 -1.922 -0.076 -1.922 -1.096 V 11.537 Z")
        )
    }.build()
}
