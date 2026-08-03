package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLOpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLOpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.534 0.799 c 0.77 -0.226 1.54 0.359 1.54 1.17 v 0.14 H 12.3 c 0.663 0.0 1.2 0.537 1.2 1.2 v 9.383 c 0.0 0.663 -0.537 1.2 -1.2 1.2 h -2.226 v 0.14 c 0.0 0.81 -0.77 1.395 -1.54 1.17 L 3.37 13.69 C 2.855 13.54 2.5 13.063 2.5 12.52 V 3.48 c 0.0 -0.542 0.355 -1.019 0.87 -1.17 L 8.534 0.8 Z m 1.54 12.093 H 12.3 c 0.11 0.0 0.2 -0.09 0.2 -0.2 V 3.308 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -2.226 v 9.784 Z M 7.321 8.0 c 0.0 0.385 -0.309 0.696 -0.69 0.696 c -0.38 0.0 -0.688 -0.311 -0.688 -0.696 c 0.0 -0.384 0.308 -0.695 0.689 -0.695 c 0.38 0.0 0.689 0.311 0.689 0.695 Z")
        )
    }.build()
}
