package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PowerWireOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PowerWireOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.36 1.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 c -0.277 0.0 -0.5 0.224 -0.5 0.5 v 2.883 H 4.95 c -0.663 0.0 -1.2 0.537 -1.2 1.2 v 2.462 c 0.0 0.965 0.422 1.881 1.155 2.508 l 1.274 1.09 c 0.045 0.037 0.07 0.093 0.07 0.151 V 15.0 h 3.5 v -3.205 c 0.0 -0.058 0.025 -0.114 0.07 -0.152 l 1.273 -1.089 c 0.734 -0.627 1.156 -1.543 1.156 -2.508 V 5.583 c 0.0 -0.663 -0.537 -1.2 -1.2 -1.2 h -0.404 V 1.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.883 H 6.359 V 1.5 Z M 4.75 5.583 c 0.0 -0.11 0.09 -0.2 0.2 -0.2 h 6.098 c 0.11 0.0 0.2 0.09 0.2 0.2 v 2.462 c 0.0 0.672 -0.294 1.311 -0.805 1.748 l -1.274 1.09 c -0.267 0.227 -0.42 0.56 -0.42 0.911 V 14.0 h -1.5 v -2.205 c 0.0 -0.35 -0.153 -0.684 -0.42 -0.912 L 5.555 9.793 C 5.045 9.356 4.75 8.717 4.75 8.045 V 5.583 Z")
        )
    }.build()
}
