package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpacingHorizontal36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpacingHorizontal36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 5.75 c 0.552 0.0 1.0 0.448 1.0 1.0 v 22.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 6.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.5 5.75 c 0.552 0.0 1.0 0.448 1.0 1.0 v 22.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 6.75 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.49 12.375 c 0.393 -0.387 1.026 -0.381 1.413 0.013 l 4.822 4.912 c 0.383 0.39 0.381 1.018 -0.005 1.406 l -4.822 4.838 c -0.39 0.391 -1.023 0.393 -1.415 0.003 c -0.39 -0.39 -0.391 -1.023 -0.002 -1.414 L 23.603 19.0 H 12.207 l 3.291 3.111 c 0.401 0.38 0.42 1.013 0.04 1.414 s -1.012 0.42 -1.413 0.04 l -5.12 -4.838 c -0.198 -0.188 -0.31 -0.45 -0.312 -0.723 c 0.0 -0.274 0.11 -0.536 0.308 -0.726 l 5.118 -4.91 c 0.399 -0.383 1.032 -0.37 1.414 0.027 c 0.383 0.399 0.37 1.032 -0.03 1.415 L 12.18 17.0 h 11.448 l -3.152 -3.21 c -0.387 -0.395 -0.38 -1.028 0.013 -1.415 Z")
        )
    }.build()
}
