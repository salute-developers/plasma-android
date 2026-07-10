package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 3.0 4.75 C 3.0 3.784 3.784 3.0 4.75 3.0 h 14.5 C 20.216 3.0 21.0 3.784 21.0 4.75 v 14.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 H 4.75 C 3.784 21.0 3.0 20.216 3.0 19.25 V 4.75 Z")
        )
    }.build()
}
