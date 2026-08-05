package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button3X2CFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button3X2CFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.9 5.46 c 0.0 -0.686 0.0 -1.03 0.134 -1.291 c 0.117 -0.23 0.305 -0.418 0.535 -0.535 C 6.831 3.5 7.174 3.5 7.86 3.5 h 0.28 c 0.686 0.0 1.03 0.0 1.292 0.134 c 0.23 0.117 0.417 0.304 0.535 0.535 C 10.1 4.43 10.1 4.774 10.1 5.46 v 5.08 c 0.0 0.686 0.0 1.03 -0.133 1.291 c -0.118 0.23 -0.305 0.418 -0.535 0.536 C 9.169 12.5 8.826 12.5 8.14 12.5 H 7.86 c -0.686 0.0 -1.029 0.0 -1.29 -0.133 c -0.231 -0.118 -0.419 -0.305 -0.536 -0.536 C 5.9 11.57 5.9 11.226 5.9 10.54 V 5.46 Z M 1.0 6.218 C 1.0 5.63 1.0 5.336 1.114 5.112 c 0.101 -0.198 0.262 -0.359 0.46 -0.46 c 0.224 -0.114 0.518 -0.114 1.106 -0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.107 0.115 c 0.197 0.1 0.358 0.261 0.459 0.459 C 4.5 5.336 4.5 5.63 4.5 6.218 v 3.563 c 0.0 0.588 0.0 0.882 -0.114 1.107 c -0.101 0.198 -0.262 0.358 -0.46 0.459 C 3.703 11.46 3.409 11.46 2.82 11.46 H 2.68 c -0.588 0.0 -0.882 0.0 -1.107 -0.114 c -0.197 -0.1 -0.358 -0.261 -0.459 -0.459 C 1.0 10.663 1.0 10.369 1.0 9.781 V 6.218 Z m 10.614 -1.106 C 11.5 5.336 11.5 5.63 11.5 6.218 v 3.563 c 0.0 0.588 0.0 0.882 0.114 1.107 c 0.101 0.198 0.262 0.358 0.46 0.459 c 0.224 0.114 0.518 0.114 1.106 0.114 h 0.14 c 0.588 0.0 0.882 0.0 1.107 -0.114 c 0.197 -0.1 0.358 -0.261 0.459 -0.459 C 15.0 10.663 15.0 10.369 15.0 9.781 V 6.218 c 0.0 -0.588 0.0 -0.882 -0.114 -1.106 c -0.101 -0.198 -0.262 -0.359 -0.46 -0.46 c -0.224 -0.114 -0.518 -0.114 -1.106 -0.114 h -0.14 c -0.588 0.0 -0.882 0.0 -1.107 0.115 c -0.197 0.1 -0.358 0.261 -0.459 0.459 Z")
        )
    }.build()
}
