package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.686 4.686 2.0 8.0 2.0 s 6.0 2.686 6.0 5.998 c 0.0 3.313 -2.686 5.998 -6.0 5.998 s -6.0 -2.685 -6.0 -5.998 Z M 8.0 1.0 C 4.134 1.0 1.0 4.133 1.0 7.998 s 3.134 6.998 7.0 6.998 s 7.0 -3.133 7.0 -6.998 S 11.866 1.0 8.0 1.0 Z M 7.998 4.488 c 0.386 0.0 0.7 0.313 0.7 0.7 v 2.81 c 0.0 0.386 -0.314 0.7 -0.7 0.7 c -0.387 0.0 -0.7 -0.314 -0.7 -0.7 v -2.81 c 0.0 -0.387 0.313 -0.7 0.7 -0.7 Z m 0.703 6.32 c 0.0 0.388 -0.314 0.703 -0.702 0.703 c -0.388 0.0 -0.703 -0.315 -0.703 -0.703 c 0.0 -0.388 0.315 -0.703 0.703 -0.703 c 0.388 0.0 0.702 0.315 0.702 0.703 Z")
        )
    }.build()
}
