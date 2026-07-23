package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 1.5 C 2.724 1.5 2.5 1.724 2.5 2.0 v 2.071 c 0.0 1.184 0.524 2.307 1.432 3.067 l 2.04 1.708 c 0.204 0.17 0.322 0.423 0.322 0.69 v 4.463 c 0.0 0.158 0.074 0.306 0.2 0.4 c 0.126 0.095 0.289 0.125 0.44 0.08 l 2.414 -0.705 c 0.213 -0.063 0.36 -0.258 0.36 -0.48 V 9.536 c 0.0 -0.267 0.118 -0.52 0.322 -0.69 l 2.04 -1.708 c 0.907 -0.76 1.431 -1.883 1.431 -3.067 V 2.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 3.0 Z m 0.5 2.571 V 2.5 h 9.001 v 1.571 c 0.0 0.888 -0.393 1.73 -1.074 2.3 L 9.387 8.08 c -0.43 0.361 -0.68 0.894 -0.68 1.457 v 3.383 l -1.413 0.413 V 9.536 c 0.0 -0.563 -0.25 -1.096 -0.68 -1.457 l -2.04 -1.707 C 3.894 5.802 3.5 4.959 3.5 4.072 Z m 5.018 -0.277 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.414 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.518 Z")
        )
    }.build()
}
