package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.972 14.125 C 20.988 14.249 21.0 14.374 21.0 14.5 v 3.0 c 0.0 2.761 -4.03 5.0 -9.0 5.0 s -9.0 -2.239 -9.0 -5.0 v -3.0 c 0.0 -0.126 0.01 -0.251 0.027 -0.375 c 0.346 2.586 4.23 4.625 8.973 4.625 s 8.626 -2.039 8.972 -4.625 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.972 8.875 C 20.988 8.999 21.0 9.124 21.0 9.25 v 3.0 c 0.0 2.761 -4.03 5.0 -9.0 5.0 s -9.0 -2.239 -9.0 -5.0 v -3.0 c 0.0 -0.126 0.01 -0.251 0.027 -0.375 C 3.373 11.461 7.257 13.5 12.0 13.5 s 8.626 -2.039 8.972 -4.625 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c 4.97 0.0 9.0 2.239 9.0 5.0 s -4.03 5.0 -9.0 5.0 s -9.0 -2.239 -9.0 -5.0 s 4.03 -5.0 9.0 -5.0 Z")
        )
    }.build()
}
