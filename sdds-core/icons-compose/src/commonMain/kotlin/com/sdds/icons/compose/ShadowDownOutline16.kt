package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowDownOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowDownOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.499 1.0 c 1.16 0.0 2.1 0.94 2.1 2.1 v 7.35 l -0.01 0.215 c -0.005 0.046 -0.013 0.09 -0.02 0.135 h 0.03 v 2.1 l -0.01 0.214 c -0.1 0.989 -0.887 1.775 -1.875 1.875 L 11.499 15.0 H 4.5 l -0.214 -0.01 C 3.227 14.881 2.4 13.986 2.4 12.9 v -2.1 h 0.032 c -0.008 -0.045 -0.016 -0.09 -0.02 -0.135 L 2.4 10.45 V 3.1 C 2.4 1.94 3.34 1.0 4.5 1.0 h 6.999 Z M 3.101 12.9 c 0.0 0.772 0.626 1.4 1.399 1.4 h 0.014 L 3.1 12.887 v 0.012 Z m 0.0 -0.756 L 5.257 14.3 h 0.972 l -1.752 -1.752 c -0.53 -0.006 -1.01 -0.206 -1.376 -0.533 v 0.129 Z m 2.12 0.406 l 1.752 1.75 h 1.356 l -1.75 -1.75 H 5.221 Z m 7.357 -0.3 c -0.31 0.186 -0.671 0.294 -1.058 0.298 l 1.137 1.137 C 12.81 13.461 12.9 13.191 12.9 12.9 v -0.328 l -0.32 -0.321 Z M 4.5 2.0 C 3.893 2.0 3.4 2.492 3.4 3.1 v 7.35 c 0.0 0.607 0.493 1.1 1.1 1.1 h 6.999 c 0.607 0.0 1.1 -0.492 1.1 -1.1 V 3.1 c 0.0 -0.608 -0.493 -1.1 -1.1 -1.1 H 4.5 Z m 4.572 12.3 h 1.356 l -1.75 -1.75 H 7.323 l 1.75 1.75 Z m 2.1 0.0 h 0.327 c 0.291 0.0 0.562 -0.09 0.786 -0.242 l -1.508 -1.508 H 9.421 l 1.75 1.75 Z")
        )
    }.build()
}
