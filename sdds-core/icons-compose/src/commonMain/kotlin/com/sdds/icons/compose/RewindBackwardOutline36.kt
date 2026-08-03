package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RewindBackwardOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RewindBackwardOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.693 8.743 c 2.188 -1.36 4.978 0.239 4.978 2.794 v 2.553 l 8.601 -5.347 c 2.188 -1.36 4.978 0.239 4.978 2.794 v 12.924 c 0.0 2.555 -2.79 4.155 -4.978 2.794 l -8.601 -5.346 v 2.552 c 0.0 2.555 -2.79 4.155 -4.978 2.794 L 4.298 20.794 c -2.064 -1.284 -2.064 -4.306 0.0 -5.59 l 10.395 -6.461 Z m 4.978 10.81 l 9.657 6.004 c 0.828 0.514 1.922 -0.076 1.922 -1.096 V 11.537 c 0.0 -1.02 -1.095 -1.61 -1.922 -1.096 l -9.657 6.004 v 3.109 Z m -2.0 -8.016 c 0.0 -1.02 -1.094 -1.61 -1.922 -1.096 L 5.354 16.903 c -0.805 0.501 -0.805 1.691 0.0 2.192 l 10.395 6.462 c 0.828 0.514 1.922 -0.076 1.922 -1.096 V 11.537 Z")
        )
    }.build()
}
