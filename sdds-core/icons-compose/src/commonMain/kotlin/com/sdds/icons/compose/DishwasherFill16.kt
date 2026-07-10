package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.0 C 2.769 1.0 1.75 2.019 1.75 3.275 v 1.95 h 12.5 v -1.95 C 14.25 2.019 13.232 1.0 11.975 1.0 h -7.95 Z m 1.197 2.8 c 0.0 0.387 -0.31 0.7 -0.694 0.7 c -0.384 0.0 -0.695 -0.313 -0.695 -0.7 c 0.0 -0.386 0.311 -0.7 0.695 -0.7 c 0.383 0.0 0.694 0.313 0.694 0.7 Z m 3.299 -0.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 3.125 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.52 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 6.225 H 1.75 v 6.5 C 1.75 13.981 2.769 15.0 4.025 15.0 h 7.95 c 1.257 0.0 2.275 -1.019 2.275 -2.275 v -6.5 Z")
        )
    }.build()
}
