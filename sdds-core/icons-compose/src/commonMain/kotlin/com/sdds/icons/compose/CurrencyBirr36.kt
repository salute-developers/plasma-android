package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyBirr36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyBirr36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.0 11.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 2.063 c 2.312 0.0 4.187 1.875 4.187 4.188 c 0.0 0.983 -0.339 1.887 -0.906 2.602 c 1.386 0.67 2.348 2.081 2.368 3.723 c 0.027 2.332 -1.855 4.237 -4.187 4.237 H 12.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 11.75 Z m 2.0 7.375 V 23.5 h 2.525 c 1.218 0.0 2.201 -0.995 2.187 -2.213 c -0.014 -1.198 -0.99 -2.162 -2.187 -2.162 H 13.0 Z m 0.0 -2.0 h 1.063 c 1.208 0.0 2.187 -0.98 2.187 -2.188 c 0.0 -1.208 -0.98 -2.187 -2.188 -2.187 H 13.0 v 4.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.5 18.75 c -1.519 0.0 -2.75 1.231 -2.75 2.75 v 3.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -7.125 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 0.252 c 0.776 -0.552 1.725 -0.877 2.75 -0.877 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 Z")
        )
    }.build()
}
