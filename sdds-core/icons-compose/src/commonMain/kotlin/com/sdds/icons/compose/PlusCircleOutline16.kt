package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlusCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlusCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z m 0.5 2.784 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 s -0.5 0.223 -0.5 0.5 v 3.715 H 3.783 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 3.715 v 3.715 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 8.499 h 3.715 c 0.277 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.223 -0.5 -0.5 -0.5 H 8.498 V 3.784 Z")
        )
    }.build()
}
