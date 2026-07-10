package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.844 6.638 C 13.612 6.614 14.249 7.23 14.249 8.0 c 0.0 0.77 -0.637 1.386 -1.405 1.362 l -2.776 -0.086 l -2.37 4.542 c -0.22 0.42 -0.653 0.682 -1.126 0.682 c -0.404 0.0 -0.705 -0.373 -0.62 -0.768 l 0.404 -1.881 l 5.172 -5.172 l 1.316 -0.041 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.738 1.646 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.512 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 4.368 -4.368 L 4.36 9.101 L 3.782 9.689 C 3.52 9.957 3.16 10.11 2.784 10.11 h -0.86 c -0.129 0.0 -0.213 -0.136 -0.155 -0.253 L 2.68 8.0 L 1.769 6.144 C 1.71 6.027 1.795 5.892 1.925 5.892 h 0.86 c 0.375 0.0 0.734 0.15 0.997 0.419 l 0.58 0.588 L 6.931 6.82 L 5.952 2.268 C 5.867 1.873 6.168 1.5 6.572 1.5 c 0.473 0.0 0.906 0.263 1.125 0.682 l 1.889 3.616 l 4.152 -4.152 Z")
        )
    }.build()
}
