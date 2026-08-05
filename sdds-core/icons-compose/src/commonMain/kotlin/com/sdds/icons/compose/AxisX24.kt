package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AxisX24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AxisX24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.97 10.5 L 16.074 5.0 h 2.495 l -5.17 6.74 L 18.75 19.0 h -2.575 l -4.285 -5.82 L 7.745 19.0 H 5.25 l 5.15 -7.12 L 5.512 5.0 h 2.575 l 3.883 5.5 Z")
        )
    }.build()
}
