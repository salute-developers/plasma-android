package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RubleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RubleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z M 7.12 4.513 c -0.276 0.0 -0.5 0.223 -0.5 0.5 v 2.66 H 6.066 c -0.276 0.0 -0.5 0.225 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 6.62 V 9.43 H 6.066 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 6.62 v 0.554 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 10.43 h 1.256 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 7.62 V 8.674 H 8.7 c 1.15 0.0 2.082 -0.932 2.082 -2.08 c 0.0 -1.15 -0.932 -2.081 -2.081 -2.081 H 7.12 Z m 1.58 3.16 H 7.62 v -2.16 H 8.7 c 0.598 0.0 1.081 0.483 1.081 1.08 c 0.0 0.597 -0.483 1.08 -1.08 1.08 Z")
        )
    }.build()
}
