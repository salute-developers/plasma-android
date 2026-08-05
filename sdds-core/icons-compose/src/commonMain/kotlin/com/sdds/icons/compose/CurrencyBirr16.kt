package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyBirr16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyBirr16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 5.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.028 c 1.104 0.0 2.0 0.895 2.0 2.0 c 0.0 0.454 -0.152 0.873 -0.406 1.208 c 0.65 0.324 1.1 0.992 1.11 1.768 c 0.013 1.114 -0.886 2.024 -2.0 2.024 H 5.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 5.0 Z m 1.0 3.5 v 2.0 h 1.232 c 0.557 0.0 1.006 -0.455 1.0 -1.012 C 7.975 8.94 7.529 8.5 6.982 8.5 H 5.75 Z m 0.0 -1.0 h 0.528 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 5.75 v 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.75 8.323 c -0.721 0.0 -1.306 0.585 -1.306 1.306 V 11.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 9.629 v -0.04 v -1.942 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 0.081 c 0.371 -0.255 0.821 -0.405 1.306 -0.405 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 Z")
        )
    }.build()
}
