package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowLeftOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowLeftOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.2 2.4 v 0.03 c 0.045 -0.007 0.09 -0.014 0.135 -0.019 l 0.215 -0.01 h 7.35 c 1.16 0.0 2.1 0.94 2.1 2.1 V 11.5 c 0.0 1.16 -0.94 2.1 -2.1 2.1 H 5.55 l -0.215 -0.011 c -0.046 -0.005 -0.09 -0.013 -0.135 -0.02 v 0.03 H 3.1 c -1.087 0.0 -1.982 -0.826 -2.09 -1.885 L 1.0 11.5 V 4.501 l 0.01 -0.215 c 0.101 -0.988 0.887 -1.775 1.876 -1.875 L 3.1 2.401 h 2.1 Z m -3.5 8.343 L 3.856 12.9 h 0.13 c -0.328 -0.366 -0.53 -0.848 -0.535 -1.376 L 1.701 9.77 v 0.972 Z m 0.0 0.757 c 0.0 0.773 0.628 1.4 1.4 1.4 h 0.013 L 1.7 11.485 V 11.5 Z m 3.85 -8.1 c -0.608 0.0 -1.1 0.494 -1.1 1.101 V 11.5 c 0.0 0.607 0.493 1.1 1.1 1.1 h 7.35 c 0.608 0.0 1.1 -0.493 1.1 -1.1 V 4.501 c 0.0 -0.607 -0.492 -1.1 -1.1 -1.1 H 5.55 Z M 1.7 9.027 l 1.75 1.751 V 9.422 L 1.7 7.67 v 1.356 Z m 0.0 -2.1 l 1.75 1.75 V 7.322 L 1.7 5.572 v 1.356 Z m 0.242 -3.212 C 1.79 3.939 1.7 4.21 1.7 4.5 v 0.327 L 3.45 6.58 V 5.223 L 1.942 3.715 Z M 3.101 3.1 c -0.292 0.0 -0.562 0.09 -0.787 0.242 l 1.137 1.136 C 3.455 4.093 3.563 3.731 3.75 3.421 L 3.429 3.1 H 3.1 Z")
        )
    }.build()
}
