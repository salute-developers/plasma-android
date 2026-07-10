package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button3X2RFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button3X2RFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.867 4.169 C 15.0 4.43 15.0 4.774 15.0 5.46 v 5.08 c 0.0 0.686 0.0 1.03 -0.133 1.291 c -0.118 0.23 -0.305 0.418 -0.536 0.536 C 14.07 12.5 13.726 12.5 13.04 12.5 h -0.28 c -0.686 0.0 -1.03 0.0 -1.291 -0.133 c -0.23 -0.118 -0.418 -0.305 -0.535 -0.536 C 10.8 11.57 10.8 11.226 10.8 10.54 V 5.46 c 0.0 -0.686 0.0 -1.03 0.133 -1.291 c 0.118 -0.23 0.305 -0.418 0.536 -0.535 C 11.73 3.5 12.074 3.5 12.76 3.5 h 0.28 c 0.686 0.0 1.03 0.0 1.291 0.134 c 0.23 0.117 0.418 0.304 0.536 0.535 Z M 9.4 6.219 c 0.0 -0.589 0.0 -0.883 -0.114 -1.107 c -0.1 -0.198 -0.261 -0.359 -0.459 -0.46 C 8.602 4.539 8.308 4.539 7.72 4.539 H 7.58 c -0.588 0.0 -0.882 0.0 -1.106 0.115 c -0.198 0.1 -0.359 0.261 -0.46 0.459 C 5.9 5.336 5.9 5.63 5.9 6.218 v 3.563 c 0.0 0.588 0.0 0.882 0.115 1.107 c 0.1 0.198 0.261 0.358 0.459 0.459 c 0.224 0.114 0.518 0.114 1.106 0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.107 -0.114 c 0.198 -0.1 0.358 -0.261 0.459 -0.459 C 9.4 10.663 9.4 10.369 9.4 9.781 V 6.218 Z m -4.9 0.0 c 0.0 -0.589 0.0 -0.883 -0.114 -1.107 c -0.101 -0.198 -0.262 -0.359 -0.46 -0.46 C 3.703 4.539 3.409 4.539 2.82 4.539 H 2.68 c -0.588 0.0 -0.882 0.0 -1.107 0.115 c -0.197 0.1 -0.358 0.261 -0.459 0.459 C 1.0 5.336 1.0 5.63 1.0 6.218 v 3.563 c 0.0 0.588 0.0 0.882 0.114 1.107 c 0.101 0.198 0.262 0.358 0.46 0.459 c 0.224 0.114 0.518 0.114 1.106 0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.107 -0.114 c 0.197 -0.1 0.358 -0.261 0.459 -0.459 C 4.5 10.663 4.5 10.369 4.5 9.781 V 6.218 Z")
        )
    }.build()
}
