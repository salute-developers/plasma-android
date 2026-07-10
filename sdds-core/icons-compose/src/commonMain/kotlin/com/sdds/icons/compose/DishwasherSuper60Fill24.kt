package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherSuper60Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherSuper60Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.75 6.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 S 15.25 4.205 15.25 6.0 h 5.0 C 20.664 6.0 21.0 6.336 21.0 6.75 S 20.664 7.5 20.25 7.5 H 19.0 v 6.781 c 0.0 0.674 0.0 1.224 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 15.506 19.0 14.955 19.0 14.282 19.0 H 9.718 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 5.0 15.506 5.0 14.955 5.0 14.281 V 7.5 H 3.75 C 3.336 7.5 3.0 7.164 3.0 6.75 S 3.336 6.0 3.75 6.0 h 5.0 Z m 1.5 0.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 S 13.75 5.034 13.75 6.0 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 15.0 c 0.414 0.0 0.75 0.336 0.75 0.75 c 0.0 2.623 2.127 4.75 4.75 4.75 h 7.5 c 2.623 0.0 4.75 -2.127 4.75 -4.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 S 22.0 15.336 22.0 15.75 c 0.0 3.452 -2.798 6.25 -6.25 6.25 h -7.5 C 4.798 22.0 2.0 19.202 2.0 15.75 C 2.0 15.336 2.336 15.0 2.75 15.0 Z")
        )
    }.build()
}
