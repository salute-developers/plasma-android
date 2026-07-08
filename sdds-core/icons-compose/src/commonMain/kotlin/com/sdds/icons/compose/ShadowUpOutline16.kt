package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowUpOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowUpOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.499 1.0 l 0.215 0.01 c 0.988 0.101 1.775 0.887 1.875 1.876 l 0.01 0.215 v 2.1 h -0.03 c 0.007 0.044 0.015 0.088 0.02 0.134 l 0.01 0.215 v 7.35 c 0.0 1.16 -0.94 2.1 -2.1 2.1 H 4.5 c -1.16 0.0 -2.1 -0.94 -2.1 -2.1 V 5.55 l 0.011 -0.215 C 2.416 5.29 2.424 5.245 2.431 5.2 h -0.03 V 3.1 c 0.0 -1.087 0.826 -1.982 1.885 -2.09 L 4.5 1.0 h 6.999 Z M 4.5 4.45 c -0.607 0.0 -1.1 0.492 -1.1 1.1 v 7.35 c 0.0 0.608 0.493 1.1 1.1 1.1 h 6.999 c 0.607 0.0 1.1 -0.492 1.1 -1.1 V 5.55 c 0.0 -0.608 -0.492 -1.1 -1.1 -1.1 H 4.5 Z M 5.257 1.7 L 3.1 3.856 v 0.128 c 0.366 -0.327 0.847 -0.527 1.376 -0.533 l 1.752 -1.75 H 5.257 Z m 6.263 1.751 c 0.386 0.004 0.748 0.112 1.058 0.298 l 0.321 -0.32 V 3.1 c 0.0 -0.292 -0.09 -0.562 -0.242 -0.787 L 11.52 3.451 Z m -4.547 -1.75 L 5.222 3.45 h 1.356 L 8.33 1.7 H 6.973 Z M 4.5 1.7 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 0.012 L 4.515 1.7 H 4.5 Z m 4.179 1.75 l 1.749 -1.75 H 9.072 l -1.75 1.75 H 8.68 Z m 3.606 -1.509 C 12.061 1.79 11.79 1.7 11.5 1.7 h -0.327 L 9.42 3.45 h 1.356 l 1.508 -1.508 Z")
        )
    }.build()
}
