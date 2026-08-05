package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SquareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SquareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 7.125 C 4.5 5.675 5.675 4.5 7.125 4.5 h 21.75 c 1.45 0.0 2.625 1.175 2.625 2.625 v 21.75 c 0.0 1.45 -1.175 2.625 -2.625 2.625 H 7.125 c -1.45 0.0 -2.625 -1.175 -2.625 -2.625 V 7.125 Z")
        )
    }.build()
}
