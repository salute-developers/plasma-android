package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.248 8.045 c 0.0 0.965 -0.422 1.88 -1.155 2.508 l -1.274 1.09 c -0.044 0.037 -0.07 0.093 -0.07 0.15 V 15.0 H 6.25 v -3.041 l 0.81 -0.81 c 0.123 0.19 0.19 0.414 0.19 0.646 v 2.205 h 1.499 v -2.205 c 0.0 -0.35 0.153 -0.684 0.42 -0.912 l 1.274 -1.089 c 0.511 -0.437 0.805 -1.076 0.805 -1.748 V 6.959 l 1.0 -1.0 v 2.086 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.145 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 2.883 h 0.357 l 2.736 -2.737 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 3.007 -3.006 C 4.157 9.893 3.75 8.992 3.75 8.045 V 5.583 c 0.0 -0.663 0.538 -1.2 1.2 -1.2 h 0.41 V 1.5 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 c 0.275 0.0 0.5 0.224 0.5 0.5 v 2.883 h 3.284 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z M 4.95 5.383 c -0.11 0.0 -0.2 0.09 -0.2 0.2 v 2.462 c 0.0 0.672 0.295 1.311 0.806 1.748 l 0.02 0.017 l 4.426 -4.427 H 4.95 Z")
        )
    }.build()
}
