package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HdmiFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HdmiFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.44 15.742 c 0.176 -0.108 0.327 -0.26 0.63 -0.562 l 2.11 -2.11 c 0.303 -0.303 0.454 -0.454 0.562 -0.63 c 0.096 -0.157 0.167 -0.328 0.21 -0.506 C 22.0 11.732 22.0 11.518 22.0 11.09 V 10.8 c 0.0 -0.98 0.0 -1.47 -0.19 -1.844 c -0.168 -0.33 -0.436 -0.597 -0.765 -0.765 C 20.67 8.0 20.18 8.0 19.2 8.0 H 4.8 C 3.82 8.0 3.33 8.0 2.956 8.19 C 2.626 8.36 2.359 8.627 2.19 8.957 C 2.0 9.33 2.0 9.82 2.0 10.8 v 0.29 c 0.0 0.428 0.0 0.642 0.048 0.844 c 0.043 0.178 0.114 0.349 0.21 0.506 c 0.108 0.176 0.26 0.327 0.562 0.63 l 2.11 2.11 c 0.303 0.303 0.454 0.454 0.63 0.562 c 0.157 0.096 0.328 0.167 0.506 0.21 C 6.268 16.0 6.482 16.0 6.91 16.0 h 10.18 c 0.428 0.0 0.642 0.0 0.844 -0.048 c 0.178 -0.043 0.349 -0.114 0.505 -0.21 Z M 16.25 12.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 16.664 11.0 16.25 11.0 h -8.5 C 7.336 11.0 7.0 11.336 7.0 11.75 s 0.336 0.75 0.75 0.75 h 8.5 Z")
        )
    }.build()
}
