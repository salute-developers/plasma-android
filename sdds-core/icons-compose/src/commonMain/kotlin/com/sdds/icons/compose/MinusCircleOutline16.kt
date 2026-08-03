package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MinusCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MinusCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.686 4.686 2.0 8.0 2.0 s 6.0 2.686 6.0 5.998 c 0.0 3.313 -2.686 5.998 -6.0 5.998 s -6.0 -2.685 -6.0 -5.998 Z M 8.0 1.0 C 4.134 1.0 1.0 4.133 1.0 7.998 s 3.134 6.998 7.0 6.998 s 7.0 -3.133 7.0 -6.998 S 11.866 1.0 8.0 1.0 Z M 3.784 7.499 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 8.432 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 3.784 Z")
        )
    }.build()
}
