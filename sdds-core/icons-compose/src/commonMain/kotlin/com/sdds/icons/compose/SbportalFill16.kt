package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.4 3.25 c 0.0 0.774 -0.627 1.4 -1.4 1.4 c -0.773 0.0 -1.4 -0.626 -1.4 -1.4 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 c 0.773 0.0 1.4 0.627 1.4 1.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 5.35 c 1.16 0.0 2.1 -0.94 2.1 -2.1 c 0.0 -0.119 -0.01 -0.236 -0.029 -0.35 h 3.704 C 14.451 2.9 15.0 3.45 15.0 4.127 v 6.65 C 15.0 11.452 14.451 12.0 13.775 12.0 H 2.225 C 1.548 12.0 1.0 11.452 1.0 10.776 v -6.65 C 1.0 3.449 1.548 2.9 2.225 2.9 h 3.704 C 5.909 3.014 5.9 3.13 5.9 3.25 c 0.0 1.16 0.94 2.1 2.1 2.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 14.1 c -1.313 0.0 -2.501 -0.535 -3.358 -1.4 h 6.716 C 10.5 13.565 9.313 14.1 8.0 14.1 Z")
        )
    }.build()
}
