package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ExportOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ExportOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 32.25 22.75 c 0.552 0.0 1.0 0.448 1.0 1.0 v 3.75 c 0.0 3.038 -2.462 5.5 -5.5 5.5 H 8.25 c -3.038 0.0 -5.5 -2.462 -5.5 -5.5 v -3.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 3.75 c 0.0 1.933 1.567 3.5 3.5 3.5 h 19.5 c 1.933 0.0 3.5 -1.567 3.5 -3.5 v -3.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.134 4.59 c 0.478 -0.48 1.254 -0.479 1.732 0.0 l 6.592 6.59 c 0.39 0.391 0.39 1.024 0.0 1.415 c -0.39 0.39 -1.023 0.39 -1.414 0.0 l -4.972 -4.972 v 19.14 c 0.0 0.552 -0.447 1.0 -1.0 1.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 V 7.48 l -5.115 5.115 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 6.59 -6.592 Z")
        )
    }.build()
}
