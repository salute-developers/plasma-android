package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Search24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Search24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.75 3.5 C 6.298 3.5 3.5 6.298 3.5 9.75 S 6.298 16.0 9.75 16.0 S 16.0 13.202 16.0 9.75 S 13.202 3.5 9.75 3.5 Z M 2.0 9.75 C 2.0 5.47 5.47 2.0 9.75 2.0 c 4.28 0.0 7.75 3.47 7.75 7.75 c 0.0 1.87 -0.662 3.585 -1.765 4.924 l 5.045 5.046 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -5.046 -5.045 C 13.335 16.838 11.62 17.5 9.75 17.5 C 5.47 17.5 2.0 14.03 2.0 9.75 Z")
        )
    }.build()
}
