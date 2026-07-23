package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.97 3.997 c -0.857 -1.543 -3.076 -1.543 -3.933 0.0 L 2.587 17.41 c -0.834 1.5 0.25 3.342 1.966 3.342 h 14.902 c 1.715 0.0 2.8 -1.843 1.966 -3.343 l -7.45 -13.41 Z m -2.622 0.729 c 0.286 -0.515 1.026 -0.515 1.311 0.0 l 7.451 13.41 c 0.278 0.5 -0.084 1.115 -0.655 1.115 H 4.553 c -0.572 0.0 -0.933 -0.614 -0.656 -1.114 l 7.451 -13.411 Z M 12.004 8.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 v -4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z m 1.0 9.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 s 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 Z")
        )
    }.build()
}
