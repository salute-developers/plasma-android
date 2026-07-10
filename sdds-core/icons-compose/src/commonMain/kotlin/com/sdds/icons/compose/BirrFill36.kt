package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BirrFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BirrFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 23.5 v -4.375 h 2.525 c 1.198 0.0 2.173 0.964 2.187 2.162 c 0.014 1.218 -0.97 2.213 -2.187 2.213 H 13.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.063 17.125 H 13.0 V 12.75 h 1.063 c 1.208 0.0 2.187 0.98 2.187 2.188 c 0.0 1.208 -0.98 2.187 -2.188 2.187 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -6.0 -22.25 c -0.552 0.0 -1.0 0.448 -1.0 1.0 V 24.5 c 0.0 0.552 0.448 1.0 1.0 1.0 h 3.525 c 2.332 0.0 4.214 -1.905 4.187 -4.237 c -0.02 -1.642 -0.982 -3.054 -2.368 -3.723 c 0.567 -0.715 0.906 -1.62 0.906 -2.602 c 0.0 -2.313 -1.875 -4.188 -4.188 -4.188 H 12.0 Z m 13.5 8.0 c -1.519 0.0 -2.75 1.231 -2.75 2.75 v 3.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -7.125 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 0.252 c 0.776 -0.552 1.725 -0.877 2.75 -0.877 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z")
        )
    }.build()
}
