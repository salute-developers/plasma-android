package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.0 10.0 c 0.0 -4.418 3.582 -8.0 8.0 -8.0 s 8.0 3.582 8.0 8.0 s -3.582 8.0 -8.0 8.0 s -8.0 -3.582 -8.0 -8.0 Z m 8.0 -6.5 c -3.59 0.0 -6.5 2.91 -6.5 6.5 s 2.91 6.5 6.5 6.5 s 6.5 -2.91 6.5 -6.5 c 0.0 -0.375 -0.032 -0.742 -0.093 -1.1 l -3.835 2.828 l -3.49 -2.188 V 6.91 l 3.49 2.187 l 3.095 -2.281 C 16.553 4.836 14.433 3.5 12.0 3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 19.5 c 0.0 -0.335 0.348 -0.529 0.668 -0.43 c 0.895 0.28 1.846 0.43 2.832 0.43 c 0.986 0.0 1.937 -0.15 2.832 -0.43 c 0.32 -0.099 0.668 0.095 0.668 0.43 c 0.0 1.933 -1.567 3.5 -3.5 3.5 s -3.5 -1.567 -3.5 -3.5 Z")
        )
    }.build()
}
