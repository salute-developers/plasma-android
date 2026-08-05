package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyRuble16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyRuble16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.55 5.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.575 c 1.146 0.0 2.075 0.929 2.075 2.075 c 0.0 1.146 -0.929 2.075 -2.075 2.075 H 7.55 V 9.4 H 8.8 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 7.55 v 0.55 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 10.4 H 6.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 S 5.724 9.4 6.0 9.4 h 0.55 V 8.65 H 6.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.55 V 5.0 Z m 1.0 2.65 h 1.075 C 9.219 7.65 9.7 7.169 9.7 6.575 S 9.219 5.5 8.625 5.5 H 7.55 v 2.15 Z")
        )
    }.build()
}
