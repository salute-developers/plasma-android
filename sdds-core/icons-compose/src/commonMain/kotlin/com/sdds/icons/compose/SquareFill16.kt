package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.7 2.925 C 1.7 2.248 2.247 1.7 2.923 1.7 h 10.15 c 0.677 0.0 1.225 0.548 1.225 1.225 v 10.15 c 0.0 0.677 -0.548 1.225 -1.225 1.225 H 2.924 c -0.676 0.0 -1.225 -0.548 -1.225 -1.225 V 2.925 Z")
        )
    }.build()
}
