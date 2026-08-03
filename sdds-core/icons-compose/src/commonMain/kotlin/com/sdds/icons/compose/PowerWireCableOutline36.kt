package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireCableOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireCableOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.422 3.0 c -0.76 0.0 -1.375 0.616 -1.375 1.375 v 6.192 H 11.5 c -1.38 0.0 -2.5 1.12 -2.5 2.5 v 5.188 c 0.0 2.051 0.9 4.0 2.462 5.33 l 2.694 2.294 c 0.112 0.095 0.176 0.234 0.176 0.38 V 33.0 h 7.333 v -6.74 c 0.0 -0.146 0.064 -0.285 0.175 -0.38 l 2.695 -2.295 c 1.562 -1.33 2.462 -3.278 2.462 -5.33 v -5.187 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 H 23.95 V 4.375 C 23.95 3.615 23.334 3.0 22.575 3.0 h -9.153 Z m 8.528 7.567 V 5.0 h -7.903 v 5.567 h 7.903 Z M 11.0 13.067 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 12.997 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.188 c 0.0 1.465 -0.643 2.857 -1.759 3.807 l -2.694 2.294 c -0.558 0.475 -0.88 1.17 -0.88 1.903 V 31.0 h -3.332 v -4.74 c 0.0 -0.732 -0.321 -1.428 -0.879 -1.903 l -2.694 -2.294 C 11.643 21.112 11.0 19.72 11.0 18.255 v -5.188 Z")
        )
    }.build()
}
