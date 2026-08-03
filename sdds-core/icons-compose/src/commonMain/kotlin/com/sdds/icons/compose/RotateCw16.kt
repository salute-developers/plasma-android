package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCw16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCw16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 C 4.686 2.0 2.0 4.686 2.0 8.0 s 2.686 6.0 6.0 6.0 c 2.485 0.0 4.619 -1.511 5.53 -3.667 c 0.107 -0.254 0.4 -0.373 0.655 -0.266 c 0.254 0.108 0.373 0.401 0.266 0.655 C 13.389 13.235 10.9 15.0 8.0 15.0 c -3.866 0.0 -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 c 2.547 0.0 4.775 1.36 6.0 3.393 V 2.944 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 2.528 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -2.528 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.21 C 12.14 3.194 10.208 2.0 8.0 2.0 Z")
        )
    }.build()
}
