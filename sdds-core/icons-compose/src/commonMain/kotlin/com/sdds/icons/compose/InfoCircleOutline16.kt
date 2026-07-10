package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InfoCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InfoCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z m 0.7 4.188 c 0.0 0.388 -0.314 0.702 -0.702 0.702 c -0.388 0.0 -0.703 -0.314 -0.703 -0.702 c 0.0 -0.388 0.315 -0.703 0.703 -0.703 c 0.388 0.0 0.702 0.315 0.702 0.703 Z M 7.995 6.795 c 0.276 0.0 0.5 0.224 0.5 0.5 v 4.215 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 7.295 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
    }.build()
}
