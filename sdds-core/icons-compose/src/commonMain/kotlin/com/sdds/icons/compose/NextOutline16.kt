package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NextOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NextOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.975 9.32 c 0.99 -0.605 0.99 -2.042 0.0 -2.646 L 4.108 2.48 C 3.075 1.849 1.75 2.592 1.75 3.802 v 8.389 c 0.0 1.21 1.325 1.953 2.358 1.322 l 6.867 -4.194 Z m -0.521 -1.793 c 0.35 0.215 0.35 0.724 0.0 0.939 L 3.587 12.66 C 3.22 12.884 2.75 12.62 2.75 12.19 V 3.803 c 0.0 -0.43 0.47 -0.693 0.837 -0.47 l 6.867 4.195 Z m 3.795 -4.434 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 10.156 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 3.093 Z")
        )
    }.build()
}
