package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyBirr24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyBirr24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.25 7.75 C 7.25 7.336 7.586 7.0 8.0 7.0 h 1.375 c 1.588 0.0 2.875 1.287 2.875 2.875 c 0.0 0.639 -0.208 1.229 -0.56 1.706 c 0.902 0.476 1.522 1.42 1.535 2.51 C 13.243 15.692 11.95 17.0 10.35 17.0 H 8.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -8.5 Z m 1.5 5.0 v 2.75 h 1.6 c 0.766 0.0 1.384 -0.626 1.375 -1.391 c -0.01 -0.753 -0.622 -1.359 -1.375 -1.359 h -1.6 Z m 0.0 -1.5 h 0.625 c 0.76 0.0 1.375 -0.616 1.375 -1.375 c 0.0 -0.76 -0.616 -1.375 -1.375 -1.375 H 8.75 v 2.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 12.5 c -0.966 0.0 -1.75 0.784 -1.75 1.75 v 2.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 11.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 s 0.75 0.336 0.75 0.75 v 0.01 C 15.755 11.189 16.356 11.0 17.0 11.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 17.414 12.5 17.0 12.5 Z")
        )
    }.build()
}
