package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button3X2LFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button3X2LFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.134 4.169 C 1.0 4.43 1.0 4.774 1.0 5.46 v 5.08 c 0.0 0.686 0.0 1.03 0.134 1.291 c 0.117 0.23 0.304 0.418 0.535 0.536 C 1.93 12.5 2.274 12.5 2.96 12.5 h 0.28 c 0.686 0.0 1.03 0.0 1.291 -0.133 c 0.23 -0.118 0.418 -0.305 0.535 -0.536 C 5.2 11.57 5.2 11.226 5.2 10.54 V 5.46 c 0.0 -0.686 0.0 -1.03 -0.134 -1.291 C 4.95 3.939 4.762 3.75 4.531 3.634 C 4.27 3.5 3.926 3.5 3.24 3.5 H 2.96 c -0.686 0.0 -1.03 0.0 -1.291 0.134 C 1.439 3.75 1.25 3.938 1.134 4.169 Z M 6.6 6.219 c 0.0 -0.589 0.0 -0.883 0.114 -1.107 c 0.1 -0.198 0.261 -0.359 0.459 -0.46 c 0.225 -0.114 0.519 -0.114 1.107 -0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.106 0.115 c 0.198 0.1 0.358 0.261 0.46 0.459 C 10.1 5.336 10.1 5.63 10.1 6.218 v 3.563 c 0.0 0.588 0.0 0.882 -0.115 1.107 c -0.1 0.198 -0.261 0.358 -0.459 0.459 C 9.302 11.46 9.008 11.46 8.42 11.46 H 8.28 c -0.588 0.0 -0.882 0.0 -1.107 -0.114 c -0.198 -0.1 -0.358 -0.261 -0.459 -0.459 C 6.6 10.663 6.6 10.369 6.6 9.781 V 6.218 Z m 4.9 0.0 c 0.0 -0.589 0.0 -0.883 0.114 -1.107 c 0.101 -0.198 0.262 -0.359 0.46 -0.46 c 0.224 -0.114 0.518 -0.114 1.106 -0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.107 0.115 c 0.197 0.1 0.358 0.261 0.459 0.459 C 15.0 5.336 15.0 5.63 15.0 6.218 v 3.563 c 0.0 0.588 0.0 0.882 -0.114 1.107 c -0.101 0.198 -0.262 0.358 -0.46 0.459 c -0.224 0.114 -0.518 0.114 -1.106 0.114 h -0.14 c -0.588 0.0 -0.882 0.0 -1.107 -0.114 c -0.197 -0.1 -0.358 -0.261 -0.459 -0.459 C 11.5 10.663 11.5 10.369 11.5 9.781 V 6.218 Z")
        )
    }.build()
}
