package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 S 8.0 2.448 8.0 3.0 v 4.0 H 7.75 C 6.784 7.0 6.0 7.784 6.0 8.75 v 3.41 c 0.0 1.387 0.606 2.704 1.659 3.607 l 1.754 1.503 C 9.468 17.318 9.5 17.387 9.5 17.46 V 22.0 h 5.0 v -4.54 c 0.0 -0.073 0.032 -0.142 0.087 -0.19 l 1.754 -1.503 C 17.394 14.864 18.0 13.547 18.0 12.16 V 8.75 C 18.0 7.784 17.216 7.0 16.25 7.0 H 16.0 V 3.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 4.0 h -4.0 V 3.0 Z M 7.5 8.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 8.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 3.41 c 0.0 0.949 -0.415 1.85 -1.135 2.468 l -1.754 1.503 C 13.223 16.464 13.0 16.95 13.0 17.46 v 3.04 h -2.0 v -3.04 c 0.0 -0.51 -0.223 -0.996 -0.611 -1.329 l -1.754 -1.503 C 7.915 14.01 7.5 13.109 7.5 12.16 V 8.75 Z")
        )
    }.build()
}
