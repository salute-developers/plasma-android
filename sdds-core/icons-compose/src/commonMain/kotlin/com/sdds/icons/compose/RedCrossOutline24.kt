package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RedCrossOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RedCrossOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.75 3.5 C 9.612 3.5 9.5 3.612 9.5 3.75 v 5.0 c 0.0 0.199 -0.079 0.39 -0.22 0.53 C 9.14 9.421 8.95 9.5 8.75 9.5 h -5.0 C 3.612 9.5 3.5 9.612 3.5 9.75 v 4.5 c 0.0 0.138 0.112 0.25 0.25 0.25 h 5.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 5.0 c 0.0 0.138 0.112 0.25 0.25 0.25 h 4.5 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -5.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.0 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -4.5 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -5.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -5.0 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -4.5 Z M 8.0 3.75 C 8.0 2.784 8.784 2.0 9.75 2.0 h 4.5 C 15.216 2.0 16.0 2.784 16.0 3.75 V 8.0 h 4.25 C 21.216 8.0 22.0 8.784 22.0 9.75 v 4.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 H 16.0 v 4.25 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -4.5 C 8.784 22.0 8.0 21.216 8.0 20.25 V 16.0 H 3.75 C 2.784 16.0 2.0 15.216 2.0 14.25 v -4.5 C 2.0 8.784 2.784 8.0 3.75 8.0 H 8.0 V 3.75 Z")
        )
    }.build()
}
