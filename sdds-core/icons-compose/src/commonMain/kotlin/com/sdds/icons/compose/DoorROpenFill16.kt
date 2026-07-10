package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.466 0.799 c -0.77 -0.226 -1.54 0.359 -1.54 1.17 v 0.14 H 3.7 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 9.383 c 0.0 0.663 0.537 1.2 1.2 1.2 h 2.226 v 0.14 c 0.0 0.81 0.77 1.395 1.54 1.17 l 5.164 -1.511 c 0.516 -0.151 0.87 -0.628 0.87 -1.17 V 3.48 c 0.0 -0.542 -0.354 -1.019 -0.87 -1.17 L 7.466 0.8 Z m -1.54 12.093 H 3.7 c -0.11 0.0 -0.2 -0.09 -0.2 -0.2 V 3.308 c 0.0 -0.11 0.09 -0.2 0.2 -0.2 h 2.226 v 9.784 Z M 8.68 8.0 c 0.0 0.385 0.308 0.696 0.689 0.696 c 0.38 0.0 0.689 -0.311 0.689 -0.696 c 0.0 -0.384 -0.309 -0.695 -0.69 -0.695 C 8.989 7.305 8.68 7.616 8.68 8.0 Z")
        )
    }.build()
}
