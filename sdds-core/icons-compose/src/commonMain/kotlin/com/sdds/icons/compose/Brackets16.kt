package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Brackets16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Brackets16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFFEFEFE)),
            pathData = addPathNodes("M 6.25 1.2 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -2.3 v 11.6 h 2.3 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.8 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 V 2.05 c 0.0 -0.47 0.38 -0.85 0.85 -0.85 h 2.45 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFFEFEFE)),
            pathData = addPathNodes("M 12.2 1.2 c 0.47 0.0 0.85 0.38 0.85 0.85 v 11.9 c 0.0 0.47 -0.38 0.85 -0.85 0.85 H 9.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.3 V 2.2 h -2.3 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.45 Z")
        )
    }.build()
}
