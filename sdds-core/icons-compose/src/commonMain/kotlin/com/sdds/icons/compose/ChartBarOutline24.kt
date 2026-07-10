package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartBarOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartBarOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.0 4.75 v 1.268 C 13.918 6.006 13.835 6.0 13.75 6.0 h -3.5 C 9.284 6.0 8.5 6.784 8.5 7.75 v 4.268 C 8.418 12.006 8.335 12.0 8.25 12.0 h -3.5 C 3.784 12.0 3.0 12.784 3.0 13.75 v 6.5 C 3.0 20.664 3.336 21.0 3.75 21.0 h 16.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 V 4.75 C 21.0 3.784 20.216 3.0 19.25 3.0 h -3.5 C 14.784 3.0 14.0 3.784 14.0 4.75 Z m 1.75 -0.25 c -0.138 0.0 -0.25 0.112 -0.25 0.25 V 19.5 h 4.0 V 4.75 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -3.5 Z m -7.25 15.0 v -5.75 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -3.5 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 5.75 h 4.0 Z m 1.5 0.0 h 4.0 V 7.75 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -3.5 C 10.112 7.5 10.0 7.612 10.0 7.75 V 19.5 Z")
        )
    }.build()
}
