package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.025 8.0 C 2.025 4.7 4.7 2.025 8.0 2.025 S 13.975 4.7 13.975 8.0 S 11.3 13.975 8.0 13.975 S 2.025 11.3 2.025 8.0 Z M 8.0 1.025 C 4.148 1.025 1.025 4.148 1.025 8.0 c 0.0 3.852 3.123 6.975 6.975 6.975 c 3.852 0.0 6.975 -3.123 6.975 -6.975 c 0.0 -3.852 -3.123 -6.975 -6.975 -6.975 Z M 7.025 11.161 l 4.2 -2.425 c 0.567 -0.327 0.567 -1.145 0.0 -1.472 l -4.2 -2.425 C 6.458 4.512 5.75 4.921 5.75 5.575 v 4.85 c 0.0 0.654 0.708 1.063 1.275 0.736 Z M 6.75 5.835 L 10.5 8.0 l -3.75 2.165 v -4.33 Z")
        )
    }.build()
}
